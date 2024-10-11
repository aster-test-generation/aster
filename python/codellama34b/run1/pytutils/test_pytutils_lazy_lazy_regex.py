import unittest
from pytutils.lazy.lazy_regex import *


class TestLazyRegex(unittest.TestCase):
    def test_lazy_regex(self):
        instance = LazyRegex()
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_lazy_regex_init(self):
        instance = LazyRegex(args=(), kwargs={})
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_lazy_regex_compile_and_collapse(self):
        instance = LazyRegex(args=(), kwargs={})
        instance._compile_and_collapse(pattern)
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_lazy_regex_getstate(self):
        instance = LazyRegex(args=(), kwargs={})
        result = instance.__getstate__()
        self.assertEqual(result, {'args': (), 'kwargs': {}})

    def test_lazy_regex_setstate(self):
        instance = LazyRegex(args=(), kwargs={})
        instance.__setstate__({'args': (), 'kwargs': {}})
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_lazy_regex_getattr(self):
        instance = LazyRegex(args=(), kwargs={})
        result = instance.__getattr__('_real_regex')
        self.assertEqual(result, None)

    def test_lazy_compile(self):
        result = lazy_compile()
        self.assertEqual(result, LazyRegex(r"^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$"))

    def test_install_lazy_compile(self):
        install_lazy_compile()
        self.assertEqual(re.compile, lazy_compile)

    def test_reset_compile(self):
        reset_compile()
        self.assertEqual(re.compile, _real_re_compile)

    def test_finditer_public(self):
        result = finditer_public('pattern', 'string')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()