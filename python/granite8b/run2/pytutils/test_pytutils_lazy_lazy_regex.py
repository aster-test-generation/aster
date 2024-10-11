import unittest
from pytutils.lazy.lazy_regex import LazyRegex, InvalidPattern


class TestLazyRegex(unittest.TestCase):
    def test_lazy_regex_init(self):
        lazy_regex = LazyRegex()
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_compile(self):
        lazy_regex = LazyRegex()
        lazy_regex._compile_and_collapse(pattern)
        self.assertIsNotNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex(args=("(",))

class TestInvalidPattern(unittest.TestCase):
    def test_invalid_pattern_message(self):
        invalid_pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(str(invalid_pattern), 'Invalid pattern: %s' % e)
        self.assertEqual(invalid_pattern.msg, 'Invalid pattern')

    def test_invalid_pattern_unicode(self):
        invalid_pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(str(invalid_pattern), 'Invalid pattern')
        self.assertEqual(unicode(invalid_pattern), 'Invalid pattern')

    def test_invalid_pattern_repr(self):
        invalid_pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(repr(invalid_pattern), 'InvalidPattern("Invalid pattern")')

class TestLazyCompile(unittest.TestCase):
    def test_lazy_compile_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            lazy_compile("(")

    def test_lazy_compile_valid_pattern(self):
        lazy_regex = lazy_compile("a*b")
        self.assertIsNotNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ("a*b",))
        self.assertEqual(lazy_regex._regex_kwargs, {})

if __name__ == '__main__':
    unittest.main()