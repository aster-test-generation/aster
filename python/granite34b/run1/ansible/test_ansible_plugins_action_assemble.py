import unittest
from ansible.plugins.action.assemble import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        def setUp(self):

    def test_assemble_from_fragments(self):
        src_path = '/path/to/fragments'
        delimiter = '---'
        compiled_regexp = re.compile(r'fragment_\d+\.txt')
        ignore_hidden = True
        decrypt = False
        result = self.action_module._assemble_from_fragments(src_path, delimiter, compiled_regexp, ignore_hidden, decrypt)
        self.assertEqual(result, '/path/to/temp_file')

    def test_run(self):
        task_vars = {}
        src = '/path/to/src'
        dest = '/path/to/dest'
        delimiter = '---'
        remote_src = 'yes'
        regexp = 'fragment_\d+\.txt'
        follow = False
        ignore_hidden = True
        decrypt = False
        result = self.action_module.run(task_vars, src, dest, delimiter, remote_src, regexp, follow, ignore_hidden, decrypt)
        self.assertEqual(result['checksum'], 'checksum_value')

if __name__ == '__main__':
    unittest.main()