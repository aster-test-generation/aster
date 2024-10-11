import unittest
from ansible.module_utils.basic import


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action_module = ActionModule()
        result = action_module.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_supports_check_mode(self):
        action_module = ActionModule()
        self.assertTrue(action_module._supports_check_mode)

    def test_supports_async(self):
        action_module = ActionModule()
        self.assertTrue(action_module._supports_async)

    def test_execute_module(self):
        action_module = ActionModule()
        result = action_module._execute_module(task_vars=None, wrap_async=False)
        self.assertEqual(result, {})

    def test_remove_tmp_path(self):
        action_module = ActionModule()
        action_module._connection = object()
        action_module._connection._shell = object()
        action_module._connection._shell.tmpdir = 'tmpdir'
        action_module._remove_tmp_path('tmpdir')
        self.assertEqual(action_module._connection._shell.tmpdir, None)

    def test_merge_hash(self):
        action_module = ActionModule()
        result = action_module.merge_hash({}, {'a': 1, 'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_get_invocation(self):
        action_module = ActionModule()
        result = action_module._get_invocation()
        self.assertEqual(result, {})

    def test_get_module_args(self):
        action_module = ActionModule()
        result = action_module._get_module_args()
        self.assertEqual(result, {})

    def test_get_task(self):
        action_module = ActionModule()
        result = action_module._get_task()
        self.assertEqual(result, None)

    def test_get_connection(self):
        action_module = ActionModule()
        result = action_module._get_connection()
        self.assertEqual(result, None)

    def test_get_shell(self):
        action_module = ActionModule()
        result = action_module._get_shell()
        self.assertEqual(result, None)

    def test_get_task_vars(self):
        action_module = ActionModule()
        result = action_module._get_task_vars()
        self.assertEqual(result, None)

    def test_get_async_val(self):
        action_module = ActionModule()
        result = action_module._get_async_val()
        self.assertEqual(result, None)

    def test_get_connection_has_native_async(self):
        action_module = ActionModule()
        result = action_module._get_connection_has_native_async()
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()