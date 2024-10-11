import unittest
from ansible.plugins.action.copy import ActionModule


class TestActionModule(unittest.TestCase):
    def test_init(self):
        action_module = MagicMock()
        self.assertIsInstance(action_module, ActionModule)

    def test_ensure_invocation(self):
        action_module = MagicMock()
        result = {}
        action_module._ensure_invocation(result)
        self.assertIn('invocation', result)

    def test_copy_file(self):
        action_module = MagicMock()
        source_full = 'source_full'
        source_rel = 'source_rel'
        content = 'content'
        content_tempfile = 'content_tempfile'
        dest = 'dest'
        task_vars = {}
        follow = True
        result = action_module._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIn('diff', result)

    def test_create_content_tempfile(self):
        action_module = MagicMock()
        content = 'content'
        content_tempfile = action_module._create_content_tempfile(content)
        self.assertIsInstance(content_tempfile, str)

    def test_remove_tempfile_if_content_defined(self):
        action_module = MagicMock()
        content = 'content'
        content_tempfile = 'content_tempfile'
        action_module._remove_tempfile_if_content_defined(content, content_tempfile)

if __name__ == '__main__':
    unittest.main()