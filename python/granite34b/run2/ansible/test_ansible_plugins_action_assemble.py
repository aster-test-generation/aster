import unittest
from ansible.plugins.action.assemble import ActionModule


class TestActionModule(unittest.TestCase):
    def test_assemble_from_fragments(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        src_path = '/path/to/fragments'
        delimiter = '\n'
        compiled_regexp = None
        ignore_hidden = False
        decrypt = True
        result = action_module._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertEqual(result, '/path/to/temp_file')

    def test_run(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = '/tmp'
        task_vars = {}
        src = '/path/to/src'
        dest = '/path/to/dest'
        delimiter = '\n'
        remote_src = 'yes'
        regexp = None
        follow = False
        ignore_hidden = False
        decrypt = True
        result = action_module.run(tmp, task_vars, src, dest, delimiter, remote_src, regexp, follow, ignore_hidden, decrypt)
        self.assertEqual(result, {'checksum': '12345'})

if __name__ == '__main__':
    unittest.main()