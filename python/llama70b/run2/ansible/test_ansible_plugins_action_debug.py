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
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_var(self):
        instance = ActionModule()
        task_vars = {'var': 'my_var'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('my_var', result)
        self.assertIsNotNone(result['my_var'])

    def test_run_with_verbosity(self):
        instance = ActionModule()
        task_vars = {'verbosity': 1}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('_ansible_verbose_always', result)
        self.assertTrue(result['_ansible_verbose_always'])

    def test_run_with_incompatible_options(self):
        instance = ActionModule()
        task_vars = {'msg': 'Hello world!', 'var': 'my_var'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('failed', result)
        self.assertTrue(result['failed'])

    def test__templar_template(self):
        instance = ActionModule()
        templar = instance._templar
        result = templar.template('my_var', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, 'my_var')

    def test__display_verbosity(self):
        instance = ActionModule()
        display = instance._display
        self.assertIsNotNone(display.verbosity)

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ActionModule()')

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()