import unittest
from ansible.module_utils._text import to_text
from ansible.module_utils.six import string_types
from ansible.errors import AnsibleUndefinedVariable
from ansible.module_utils.six import PY2

class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(None, None)
        self.assertEqual(result, {})

    def test_run_with_msg(self):
        action = ActionModule()
        result = action.run(None, None, {'msg': 'Hello world!'})
        self.assertEqual(result, {'msg': 'Hello world!', '_ansible_verbose_always': True, 'failed': False})

    def test_run_with_var(self):
        action = ActionModule()
        result = action.run(None, None, {'var': 'Hello world!'})
        self.assertEqual(result, {'Hello world!': 'Hello world!', '_ansible_verbose_always': True, 'failed': False})

    def test_run_with_verbosity(self):
        action = ActionModule()
        result = action.run(None, None, {'verbosity': 1})
        self.assertEqual(result, {'msg': 'Hello world!', '_ansible_verbose_always': True, 'failed': False})

    def test_run_with_incompatible_options(self):
        action = ActionModule()
        result = action.run(None, None, {'msg': 'Hello world!', 'var': 'Hello world!'})
        self.assertEqual(result, {'failed': True, 'msg': "'msg' and 'var' are incompatible options"})

    def test_template(self):
        action = ActionModule()
        result = action._templar.template('Hello world!', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, 'Hello world!')

    def test_template_with_undefined_variable(self):
        action = ActionModule()
        with self.assertRaises(AnsibleUndefinedVariable):
            action._templar.template('Hello world!', convert_bare=True, fail_on_undefined=True)

    def test_template_with_list(self):
        action = ActionModule()
        result = action._templar.template('[1, 2, 3]', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, '[1, 2, 3]')

    def test_template_with_dict(self):
        action = ActionModule()
        result = action._templar.template('{"a": 1, "b": 2}', convert_bare=True, fail_on_undefined=True)
        self.assertEqual(result, '{"a": 1, "b": 2}')

    def test_to_text(self):
        action = ActionModule()
        result = action._display.to_text('Hello world!')
        self.assertEqual(result, 'Hello world!')

    def test_to_text_with_unicode(self):
        action = ActionModule()
        result = action._display.to_text(u'Hello world!')
        self.assertEqual(result, 'Hello world!')

    def test_to_text_with_py2(self):
        if PY2:
            action = ActionModule()
            result = action._display.to_text(u'Hello world!')
            self.assertEqual(result, 'Hello world!')
        else:
            pass

    def test_repr(self):
        action = ActionModule()
        result = repr(action)
        self.assertEqual(result, 'ActionModule()')

    def test_str(self):
        action = ActionModule()
        result = str(action)
        self.assertEqual(result, 'ActionModule()')

    def test_eq(self):
        action1 = ActionModule()
        action2 = ActionModule()
        self.assertEqual(action1, action2)

if __name__ == '__main__':
    unittest.main()