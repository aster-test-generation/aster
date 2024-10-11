import unittest
from pytutils.lazy.lazy_regex import LazyRegex, InvalidPattern


class TestLazyRegex(unittest.TestCase):
    def test_lazy_regex_init(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_compile_and_collapse(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse(pattern)
        self.assertIsNotNone(lazy_regex._real_regex)

    def test_lazy_regex_real_re_compile(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        regex = lazy_regex._real_re_compile(pattern="test", flags=0)
        self.assertIsNotNone(regex)

    def test_lazy_regex_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            lazy_regex = LazyRegex(args=(), kwargs={})
            lazy_regex._real_re_compile(pattern="(", flags=0)

    def test_lazy_regex_get_state(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        state = lazy_regex.__getstate__()
        self.assertEqual(state, {"args": (), "kwargs": {}})

    def test_lazy_regex_set_state(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex.__setstate__({"args": (), "kwargs": {}})
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_get_attribute(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse()
        regex = lazy_regex._real_regex
        self.assertEqual(lazy_regex.attr, getattr(regex, "attr"))

    def test_lazy_regex_get_state(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        state = lazy_regex.__getstate__()
        self.assertEqual(state, {"args": (), "kwargs": {}})

    def test_lazy_regex_set_state(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex.__setstate__({"args": (), "kwargs": {}})
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_get_attribute(self):
        lazy_regex = LazyRegex(args=(), kwargs={})
        lazy_regex._compile_and_collapse()
        regex = lazy_regex._real_regex
        self.assertEqual(lazy_regex.attr, getattr(regex, "attr"))

if __name__ == '__main__':
    unittest.main()