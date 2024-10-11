import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion

class TestVersion(unittest.TestCase):
    def test_init(self):
        v = Version()
        self.assertIsNone(v.version)
        self.assertIsNone(v.prerelease)

        v = Version("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))
        self.assertIsNone(v.prerelease)

        v = Version("1.2.3a4")
        self.assertEqual(v.version, (1, 2, 3))
        self.assertEqual(v.prerelease, ("a", 4))

    def test_repr(self):
        v = Version("1.2.3")
        self.assertEqual(repr(v), "Version ('1.2.3')")

        v = Version("1.2.3a4")
        self.assertEqual(repr(v), "Version ('1.2.3a4')")

    def test_eq(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertEqual(v1, v2)

        v1 = Version("1.2.3a4")
        v2 = Version("1.2.3a4")
        self.assertEqual(v1, v2)

        v1 = Version("1.2.3")
        v2 = Version("1.2.3a4")
        self.assertNotEqual(v1, v2)

    def test_lt(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertFalse(v1 < v2)

        v1 = Version("1.2.3a4")
        v2 = Version("1.2.3a4")
        self.assertFalse(v1 < v2)

        v1 = Version("1.2.3")
        v2 = Version("1.2.3a4")
        self.assertTrue(v1 < v2)

    def test_le(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertTrue(v1 <= v2)

        v1 = Version("1.2.3a4")
        v2 = Version("1.2.3a4")
        self.assertTrue(v1 <= v2)

        v1 = Version("1.2.3")
        v2 = Version("1.2.3a4")
        self.assertTrue(v1 <= v2)

    def test_gt(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertFalse(v1 > v2)

        v1 = Version("1.2.3a4")
        v2 = Version("1.2.3a4")
        self.assertFalse(v1 > v2)

        v1 = Version("1.2.3")
        v2 = Version("1.2.3a4")
        self.assertFalse(v1 > v2)

    def test_ge(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        self.assertTrue(v1 >= v2)

        v1 = Version("1.2.3a4")
        v2 = Version("1.2.3a4")
        self.assertTrue(v1 >= v2)

        v1 = Version("1.2.3")
        v2 = Version("1.2.3a4")
        self.assertFalse(v1 >= v2)

class TestStrictVersion(unittest.TestCase):
    def test_parse(self):
        v = StrictVersion("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))
        self.assertIsNone(v.prerelease)

        v = StrictVersion("1.2.3a4")
        self.assertEqual(v.version, (1, 2, 3))
        self.assertEqual(v.prerelease, ("a", 4))

        with self.assertRaises(ValueError):
            StrictVersion("1.2.3.4")

if __name__ == '__main__':
    unittest.main()