import unittest
from ansible.module_utils._text import to_native


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = service.ActionModule()
        self.assertIsInstance(instance, service.ActionBase)

    def test_run(self):
        instance = service.ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test_supports_check_mode(self):
        instance = service.ActionModule()
        self.assertTrue(instance._supports_check_mode)

    def test_supports_async(self):
        instance = service.ActionModule()
        self.assertTrue(instance._supports_async)

    def test_transfers_files(self):
        instance = service.ActionModule()
        self.assertFalse(instance.TRANSFERS_FILES)

    def test_unused_params(self):
        instance = service.ActionModule()
        self.assertIsInstance(instance.UNUSED_PARAMS, dict)

    def test_builtin_svc_mgr_modules(self):
        instance = service.ActionModule()
        self.assertIsInstance(instance.BUILTIN_SVC_MGR_MODULES, set)

    def test_execute_module(self):
        instance = service.ActionModule()
        result = instance._execute_module(module_name='ansible.legacy.setup', module_args=dict(gather_subset='!all', filter='ansible_service_mgr'), task_vars=None)
        self.assertIsInstance(result, dict)

    def test_display_debug(self):
        instance = service.ActionModule()
        instance._display.debug("Test message")
        # No assertion, just testing that it doesn't raise an error

    def test_shared_loader_obj(self):
        instance = service.ActionModule()
        self.assertIsInstance(instance._shared_loader_obj, object)

    def test_module_loader_has_plugin(self):
        instance = service.ActionModule()
        self.assertTrue(instance._shared_loader_obj.module_loader.has_plugin('ansible.legacy.service'))

    def test_find_plugin_with_context(self):
        instance = service.ActionModule()
        context = instance._shared_loader_obj.module_loader.find_plugin_with_context('ansible.legacy.service', collection_list=None)
        self.assertIsInstance(context, object)

    def test_get_action_args_with_defaults(self):
        instance = service.ActionModule()
        new_module_args = instance._task.args.copy()
        result = instance._shared_loader_obj.module_loader.get_action_args_with_defaults(
            'ansible.legacy.service', new_module_args, instance._task.module_defaults, instance._templar,
            action_groups=instance._task._parent._play._action_groups
        )
        self.assertIsInstance(result, dict)

    def test_remove_tmp_path(self):
        instance = service.ActionModule()
        instance._remove_tmp_path(instance._connection._shell.tmpdir)
        # No assertion, just testing that it doesn't raise an error

    def test_private_method__execute_module(self):
        instance = service.ActionModule()
        result = instance._ActionModule__execute_module(module_name='ansible.legacy.setup', module_args=dict(gather_subset='!all', filter='ansible_service_mgr'), task_vars=None)
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = service.ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = service.ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()