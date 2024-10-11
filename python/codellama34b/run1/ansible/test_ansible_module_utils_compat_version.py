import unittest
from ansible.module_utils.compat.version import *



class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, '1.0.0')

    def test_prerelease(self):
        instance = Version()
        self.assertEqual(instance.pre, None)

    def test_parse(self):
        instance = Version()
        instance.parse_version('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))

    def test_str(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('None')")

    def test_repr(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, "Version ('None')")

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
    def test_strictversion(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, '0.1.0')

    def test_prerelease(self):
        instance = StrictVersion()
        self.assertEqual(instance.pre, None)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))

    def test_str(self):
        instance = StrictVersion()
        result = instance.version
        self.assertEqual(result, "StrictVersion ('None')")

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__(1)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__(1)
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__(1)
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__(1)
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__(1)
        self.assertEqual(result, NotImplemented)

class TestLooseVersion(unittest.TestCase):
    def test_looseversion(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, '0.0.1')

    def test_parse(self):
        instance = LooseVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, [1, 2, 3])

    def test_str(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, "LooseVersion ('None')")

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, "Version ('None')")

    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('None')")

    def test_eq(self):
        instance = Version()
        result = instance.__eq__("1.0.0")
        self.assertEqual(result, False)

    def test_lt(self):
        instance = Version()
        result = instance.__lt__("1.0.0")
        self.assertEqual(result, False)

    def test_le(self):
        instance = Version()
        result = instance.__le__("1.0.0")
        self.assertEqual(result, False)

    def test_gt(self):
        instance = Version()
        result = instance.__gt__("1.0.0")
        self.assertEqual(result, False)

    def test_ge(self):
        instance = Version()
        result = instance.__ge__("1.0.0")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = Version()
        instance.parse("1.0.0")
        self.assertEqual(instance.version, (1, 0, 0))
        self.assertEqual(instance.prerelease, None)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__("1.0.0")
        self.assertEqual(result, False)

    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__("1.0.0")
        self.assertEqual(result, False)

    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__("1.0.0")
        self.assertEqual(result, False)

    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__("1.0.0")
        self.assertEqual(result, False)

    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__("1.0.0")
        self.assertEqual(result, False)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse("1.0.0")
        self.assertEqual(instance.version, (1, 0, 0))
        self.assertEqual(instance.prerelease, None)

class TestLooseVersion(unittest.TestCase):
    def test_looseversion(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, None)

    def test_str(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, "LooseVersion ('None')")

    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('None')")

class TestVersion(unittest.TestCase):
    def test_init(self):
        instance = Version()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('None')")

    def test_eq(self):
        instance = Version()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = Version()
        result = instance.__lt__(None)
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = Version()
        result = instance.__le__(None)
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = Version()
        result = instance.__gt__(None)
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = Version()
        result = instance.__ge__(None)
        self.assertEqual(result, NotImplemented)

    def test_parse(self):
        instance = Version()
        instance.parse(None)
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, "None")

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('None')")

    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__(None)
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__(None)
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__(None)
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__(None)
        self.assertEqual(result, NotImplemented)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse(None)
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, "None")

    def test__cmp(self):
        instance = StrictVersion()
        result = instance._cmp(None)
        self.assertEqual(result, NotImplemented)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('None')")

    def test_eq(self):
        instance = LooseVersion()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

if __name__ == '__main__':
    unittest.main()