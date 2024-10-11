import unittest
from ansible.plugins.action.copy import ActionModule


class TestActionModule(unittest.TestCase):
    def test_ensure_invocation(self):
        result = {}
        action_module = MagicMock()
        result = action_module._ensure_invocation(result)
        self.assertIn('invocation', result)
        self.assertEqual(result['invocation'], 'CENSORED: no_log is set')

    def test_copy_file(self):
        source_full = '/path/to/source'
        source_rel = 'source.txt'
        content = 'This is a test content'
        content_tempfile = '/path/to/content_tempfile'
        dest = '/path/to/dest'
        task_vars = {}
        follow = True
        action_module = MagicMock()
        result = action_module._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIn('diff', result)
        self.assertEqual(result['diff'], [])
        self.assertIn('failed', result)
        self.assertEqual(result['failed'], True)
        self.assertIn('msg', result)
        self.assertEqual(result['msg'], 'can not use content with a dir as dest')

    def test_create_content_tempfile(self):
        content = 'This is a test content'
        action_module = MagicMock()
        content_tempfile = action_module._create_content_tempfile(content)
        self.assertTrue(os.path.exists(content_tempfile))
        os.remove(content_tempfile)

    def test_remove_tempfile_if_content_defined(self):
        content = 'This is a test content'
        content_tempfile = '/path/to/content_tempfile'
        action_module = MagicMock()
        action_module._remove_tempfile_if_content_defined(content, content_tempfile)
        self.assertFalse(os.path.exists(content_tempfile))

if __name__ == '__main__':
    unittest.main()