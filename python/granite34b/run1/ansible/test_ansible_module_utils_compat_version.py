import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion
from ansible.module_utils.compat.version import StrictVersion, LooseVersion


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
        self.assertEqual(v1._cmp(v2), -1)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        v = LooseVersion()
        self.assertIsInstance(v, LooseVersion)

    def test_parse(self):
        v = LooseVersion("1.2.3a4")
        self.assertEqual(v.version, [1, 2, 3, "a", 4])

    def test_str(self):
        v = LooseVersion("1.2.3a4")
        self.assertEqual(str(v), "1.2.3a4")

    def test_repr(self):
        v = LooseVersion("1.2.3a4")
        self.assertEqual(repr(v), "LooseVersion ('1.2.3a4')")

    def test_cmp(self):
        v1 = LooseVersion("1.2.3a4")
        v2 = LooseVersion("1.2.3a5")
        self.assertEqual(v1._cmp(v2), -1)

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        v = StrictVersion('1.2.3')
        self.assertEqual(v.version, (1, 2, 3))
        self.assertIsNone(v.prerelease)

    def test_repr(self):
        v = StrictVersion('1.2.3')
        self.assertEqual(repr(v), "StrictVersion ('1.2.3')")

    def test_eq(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.3')
        v3 = StrictVersion('1.2.4')
        self.assertEqual(v1, v2)
        self.assertNotEqual(v1, v3)

    def test_lt(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.4')
        v3 = StrictVersion('1.3.0')
        self.assertLess(v1, v2)
        self.assertLess(v1, v3)

    def test_le(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.4')
        v3 = StrictVersion('1.3.0')
        self.assertLessEqual(v1, v2)
        self.assertLessEqual(v1, v3)
        self.assertLessEqual(v1, v1)

    def test_gt(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.2')
        v3 = StrictVersion('1.1.0')
        self.assertGreater(v1, v2)
        self.assertGreater(v1, v3)

    def test_ge(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.2')
        v3 = StrictVersion('1.1.0')
        self.assertGreaterEqual(v1, v2)
        self.assertGreaterEqual(v1, v3)
        self.assertGreaterEqual(v1, v1)

    def test_parse(self):
        v = StrictVersion('1.2.3a4')
        self.assertEqual(v.version, (1, 2, 3))
        self.assertEqual(v.prerelease, ('a', 4))

    def test_str(self):
        v = StrictVersion('1.2.3a4')
        self.assertEqual(str(v), '1.2.3a4')

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        v = LooseVersion('1.2.3')
        self.assertEqual(v.version, [1, 2, 3])

    def test_repr(self):
        v = LooseVersion('1.2.3')
        self.assertEqual(repr(v), "LooseVersion ('1.2.3')")

    def test_parse(self):
        v = LooseVersion('1.2.3a4')
        self.assertEqual(v.version, [1, 2, 3, 'a', 4])

    def test_str(self):
        v = LooseVersion('1.2.3a4')
        self.assertEqual(str(v), '1.2.3a4')

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