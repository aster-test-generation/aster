import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion

class TestVersion(unittest.TestCase):
    def test_version_init(self):
        instance = Version("1.0")
        self.assertEqual(instance.__repr__(), "Version ('1.0')")

    def test_version_repr(self):
        instance = Version("1.0")
        self.assertEqual(instance.__repr__(), "Version ('1.0')")

    def test_version_eq(self):
        instance1 = Version("1.0")
        instance2 = Version("1.0")
        self.assertTrue(instance1.__eq__(instance2))

    def test_version_lt(self):
        instance1 = Version("1.0")
        instance2 = Version("2.0")
        self.assertTrue(instance1.__lt__(instance2))

    def test_version_le(self):
        instance1 = Version("1.0")
        instance2 = Version("2.0")
        self.assertTrue(instance1.__le__(instance2))

    def test_version_gt(self):
        instance1 = Version("2.0")
        instance2 = Version("1.0")
        self.assertTrue(instance1.__gt__(instance2))

    def test_version_ge(self):
        instance1 = Version("2.0")
        instance2 = Version("1.0")
        self.assertTrue(instance1.__ge__(instance2))

class TestStrictVersion(unittest.TestCase):
    def test_strict_version_init(self):
        instance = StrictVersion("1.0")
        self.assertEqual(instance.version, (1, 0, 0))

    def test_strict_version_parse(self):
        instance = StrictVersion()
        instance.parse("1.0")
        self.assertEqual(instance.version, (1, 0, 0))

    def test_strict_version_str(self):
        instance = StrictVersion("1.0")
        self.assertEqual(instance.__str__(), "1.0")

    def test_strict_version_repr(self):
        instance = StrictVersion("1.0")
        self.assertEqual(instance.__repr__(), "StrictVersion ('1.0')")

    def test_strict_version_cmp(self):
        instance1 = StrictVersion("1.0")
        instance2 = StrictVersion("2.0")
        self.assertEqual(instance1._cmp(instance2), -1)

    def test_strict_version_eq(self):
        instance1 = StrictVersion("1.0")
        instance2 = StrictVersion("1.0")
        self.assertTrue(instance1.__eq__(instance2))

    def test_strict_version_lt(self):
        instance1 = StrictVersion("1.0")
        instance2 = StrictVersion("2.0")
        self.assertTrue(instance1.__lt__(instance2))

    def test_strict_version_le(self):
        instance1 = StrictVersion("1.0")
        instance2 = StrictVersion("2.0")
        self.assertTrue(instance1.__le__(instance2))

    def test_strict_version_gt(self):
        instance1 = StrictVersion("2.0")
        instance2 = StrictVersion("1.0")
        self.assertTrue(instance1.__gt__(instance2))

    def test_strict_version_ge(self):
        instance1 = StrictVersion("2.0")
        instance2 = StrictVersion("1.0")
        self.assertTrue(instance1.__ge__(instance2))

class TestLooseVersion(unittest.TestCase):
    def test_loose_version_init(self):
        instance = LooseVersion("1.0")
        self.assertEqual(instance.version, [1, 0])

    def test_loose_version_parse(self):
        instance = LooseVersion()
        instance.parse("1.0")
        self.assertEqual(instance.version, [1, 0])

    def test_loose_version_str(self):
        instance = LooseVersion("1.0")
        self.assertEqual(instance.__str__(), "1.0")

    def test_loose_version_repr(self):
        instance = LooseVersion("1.0")
        self.assertEqual(instance.__repr__(), "LooseVersion ('1.0')")

    def test_loose_version_cmp(self):
        instance1 = LooseVersion("1.0")
        instance2 = LooseVersion("2.0")
        self.assertEqual(instance1._cmp(instance2), -1)

    def test_loose_version_eq(self):
        instance1 = LooseVersion("1.0")
        instance2 = LooseVersion("1.0")
        self.assertTrue(instance1.__eq__(instance2))

    def test_loose_version_lt(self):
        instance1 = LooseVersion("1.0")
        instance2 = LooseVersion("2.0")
        self.assertTrue(instance1.__lt__(instance2))

    def test_loose_version_le(self):
        instance1 = LooseVersion("1.0")
        instance2 = LooseVersion("2.0")
        self.assertTrue(instance1.__le__(instance2))

    def test_loose_version_gt(self):
        instance1 = LooseVersion("2.0")
        instance2 = LooseVersion("1.0")
        self.assertTrue(instance1.__gt__(instance2))

    def test_loose_version_ge(self):
        instance1 = LooseVersion("2.0")
        instance2 = LooseVersion("1.0")
        self.assertTrue(instance1.__ge__(instance2))

if __name__ == '__main__':
    unittest.main()