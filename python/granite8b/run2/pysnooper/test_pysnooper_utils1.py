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

    def test_subclasshook(self):
        class MockClass:
            pass
        result = WritableStream.__subclasshook__(MockClass)
        self.assertEqual(result, NotImplemented)

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        errors = file_reading_errors
        self.assertTrue(issubclass(IOError, errors))
        self.assertTrue(issubclass(OSError, errors))
        self.assertTrue(issubclass(ValueError, errors))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        result = shitcode('test')
        self.assertEqual(result, '??')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        class MockClass:
            pass
        def custom_repr(item):
            return 'custom_repr'
        result = get_repr_function(MockClass(), custom_repr)
        self.assertEqual(result, 'custom_repr')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr('test at 0x12345678')
        self.assertEqual(result, 'test')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        class MockClass:
            pass
        result = get_shortish_repr(MockClass())
        self.assertEqual(result, 'MockClass')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        result = truncate('test', 5)
        self.assertEqual(result, 'test')
        result = truncate('test', 3)
        self.assertEqual(result, 'tes...')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        result = ensure_tuple('test')
        self.assertEqual(result, ('test',))
        result = ensure_tuple(['test'])
        self.assertEqual(result, ('test',))
        result = ensure_tuple(('test',))
        self.assertEqual(result, ('test',))

if __name__ == '__main__':
    unittest.main()