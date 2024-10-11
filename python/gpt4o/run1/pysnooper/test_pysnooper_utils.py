import unittest
from pysnooper.utils import *


class TestCheckMethods(unittest.TestCase):
    def test_check_methods(self):
        class TestClass:
            def write(self):
                pass
        result = _check_methods(TestClass, 'write')
        self.assertTrue(result)

    def test_check_methods_not_implemented(self):
        class TestClass:
            pass
        result = _check_methods(TestClass, 'write')
        self.assertEqual(result, NotImplemented)

class TestWritableStream(unittest.TestCase):
    def test_subclasshook(self):
        class TestClass:
            def write(self):
                pass
        result = WritableStream.__subclasshook__(TestClass)
        self.assertTrue(result)

    def test_subclasshook_not_implemented(self):
        class TestClass:
            pass
        result = WritableStream.__subclasshook__(TestClass)
        self.assertEqual(result, NotImplemented)

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        result = shitcode('hello')
        self.assertEqual(result, 'hello')

    def test_shitcode_non_ascii(self):
        result = shitcode('hello\u2603')
        self.assertEqual(result, 'hello?')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function_default(self):
        result = get_repr_function(123, [])
        self.assertEqual(result, repr)

    def test_get_repr_function_custom(self):
        custom_repr = [(lambda x: isinstance(x, int), lambda x: 'int')]
        result = get_repr_function(123, custom_repr)
        self.assertEqual(result(123), 'int')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr('<object at 0x1234>')
        self.assertEqual(result, '<object>')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        result = get_shortish_repr(123)
        self.assertEqual(result, '123')

    def test_get_shortish_repre_custom(self):
        custom_repr = [(lambda x: isinstance(x, int), lambda x: 'int')]
        result = get_shortish_repre(123, custom_repr)
        self.assertEqual(result, 'int')

    def test_get_shortish_repr_max_length(self):
        result = get_shortish_repr('a' * 100, max_length=10)
        self.assertEqual(result, 'aaaa...aaaa')

    def test_get_shortish_repr_normalize(self):
        result = get_shortish_repr('<object at 0x1234>', normalize=True)
        self.assertEqual(result, '<object>')

class TestTruncate(unittest.TestCase):
    def test_truncate_no_truncate(self):
        result = truncate('hello', 10)
        self.assertEqual(result, 'hello')

    def test_truncate_with_truncate(self):
        result = truncate('hello world', 5)
        self.assertEqual(result, 'he...ld')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple_with_iterable(self):
        result = ensure_tuple([1, 2, 3])
        self.assertEqual(result, (1, 2, 3))

    def test_ensure_tuple_with_non_iterable(self):
        result = ensure_tuple(123)
        self.assertEqual(result, (123,))

if __name__ == '__main__':
    unittest.main()