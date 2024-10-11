import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion


class TestVersion(unittest.TestCase):
    def test_init(self):
        v = Version()
        self.assertIsInstance(v, Version)

    def test_repr(self):
        v = Version()
        self.assertEqual(repr(v), "<class 'ansible.module_utils.compat.version.Version'> ()")

    def test_eq(self):
        v1 = Version()
        v2 = Version()
        self.assertEqual(v1, v2)

    def test_lt(self):
        v1 = Version()
        v2 = Version()
        self.assertFalse(v1 < v2)

    def test_le(self):
        v1 = Version()
        v2 = Version()
        self.assertTrue(v1 <= v2)

    def test_gt(self):
        v1 = Version()
        v2 = Version()
        self.assertFalse(v1 > v2)

    def test_ge(self):
        v1 = Version()
        v2 = Version()
        self.assertTrue(v1 >= v2)

class TestStrictVersion(unittest.TestCase):
    def test_parse(self):
        v = StrictVersion("1.2.3a4")
        self.assertEqual(v.version, (1, 2, 3))
        self.assertEqual(v.prerelease, ("a", 4))

    def test_str(self):
        v = StrictVersion("1.2.3a4")
        self.assertEqual(str(v), "1.2.3a4")

    def test_cmp(self):
        v1 = StrictVersion("1.2.3a4")
        v2 = StrictVersion("1.2.3a5")
        self.assertTrue(v1 < v2)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        v = LooseVersion("1.2.3")
        self.assertIsInstance(v, LooseVersion)

    def test_parse(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(v.version, [1, 2, 3])

    def test_str(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(str(v), "1.2.3")

    def test_repr(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(repr(v), "LooseVersion ('1.2.3')")

    def test_cmp(self):
        v1 = LooseVersion("1.2.3")
        v2 = LooseVersion("1.2.4")
        self.assertTrue(v1 < v2)

class TestVersion(unittest.TestCase):
    def test_init(self):
        v = Version()
        self.assertIsNone(v.version)
        v = Version("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))

    def test_repr(self):
        v = Version("1.2.3")
        self.assertEqual(repr(v), "Version ('1.2.3')")

    def test_eq(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.3")
        v3 = Version("1.2.4")
        self.assertEqual(v1, v2)
        self.assertNotEqual(v1, v3)

    def test_lt(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.4")
        v3 = Version("1.3.0")
        self.assertFalse(v1 < v1)
        self.assertTrue(v1 < v2)
        self.assertTrue(v1 < v3)

    def test_le(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.4")
        v3 = Version("1.3.0")
        self.assertTrue(v1 <= v1)
        self.assertTrue(v1 <= v2)
        self.assertTrue(v1 <= v3)

    def test_gt(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.4")
        v3 = Version("1.3.0")
        self.assertFalse(v1 > v1)
        self.assertFalse(v1 > v2)
        self.assertFalse(v1 > v3)

    def test_ge(self):
        v1 = Version("1.2.3")
        v2 = Version("1.2.4")
        v3 = Version("1.3.0")
        self.assertTrue(v1 >= v1)
        self.assertFalse(v1 >= v2)
        self.assertFalse(v1 >= v3)

class TestStrictVersion(unittest.TestCase):
    def test_parse(self):
        v = StrictVersion("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))
        v = StrictVersion("1.2.3a4")
        self.assertEqual(v.version, (1, 2, 3))
        self.assertEqual(v.prerelease, ("a", 4))

    def test_str(self):
        v = StrictVersion("1.2.3")
        self.assertEqual(str(v), "1.2.3")
        v = StrictVersion("1.2.3a4")
        self.assertEqual(str(v), "1.2.3a4")

    def test_cmp(self):
        v1 = StrictVersion("1.2.3")
        v2 = StrictVersion("1.2.3")
        v3 = StrictVersion("1.2.4")
        v4 = StrictVersion("1.2.3a4")
        v5 = StrictVersion("1.2.3a5")
        self.assertEqual(v1, v2)
        self.assertNotEqual(v1, v3)
        self.assertEqual(v4, v4)
        self.assertNotEqual(v4, v5)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        v = LooseVersion()
        self.assertIsNone(v.version)
        v = LooseVersion("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))

    def test_parse(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))
        v = LooseVersion("1.2.3a4")
        self.assertEqual(v.version, (1, 2, 3, "a", 4))

    def test_str(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(str(v), "1.2.3")
        v = LooseVersion("1.2.3a4")
        self.assertEqual(str(v), "1.2.3a4")

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

class TestVersion(unittest.TestCase):
    def test_init(self):
        v = Version()
        self.assertIsInstance(v, Version)

    def test_repr(self):
        v = Version()
        self.assertEqual(repr(v), "%s ('%s')" % (v.__class__.__name__, str(v)))

    def test_eq(self):
        v1 = Version()
        v2 = Version()
        self.assertEqual(v1, v2)

    def test_lt(self):
        v1 = Version()
        v2 = Version()
        self.assertFalse(v1 < v2)

    def test_le(self):
        v1 = Version()
        v2 = Version()
        self.assertTrue(v1 <= v2)

    def test_gt(self):
        v1 = Version()
        v2 = Version()
        self.assertFalse(v1 > v2)

    def test_ge(self):
        v1 = Version()
        v2 = Version()
        self.assertTrue(v1 >= v2)

class TestStrictVersion(unittest.TestCase):
    def test_parse(self):
        v = StrictVersion("1.2.3")
        self.assertEqual(v.version, (1, 2, 3))

    def test_str(self):
        v = StrictVersion("1.2.3")
        self.assertEqual(str(v), "1.2.3")

    def test_cmp(self):
        v1 = StrictVersion("1.2.3")
        v2 = StrictVersion("1.2.3")
        self.assertEqual(v1._cmp(v2), 0)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        v = LooseVersion()
        self.assertIsInstance(v, LooseVersion)

    def test_parse(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(v.version, [1, 2, 3])

    def test_str(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(str(v), "1.2.3")

    def test_repr(self):
        v = LooseVersion("1.2.3")
        self.assertEqual(repr(v), "LooseVersion ('%s')" % str(v))

    def test_cmp(self):
        v1 = LooseVersion("1.2.3")
        v2 = LooseVersion("1.2.3")
        self.assertEqual(v1._cmp(v2), 0)

if __name__ == '__main__':
    unittest.main()