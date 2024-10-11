import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        result = ActionModule().run()
        self.assertEqual(result, {})

    def test_supports_check_mode(self):
        self.assertTrue(ActionModule()._supports_check_mode)

    def test_supports_async(self):
        self.assertTrue(ActionModule()._supports_async)

    def test_remove_tmp_path(self):
        action_module = ActionModule()
        action_module._remove_tmp_path('/tmp/ansible-tmp-1234567890')
        self.assertEqual(action_module._connection._shell.tmpdir, '/tmp/ansible-tmp-1234567890')

if __name__ == '__main__':
    unittest.main()