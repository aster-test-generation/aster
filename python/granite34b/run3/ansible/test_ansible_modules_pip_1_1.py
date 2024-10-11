import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils._text import to_native
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.six import PY3


class TestAnsibleModule(unittest.TestCase):
    def test_ansible_module(self):
        module = AnsibleModule(argument_spec={'name': {'type': 'str'}})
        self.assertEqual(module.params['name'], 'test')

class TestToNative(unittest.TestCase):
    def test_to_native(self):
        result = to_native('test')
        self.assertEqual(result, 'test')

class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale(module=None)
        self.assertTrue(result)

class TestPy3(unittest.TestCase):
    def test_py3(self):
        self.assertTrue(PY3)

if __name__ == '__main__':
    unittest.main()