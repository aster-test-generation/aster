import unittest
from ansible.plugins.action.service import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action_module = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_run_method(self):
        result = self.action_module.run()
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_and_task_vars(self):
        tmp = "tmp_path"
        task_vars = {}
        result = self.action_module.run(tmp, task_vars)
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_task_vars_and_use_param(self):
        tmp = "tmp_path"
        task_vars = {}
        use_param = "auto"
        result = self.action_module.run(tmp, task_vars, use_param)
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_task_vars_use_param_and_delegate_to(self):
        tmp = "tmp_path"
        task_vars = {}
        use_param = "auto"
        delegate_to = "host_name"
        result = self.action_module.run(tmp, task_vars, use_param, delegate_to)
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_task_vars_use_param_delegate_to_and_async_param(self):
        tmp = "tmp_path"
        task_vars = {}
        use_param = "auto"
        delegate_to = "host_name"
        async_param = True
        result = self.action_module.run(tmp, task_vars, use_param, delegate_to, async_param)
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_task_vars_use_param_delegate_to_async_param_and_check_mode(self):
        tmp = "tmp_path"
        task_vars = {}
        use_param = "auto"
        delegate_to = "host_name"
        async_param = True
        check_mode = True
        result = self.action_module.run(tmp, task_vars, use_param, delegate_to, async_param, check_mode)
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_task_vars_use_param_delegate_to_async_param_check_mode_and_svc_mgr(self):
        tmp = "tmp_path"
        task_vars = {}
        use_param = "auto"
        delegate_to = "host_name"
        async_param = True
        check_mode = True
        svc_mgr = "svc_mgr_name"
        result = self.action_module.run(tmp, task_vars, use_param, delegate_to, async_param, check_mode, svc_mgr)
        self.assertIsInstance(result, dict)

    def test_run_method_with_tmp_task_vars_use_param_delegate_to_async_param_check_mode_svc_mgr_and_svc_mgr_facts(self):
        tmp = "tmp_path"
        task_vars = {}
        use_param = "auto"
        delegate_to = "host_name"
        async_param = True
        check_mode = True
        svc_mgr = "svc_mgr_name"
        svc_mgr_facts = "svc_mgr_facts"
        result = self.action_module.run(tmp, task_vars, use_param, delegate_to, async_param, check_mode, svc_mgr, svc_mgr_facts)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()