import unittest
from pysnooper.utils import WritableStream, file_reading_errors, shitcode, get_repr_function, DEFAULT_REPR_RE, normalize_repr, get_shortish_repr, truncate, ensure_tuple


class TestWritableStream(unittest.TestCase):
    def test_write(self):
        class MockStream:
            def write(self, s):
                self.s = s
        stream = MockStream()
        writable_stream = WritableStream()
        writable_stream.write('test')
        self.assertEqual(stream.s, 'test')

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        errors = file_reading_errors
        self.assertTrue(issubclass(IOError, errors))
        self.assertTrue(issubclass(OSError, errors))
        self.assertTrue(issubclass(ValueError, errors))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode('abc'), 'abc')
        self.assertEqual(shitcode('a\nb'), 'a\nb')
        self.assertEqual(shitcode('a\rb'), 'a?b')
        self.assertEqual(shitcode('a\r\nb'), 'a?b')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        class MockClass:
            def __repr__(self):
                return 'MockClass'
        mock_class = MockClass()
        repr_function = get_repr_function(mock_class, [])
        self.assertEqual(repr_function(mock_class), 'MockClass')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('abc'), 'abc')
        self.assertEqual(normalize_repr('a\nb'), 'a\nb')
        self.assertEqual(normalize_repr('a\rb'), 'a?b')
        self.assertEqual(normalize_repr('a\r\nb'), 'a?b')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr('abc'), "'abc'")
        self.assertEqual(get_shortish_repr('a\nb'), 'a...b')
        self.assertEqual(get_shortish_repr('a\rb'), 'a...b')
        self.assertEqual(get_shortish_repr('a\r\nb'), 'a...b')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate('abc', 3), 'abc')
        self.assertEqual(truncate('abc', 2), 'ab...abc')
        self.assertEqual(truncate('abc', 1), 'a...')
        self.assertEqual(truncate('abc', 0), '')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('abc'), ('abc',))
        self.assertEqual(ensure_tuple(['abc']), ('abc',))
        self.assertEqual(ensure_tuple((1, 2, 3)), (1, 2, 3))
        self.assertEqual(ensure_tuple(1), (1,))
        self.assertEqual(ensure_tuple(None), (None,))

if __name__ == '__main__':
    unittest.main()