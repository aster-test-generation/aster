import unittest
from ansible.plugins.action.copy import ActionModule


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertIsInstance(result, dict)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'src (or content) is required')

    def test_copy_file(self):
        instance = ActionModule()
        result = instance._copy_file(None, None, None, None, None, None, None)
        self.assertIsNone(result)

    def test_find_needle(self):
        instance = ActionModule()
        result = instance._find_needle(None, None)
        self.assertIsInstance(result, str)

    def test_remote_expand_user(self):
        instance = ActionModule()
        result = instance._remote_expand_user(None)
        self.assertIsInstance(result, str)

    def test_execute_module(self):
        instance = ActionModule()
        result = instance._execute_module(None, None, None)
        self.assertIsInstance(result, dict)

    def test_remove_tmp_path(self):
        instance = ActionModule()
        result = instance._remove_tmp_path(None)
        self.assertIsNone(result)

    def test_create_content_tempfile(self):
        instance = ActionModule()
        result = instance._create_content_tempfile(None)
        self.assertIsInstance(result, str)

    def test_ensure_invocation(self):
        instance = ActionModule()
        result = instance._ensure_invocation(None)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()