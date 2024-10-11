import unittest
from pytutils import LazyRegex, InvalidPatter
from pytutils.lazy import _real_re_compile, lazy_compile, install_lazy_compile, reset_compile


class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        lazy_regex = LazyRegex()
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_compile_and_collapse(self):
        lazy_regex = LazyRegex('pattern', flags=re.IGNORECASE)
        lazy_regex._compile_and_collapse()
        self.assertIsNotNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._real_regex.pattern, 'pattern')
        self.assertEqual(lazy_regex._real_regex.flags, re.IGNORECASE)

    def test_getattr(self):
        lazy_regex = LazyRegex('pattern', flags=re.IGNORECASE)
        lazy_regex._compile_and_collapse()
        self.assertEqual(lazy_regex.findall('test'), lazy_regex._real_regex.findall('test'))
        self.assertEqual(lazy_regex.search('test'), lazy_regex._real_regex.search('test'))

    def test_eq(self):
        lazy_regex1 = LazyRegex('pattern', flags=re.IGNORECASE)
        lazy_regex2 = LazyRegex('pattern', flags=re.IGNORECASE)
        self.assertEqual(lazy_regex1, lazy_regex2)

    def test_neq(self):
        lazy_regex1 = LazyRegex('pattern', flags=re.IGNORECASE)
        lazy_regex2 = LazyRegex('other_pattern', flags=re.IGNORECASE)
        self.assertNotEqual(lazy_regex1, lazy_regex2)

    def test_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex('invalid pattern')

    def test_str(self):
        lazy_regex = LazyRegex('pattern', flags=re.IGNORECASE)
        lazy_regex._compile_and_collapse()
        self.assertEqual(str(lazy_regex), 'pattern')

    def test_repr(self):
        lazy_regex = LazyRegex('pattern', flags=re.IGNORECASE)
        lazy_regex._compile_and_collapse()
        self.assertEqual(repr(lazy_regex), 'LazyRegex(pattern, flags=re.IGNORECASE)')

    def test_getstate(self):
        lazy_regex = LazyRegex('pattern', flags=re.IGNORECASE)
        state = lazy_regex.__getstate__()
        self.assertEqual(state['args'], ('pattern',))
        self.assertEqual(state['kwargs'], {'flags': re.IGNORECASE})

    def test_setstate(self):
        state = {'args': ('pattern',), 'kwargs': {'flags': re.IGNORECASE}}
        lazy_regex = LazyRegex()
        lazy_regex.__setstate__(state)
        self.assertEqual(lazy_regex._regex_args, ('pattern',))
        self.assertEqual(lazy_regex._regex_kwargs, {'flags': re.IGNORECASE})

class TestInvalidPattern(unittest.TestCase):
    def test_init(self):
        invalid_pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(invalid_pattern.msg, 'Invalid pattern')

    def test_format(self):
        invalid_pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(str(invalid_pattern), 'Invalid pattern')

    def test_unicode(self):
        invalid_pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(unicode(invalid_pattern), 'Invalid pattern')

    def test_eq(self):
        invalid_pattern1 = InvalidPattern('Invalid pattern')
        invalid_pattern2 = InvalidPattern('Invalid pattern')
        self.assertEqual(invalid_pattern1, invalid_pattern2)

    def test_neq(self):
        invalid_pattern1 = InvalidPattern('Invalid pattern')
        invalid_pattern2 = InvalidPattern('Other invalid pattern')
        self.assertNotEqual(invalid_pattern1, invalid_pattern2)

class TestLazyCompile(unittest.TestCase):
    def test_lazy_compile(self):
        lazy_regex = lazy_compile('pattern', flags=re.IGNORECASE)
        self.assertIsInstance(lazy_regex, LazyRegex)

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

if __name__ == '__main__':
    unittest.main()