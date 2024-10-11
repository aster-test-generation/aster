import unittest
from ansible.module_utils.compat.version import *


class TestVersion(unittest.TestCase):
    def test_init(self):
        instance = Version()
        self.assertIsInstance(instance, Version)

    def test_repr(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, "Version ('')")

    def test_eq(self):
        instance = Version()
        result = instance.__eq__(instance)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = Version()
        result = instance.__lt__(2)
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = Version()
        result = instance.__le__(2)
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = Version()
        result = instance.__gt__(2)
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = Version()
        result = instance.__ge__(2)
        self.assertEqual(result, NotImplemented)

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        instance = StrictVersion()
        self.assertIsInstance(instance, StrictVersion)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse("1.2.3a4")
        self.assertEqual(instance.version, (1, 2, 3))
        self.assertEqual(instance.prerelease, ("a", 4))

    def test_str(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        instance.prerelease = ("a", 4)
        result = instance.__str__()
        self.assertEqual(result, "1.2.3a4")

    def test_cmp(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        instance.prerelease = ("a", 4)
        result = instance._cmp("1.2.3a4")
        self.assertEqual(result, 0)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        instance = LooseVersion()
        self.assertIsInstance(instance, LooseVersion)

    def test_parse(self):
        instance = LooseVersion()
        instance.parse("1.2.3a4")
        self.assertEqual(instance.version, [1, 2, 3, "a", 4])

    def test_str(self):
        instance = LooseVersion()
        instance.version = [1, 2, 3, "a", 4]
        result = instance.__str__()
        self.assertEqual(result, "1.2.3a4")

    def test_repr(self):
        instance = LooseVersion()
        instance.version = [1, 2, 3, "a", 4]
        result = instance.__str__()
        self.assertEqual(result, "LooseVersion ('1.2.3a4')")

    def test_cmp(self):
        instance = LooseVersion()
        instance.version = [1, 2, 3, "a", 4]
        result = instance._cmp("1.2.3a4")
        self.assertEqual(result, 0)



class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.__repr__(), "Version ('')")

    def test_strict_version(self):
        instance = StrictVersion()
        self.assertEqual(instance.__repr__(), "StrictVersion ('')")

    def test_loose_version(self):
        instance = LooseVersion()
        self.assertEqual(instance.__repr__(), "LooseVersion ('')")

    def test_version_parse(self):
        instance = Version()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))

    def test_strict_version_parse(self):
        instance = StrictVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))

    def test_loose_version_parse(self):
        instance = LooseVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))

    def test_version_str(self):
        instance = Version()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__str__(), '1.2.3')

    def test_strict_version_str(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__str__(), '1.2.3')

    def test_loose_version_str(self):
        instance = LooseVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__str__(), '1.2.3')

    def test_version_eq(self):
        instance = Version()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__eq__(1), False)

    def test_strict_version_eq(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__eq__(1), False)

    def test_loose_version_eq(self):
        instance = LooseVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__eq__(1), False)

    def test_version_lt(self):
        instance = Version()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__lt__(1), False)

    def test_strict_version_lt(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__lt__(1), False)

    def test_loose_version_lt(self):
        instance = LooseVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__lt__(1), False)

    def test_version_le(self):
        instance = Version()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__le__(1), False)

    def test_strict_version_le(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__le__(1), False)

    def test_loose_version_le(self):
        instance = LooseVersion()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__le__(1), False)

    def test_version_gt(self):
        instance = Version()
        instance.version = (1, 2, 3)
        self.assertEqual(instance.__gt__(1), False)

if __name__ == '__main__':
    unittest.main()