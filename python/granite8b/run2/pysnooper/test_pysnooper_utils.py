import unittest
from pysnooper.utils import WritableStream, file_reading_errors, shitcode, get_repr_function, DEFAULT_REPR_RE, normalize_repr, get_shortish_repr, truncate, ensure_tuple


class TestWritableStream(unittest.TestCase):
    def test_write(self):
        class MockStream:
            def write(self, s):
                self.s = s
        stream = MockStream()
        writable_stream = WritableStream()
        writable_stream.write(stream, 'test')
        self.assertEqual(stream.s, 'test')

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        errors = (IOError, OSError, ValueError)
        for error in errors:
            with self.assertRaises(error):
                raise error('test')

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode('abc'), 'abc')
        self.assertEqual(shitcode('a\nb\nc'), 'a\nb\nc')
        self.assertEqual(shitcode('a\nb\nc\xd8'), 'a?b?c?')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        class MockClass:
            pass
        mock_class = MockClass()
        def custom_repr(item):
            return 'custom'
        self.assertEqual(get_repr_function(mock_class, custom_repr), custom_repr)

class TestDEFAULT_REPR_RE(unittest.TestCase):
    def test_DEFAULT_REPR_RE(self):
        self.assertEqual(DEFAULT_REPR_RE.sub('', 'abc at 0x12345678'), 'abc')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('abc at 0x12345678'), 'abc')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        class MockClass:
            pass
        mock_class = MockClass()
        self.assertEqual(get_shortish_repr(mock_class), '<MockClass object at 0x7fb1a5c899f0>')
        self.assertEqual(get_shortish_repr(mock_class, max_length=10), 'MockClas...')
        self.assertEqual(get_shortish_repr(mock_class, max_length=10, normalize=True), 'MockClass')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate('abc', 10), 'abc')
        self.assertEqual(truncate('abc', 3), 'abc')
        self.assertEqual(truncate('abc', 0), '')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('abc'), ('abc',))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))
        self.assertEqual(ensure_tuple((1, 2, 3)), (1, 2, 3))
        self.assertEqual(ensure_tuple({'a': 1, 'b': 2}), ('a', 'b'))

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