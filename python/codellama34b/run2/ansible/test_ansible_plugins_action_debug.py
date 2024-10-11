import unittest
from ansible.plugins.action.yaml import *



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

    def test_run_with_msg_and_var(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var')
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_tmp(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', tmp=None)
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_task_vars(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_tmp_and_task_vars(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', tmp=None, task_vars=None)
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', verbosity=0)
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_tmp_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', tmp=None, verbosity=0)
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_task_vars_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', task_vars=None, verbosity=0)
        self.assertEqual(result, None)

    def test_run_with_msg_and_var_and_tmp_and_task_vars_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(msg='msg', var='var', tmp=None, task_vars=None, verbosity=0)
        self.assertEqual(result, None)

    def test_run_with_var_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(var='var', verbosity=0)
        self.assertEqual(result, None)

    def test_run_with_var_and_tmp_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(var='var', tmp=None, verbosity=0)
        self.assertEqual(result, None)

    def test_run_with_var_and_task_vars_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(var='var', task_vars=None, verbosity=0)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()