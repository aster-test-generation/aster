import unittest
from pytutils.lazy.lazy_regex import LazyRegex, InvalidPattern


class TestLazyRegex(unittest.TestCase):
    def test_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex(args=("(",), kwargs={})

    def test_lazy_regex_init(self):
        lazy_regex = LazyRegex(args=("a*b+",), kwargs={})
        self.assertEqual(lazy_regex._regex_args, ("a*b+",))
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_getstate(self):
        lazy_regex = LazyRegex(args=("a*b+",), kwargs={})
        state = lazy_regex.__getstate__()
        self.assertEqual(state, {"args": ("a*b+",), "kwargs": {}})

    def test_lazy_regex_setstate(self):
        lazy_regex = LazyRegex(args=("a*b+",), kwargs={})
        state = {"args": ("a*b+",), "kwargs": {}}
        lazy_regex.__setstate__(state)
        self.assertEqual(lazy_regex._regex_args, ("a*b+",))
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_getattr(self):
        lazy_regex = LazyRegex(args=("a*b+",), kwargs={})
        self.assertEqual(lazy_regex.pattern, "a*b+")

if __name__ == '__main__':
    unittest.main()