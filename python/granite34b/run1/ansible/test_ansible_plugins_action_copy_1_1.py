import unittest
from ansible.plugins.action.copy import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = MagicMock()

    def test_ensure_invocation(self):
        result = {}
        self.action_module._ensure_invocation(result)
        self.assertIn('invocation', result)

    def test_copy_file(self):
        source_full = 'source_file.txt'
        source_rel = 'source_file.txt'
        content = 'This is a test content'
        content_tempfile = self.action_module._create_content_tempfile(content)
        dest = '/destination_dir'
        task_vars = {}
        follow = True
        result = self.action_module._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIn('checksum', result)
        self.action_module._remove_tempfile_if_content_defined(content, content_tempfile)

    def test_create_content_tempfile(self):
        content = 'This is a test content'
        content_tempfile = self.action_module._create_content_tempfile(content)
        self.assertTrue(os.path.exists(content_tempfile))
        os.remove(content_tempfile)

    def test_remove_tempfile_if_content_defined(self):
        content = 'This is a test content'
        content_tempfile = self.action_module._create_content_tempfile(content)
        self.action_module._remove_tempfile_if_content_defined(content, content_tempfile)
        self.assertFalse(os.path.exists(content_tempfile))

if __name__ == '__main__':
    unittest.main()