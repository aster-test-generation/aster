import unittest
from ansible.plugins.action.shell import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run()
        self.assertEqual(result, expected_result)

if __name__ == '__main__':
    unittest.main()