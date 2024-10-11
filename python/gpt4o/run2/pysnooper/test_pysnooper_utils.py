from pysnooper.utils import _check_methods
import unittest
from pysnooper.utils import *


class TestWritableStream(unittest.TestCase):
    def test_subclasshook_with_write_method(self):
        class TestClass:
            def write(self, s):
                pass

        result = WritableStream.__subclasshook__(TestClass)
        self.assertEqual(result, True)

    def test_subclasshook_without_write_method(self):
        class TestClass:
            pass

        result = WritableStream.__subclasshook__(TestClass)
        self.assertEqual(result, NotImplemented)

class TestCheckMethods(unittest.TestCase):
    def test_check_methods_with_existing_method(self):
        class TestClass:
            def write(self, s):
                pass

        result = _check_methods(TestClass, 'write')
        self.assertEqual(result, True)

    def test_check_methods_with_non_existing_method(self):
        class TestClass:
            pass

        result = _check_methods(TestClass, 'write')
        self.assertEqual(result, NotImplemented)

class TestShitcode(unittest.TestCase):
    def test_shitcode_with_ascii(self):
        result = shitcode('hello')
        self.assertEqual(result, 'hello')

    def test_shitcode_with_non_ascii(self):
        result = shitcode('hello\u2603')
        self.assertEqual(result, 'hello?')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function_with_condition(self):
        custom_repr = [(lambda x: isinstance(x, int), lambda x: 'int')]
        result = get_repr_function(5, custom_repr)
        self.assertEqual(result(5), 'int')

    def test_get_repr_function_without_condition(self):
        custom_repr = [(lambda x: isinstance(x, int), lambda x: 'int')]
        result = get_repr_function('test', custom_repr)
        self.assertEqual(result('test'), repr('test'))

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr('<object at 0x1234>')
        self.assertEqual(result, '<object>')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        result = get_shortish_repr('test')
        self.assertEqual(result, 'test')

    def test_get_shortish_repr_with_custom_repr(self):
        custom_repr = [(lambda x: isinstance(x, int), lambda x: 'int')]
        result = get_shortish_repr(5, custom_repr)
        self.assertEqual(result, 'int')

    def test_get_shortish_repr_with_exception(self):
        def raise_exception(x):
            raise Exception

        custom_repr = [(lambda x: True, raise_exception)]
        result = get_shortish_repr('test', custom_repr)
        self.assertEqual(result, 'REPR FAILED')

    def test_get_shortish_repr_with_normalize(self):
        result = get_shortish_repr('<object at 0x1234>', normalize=True)
        self.assertEqual(result, '<object>')

    def test_get_shortish_repr_with_max_length(self):
        result = get_shortish_repr('test', max_length=2)
        self.assertEqual(result, 't...t')

class TestTruncate(unittest.TestCase):
    def test_truncate_within_max_length(self):
        result = truncate('test', 10)
        self.assertEqual(result, 'test')

    def test_truncate_exceeding_max_length(self):
        result = truncate('test', 2)
        self.assertEqual(result, 't...t')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple_with_iterable(self):
        result = ensure_tuple([1, 2, 3])
        self.assertEqual(result, (1, 2, 3))

    def test_ensure_tuple_with_non_iterable(self):
        result = ensure_tuple(1)
        self.assertEqual(result, (1,))

if __name__ == '__main__':
    unittest.main()