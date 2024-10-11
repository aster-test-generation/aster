import unittest
from ansible.plugins.action import service


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_run_with_tmp(self):
        instance = ActionModule()
        result = instance.run(tmp=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars(self):
        instance = ActionModule()
        result = instance.run(task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test__supports_check_mode(self):
        instance = ActionModule()
        result = instance._supports_check_mode
        self.assertEqual(result, True)

    def test__supports_async(self):
        instance = ActionModule()
        result = instance._supports_async
        self.assertEqual(result, True)

    def test_TRANSFERS_FILES(self):
        result = ActionModule.TRANSFERS_FILES
        self.assertEqual(result, False)

    def test_UNUSED_PARAMS(self):
        result = ActionModule.UNUSED_PARAMS
        self.assertEqual(result, {'systemd': ['pattern', 'runlevel', 'sleep', 'arguments', 'args']})

    def test_BUILTIN_SVC_MGR_MODULES(self):
        result = ActionModule.BUILTIN_SVC_MGR_MODULES
        self.assertEqual(result, {'openwrt_init', 'service', 'systemd', 'sysvinit'})

    def test__execute_module(self):
        instance = ActionModule()
        result = instance._execute_module(module_name=None, module_args=None, task_vars=None, wrap_async=None)
        self.assertEqual(result, None)

    def test__remove_tmp_path(self):
        instance = ActionModule()
        result = instance._remove_tmp_path(None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()