
import unittest
from ansible.module_utils.compat.version import *

class TestVersion(unittest.TestCase):
    def test_init(self):
        instance = Version()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('None')")

    def test_eq(self):
        instance = Version()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = Version()
        result = instance.__lt__(None)
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = Version()
        result = instance.__le__(None)
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = Version()
        result = instance.__gt__(None)
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = Version()
        result = instance.__ge__(None)
        self.assertEqual(result, NotImplemented)

    def test_parse(self):
        instance = Version()
        instance.parse(None)
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, "None")

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__(None)
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__(None)
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__(None)
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__(None)
        self.assertEqual(result, NotImplemented)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse(None)
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, "None")

    def test__cmp(self):
        instance = StrictVersion()
        result = instance._cmp(None)
        self.assertEqual(result, NotImplemented)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('None')")

    def test_eq(self):
        instance = LooseVersion()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

if __name__ == '__main__':
    unittest.main()