import unittest
from ansible.plugins.action.fail import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_without_msg(self):
        def setUp(self):
        result = action.run(None, None)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_msg(self):
        def setUp(self):
        result = action.run(None, None, msg='Custom message')
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')

    def test_run_with_msg_and_other_args(self):
        def setUp(self):
        result = action.run(None, None, msg='Custom message', other_arg=123)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')
        self.assertEqual(result['other_arg'], 123)

    def test_run_with_msg_and_invalid_arg(self):
        action = ActionModule(connection=None,
        with self.assertRaises(TypeError):
            action.run(None, None, msg='Custom message', invalid_arg=456)

if __name__ == '__main__':
    unittest.main()