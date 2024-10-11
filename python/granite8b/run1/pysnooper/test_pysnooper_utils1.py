import unittest
from pysnooper.utils import WritableStream, file_reading_errors, shitcode, get_repr_function, DEFAULT_REPR_RE, normalize_repr, get_shortish_repr, truncate, ensure_tuple

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockStream:
            def write(self, s):
                self.written = s
        stream = MockStream()
        instance = WritableStream()
        instance.write(stream, 'test')
        self.assertEqual(stream.written, 'test')

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        errors = file_reading_errors
        self.assertTrue(issubclass(IOError, errors))
        self.assertTrue(issubclass(OSError, errors))
        self.assertTrue(issubclass(ValueError, errors))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        s = 'abc123!@#$%^&*()'
        result = shitcode(s)
        self.assertEqual(result, 'abc123?????????')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        class MockClass:
            def __repr__(self):
                return 'MockClass'
        class MockCondition:
            def __call__(self, item):
                return isinstance(item, MockClass)
        condition = MockCondition()
        action = repr
        result = get_repr_function(MockClass(), [(condition, action)])
        self.assertEqual(result(MockClass()), 'MockClass')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        s = 'abc at 0x12345678'
        result = normalize_repr(s)
        self.assertEqual(result, 'abc')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        class MockClass:
            def __repr__(self):
                return 'MockClass'
        instance = MockClass()
        result = get_shortish_repr(instance)
        self.assertEqual(result, 'MockClass')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        s = 'abcdefghijklmnopqrstuvwxyz'
        result = truncate(s, 10)
        self.assertEqual(result, 'abcdefghij...')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple(1), (1,))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))
        self.assertEqual(ensure_tuple((1, 2, 3)), (1, 2, 3))
        self.assertEqual(ensure_tuple('abc'), ('abc',))
        self.assertEqual(ensure_tuple({'a': 1, 'b': 2}), ({'a': 1, 'b': 2},))

if __name__ == '__main__':
    unittest.main()