
import unittest
from ansible.module_utils.compat.version import *

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, None)

    def test_prerelease(self):
        instance = Version()
        self.assertEqual(instance.prerelease, None)

    def test_parse(self):
        instance = Version()
        instance.parse('1.0')
        self.assertEqual(instance.version, (1, 0))

    def test_str(self):
        instance = Version()
        self.assertEqual(str(instance), '1.0')

    def test_repr(self):
        instance = Version()
        self.assertEqual(repr(instance), "Version ('1.0')")

    def test_eq(self):
        instance = Version()
        self.assertEqual(instance == '1.0', True)

    def test_lt(self):
        instance = Version()
        self.assertEqual(instance < '1.0', False)

    def test_le(self):
        instance = Version()
        self.assertEqual(instance <= '1.0', True)

    def test_gt(self):
        instance = Version()
        self.assertEqual(instance > '1.0', False)

    def test_ge(self):
        instance = Version()
        self.assertEqual(instance >= '1.0', True)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, None)

    def test_prerelease(self):
        instance = StrictVersion()
        self.assertEqual(instance.prerelease, None)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse('1.0')
        self.assertEqual(instance.version, (1, 0))

    def test_str(self):
        instance = StrictVersion()
        self.assertEqual(str(instance), '1.0')

    def test_repr(self):
        instance = StrictVersion()
        self.assertEqual(repr(instance), "StrictVersion ('1.0')")

    def test_eq(self):
        instance = StrictVersion()
        self.assertEqual(instance == '1.0', True)

    def test_lt(self):
        instance = StrictVersion()
        self.assertEqual(instance < '1.0', False)

    def test_le(self):
        instance = StrictVersion()
        self.assertEqual(instance <= '1.0', True)

    def test_gt(self):
        instance = StrictVersion()
        self.assertEqual(instance > '1.0', False)

    def test_ge(self):
        instance = StrictVersion()
        self.assertEqual(instance >= '1.0', True)

class TestLooseVersion(unittest.TestCase):
    def test_looseversion(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, None)

    def test_parse(self):
        instance = LooseVersion()
        instance.parse('1.0')
        self.assertEqual(instance.version, (1, 0))

    def test_str(self):
        instance = LooseVersion()
        self.assertEqual(str(instance), '1.0')

    def test_repr(self):
        instance = LooseVersion()
        self.assertEqual(repr(instance), "LooseVersion ('1.0')")

    def test_eq(self):
        instance = LooseVersion()
        self.assertEqual(instance == '1.0', True)

    def test_lt(self):
        instance = LooseVersion()
        self.assertEqual(instance < '1.0', False)

    def test_le(self):
        instance = LooseVersion()
        self.assertEqual(instance <= '1.0', True)

if __name__ == '__main__':
    unittest.main()