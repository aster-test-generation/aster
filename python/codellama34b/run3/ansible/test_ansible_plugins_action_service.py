import unittest
from ansible.plugins.action import ActionModule



class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, None)

    def test_run_with_args(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto')
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_2(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto')
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_3(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all')
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_4(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr')
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_5(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr', async_val=None)
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_6(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr', async_val=None, action_groups=None)
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_7(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr', async_val=None, action_groups=None, _task=None)
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_8(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr', async_val=None, action_groups=None, _task=None, _connection=None)
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_9(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr', async_val=None, action_groups=None, _task=None, _connection=None, _play=None)
        self.assertEqual(result, None)

    def test_run_with_args_and_kwargs_10(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, module='auto', use='auto', gather_subset='!all', filter='ansible_service_mgr', async_val=None, action_groups=None, _task=None, _connection=None, _play=None, _loader=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()