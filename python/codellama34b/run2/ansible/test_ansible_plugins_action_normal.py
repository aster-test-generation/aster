import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertIsNotNone(result)

    def test_supports_check_mode(self):
        instance = ActionModule()
        result = instance._supports_check_mode
        self.assertTrue(result)

    def test_supports_async(self):
        instance = ActionModule()
        result = instance._supports_async
        self.assertTrue(result)

    def test_execute_module(self):
        instance = ActionModule()
        result = instance._execute_module()
        self.assertIsNotNone(result)

    def test_remove_tmp_path(self):
        instance = ActionModule()
        result = instance._remove_tmp_path()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()