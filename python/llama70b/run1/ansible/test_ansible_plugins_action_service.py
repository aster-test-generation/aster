import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test_TRANSFERS_FILES(self):
        instance = ActionModule()
        self.assertFalse(instance.TRANSFERS_FILES)

    def test_UNUSED_PARAMS(self):
        instance = ActionModule()
        self.assertIsInstance(instance.UNUSED_PARAMS, dict)

    def test_BUILTIN_SVC_MGR_MODULES(self):
        instance = ActionModule()
        self.assertIsInstance(instance.BUILTIN_SVC_MGR_MODULES, set)

    def test__supports_check_mode(self):
        instance = ActionModule()
        self.assertTrue(instance._supports_check_mode)

    def test__supports_async(self):
        instance = ActionModule()
        self.assertTrue(instance._supports_async)

    def test__execute_module(self):
        instance = ActionModule()
        module_name = 'ansible.legacy.setup'
        module_args = dict(gather_subset='!all', filter='ansible_service_mgr')
        task_vars = {}
        result = instance._execute_module(module_name, module_args, task_vars)
        self.assertIsInstance(result, dict)

    def test__remove_tmp_path(self):
        instance = ActionModule()
        tmpdir = '/tmp'
        instance._remove_tmp_path(tmpdir)
        # no assertion, just test that it doesn't raise an error

    def test_str(self):
        instance = ActionModule()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test_repr(self):
        instance = ActionModule()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test_eq(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()