import unittest
from pytutils.lazy.lazy_regex import LazyRegex, install_lazy_compile, reset_compile


class TestLazyRegex(unittest.TestCase):
    def test_lazy_regex(self):
        lazy_regex = LazyRegex(r'\d+')
        self.assertIsInstance(lazy_regex, LazyRegex)
        self.assertIsInstance(lazy_regex, re.Pattern)
        self.assertEqual(lazy_regex.pattern, r'\d+')
        self.assertEqual(lazy_regex.flags, 0)
        self.assertIsNone(lazy_regex._real_regex)
        self.assertEqual(lazy_regex._regex_args, (r'\d+',))
        self.assertEqual(lazy_regex._regex_kwargs, {})

    def test_lazy_regex_invalid_pattern(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex('(')

    def test_lazy_regex_attributes(self):
        lazy_regex = LazyRegex(r'\d+')
        self.assertEqual(lazy_regex.findall('123'), ['1', '2', '3'])
        self.assertEqual(lazy_regex.finditer('123'), ['1', '2', '3'])
        self.assertEqual(lazy_regex.match('123'), '123')
        self.assertEqual(lazy_regex.scanner('123'), '123')
        self.assertEqual(lazy_regex.search('123'), '123')
        self.assertEqual(lazy_regex.split('123'), ['1', '2', '3'])
        self.assertEqual(lazy_regex.sub('X', '123'), 'X1X2X3')
        self.assertEqual(lazy_regex.subn('X', '123'), ('X1X2X3', 3))

    def test_lazy_regex_copy(self):
        lazy_regex = LazyRegex(r'\d+')
        lazy_regex_copy = lazy_regex.copy()
        self.assertEqual(lazy_regex.pattern, lazy_regex_copy.pattern)
        self.assertEqual(lazy_regex.flags, lazy_regex_copy.flags)
        self.assertEqual(lazy_regex._real_regex, lazy_regex_copy._real_regex)
        self.assertEqual(lazy_regex._regex_args, lazy_regex_copy._regex_args)
        self.assertEqual(lazy_regex._regex_kwargs, lazy_regex_copy._regex_kwargs)

    def test_lazy_regex_deepcopy(self):
        lazy_regex = LazyRegex(r'\d+')
        lazy_regex_deepcopy = lazy_regex.deepcopy()
        self.assertEqual(lazy_regex.pattern, lazy_regex_deepcopy.pattern)
        self.assertEqual(lazy_regex.flags, lazy_regex_deepcopy.flags)
        self.assertEqual(lazy_regex._real_regex, lazy_regex_deepcopy._real_regex)
        self.assertEqual(lazy_regex._regex_args, lazy_regex_deepcopy._regex_args)
        self.assertEqual(lazy_regex._regex_kwargs, lazy_regex_deepcopy._regex_kwargs)

    def test_lazy_regex_invalid_pattern_copy(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex('(').copy()

    def test_lazy_regex_invalid_pattern_deepcopy(self):
        with self.assertRaises(InvalidPattern):
            LazyRegex('(').deepcopy()

class TestInstallLazyCompile(unittest.TestCase):
    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, LazyRegex)

    def test_reset_compile(self):
        install_lazy_compile()
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

if __name__ == '__main__':
    unittest.main()