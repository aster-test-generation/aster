import unittest
from ansible.module_utils.compat.version import StrictVersion, LooseVersion


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

        version.parse('1.2.3a4')
        self.assertEqual(version.version, (1, 2, 3))
        self.assertEqual(version.prerelease, ('a', 4))

    def test_str(self):
        version = StrictVersion('1.2.3')
        self.assertEqual(str(version), '1.2.3')

        version.prerelease = ('a', 4)
        self.assertEqual(str(version), '1.2.3a4')

    def test_cmp(self):
        version1 = StrictVersion('1.2.3')
        version2 = StrictVersion('1.2.3')
        self.assertEqual(version1._cmp(version2), 0)

        version2.version = (1, 2, 4)
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = (1, 2, 2)
        self.assertEqual(version1._cmp(version2), 1)

        version2.prerelease = ('a', 4)
        self.assertEqual(version1._cmp(version2), 1)

        version2.prerelease = ('b', 4)
        self.assertEqual(version1._cmp(version2), -1)

        version2.prerelease = ('a', 5)
        self.assertEqual(version1._cmp(version2), -1)

        version2.prerelease = ('a', 4)
        self.assertEqual(version1._cmp(version2), 0)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        version = LooseVersion('1.2.3')
        self.assertEqual(version.version, [1, 2, 3])

    def test_parse(self):
        version = LooseVersion()
        version.parse('1.2.3')
        self.assertEqual(version.version, [1, 2, 3])

        version.parse('1.2.3a4')
        self.assertEqual(version.version, [1, 2, 3, 'a', 4])

    def test_str(self):
        version = LooseVersion('1.2.3')
        self.assertEqual(str(version), '1.2.3')

        version.version = [1, 2, 3, 'a', 4]
        self.assertEqual(str(version), '1.2.3')

    def test_cmp(self):
        version1 = LooseVersion('1.2.3')
        version2 = LooseVersion('1.2.3')
        self.assertEqual(version1._cmp(version2), 0)

        version2.version = [1, 2, 4]
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = [1, 2, 2]
        self.assertEqual(version1._cmp(version2), 1)

        version2.version = [1, 2, 3, 'a', 4]
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = [1, 2, 3, 'b', 4]
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = [1, 2, 3, 'a', 5]
        self.assertEqual(version1._cmp(version2), -1)

        version2.version = [1, 2, 3, 'a', 4]
        self.assertEqual(version1._cmp(version2), -1)

if __name__ == '__main__':
    unittest.main()