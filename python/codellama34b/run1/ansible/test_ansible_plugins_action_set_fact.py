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

    def test_run_with_facts(self):
        instance = ActionModule()
        result = instance.run(facts={})
        self.assertEqual(result, None)

    def test_run_with_tmp_and_facts(self):
        instance = ActionModule()
        result = instance.run(tmp=None, facts={})
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_facts(self):
        instance = ActionModule()
        result = instance.run(task_vars=None, facts={})
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_and_facts(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, facts={})
        self.assertEqual(result, None)

    def test_run_with_cacheable(self):
        instance = ActionModule()
        result = instance.run(cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(tmp=None, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(task_vars=None, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_facts_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(facts={}, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_facts_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(tmp=None, facts={}, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_task_vars_and_facts_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(task_vars=None, facts={}, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_tmp_and_task_vars_and_facts_and_cacheable(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None, facts={}, cacheable=None)
        self.assertEqual(result, None)

    def test_run_with_facts_and_cacheable_and_task_vars(self):
        instance = ActionModule()
        result = instance.run(facts={}, cacheable=None, task_vars=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()