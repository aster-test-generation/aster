
import unittest
from ansible.module_utils.compat.version import *

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, ())
    def test_prerelease(self):
        instance = Version()
        self.assertEqual(instance.prerelease, None)
    def test_parse(self):
        instance = Version()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))
        self.assertEqual(instance.prerelease, None)
    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, '')
    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('')")
    def test_eq(self):
        instance = Version()
        result = instance.__eq__(Version())
        self.assertEqual(result, True)
    def test_lt(self):
        instance = Version()
        result = instance.__lt__(Version())
        self.assertEqual(result, False)
    def test_le(self):
        instance = Version()
        result = instance.__le__(Version())
        self.assertEqual(result, True)
    def test_gt(self):
        instance = Version()
        result = instance.__gt__(Version())
        self.assertEqual(result, False)
    def test_ge(self):
        instance = Version()
        result = instance.__ge__(Version())
        self.assertEqual(result, True)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, ())
        self.assertEqual(instance.prerelease, None)
    def test_parse(self):
        instance = StrictVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))
        self.assertEqual(instance.prerelease, None)
    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, '1.2.3')
    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('1.2.3')")
    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__(StrictVersion())
        self.assertEqual(result, True)
    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__(StrictVersion())
        self.assertEqual(result, False)
    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__(StrictVersion())
        self.assertEqual(result, True)
    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__(StrictVersion())
        self.assertEqual(result, False)
    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__(StrictVersion())
        self.assertEqual(result, True)

class TestLooseVersion(unittest.TestCase):
    def test_looseversion(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, ())
    def test_parse(self):
        instance = LooseVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))
    def test_str(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, '1.2.3')
    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('1.2.3')")

if __name__ == '__main__':
    unittest.main()