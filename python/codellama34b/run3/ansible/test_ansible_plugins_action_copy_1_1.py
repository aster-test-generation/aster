import unittest
from ansible.plugins.action.copy import *


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_ensure_invocation(self):
        instance = ActionModule()
        result = {}
        result['invocation'] = {}
        result['invocation']['module_args'] = {}
        result['invocation']['module_args']['content'] = 'CENSORED: content is a no_log parameter'
        result = instance._ensure_invocation(result)
        self.assertEqual(result['invocation']['module_args']['content'], 'VALUE_SPECIFIED_IN_NO_LOG_PARAMETER')

    def test_copy_file(self):
        instance = ActionModule()
        source_full = 'test_source_full'
        source_rel = 'test_source_rel'
        content = 'test_content'
        content_tempfile = 'test_content_tempfile'
        dest = 'test_dest'
        task_vars = {}
        follow = True
        result = instance._copy_file(source_full, source_rel, content, content_tempfile, dest, task_vars, follow)
        self.assertEqual(result['diff'], [])

    def test_create_content_tempfile(self):
        instance = ActionModule()
        content = 'test_content'
        content_tempfile = instance._create_content_tempfile(content)
        self.assertEqual(content_tempfile, 'test_content_tempfile')

    def test_remove_tempfile_if_content_defined(self):
        instance = ActionModule()
        content = 'test_content'
        content_tempfile = 'test_content_tempfile'
        instance._remove_tempfile_if_content_defined(content, content_tempfile)
        self.assertEqual(content_tempfile, 'test_content_tempfile')

if __name__ == '__main__':
    unittest.main()