import unittest
from pytutils.lazy.lazy_regex import LazyRegex, InvalidPattern


class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_compile_and_collapse(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        self.assertIsNotNone(lazy_regex._real_regex)

    def test_real_re_compile(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        import re
        self.assertIsNotNone(regex)

    def test_real_re_compile_invalid_pattern(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        with self.assertRaises(InvalidPattern):
            lazy_regex._real_re_compile('invalid pattern')

    def test_getstate(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        state = lazy_regex.__getstate__()
        self.assertEqual(state, {"args": (), "kwargs": {}})

    def test_setstate(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex.__setstate__({"args": (), "kwargs": {}})
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_getattr(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        regex = lazy_regex._real_regex
        self.assertEqual(lazy_regex.attr, getattr(regex, "attr"))

    def test_install_lazy_compile(self):
        import re
        self.assertEqual(re.compile(''), LazyRegex(''))

    def test_reset_compile(self):
        import re
        re.compile = LazyRegex
        self.assertEqual(re.compile, LazyRegex)
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

if __name__ == '__main__':
    unittest.main()