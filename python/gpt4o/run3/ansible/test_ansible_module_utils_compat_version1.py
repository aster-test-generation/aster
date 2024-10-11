import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion

class TestVersion(unittest.TestCase):
    def test_version_init(self):
        version = Version("1.0")
        self.assertIsInstance(version, Version)

    def test_version_repr(self):
        version = Version("1.0")
        self.assertEqual(repr(version), "Version ('1.0')")

    def test_version_eq(self):
        version1 = Version("1.0")
        version2 = Version("1.0")
        self.assertTrue(version1 == version2)

    def test_version_lt(self):
        version1 = Version("1.0")
        version2 = Version("2.0")
        self.assertTrue(version1 < version2)

    def test_version_le(self):
        version1 = Version("1.0")
        version2 = Version("1.0")
        self.assertTrue(version1 <= version2)

    def test_version_gt(self):
        version1 = Version("2.0")
        version2 = Version("1.0")
        self.assertTrue(version1 > version2)

    def test_version_ge(self):
        version1 = Version("1.0")
        version2 = Version("1.0")
        self.assertTrue(version1 >= version2)

class TestStrictVersion(unittest.TestCase):
    def test_strict_version_init(self):
        version = StrictVersion("1.0")
        self.assertIsInstance(version, StrictVersion)

    def test_strict_version_parse(self):
        version = StrictVersion("1.0")
        self.assertEqual(version.version, (1, 0, 0))

    def test_strict_version_str(self):
        version = StrictVersion("1.0")
        self.assertEqual(str(version), "1.0")

    def test_strict_version_repr(self):
        version = StrictVersion("1.0")
        self.assertEqual(repr(version), "StrictVersion ('1.0')")

    def test_strict_version_cmp(self):
        version1 = StrictVersion("1.0")
        version2 = StrictVersion("2.0")
        self.assertEqual(version1._cmp(version2), -1)

    def test_strict_version_eq(self):
        version1 = StrictVersion("1.0")
        version2 = StrictVersion("1.0")
        self.assertTrue(version1 == version2)

    def test_strict_version_lt(self):
        version1 = StrictVersion("1.0")
        version2 = StrictVersion("2.0")
        self.assertTrue(version1 < version2)

    def test_strict_version_le(self):
        version1 = StrictVersion("1.0")
        version2 = StrictVersion("1.0")
        self.assertTrue(version1 <= version2)

    def test_strict_version_gt(self):
        version1 = StrictVersion("2.0")
        version2 = StrictVersion("1.0")
        self.assertTrue(version1 > version2)

    def test_strict_version_ge(self):
        version1 = StrictVersion("1.0")
        version2 = StrictVersion("1.0")
        self.assertTrue(version1 >= version2)

class TestLooseVersion(unittest.TestCase):
    def test_loose_version_init(self):
        version = LooseVersion("1.0")
        self.assertIsInstance(version, LooseVersion)

    def test_loose_version_parse(self):
        version = LooseVersion("1.0")
        self.assertEqual(version.version, [1, 0])

    def test_loose_version_str(self):
        version = LooseVersion("1.0")
        self.assertEqual(str(version), "1.0")

    def test_loose_version_repr(self):
        version = LooseVersion("1.0")
        self.assertEqual(repr(version), "LooseVersion ('1.0')")

    def test_loose_version_cmp(self):
        version1 = LooseVersion("1.0")
        version2 = LooseVersion("2.0")
        self.assertEqual(version1._cmp(version2), -1)

    def test_loose_version_eq(self):
        version1 = LooseVersion("1.0")
        version2 = LooseVersion("1.0")
        self.assertTrue(version1 == version2)

    def test_loose_version_lt(self):
        version1 = LooseVersion("1.0")
        version2 = LooseVersion("2.0")
        self.assertTrue(version1 < version2)

    def test_loose_version_le(self):
        version1 = LooseVersion("1.0")
        version2 = LooseVersion("1.0")
        self.assertTrue(version1 <= version2)

    def test_loose_version_gt(self):
        version1 = LooseVersion("2.0")
        version2 = LooseVersion("1.0")
        self.assertTrue(version1 > version2)

    def test_loose_version_ge(self):
        version1 = LooseVersion("1.0")
        version2 = LooseVersion("1.0")
        self.assertTrue(version1 >= version2)

if __name__ == '__main__':
    unittest.main()