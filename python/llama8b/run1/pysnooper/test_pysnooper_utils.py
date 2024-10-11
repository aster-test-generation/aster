import unittest
from pysnooper.utils import WritableStream, _check_methods, file_reading_errors, shitcode, get_repr_function, DEFAULT_REPR_RE, normalize_repr, get_shortish_repr, truncate, ensure_tuple
from pysnooper.utils import WritableStream, _check_methods, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple


class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockWritableStream(WritableStream):
            def write(self, s):
                self.written = s
        instance = MockWritableStream()
        instance.write('Hello, World!')
        self.assertEqual(instance.written, 'Hello, World!')

    def test_subclasshook(self):
        class MockWritableStream(WritableStream):
            def write(self, s):
                pass
        self.assertTrue(_check_methods(MockWritableStream, 'write'))

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        for error in file_reading_errors:
            self.assertTrue(issubclass(error, Exception))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode('Hello, World!'), 'Hello, World!')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(item):
            if isinstance(item, int):
                return 'Custom Repr'
            else:
                return repr(item)
        self.assertEqual(get_repr_function(1, custom_repr), 'Custom Repr')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('Hello, World! at 0x1234'), 'Hello, World!')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr('Hello, World!', max_length=10), 'Hello...')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate('Hello, World!', max_length=10), 'Hello...')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple((1, 2, 3)), (1, 2, 3))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))
        self.assertEqual(ensure_tuple('Hello'), ('Hello',))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockWritableStream(WritableStream):
            def write(self, s):
                self.written = s
        instance = MockWritableStream()
        instance.write('Hello, World!')
        self.assertEqual(instance.written, 'Hello, World!')

    def test_subclasshook(self):
        class MockWritableStream(WritableStream):
            def write(self, s):
                pass
        self.assertTrue(_check_methods(MockWritableStream, 'write'))

    def test_file_reading_errors(self):
        for error in file_reading_errors:
            self.assertTrue(isinstance(error, Exception))

    def test_shitcode(self):
        self.assertEqual(shitcode('Hello, World!'), 'Hello, World!')

    def test_get_repr_function(self):
        class MockItem:
            def __repr__(self):
                return 'MockItem'
        custom_repr = [(isinstance, lambda x: isinstance(x, MockItem), lambda x: 'MockItem Custom')]
        self.assertEqual(get_repr_function(MockItem(), custom_repr)(MockItem()), 'MockItem Custom')

    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('MockItem at 0x123456'), 'MockItem')

    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr('MockItem', max_length=10), 'MockItem')

    def test_truncate(self):
        self.assertEqual(truncate('MockItem', 10), 'MockItem')

    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('MockItem'), ('MockItem',))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockWritableStream(WritableStream):
            def write(self, s):
                self.s = s
        instance = MockWritableStream()
        instance.write("Hello, World!")
        self.assertEqual(instance.s, "Hello, World!")

    def test_subclasshook(self):
        class MockWritableStream(WritableStream):
            pass
        self.assertTrue(_check_methods(MockWritableStream, 'write'))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode("Hello, World!"), "Hello, World!")

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        custom_repr = [(int, lambda x: str(x))]
        self.assertEqual(get_repr_function(1, custom_repr), str)

    def test_get_repr_function_default(self):
        self.assertEqual(get_repr_function(1), repr)

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr("Hello, World! at 0x123456"), "Hello, World!")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr(1), "1")

    def test_get_shortish_repr_normalize(self):
        self.assertEqual(get_shortish_repr(1, normalize=True), "1")

    def test_get_shortish_repr_max_length(self):
        self.assertEqual(get_shortish_repr(1, max_length=2), "1")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate("Hello, World!", 10), "Hel...")

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple((1, 2, 3)), (1, 2, 3))

    def test_ensure_tuple_list(self):
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))

    def test_ensure_tuple_string(self):
        self.assertEqual(ensure_tuple("Hello, World!"), ("Hello, World!",))

class TestPysnooperUtils(unittest.TestCase):
    def test_check_methods(self):
        class TestClass:
            def write(self, s):
                pass
        self.assertTrue(_check_methods(TestClass, 'write'))

    def test_check_methods_not_implemented(self):
        class TestClass:
            pass
        self.assertEqual(_check_methods(TestClass, 'write'), NotImplemented)

    def test_check_methods_method_none(self):
        class TestClass:
            def write(self, s):
                pass
        self.assertEqual(_check_methods(TestClass, 'write'), NotImplemented)

    def test_WritableStream(self):
        class TestWritableStream(WritableStream):
            def write(self, s):
                pass
        self.assertTrue(isinstance(TestWritableStream(), WritableStream))

    def test_WritableStream_not_implemented(self):
        class TestWritableStream:
            pass
        self.assertEqual(_check_methods(TestWritableStream, 'write'), NotImplemented)

    def test_shitcode(self):
        self.assertEqual(shitcode('Hello, World!'), 'Hello, World!')

    def test_shitcode_non_ascii(self):
        self.assertEqual(shitcode('Hello, à'), 'Hello, ?')

    def test_get_repr_function(self):
        class TestClass:
            def __repr__(self):
                return 'Test Class'
        self.assertEqual(get_repr_function(TestClass(), []), TestClass().__repr__)

    def test_get_repr_function_custom(self):
        class TestClass:
            def __repr__(self):
                return 'Test Class'
        custom_repr = [(lambda x: isinstance(x, TestClass), lambda x: 'Custom Class')]
        self.assertEqual(get_repr_function(TestClass(), custom_repr), custom_repr[1])

    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('Hello, World!'), 'Hello, World!')

    def test_normalize_repr_with_default(self):
        self.assertEqual(normalize_repr('Hello, World! at 0x123456'), 'Hello, World!')

    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr('Hello, World!', max_length=10), 'Hello, Wor')

    def test_get_shortish_repr_normalize(self):
        self.assertEqual(get_shortish_repr('Hello, World!', normalize=True), 'Hello, World!')

    def test_truncate(self):
        self.assertEqual(truncate('Hello, World!', 10), 'Hello, Wor')

    def test_truncate_none(self):
        self.assertEqual(truncate('Hello, World!', None), 'Hello, World!')

    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('Hello'), ('Hello',))

    def test_ensure_tuple_iterable(self):
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))

if __name__ == '__main__':
    unittest.main()