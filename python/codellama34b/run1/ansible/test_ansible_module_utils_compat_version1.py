
import unittest
from ansible.module_utils.compat.version import *

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, "Version ('None')")

    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('None')")

    def test_eq(self):
        instance = Version()
        result = instance.__eq__("1.0.0")
        self.assertEqual(result, False)

    def test_lt(self):
        instance = Version()
        result = instance.__lt__("1.0.0")
        self.assertEqual(result, False)

    def test_le(self):
        instance = Version()
        result = instance.__le__("1.0.0")
        self.assertEqual(result, False)

    def test_gt(self):
        instance = Version()
        result = instance.__gt__("1.0.0")
        self.assertEqual(result, False)

    def test_ge(self):
        instance = Version()
        result = instance.__ge__("1.0.0")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = Version()
        instance.parse("1.0.0")
        self.assertEqual(instance.version, (1, 0, 0))
        self.assertEqual(instance.prerelease, None)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__("1.0.0")
        self.assertEqual(result, False)

    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__("1.0.0")
        self.assertEqual(result, False)

    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__("1.0.0")
        self.assertEqual(result, False)

    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__("1.0.0")
        self.assertEqual(result, False)

    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__("1.0.0")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse("1.0.0")
        self.assertEqual(instance.version, (1, 0, 0))
        self.assertEqual(instance.prerelease, None)

class TestLooseVersion(unittest.TestCase):
    def test_looseversion(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, None)

    def test_str(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, "LooseVersion ('None')")

    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('None')")

if __name__ == '__main__':
    unittest.main()