import unittest
from pytutils.regex import LazyRegex, InvalidPatter
from pytutils.lazy import _real_re_compile, lazy_compile, install_lazy_compile, reset_compile


class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        lazy_regex = LazyRegex()
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ())
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_compile_and_collapse(self):
        lazy_regex = LazyRegex(args=('pattern',), kwargs={'flags': 0})
        lazy_regex._compile_and_collapse()
        self.assertIsNotNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, ('pattern',))
        self.assertEqual(lazy_regex._regex_kwargs, {'flags': 0})

    def test_getattr(self):
        lazy_regex = LazyRegex()
        lazy_regex._compile_and_collapse()
        self.assertEqual(lazy_regex.findall, lazy_regex._real_regex.findall)
        self.assertEqual(lazy_regex.finditer, lazy_regex._real_regex.finditer)
        self.assertEqual(lazy_regex.match, lazy_regex._real_regex.match)
        self.assertEqual(lazy_regex.scanner, lazy_regex._real_regex.scanner)
        self.assertEqual(lazy_regex.search, lazy_regex._real_regex.search)
        self.assertEqual(lazy_regex.split, lazy_regex._real_regex.split)
        self.assertEqual(lazy_regex.sub, lazy_regex._real_regex.sub)
        self.assertEqual(lazy_regex.subn, lazy_regex._real_regex.subn)

    def test_eq(self):
        lazy_regex1 = LazyRegex(args=('pattern',), kwargs={'flags': 0})
        lazy_regex2 = LazyRegex(args=('pattern',), kwargs={'flags': 0})
        self.assertEqual(lazy_regex1, lazy_regex2)

    def test_getstate(self):
        lazy_regex = LazyRegex(args=('pattern',), kwargs={'flags': 0})
        state = lazy_regex.__getstate__()
        self.assertEqual(state['args'], ('pattern',))
        self.assertEqual(state['kwargs'], {'flags': 0})

    def test_setstate(self):
        state = {'args': ('pattern',), 'kwargs': {'flags': 0}}
        lazy_regex = LazyRegex()
        lazy_regex.__setstate__(state)
        self.assertEqual(lazy_regex._regex_args, ('pattern',))
        self.assertEqual(lazy_regex._regex_kwargs, {'flags': 0})

    def test_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex(args=('invalid pattern',), kwargs={'flags': 0})

    def test_str(self):
        lazy_regex = LazyRegex(args=('pattern',), kwargs={'flags': 0})
        lazy_regex._compile_and_collapse()
        self.assertEqual(str(lazy_regex), 'LazyRegex(pattern, flags=0)')

    def test_repr(self):
        lazy_regex = LazyRegex(args=('pattern',), kwargs={'flags': 0})
        lazy_regex._compile_and_collapse()
        self.assertEqual(repr(lazy_regex), 'LazyRegex(pattern, flags=0)')

class TestInvalidPattern(unittest.TestCase):
    def test_format(self):
        pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(pattern._format(), 'Invalid pattern')

    def test_unicode(self):
        pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(pattern.__unicode__(), 'Invalid pattern')

    def test_str(self):
        pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(pattern.__str__(), 'Invalid pattern')

    def test_repr(self):
        pattern = InvalidPattern('Invalid pattern')
        self.assertEqual(pattern.__repr__(), 'InvalidPattern("Invalid pattern")')

class TestLazyCompile(unittest.TestCase):
    def test_lazy_compile(self):
        lazy_regex = lazy_compile('pattern', flags=0)
        self.assertIsInstance(lazy_regex, LazyRegex)
        self.assertEqual(lazy_regex._regex_args, ('pattern',))
        self.assertEqual(lazy_regex._regex_kwargs, {'flags': 0})

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

class TestFinditer(unittest.TestCase):
    def test_finditer_public(self):
        pattern = 'pattern'
        string = 'string'
        lazy_regex = LazyRegex(args=(pattern,), kwargs={'flags': 0})
        lazy_regex._compile_and_collapse()
        self.assertEqual(lazy_regex.finditer(string), lazy_regex._real_regex.finditer(string))

if __name__ == '__main__':
    unittest.main()