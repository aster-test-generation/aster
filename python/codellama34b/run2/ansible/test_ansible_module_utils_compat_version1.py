
import unittest
from ansible.module_utils.compat.version import *

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        result = instance.version
        self.assertEqual(result, None)

    def test_prerelease(self):
        instance = Version()
        result = instance.prerelease
        self.assertEqual(result, None)

    def test_parse(self):
        instance = Version()
        instance.parse("1.2.3")
        result = instance.version
        self.assertEqual(result, (1, 2, 3))

    def test_str(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__str__()
        self.assertEqual(result, "1.2.3")

    def test_repr(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__repr__()
        self.assertEqual(result, "Version ('1.2.3')")

    def test_eq(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__eq__("1.2.3")
        self.assertEqual(result, True)

    def test_lt(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__lt__("1.2.3")
        self.assertEqual(result, False)

    def test_le(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__le__("1.2.3")
        self.assertEqual(result, True)

    def test_gt(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__gt__("1.2.3")
        self.assertEqual(result, False)

    def test_ge(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__ge__("1.2.3")
        self.assertEqual(result, True)

    def test_cmp(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance._cmp("1.2.3")
        self.assertEqual(result, 0)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        result = instance.version
        self.assertEqual(result, None)

    def test_prerelease(self):
        instance = StrictVersion()
        result = instance.prerelease
        self.assertEqual(result, None)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse("1.2.3")
        result = instance.version
        self.assertEqual(result, (1, 2, 3))

    def test_str(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__str__()
        self.assertEqual(result, "1.2.3")

    def test_repr(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('1.2.3')")

    def test_eq(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__eq__("1.2.3")
        self.assertEqual(result, True)

    def test_lt(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__lt__("1.2.3")
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()