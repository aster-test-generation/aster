import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test__supports_check_mode(self):
        instance = ActionModule()
        result = instance._supports_check_mode()
        self.assertEqual(result, True)

    def test__supports_async(self):
        instance = ActionModule()
        result = instance._supports_async()
        self.assertEqual(result, True)

    def test_run_2(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test__remove_tmp_path(self):
        instance = ActionModule()
        result = instance._remove_tmp_path()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()