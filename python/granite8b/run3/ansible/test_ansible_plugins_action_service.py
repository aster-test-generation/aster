import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run()
        self.assertEqual(result, {})

    def test_run_with_module(self):
        action = ActionModule(None, None, None)
        result = action.run(module='ansible.legacy.service')
        self.assertEqual(result, {})

    def test_run_with_use_auto(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto')
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_delegate_to(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost')
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', ansible_facts={'ansible_service_mgr': 'systemd'})
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'})
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to_and_module(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'}, module='ansible.legacy.service')
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to_and_module_and_args(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'}, module='ansible.legacy.service', name='nginx')
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to_and_module_and_args_and_state(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'}, module='ansible.legacy.service', name='nginx', state='started')
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to_and_module_and_args_and_state_and_sleep(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'}, module='ansible.legacy.service', name='nginx', state='started', sleep=5)
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to_and_module_and_args_and_state_and_sleep_and_pattern(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'}, module='ansible.legacy.service', name='nginx', state='started', sleep=5, pattern='nginx')
        self.assertEqual(result, {})

    def test_run_with_use_auto_and_facts_and_delegate_to_and_module_and_args_and_state_and_sleep_and_pattern_and_runlevel(self):
        action = ActionModule(None, None, None)
        result = action.run(use='auto', delegate_to='localhost', ansible_facts={'ansible_service_mgr': 'systemd'}, module='ansible.legacy.service', name='nginx', state='started', sleep=5, pattern='nginx', runlevel='5')
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()