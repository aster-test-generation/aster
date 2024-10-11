from pytutils.lazy.lazy_regex import _real_re_compile
import unittest
from pytutils.lazy.lazy_regex import *


class TestInvalidPattern(unittest.TestCase):
    def test_init(self):
        instance = InvalidPattern('test message')
        self.assertEqual(instance.msg, 'test message')

    def test_format(self):
        instance = InvalidPattern('test message')
        try:
        self.assertEqual(result, 'Invalid pattern(s) found. test message')

    def test_unicode(self):
        instance = InvalidPattern('test message')
        result = instance.__unicode__()
        self.assertEqual(result, u'Invalid pattern(s) found. test message')

    def test_str(self):
        instance = InvalidPattern('test message')
        try:
        self.assertEqual(result, 'Invalid pattern(s) found. test message')

    def test_repr(self):
        instance = InvalidPattern('test message')
        e = Exception()
        self.assertEqual(result, 'InvalidPattern(Invalid pattern(s) found. test message)')

    def test_get_format_string(self):
        instance = InvalidPattern('test message')
        from breezy import bzrlib
        self.assertEqual(result, 'Invalid pattern(s) found. %(msg)s')

    def test_eq(self):
        instance1 = InvalidPattern('test message')
        instance2 = InvalidPattern('test message')
        self.assertTrue(instance1 == instance2)

class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        instance = LazyRegex()
        self.assertIsNone(instance._real_regex)

    def test_compile_and_collapse(self):
        instance = LazyRegex('pattern')
        instance._compile_and_collapse()
        self.assertIsNotNone(instance._real_regex)

    def test_real_re_compile(self):
        instance = LazyRegex('pattern')
        result = instance._real_re_compile('pattern')
        self.assertIsNotNone(result)

    def test_getstate(self):
        instance = LazyRegex('pattern')
        result = instance.__getstate__()
        self.assertEqual(result, {"args": ('pattern',), "kwargs": {}})

    def test_setstate(self):
        instance = LazyRegex('pattern')
        state = {"args": ('pattern',), "kwargs": {}}
        instance.__setstate__(state)
        self.assertEqual(instance._regex_args, ('pattern',))
        self.assertEqual(instance._regex_kwargs, {})

    def test_getattr(self):
        instance = LazyRegex('pattern')
        instance._compile_and_collapse()
        result = instance.findall('string')
        self.assertIsNotNone(result)

    def test_lazy_compile(self):
        result = lazy_compile('pattern')
        self.assertIsInstance(result, LazyRegex)

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

if __name__ == '__main__':
    unittest.main()