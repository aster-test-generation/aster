import unittest
from ansible.module_utils.compat.version import *



class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, '1.0')

    def test_prerelease(self):
        instance = Version()
        self.assertEqual(instance.pre, None)

    def test_parse(self):
        instance = Version()
        instance.parse('')
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, '')

    def test_repr(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, '')

    def test_eq(self):
        instance = Version()
        result = instance.__eq__('')
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = Version()
        result = instance.__lt__(Version(''))
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = Version()
        result = instance.__le__('1.0.0')
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = Version()
        result = instance.__gt__('1.0.0')
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = Version()
        result = instance.__ge__(Version(''))
        self.assertEqual(result, NotImplemented)

class TestStrictVersion(unittest.TestCase):
    def test_version(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, '0.1.0')

    def test_prerelease(self):
        instance = StrictVersion()
        self.assertEqual(instance.pre, None)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse('0.0.0')
        self.assertEqual(instance.version, None)
        self.assertEqual(instance.prerelease, None)

    def test_str(self):
        instance = StrictVersion()
        result = instance.version
        self.assertEqual(result, '')

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, '')

    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__(StrictVersion(''))
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__(StrictVersion(''))
        self.assertEqual(result, NotImplemented)

    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__('')
        self.assertEqual(result, NotImplemented)

    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__('')
        self.assertEqual(result, NotImplemented)

    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__(StrictVersion(''))
        self.assertEqual(result, NotImplemented)

