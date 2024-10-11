import unittest
from ansible.plugins.action.debug import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_msg(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={'msg': 'Hello world!'})
        self.assertEqual(result['msg'], 'Hello world!')
        self.assertTrue(result['_ansible_verbose_always'])
        self.assertFalse(result['failed'])

    def test_run_var(self):
        from ansible.plugins.action.normal import ActionModule
        result = action.run(task_vars={'var': 'foo'})
        self.assertEqual(result['foo'], 'foo')
        self.assertTrue(result['_ansible_verbose_always'])
        self.assertFalse(result['failed'])

    def test_run_verbosity(self):
        action = ActionModule(connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={'verbosity': 1})
        self.assertEqual(result['skipped_reason'], 'Verbosity threshold not met.')
        self.assertTrue(result['skipped'])
        self.assertFalse(result['failed'])

    def test_run_both(self):
        def setUp(self):
        result = action.run(task_vars={'msg': 'Hello world!', 'var': 'foo'})
        self.assertEqual(result['msg'], 'Hello world!')
        self.assertEqual(result['foo'], 'foo')
        self.assertTrue(result['_ansible_verbose_always'])
        self.assertFalse(result['failed'])

    def test_run_neither(self):
        action = ActionModule(connection=None, loader=None, templar=None, shared_loader_obj=None)
        result = action.run(task_vars={})
        self.assertEqual(result['msg'], 'Hello world!')
        self.assertTrue(result['_ansible_verbose_always'])
        self.assertFalse(result['failed'])

if __name__ == '__main__':
    unittest.main()