import unittest
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils._text import to_native
from ansible.module_utils.basic import AnsibleModule, is_executable, missing_required_lib
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.six import PY3


__metaclass__ = type
class TestModuleUtilsCompatVersion(unittest.TestCase):
    def test_LooseVersion(self):
        instance = LooseVersion()
        result = instance.parse("1.0")
        self.assertEqual(result, None)

    def test_LooseVersion_str(self):
        instance = LooseVersion()
        result = instance.vstring
        self.assertEqual(result, "1.0")

    def test_LooseVersion_repr(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, "1.0")

    def test_LooseVersion_eq(self):
        instance = LooseVersion()
        result = instance.__eq__(1.0)
        self.assertEqual(result, NotImplemented)

    def test_LooseVersion_ne(self):
        instance = LooseVersion()
        result = instance.__ne__(1.0)
        self.assertEqual(result, NotImplemented)

    def test_LooseVersion_lt(self):
        instance = LooseVersion()
        result = instance.__lt__(1.0)
        self.assertEqual(result, NotImplemented)

    def test_LooseVersion_le(self):
        instance = LooseVersion()
        result = instance.__le__(1.0)
        self.assertEqual(result, NotImplemented)

    def test_LooseVersion_gt(self):
        instance = LooseVersion()
        result = instance.__gt__(1.0)
        self.assertEqual(result, NotImplemented)

    def test_LooseVersion_ge(self):
        instance = LooseVersion()
        result = instance.__ge__(1.0)
        self.assertEqual(result, NotImplemented)

class TestModuleUtilsText(unittest.TestCase):
    def test_to_native(self):
        instance = to_native(None)
        result = instance.parse("1.0")
        self.assertEqual(result, 1.0)

    def test_to_native_str(self):
        instance = to_native(obj)
        result = instance.__str__()
        self.assertEqual(result, "1.0")

    def test_to_native_repr(self):
        instance = to_native(obj)
        result = instance.__repr__()
        self.assertEqual(result, "1.0")

    def test_to_native_eq(self):
        instance = to_native(10)
        result = instance.__eq__(1.0)
        self.assertEqual(result, True)

    def test_to_native_ne(self):
        instance = to_native(obj)
        result = instance.__ne__(1.0)
        self.assertEqual(result, False)

    def test_to_native_lt(self):
        instance = to_native(obj)
        result = instance.__lt__(1.0)
        self.assertEqual(result, False)

    def test_to_native_le(self):
        instance = to_native(obj)
        result = instance.__le__(1.0)
        self.assertEqual(result, True)

    def test_to_native_gt(self):
        instance = to_native(obj)
        result = instance.__gt__(1.0)
        self.assertEqual(result, False)

    def test_to_native_ge(self):
        instance = to_native(obj)
        result = instance.__ge__(1.0)
        self.assertEqual(result, True)

class TestModuleUtilsBasic(unittest.TestCase):
    def test_AnsibleModule(self):
        instance = AnsibleModule(argument_spec=dict())
        result = instance.parse("1.0")
        self.assertEqual(result, 1.0)

if __name__ == '__main__':
    unittest.main()