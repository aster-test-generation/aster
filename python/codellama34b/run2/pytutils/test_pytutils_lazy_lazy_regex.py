import unittest
from pytutils.lazy.lazy_regex import *


class TestLazyRegex(unittest.TestCase):
    def test_lazy_regex(self):
        instance = LazyRegex()
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_compile_and_collapse(self):
        instance = LazyRegex()
        instance._compile_and_collapse(r'^(?P<name>\w+)\s+(?P<email>\w+@[a-z]+\.[a-z]{2,3})$')
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_real_re_compile(self):
        instance = LazyRegex()
        result = instance._real_re_compile()
        self.assertEqual(result, None)

    def test___getstate__(self):
        instance = LazyRegex()
        result = instance.__getstate__()
        self.assertEqual(result, {'args': (), 'kwargs': {}})

    def test___setstate__(self):
        instance = LazyRegex()
        instance.__setstate__({"args": (), "kwargs": {}})
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test___getattr__(self):
        instance = LazyRegex()
        result = instance.__getattr__('attr')
        self.assertEqual(result, None)

    def test_lazy_compile(self):
        result = lazy_compile()
        self.assertEqual(result, LazyRegex(r'^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\.[a-zA-Z0-9-.]+$'))

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

    def test_finditer_public(self):
        result = finditer_public(pattern, string)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()