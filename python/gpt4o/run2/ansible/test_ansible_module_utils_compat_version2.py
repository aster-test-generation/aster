import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion

class TestVersion(unittest.TestCase):
    def test_version_init(self):
        version = Version()
        self.assertIsInstance(version, Version)

    def test_version_repr(self):
        version = Version()
        self.assertEqual(repr(version), "Version ('')")

    def test_version_eq(self):
        version1 = Version()
        version2 = Version()
        self.assertTrue(version1 == version2)

    def test_version_lt(self):
        version1 = Version()
        version2 = Version()
        self.assertFalse(version1 < version2)

    def test_version_le(self):
        version1 = Version()
        version2 = Version()
        self.assertTrue(version1 <= version2)

    def test_version_gt(self):
        version1 = Version()
        version2 = Version()
        self.assertFalse(version1 > version2)

    def test_version_ge(self):
        version1 = Version()
        version2 = Version()
        self.assertTrue(version1 >= version2)

class TestStrictVersion(unittest.TestCase):
    def test_strict_version_init(self):
        version = StrictVersion()
        self.assertIsInstance(version, StrictVersion)

    def test_strict_version_parse(self):
        version = StrictVersion("1.2.3")
        self.assertEqual(version.version, (1, 2, 3))

    def test_strict_version_parse_invalid(self):
        with self.assertRaises(ValueError):
            StrictVersion("invalid")

    def test_strict_version_str(self):
        version = StrictVersion("1.2.3")
        self.assertEqual(str(version), "1.2.3")

    def test_strict_version_repr(self):
        version = StrictVersion("1.2.3")
        self.assertEqual(repr(version), "StrictVersion ('1.2.3')")

    def test_strict_version_cmp(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.4")
        self.assertEqual(version1._cmp(version2), -1)

    def test_strict_version_eq(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        self.assertTrue(version1 == version2)

    def test_strict_version_lt(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.4")
        self.assertTrue(version1 < version2)

    def test_strict_version_le(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.4")
        self.assertTrue(version1 <= version2)

    def test_strict_version_gt(self):
        version1 = StrictVersion("1.2.4")
        version2 = StrictVersion("1.2.3")
        self.assertTrue(version1 > version2)

    def test_strict_version_ge(self):
        version1 = StrictVersion("1.2.4")
        version2 = StrictVersion("1.2.3")
        self.assertTrue(version1 >= version2)

class TestLooseVersion(unittest.TestCase):
    def test_loose_version_init(self):
        version = LooseVersion()
        self.assertIsInstance(version, LooseVersion)

    def test_loose_version_parse(self):
        version = LooseVersion("1.2.3")
        self.assertEqual(version.version, [1, 2, 3])

    def test_loose_version_str(self):
        version = LooseVersion("1.2.3")
        self.assertEqual(str(version), "1.2.3")

    def test_loose_version_repr(self):
        version = LooseVersion("1.2.3")
        self.assertEqual(repr(version), "LooseVersion ('1.2.3')")

    def test_loose_version_cmp(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.4")
        self.assertEqual(version1._cmp(version2), -1)

    def test_loose_version_eq(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.3")
        self.assertTrue(version1 == version2)

    def test_loose_version_lt(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.4")
        self.assertTrue(version1 < version2)

    def test_loose_version_le(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.4")
        self.assertTrue(version1 <= version2)

    def test_loose_version_gt(self):
        version1 = LooseVersion("1.2.4")
        version2 = LooseVersion("1.2.3")
        self.assertTrue(version1 > version2)

    def test_loose_version_ge(self):
        version1 = LooseVersion("1.2.4")
        version2 = LooseVersion("1.2.3")
        self.assertTrue(version1 >= version2)

if __name__ == '__main__':
    unittest.main()