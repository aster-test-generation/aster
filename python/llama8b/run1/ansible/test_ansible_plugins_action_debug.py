import unittest
from ansible.module_utils.basic import
from ansible.module_utils._text import to_text


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run({'msg': 'Hello world!'})
        self.assertEqual(result, {'msg': 'Hello world!', '_ansible_verbose_always': True, 'failed': False})

    def test_run_with_var(self):
        action = ActionModule()
        result = action.run({'var': 'Hello world!'})
        self.assertEqual(result, {'Hello world!': 'Hello world!', '_ansible_verbose_always': True, 'failed': False})

    def test_run_with_verbosity(self):
        action = ActionModule()
        result = action.run({'verbosity': 1})
        self.assertEqual(result, {'skipped_reason': "Verbosity threshold not met.", 'skipped': True, 'failed': False})

    def test_run_with_invalid_args(self):
        action = ActionModule()
        result = action.run({'msg': 'Hello world!', 'var': 'Hello world!'})
        self.assertEqual(result, {'failed': True, 'msg': "'msg' and 'var' are incompatible options"})

    def test_display_verbosity(self):
        action = ActionModule()
        self.assertEqual(action._display.verbosity, 0)

    def test_template(self):
        action = ActionModule()
        result = action._templar.template('Hello world!', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, 'Hello world!')

    def test_template_with_undefined_variable(self):
        action = ActionModule()
        with self.assertRaises(AnsibleUndefinedVariable):
            action._templar.template('{{ undefined_variable }}', convert_bare=True, fail_on_undefined=True)

    def test_template_with_list(self):
        action = ActionModule()
        result = action._templar.template('[1, 2, 3]', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, '[1, 2, 3]')

    def test_template_with_dict(self):
        action = ActionModule()
        result = action._templar.template('{"key": "value"}', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, '{"key": "value"}')

    def test_to_text(self):
        action = ActionModule()
        result = to_text('Hello world!')
        self.assertEqual(result, 'Hello world!')

    def test_to_text_with_unicode(self):
        action = ActionModule()
        result = to_text(u'Hello world!')
        self.assertEqual(result, 'Hello world!')

if __name__ == '__main__':
    unittest.main()