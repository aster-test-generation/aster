import unittest
from pysnooper.utils import WritableStream, file_reading_errors, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple
from pysnooper.utils import WritableStream, _check_methods, get_repr_function, get_shortish_repr, truncate, ensure_tuple


class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockWritableStream(WritableStream):
            def write(self, s):
                self.written = s
        stream = MockWritableStream()
        stream.write("Hello, World!")
        self.assertEqual(stream.written, "Hello, World!")

    def test_subclasshook(self):
        class MockWritableStream(WritableStream):
            pass
        self.assertTrue(WritableStream.__subclasshook__(MockWritableStream))

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        for error in file_reading_errors:
            self.assertTrue(issubclass(error, Exception))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode("Hello, World!"), "Hello, World!")

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(item):
            if isinstance(item, int):
                return "Custom Repr"
            else:
                return repr(item)
        self.assertEqual(get_repr_function(1, custom_repr), "Custom Repr")
        self.assertEqual(get_repr_function("Hello, World!", custom_repr), "'Hello, World!'")

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr("Hello, World! at 0x1234"), "Hello, World!")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr("Hello, World!"), "Hello, World!")
        self.assertEqual(get_shortish_repr("Hello, World!", max_length=5), "Hello...")
        self.assertEqual(get_shortish_repr("Hello, World!", normalize=True), "Hello, World!")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate("Hello, World!", 10), "Hello, Wor...")
        self.assertEqual(truncate("Hello, World!", 20), "Hello, World!")

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple(1), (1,))
        self.assertEqual(ensure_tuple("Hello, World!"), ("Hello, World!",))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class TestStream(WritableStream):
            def write(self, s):
                return s
        stream = TestStream()
        result = stream.write('Hello, World!')
        self.assertEqual(result, 'Hello, World!')

    def test_subclasshook(self):
        class TestStream(WritableStream):
            pass
        self.assertTrue(_check_methods(TestStream, 'write'))

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(item):
            if isinstance(item, int):
                return 'Custom Repr'
            else:
                return repr(item)
        result = get_repr_function(5, custom_repr)
        self.assertEqual(result, 'Custom Repr')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        result = get_shortish_repr('Hello, World!', max_length=10)
        self.assertEqual(result, 'Hello, Wor...')

    def test_get_shortish_repr_normalize(self):
        result = get_shortish_repr('Hello, World!', normalize=True)
        self.assertEqual(result, 'Hello, Wor...')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        result = truncate('Hello, World!', 10)
        self.assertEqual(result, 'Hello, Wor...')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        result = ensure_tuple('Hello, World!')
        self.assertEqual(result, ('Hello, World!',))

    def test_ensure_tuple_iterable(self):
        result = ensure_tuple([1, 2, 3])
        self.assertEqual(result, (1, 2, 3))

if __name__ == '__main__':
    unittest.main()