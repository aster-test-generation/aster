import unittest
from ansible.plugins.action import *


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_supports_check_mode(self):
        instance = ActionModule()
        result = instance._supports_check_mode
        self.assertEqual(result, True)

    def test_supports_async(self):
        instance = ActionModule()
        result = instance._supports_async
        self.assertEqual(result, True)

    def test_execute_module(self):
        instance = ActionModule()
        result = instance._execute_module()
        self.assertEqual(result, None)

    def test_remove_tmp_path(self):
        instance = ActionModule()
        result = instance._remove_tmp_path()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()