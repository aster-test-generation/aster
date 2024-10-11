from pytutils.lazy.lazy_regex import _real_re_compile
import unittest
from pytutils.lazy.lazy_regex import InvalidPattern, LazyRegex, lazy_compile, install_lazy_compile, reset_compile
import re


class TestInvalidPattern(unittest.TestCase):
    def test_init(self):
        instance = InvalidPattern("Test message")
        self.assertEqual(instance.msg, "Test message")

    def test_format(self):
        instance = InvalidPattern("Test message")
        result = instance._format(e)
        self.assertEqual(result, "Invalid pattern(s) found. Test message")

    def test_unicode(self):
        instance = InvalidPattern("Test message")
        result = instance.__str__()
        self.assertEqual(result, "Invalid pattern(s) found. Test message")

    def test_str(self):
        instance = InvalidPattern("Test message")
        result = str(instance)
        self.assertEqual(result, "Invalid pattern(s) found. Test message")

    def test_repr(self):
        instance = InvalidPattern("Test message")
        e = None
        self.assertEqual(result, "InvalidPattern(Invalid pattern(s) found. Test message)")

    def test_eq(self):
        instance1 = InvalidPattern("Test message")
        instance2 = InvalidPattern("Test message")
        self.assertTrue(instance1 == instance2)

class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        instance = LazyRegex(args=("pattern",), kwargs={"flags": 0})
        self.assertIsNone(instance._real_regex)
        self.assertEqual(instance._regex_args, ("pattern",))
        self.assertEqual(instance._regex_kwargs, {"flags": 0})

    def test_compile_and_collapse(self):
        instance = LazyRegex(args=("pattern",), kwargs={"flags": 0})
        instance._compile_and_collapse()
        self.assertIsNotNone(instance._real_regex)

    def test_real_re_compile(self):
        instance = LazyRegex()
        result = instance._real_re_compile("pattern", 0)
        self.assertIsInstance(result, re.Pattern)

    def test_real_re_compile_invalid(self):
        instance = LazyRegex()
        with self.assertRaises(InvalidPattern):
            instance._real_re_compile("[", 0)

    def test_getstate(self):
        instance = LazyRegex(args=("pattern",), kwargs={"flags": 0})
        result = instance.__getstate__()
        self.assertEqual(result, {"args": ("pattern",), "kwargs": {"flags": 0}})

    def test_setstate(self):
        instance = LazyRegex()
        state = {"args": ("pattern",), "kwargs": {"flags": 0}}
        instance.__setstate__(state)
        self.assertEqual(instance._regex_args, ("pattern",))
        self.assertEqual(instance._regex_kwargs, {"flags": 0})

    def test_getattr(self):
        instance = LazyRegex(args=("pattern",), kwargs={"flags": 0})
        result = instance.findall("pattern")
        self.assertIsInstance(result, list)

class TestLazyCompileFunctions(unittest.TestCase):
    def test_lazy_compile(self):
        result = lazy_compile("pattern", flags=0)
        self.assertIsInstance(result, LazyRegex)

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)
        reset_compile()  # Reset to avoid side effects

    def test_reset_compile(self):
        install_lazy_compile()
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

if __name__ == '__main__':
    unittest.main()