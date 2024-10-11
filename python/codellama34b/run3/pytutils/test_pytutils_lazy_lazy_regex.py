import unittest
from pytutils.lazy.lazy_regex import *


class TestLazyRegex(unittest.TestCase):
    def test_init(self):
        instance = LazyRegex()
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ())
        self.assertEqual(instance._regex_kwargs, {})

    def test_init_with_args(self):
        instance = LazyRegex(args=('test',), kwargs={'test': 'test'})
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ('test',))
        self.assertEqual(instance._regex_kwargs, {'test': 'test'})

    def test_compile_and_collapse(self):
        instance = LazyRegex(args=('test',), kwargs={'test': 'test'})
        instance._compile_and_collapse(test=True)
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ('test',))
        self.assertEqual(instance._regex_kwargs, {'test': 'test'})

    def test_getstate(self):
        instance = LazyRegex(args=('test',), kwargs={'test': 'test'})
        result = instance.__getstate__()
        self.assertEqual(result, {'args': ('test',), 'kwargs': {'test': 'test'}})

    def test_setstate(self):
        instance = LazyRegex()
        instance.__setstate__({"args": ('test',), "kwargs": {'test': 'test'}})
        self.assertEqual(instance._real_regex, None)
        self.assertEqual(instance._regex_args, ('test',))
        self.assertEqual(instance._regex_kwargs, {'test': 'test'})

    def test_getattr(self):
        instance = LazyRegex()
        result = instance.__getattr__('test')
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
        result = finditer_public('a', 'abcd')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()