import unittest
from ansible.plugins.action.shell import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run()
        self.assertEqual(result, {'_uses_shell': True})

if __name__ == '__main__':
    unittest.main()