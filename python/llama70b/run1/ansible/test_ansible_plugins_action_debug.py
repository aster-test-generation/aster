import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run(self):
        instance = ActionModule()
        task_vars = {'msg': 'Hello world!'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('msg', result)

    def test_run_incompatible_options(self):
        instance = ActionModule()
        task_vars = {'msg': 'Hello world!', 'var': 'foo'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('failed', result)

    def test_run_verbosity(self):
        instance = ActionModule()
        task_vars = {'verbosity': 1}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('_ansible_verbose_always', result)

    def test_run_skipped(self):
        instance = ActionModule()
        task_vars = {'verbosity': 0}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('skipped', result)

    def test__templar_template(self):
        instance = ActionModule()
        templar = instance._templar
        result = templar.template('foo', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, 'foo')

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()