class TestLooseVersion(unittest.TestCase):
    def test_version(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, '1.0.0')

    def test_parse(self):
        instance = LooseVersion()
        instance.parse('')
        self.assertEqual(instance.version, [])

    def test_str(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, '')

    def test_repr(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, '')

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        result = instance.version
        self.assertEqual(result, None)

    def test_prerelease(self):
        instance = Version()
        result = instance.prerelease
        self.assertEqual(result, None)

    def test_parse(self):
        instance = Version()
        instance.parse("1.2.3")
        result = instance.version
        self.assertEqual(result, (1, 2, 3))

    def test_str(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__str__()
        self.assertEqual(result, "1.2.3")

    def test_repr(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__repr__()
        self.assertEqual(result, "Version ('1.2.3')")

    def test_eq(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__eq__("1.2.3")
        self.assertEqual(result, True)

    def test_lt(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__lt__("1.2.3")
        self.assertEqual(result, False)

    def test_le(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__le__("1.2.3")
        self.assertEqual(result, True)

    def test_gt(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__gt__("1.2.3")
        self.assertEqual(result, False)

    def test_ge(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance.__ge__("1.2.3")
        self.assertEqual(result, True)

    def test_cmp(self):
        instance = Version()
        instance.version = (1, 2, 3)
        result = instance._cmp("1.2.3")
        self.assertEqual(result, 0)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        result = instance.version
        self.assertEqual(result, None)

    def test_prerelease(self):
        instance = StrictVersion()
        result = instance.prerelease
        self.assertEqual(result, None)

    def test_parse(self):
        instance = StrictVersion()
        instance.parse("1.2.3")
        result = instance.version
        self.assertEqual(result, (1, 2, 3))

    def test_str(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__str__()
        self.assertEqual(result, "1.2.3")

    def test_repr(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('1.2.3')")

    def test_eq(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__eq__("1.2.3")
        self.assertEqual(result, True)

    def test_lt(self):
        instance = StrictVersion()
        instance.version = (1, 2, 3)
        result = instance.__lt__("1.2.3")
        self.assertEqual(result, False)

class TestVersion(unittest.TestCase):
    def test_init(self):
        instance = Version()
        self.assertIsInstance(instance, Version)

    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('')")

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
        instance.parse("")
        self.assertEqual(instance.version, ())

    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, '')

    def test_cmp(self):
        instance = Version()
        result = instance._cmp(None)
        self.assertEqual(result, NotImplemented)

class TestStrictVersion(unittest.TestCase):
    def test_init(self):
        instance = StrictVersion()
        self.assertIsInstance(instance, StrictVersion)

    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('')")

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
        instance.parse("")
        self.assertEqual(instance.version, ())

    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, '')

    def test_cmp(self):
        instance = StrictVersion()
        result = instance._cmp(None)
        self.assertEqual(result, NotImplemented)

class TestLooseVersion(unittest.TestCase):
    def test_init(self):
        instance = LooseVersion()
        self.assertIsInstance(instance, LooseVersion)

    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('')")

    def test_eq(self):
        instance = LooseVersion()
        result = instance.__eq__(None)
        self.assertEqual(result, NotImplemented)

    def test_lt(self):
        instance = LooseVersion()
        result = instance.__lt__(None)
        self.assertEqual(result, NotImplemented)

class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.version, ())
    def test_prerelease(self):
        instance = Version()
        self.assertEqual(instance.prerelease, None)
    def test_parse(self):
        instance = Version()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))
        self.assertEqual(instance.prerelease, None)
    def test_str(self):
        instance = Version()
        result = instance.__str__()
        self.assertEqual(result, '')
    def test_repr(self):
        instance = Version()
        result = instance.__repr__()
        self.assertEqual(result, "Version ('')")
    def test_eq(self):
        instance = Version()
        result = instance.__eq__(Version())
        self.assertEqual(result, True)
    def test_lt(self):
        instance = Version()
        result = instance.__lt__(Version())
        self.assertEqual(result, False)
    def test_le(self):
        instance = Version()
        result = instance.__le__(Version())
        self.assertEqual(result, True)
    def test_gt(self):
        instance = Version()
        result = instance.__gt__(Version())
        self.assertEqual(result, False)
    def test_ge(self):
        instance = Version()
        result = instance.__ge__(Version())
        self.assertEqual(result, True)

class TestStrictVersion(unittest.TestCase):
    def test_strictversion(self):
        instance = StrictVersion()
        self.assertEqual(instance.version, ())
        self.assertEqual(instance.prerelease, None)
    def test_parse(self):
        instance = StrictVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))
        self.assertEqual(instance.prerelease, None)
    def test_str(self):
        instance = StrictVersion()
        result = instance.__str__()
        self.assertEqual(result, '1.2.3')
    def test_repr(self):
        instance = StrictVersion()
        result = instance.__repr__()
        self.assertEqual(result, "StrictVersion ('1.2.3')")
    def test_eq(self):
        instance = StrictVersion()
        result = instance.__eq__(StrictVersion())
        self.assertEqual(result, True)
    def test_lt(self):
        instance = StrictVersion()
        result = instance.__lt__(StrictVersion())
        self.assertEqual(result, False)
    def test_le(self):
        instance = StrictVersion()
        result = instance.__le__(StrictVersion())
        self.assertEqual(result, True)
    def test_gt(self):
        instance = StrictVersion()
        result = instance.__gt__(StrictVersion())
        self.assertEqual(result, False)
    def test_ge(self):
        instance = StrictVersion()
        result = instance.__ge__(StrictVersion())
        self.assertEqual(result, True)

class TestLooseVersion(unittest.TestCase):
    def test_looseversion(self):
        instance = LooseVersion()
        self.assertEqual(instance.version, ())
    def test_parse(self):
        instance = LooseVersion()
        instance.parse('1.2.3')
        self.assertEqual(instance.version, (1, 2, 3))
    def test_str(self):
        instance = LooseVersion()
        result = instance.__str__()
        self.assertEqual(result, '1.2.3')
    def test_repr(self):
        instance = LooseVersion()
        result = instance.__repr__()
        self.assertEqual(result, "LooseVersion ('1.2.3')")

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


class TestVersion(unittest.TestCase):
    def test_version(self):
        instance = Version()
        self.assertEqual(instance.__repr__(), "Version ('')")
        self.assertEqual(instance.__str__(), '')
        self.assertEqual(instance.__eq__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__lt__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__le__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__gt__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__ge__(StrictVersion('1.2.3')), False)

    def test_strict_version(self):
        instance = StrictVersion('1.2.3')
        self.assertEqual(instance.__repr__(), "StrictVersion ('1.2.3')")
        self.assertEqual(instance.__str__(), '1.2.3')
        self.assertEqual(instance.__eq__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__lt__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__le__(StrictVersion('1.2.3')), True)
        self.assertEqual(instance.__gt__(StrictVersion('1.2.3')), False)
        self.assertEqual(instance.__ge__(StrictVersion('1.2.3')), True)

    def test_loose_version(self):
        instance = LooseVersion('1.2.3')
        self.assertEqual(instance.__repr__(), "LooseVersion ('1.2.3')")
        self.assertEqual(instance.__str__(), '1.2.3')
        self.assertEqual(instance.__eq__(LooseVersion('1.2.3')), True)
        self.assertEqual(instance.__lt__(LooseVersion('1.2.3')), False)
        self.assertEqual(instance.__le__(LooseVersion('1.2.3')), True)
        self.assertEqual(instance.__gt__(LooseVersion('1.2.3')), False)
        self.assertEqual(instance.__ge__(LooseVersion('1.2.3')), True)

if __name__ == '__main__':
    unittest.main()