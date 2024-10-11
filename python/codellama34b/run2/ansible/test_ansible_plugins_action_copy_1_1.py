import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_ensure_invocation(self):
        instance = ActionModule()
        result = {}
        result = instance._ensure_invocation(result)
        self.assertIsInstance(result, dict)
        self.assertIn('invocation', result)

    def test_copy_file(self):
        instance = ActionModule()
        source_full = 'source_full'
        source_rel = 'source_rel'
        content = 'content'
        content_tempfile = 'content_tempfile'
        dest = 'dest'
        task_vars = {}
        follow = True
        result = instance._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertIsInstance(result, dict)
        self.assertIn('diff', result)

    def test_create_content_tempfile(self):
        instance = ActionModule()
        content = 'content'
        content_tempfile = instance._create_content_tempfile(content)
        self.assertIsInstance(content_tempfile, str)

    def test_remove_tempfile_if_content_defined(self):
        instance = ActionModule()
        content = 'content'
        content_tempfile = 'content_tempfile'
        instance._remove_tempfile_if_content_defined(content, content_tempfile)

if __name__ == '__main__':
    unittest.main()