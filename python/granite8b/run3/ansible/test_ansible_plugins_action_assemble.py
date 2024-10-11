import unittest
from ansible.plugins.action import ActionModule


class TestAssemble(unittest.TestCase):
    def test_assemble_from_fragments(self):
        src_path = '/path/to/fragments'
        delimiter = '---'
        compiled_regexp = re.compile(r'fragment-\d\.txt')
        ignore_hidden = True
        decrypt = True
        temp_path = assemble._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertEqual(temp_path, '/path/to/temp_file.txt')

    def test_run(self):
        task_vars = {'src': '/path/to/fragments', 'dest': '/path/to/dest_file.txt'}
        result = assemble.run(task_vars=task_vars)
        self.assertEqual(result['dest'], '/path/to/dest_file.txt')

if __name__ == '__main__':
    unittest.main()