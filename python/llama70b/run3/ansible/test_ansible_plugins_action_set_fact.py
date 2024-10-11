import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        task_vars = {'foo': 'bar'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('ansible_facts', result)

    def test_run_no_task_vars(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIn('ansible_facts', result)

    def test_run_cacheable(self):
        instance = ActionModule()
        task_vars = {'foo': 'bar'}
        instance._task.args = {'cacheable': 'True'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('_ansible_facts_cacheable', result)

    def test_run_invalid_variable_name(self):
        instance = ActionModule()
        task_vars = {'foo': 'bar'}
        instance._task.args = {' invalid': 'value'}
        with self.assertRaises(AnsibleActionFail):
            instance.run(tmp=None, task_vars=task_vars)

    def test_run_no_key_value_pairs(self):
        instance = ActionModule()
        task_vars = {}
        with self.assertRaises(AnsibleActionFail):
            instance.run(tmp=None, task_vars=task_vars)

    def test__init__(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionBase)

    def test__str__(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, "ActionModule")

    def test__repr__(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, "ActionModule()")

    def test_run_private_method(self):
        instance = ActionModule()
        task_vars = {'foo': 'bar'}
        result = instance._ActionModule__run(tmp=None, task_vars=task_vars)
        self.assertIn('ansible_facts', result)

    def test_protected_method(self):
        instance = ActionModule()
        result = instance._templar.template('foo')
        self.assertEqual(result, 'foo')

if __name__ == '__main__':
    unittest.main()