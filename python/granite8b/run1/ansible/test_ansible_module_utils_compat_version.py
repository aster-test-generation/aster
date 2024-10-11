import unittest
from ansible.module_utils.compat.version import Version, StrictVersion, LooseVersion
import re
from ansible.module_utils.compat.version import StrictVersion, LooseVersion


class TestVersion(unittest.TestCase):
    def test_version_init(self):
        v = Version('1.2.3')
        self.assertEqual(v.version, (1, 2, 3))
        self.assertIsNone(v.prerelease)

    def test_version_str(self):
        v = Version('1.2.3')
        self.assertEqual(str(v), '1.2.3')

    def test_version_eq(self):
        v1 = Version('1.2.3')
        v2 = Version('1.2.3')
        self.assertEqual(v1, v2)

    def test_version_lt(self):
        v1 = Version('1.2.3')
        v2 = Version('1.2.4')
        self.assertTrue(v1 < v2)

    def test_version_gt(self):
        v1 = Version('1.2.4')
        v2 = Version('1.2.3')
        self.assertTrue(v1 > v2)

    def test_version_le(self):
        v1 = Version('1.2.3')
        v2 = Version('1.2.4')
        self.assertTrue(v1 <= v2)

    def test_version_ge(self):
        v1 = Version('1.2.4')
        v2 = Version('1.2.3')
        self.assertTrue(v1 >= v2)

