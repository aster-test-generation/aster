import unittest
from ansible.module_utils._text import to_native


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

    def test_run_incompatible_options(self):
        instance = ActionModule()
        task_vars = {'msg': 'Hello world!', 'var': 'foo'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('failed', result)
        self.assertTrue(result['failed'])
        self.assertIn('msg', result)
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

    def test_run_verbosity(self):
        instance = ActionModule()
        task_vars = {'verbosity': 1}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('_ansible_verbose_always', result)
        self.assertTrue(result['_ansible_verbose_always'])

    def test_run_skipped(self):
        instance = ActionModule()
        task_vars = {'verbosity': 0}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertIn('skipped_reason', result)
        self.assertEqual(result['skipped_reason'], "Verbosity threshold not met.")
        self.assertIn('skipped', result)
        self.assertTrue(result['skipped'])

    def test__templar_template(self):
        instance = ActionModule()
        templar = instance._templar
        result = templar.template('Hello {{ world }}!', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, 'Hello world!')

    def test__templar_template_undefined(self):
        instance = ActionModule()
        templar = instance._templar
        with self.assertRaises(AnsibleUndefinedVariable):
            templar.template('Hello {{ undefined }}!', convert_bare=True, fail_on_undefined=True)

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, "ActionModule")

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, "ActionModule()")

if __name__ == '__main__':
    unittest.main()