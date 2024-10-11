import unittest
from ansible.plugins.action import assemble


class TestAssembleActionModule(unittest.TestCase):
    def test_assemble_from_fragments(self):
        action_module = ActionModule()
        src_path = '/path/to/fragments'
        delimiter = '\n'
        compiled_regexp = re.compile(r'fragment-\d\.txt')
        ignore_hidden = True
        decrypt = True
        temp_path = action_module._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertEqual(temp_path, '/path/to/temp/file')

    def test_run(self):
        action_module = ActionModule()
        task_vars = {'src': '/path/to/fragments', 'dest': '/path/to/destination'}
        result = action_module.run(tmp=None, task_vars=task_vars)
        self.assertEqual(result, {'changed': True, 'checksum': '1234567890', 'dest': '/path/to/destination', 'diff': {'after': {'content': 'content of destination file', 'dest': '/path/to/destination', 'group': 'root', 'mode': '0644', 'owner': 'root', 'state': 'file'}, 'before': None, 'diff': '--- /path/to/destination\n+++ /path/to/fragments\n@@ -0,0 +1 @@\n+content of fragment file\n'}, 'path': '/path/to/destination', 'size': 100})

if __name__ == '__main__':
    unittest.main()