class TestStrictVersion(unittest.TestCase):
    def test_strict_version_init(self):
        v = StrictVersion('1.2.3')
        self.assertEqual(v.version, (1, 2, 3))
        self.assertIsNone(v.prerelease)

    def test_strict_version_str(self):
        v = StrictVersion('1.2.3')
        self.assertEqual(str(v), '1.2.3')

    def test_strict_version_eq(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.3')
        self.assertEqual(v1, v2)

    def test_strict_version_lt(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.4')
        self.assertTrue(v1 < v2)

    def test_strict_version_gt(self):
        v1 = StrictVersion('1.2.4')
        v2 = StrictVersion('1.2.3')
        self.assertTrue(v1 > v2)

    def test_strict_version_le(self):
        v1 = StrictVersion('1.2.3')
        v2 = StrictVersion('1.2.4')
        self.assertTrue(v1 <= v2)

    def test_strict_version_ge(self):
        v1 = StrictVersion('1.2.4')
        v2 = StrictVersion('1.2.3')
        self.assertTrue(v1 >= v2)

class TestLooseVersion(unittest.TestCase):
    def test_loose_version_init(self):
        v = LooseVersion('1.2.3')
        self.assertEqual(v.version, ['1', '2', '3'])

    def test_loose_version_str(self):
        v = LooseVersion('1.2.3')
        self.assertEqual(str(v), '1.2.3')

    def test_loose_version_eq(self):
        v1 = LooseVersion('1.2.3')
        v2 = LooseVersion('1.2.3')
        self.assertEqual(v1, v2)

    def test_loose_version_lt(self):
        v1 = LooseVersion('1.2.3')
        v2 = LooseVersion('1.2.4')
        self.assertTrue(v1 < v2)

    def test_loose_version_gt(self):
        v1 = LooseVersion('1.2.4')
        v2 = LooseVersion('1.2.3')
        self.assertTrue(v1 > v2)

    def test_loose_version_le(self):
        v1 = LooseVersion('1.2.3')
        v2 = LooseVersion('1.2.4')
        self.assertTrue(v1 <= v2)

class TestStrictVersion:
    def test_init_with_string(self):
        version = StrictVersion("1.2.3")
        assert version.version == (1, 2, 3)

    def test_init_with_tuple(self):
        version = StrictVersion((1, 2, 3))
        assert version.version == (1, 2, 3)

    def test_str_method(self):
        version = StrictVersion("1.2.3")
        assert str(version) == "1.2.3"

    def test_repr_method(self):
        version = StrictVersion("1.2.3")
        assert repr(version) == "StrictVersion('1.2.3')"

    def test_eq_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        assert version1 == version2

    def test_lt_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.4")
        assert version1 < version2

    def test_le_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        assert version1 <= version2

    def test_gt_method(self):
        version1 = StrictVersion("1.2.4")
        version2 = StrictVersion("1.2.3")
        assert version1 > version2

    def test_ge_method(self):
        version1 = StrictVersion("1.2.3")
        version2 = StrictVersion("1.2.3")
        assert version1 >= version2

class TestLooseVersion:
    def test_init_with_string(self):
        version = LooseVersion("1.2.3")
        assert version.version == [1, 2, 3]

    def test_init_with_list(self):
        version = LooseVersion([1, 2, 3])
        assert version.version == [1, 2, 3]

    def test_str_method(self):
        version = LooseVersion("1.2.3")
        assert str(version) == "1.2.3"

    def test_repr_method(self):
        version = LooseVersion("1.2.3")
        assert repr(version) == "LooseVersion('1.2.3')"

    def test_eq_method(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.3")
        assert version1 == version2

    def test_lt_method(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.4")
        assert version1 < version2

    def test_le_method(self):
        version1 = LooseVersion("1.2.3")
        version2 = LooseVersion("1.2.3")
        assert version1 <= version2

    def test_gt_method(self):
        version1 = LooseVersion("1.2.4")
        version2 = LooseVersion("1.2.3")
        assert version1 > version2

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        version = StrictVersion('1.2.3')
        self.assertEqual(version.version, (1, 2, 3))
        self.assertIsNone(version.prerelease)

    def test_parse(self):
        version = StrictVersion()
        version.parse('1.2.3')
        self.assertEqual(version.version, (1, 2, 3))
        self.assertIsNone(version.prerelease)

        version.parse('1.2.3-alpha.1')
        self.assertEqual(version.version, (1, 2, 3))
        self.assertEqual(version.prerelease, ('alpha', 1))

    def test_str(self):
        version = StrictVersion('1.2.3')
        self.assertEqual(str(version), '1.2.3')

        version.prerelease = ('alpha', 1)
        self.assertEqual(str(version), '1.2.3-alpha.1')

    def test_cmp(self):
        version1 = StrictVersion('1.2.3')
        version2 = StrictVersion('1.2.3')
        self.assertEqual(version1._cmp(version2), 0)

        version2.version = (1, 2, 4)
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = (1, 2, 2)
        self.assertEqual(version1._cmp(version2), 1)

        version1.prerelease = ('alpha', 1)
        version2.prerelease = ('alpha', 1)
        self.assertEqual(version1._cmp(version2), 0)

        version2.prerelease = ('alpha', 2)
        self.assertEqual(version1._cmp(version2), -1)

        version2.prerelease = ('beta', 1)
        self.assertEqual(version1._cmp(version2), -1)

        version2.prerelease = ('beta', 2)
        self.assertEqual(version1._cmp(version2), 1)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        version = LooseVersion('1.2.3')
        self.assertEqual(version.version, [1, 2, 3])

    def test_parse(self):
        version = LooseVersion()
        version.parse('1.2.3')
        self.assertEqual(version.version, [1, 2, 3])

        version.parse('1.2.3-alpha.1')
        self.assertEqual(version.version, [1, 2, 3, 'alpha', 1])

    def test_str(self):
        version = LooseVersion('1.2.3')
        self.assertEqual(str(version), '1.2.3')

        version.version.append('alpha')
        self.assertEqual(str(version), '1.2.3-alpha')

    def test_cmp(self):
        version1 = LooseVersion('1.2.3')
        version2 = LooseVersion('1.2.3')
        self.assertEqual(version1._cmp(version2), 0)

        version2.version = [1, 2, 4]
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = [1, 2, 2]
        self.assertEqual(version1._cmp(version2), 1)

        version1.version.append('alpha')
        version2.version.append('alpha')
        self.assertEqual(version1._cmp(version2), 0)

        version2.version.append(2)
        self.assertEqual(version1._cmp(version2), -1)

        version2.version.append(1)
        self.assertEqual(version1._cmp(version2), 1)

if __name__ == '__main__':
    unittest.main()