import unittest
from ansible.plugins.action.yaml import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg(self):
        instance = ActionModule()
        result = instance.run(task_vars={'msg': 'test_msg'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'test_msg')

if __name__ == '__main__':
    unittest.main()