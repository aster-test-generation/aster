import unittest
from ansible.plugins.action.fail import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_with_default_message(self):
        action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run()
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_custom_message(self):
        action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(msg='Custom message')
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom message')

    def test_run_with_empty_message(self):
        action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(msg='')
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], '')

    def test_run_with_none_message(self):
        action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(msg=None)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_run_with_invalid_message(self):
        action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(msg=123)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Failed as requested from task')

if __name__ == '__main__':
    unittest.main()