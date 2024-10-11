import unittest
from ansible.plugins.action.normal import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_method(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        result = action_module.run()
        self.assertEqual(result, {})

    def test_run_method_with_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        task_vars = {'key': 'value'}
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_method_with_tmp(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = 'tmp_path'
        result = action_module.run(tmp=tmp)
        self.assertEqual(result, {})

    def test_run_method_with_tmp_and_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        tmp = 'tmp_path'
        task_vars = {'key': 'value'}
        result = action_module.run(tmp=tmp, task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_method_with_check_mode(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        self.assertTrue(action_module._supports_check_mode)

    def test_run_method_with_async(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        self.assertTrue(action_module._supports_async)

    def test_run_method_with_async_and_connection(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        connection = MagicMock()
        connection.has_native_async = True
        action_module._connection = connection
        result = action_module.run()
        self.assertEqual(result, {})

    def test_run_method_with_async_and_connection_and_task_vars(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        connection = MagicMock()
        connection.has_native_async = True
        action_module._connection = connection
        task_vars = {'key': 'value'}
        result = action_module.run(task_vars=task_vars)
        self.assertEqual(result, {})

    def test_run_method_with_async_and_connection_and_task_vars_and_module_args(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        connection = MagicMock()
        connection.has_native_async = True
        action_module._connection = connection
        task_vars = {'key': 'value'}
        module_args = {'module_args': 'args'}
        result = action_module.run(task_vars=task_vars, module_args=module_args)
        self.assertEqual(result, {})

    def test_run_method_with_async_and_connection_and_task_vars_and_module_args_and_verbose_override(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        connection = MagicMock()
        connection.has_native_async = True
        action_module._connection = connection
        task_vars = {'key': 'value'}
        module_args = {'module_args': 'args'}
        action_module._task.action = 'action'
        result = action_module.run(task_vars=task_vars, module_args=module_args)
        self.assertEqual(result, {})

    def test_run_method_with_async_and_connection_and_task_vars_and_module_args_and_verbose_override_and_async_val(self):
        action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)
        connection = MagicMock()
        connection.has_native_async = True
        action_module._connection = connection
        task_vars = {'key': 'value'}
        module_args = {'module_args': 'args'}
        action_module._task.action = 'action'
        action_module._task.async_val = True
        result = action_module.run(task_vars=task_vars, module_args=module_args)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()