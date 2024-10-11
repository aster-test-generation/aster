import unittest
from ansible.plugins.action.yaml import *



class TestActionModule(unittest.TestCase):
    def test_run(self):
        self._supports_check_mode = False
        result = super(ActionModule, self).run(tmp, task_vars)
        del tmp  
        if task_vars is None:
            task_vars = dict()
        src = self._task.args.get('src', None)
        dest = self._task.args.get('dest', None)
        delimiter = self._task.args.get('delimiter', None)
        remote_src = self._task.args.get('remote_src', 'yes')
        regexp = self._task.args.get('regexp', None)
        follow = self._task.args.get('follow', False)
        ignore_hidden = self._task.args.get('ignore_hidden', False)
        decrypt = self._task.args.pop('decrypt', True)
        try:
            if src is None or dest is None:
                raise AnsibleActionFail("src and dest are required")
            if boolean(remote_src, strict=False):
                result.update(self._execute_module(module_name='ansible.legacy.assemble', task_vars=task_vars))
                raise _AnsibleActionDone()
            else:
                try:
                    src = self._find_needle('files', src)
                except AnsibleError as e:
                    raise AnsibleActionFail(to_native(e))
            if not os.path.isdir(src):
                raise AnsibleActionFail(u"Source (%s) is not a directory" % src)
            _re = None
            if regexp is not None:
                _re = re.compile(regexp)
            path = self._assemble_from_fragments(src, delimiter, _re, ignore_hidden, decrypt)
            path_checksum = checksum_s(path)
            dest = self._remote_expand_user(dest)
            dest_stat = self._execute_remote_stat(dest, all_vars=task_vars, follow=follow)
            diff = {}
            new_module_args = self._task.args.copy()
            for opt in ['remote_src', 'regexp', 'delimiter', 'ignore_hidden', 'decrypt']:
                if opt in new_module_args:
                    del new_module_args[opt]
            new_module_args['dest'] = dest
            if path_checksum != dest_stat['checksum']:
                if self._play_context.diff:
                    diff = self._get_diff_data(dest, path, task_vars)
                remote_path = self._connection._shell.join_path(self._connection._shell.tmpdir, 'src')
                xfered = self._transfer_file(path, remote_path)
                self._fixup_perms2((self._connection._shell.tmpdir, remote_path))
                new_module_args.update(dict(src=xfered,))
                res = self._execute_module(module_name='ansible.legacy.copy', module_args=new_module_args, task_vars=task_vars)
                if diff:
                    res['diff'] = diff
                result.update(res)
            else:
                result.update(self._execute_module(module_name='ansible.legacy.file', module_args=new_module_args, task_vars=task_vars))
        except AnsibleAction as e:
            result.update(e.result)
        finally:
            self._remove_tmp_path(self._connection._shell.tmpdir)
        return result

if __name__ == '__main__':
    unittest.main()