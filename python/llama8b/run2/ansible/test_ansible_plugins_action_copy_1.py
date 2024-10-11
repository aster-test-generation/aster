import unittest
from unittest.mock import patch, Mock
from ansible.module_utils.basic import AnsibleModul


class TestActionModule(unittest.TestCase):
    def test_init(self):
        action_module = ActionModule()
        self.assertEqual(action_module.__class__, ActionModule)

    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_find_needle(self):
        action_module = ActionModule()
        source = 'files'
        result = action_module._find_needle('files', source)
        self.assertEqual(result, source)

    def test_create_content_tempfile(self):
        action_module = ActionModule()
        content = 'test content'
        result = action_module._create_content_tempfile(content)
        self.assertIsInstance(result, tempfile.TemporaryFile)

    def test_copy_file(self):
        action_module = ActionModule()
        source_full = 'source file'
        source_rel = 'source file'
        content = 'test content'
        content_tempfile = tempfile.TemporaryFile()
        dest = 'dest'
        task_vars = {}
        result = action_module._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow=False)
        self.assertEqual(result, {})

    def test_execute_module(self):
        action_module = ActionModule()
        module_name = 'ansible.legacy.copy'
        module_args = {'path': 'path', 'state': 'directory'}
        task_vars = {}
        result = action_module._execute_module(module_name, module_args, task_vars)
        self.assertEqual(result, {})

    def test_ensure_invocation(self):
        action_module = ActionModule()
        result = action_module._ensure_invocation({'failed': True, 'msg': 'msg'})
        self.assertEqual(result, {'failed': True, 'msg': 'msg'})

    def test_remove_tmp_path(self):
        action_module = ActionModule()
        tmpdir = '/tmp'
        action_module._remove_tmp_path(tmpdir)
        self.assertEqual(action_module._connection._shell.tmpdir, tmpdir)

    def test_remote_expand_user(self):
        action_module = ActionModule()
        dest = '~/dest'
        result = action_module._remote_expand_user(dest)
        self.assertEqual(result, '/home/user/dest')

    def test_walk_dirs(self):
        action_module = ActionModule()
        source = 'source'
        local_follow = True
        trailing_slash_detector = Mock()
        result = action_module._walk_dirs(source, local_follow, trailing_slash_detector)
        self.assertEqual(result, [])

    def test_str(self):
        action_module = ActionModule()
        result = str(action_module)
        self.assertEqual(result, 'ActionModule')

    def test_repr(self):
        action_module = ActionModule()
        result = repr(action_module)
        self.assertEqual(result, 'ActionModule()')

    def test_eq(self):
        action_module1 = ActionModule()
        action_module2 = ActionModule()
        self.assertEqual(action_module1, action_module2)

if __name__ == '__main__':
    unittest.main()