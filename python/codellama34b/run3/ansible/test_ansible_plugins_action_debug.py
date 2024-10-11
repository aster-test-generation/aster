import unittest
from ansible.plugins.action.yaml import ActionModule
from ansible.errors import AnsibleUndefinedVariable
from ansible.module_utils.six import string_types
from ansible.module_utils._text import to_text



class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run()
        self.assertEqual(result, {})

    def test_run_with_tmp_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_msg_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_verbosity(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_msg(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var_and_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var_and_var_and_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

    def test_run_with_var_and_var_and_var_and_var_and_var_and_var_and_var_and_var_and_var_and_var(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()