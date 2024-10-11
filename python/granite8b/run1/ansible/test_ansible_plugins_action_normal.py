import unittest
from ansible.plugins.action import normal


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run()
        self.assertEqual(result, {})

    def test_supports_check_mode(self):
        action = ActionModule()
        self.assertTrue(action._supports_check_mode)

    def test_supports_async(self):
        action = ActionModule()
        self.assertTrue(action._supports_async)

    def test_remove_tmp_path(self):
        action = ActionModule()
        action._remove_tmp_path('/tmp')
        self.assertEqual(action._remove_tmp_path, None)

    def test_execute_module(self):
        action = ActionModule()
        result = action._execute_module()
        self.assertEqual(result, {})

    def test_merge_hash(self):
        action = ActionModule()
        result = action._merge_hash()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()