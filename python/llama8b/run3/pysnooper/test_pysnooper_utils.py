import unittest
from pysnooper.utils import WritableStream, get_repr_function, get_shortish_repr, truncate, ensure_tuple
from pysnooper.utils import WritableStream, _check_methods, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple
from pysnooper.utils import WritableStream, _check_methods, file_reading_errors, shitcode, get_repr_function, DEFAULT_REPR_RE, normalize_repr, get_shortish_repr, truncate, ensure_tuple


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
            def write(self, s):
                pass
        self.assertTrue(WritableStream.__subclasshook__(MockWritableStream))

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(item):
            if isinstance(item, int):
                return "Custom Repr"
            else:
                return repr
        self.assertEqual(get_repr_function(1, custom_repr), "Custom Repr")
        self.assertEqual(get_repr_function("Hello, World!", custom_repr), "'Hello, World!'")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr(1), "1")
        self.assertEqual(get_shortish_repr("Hello, World!"), "Hello, World!")
        self.assertEqual(get_shortish_repr(1, max_length=5), "1...")
        self.assertEqual(get_shortish_repr("Hello, World!", normalize=True), "Hello World")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate("Hello, World!", 10), "Hello, Wor...")
        self.assertEqual(truncate("Hello, World!", 20), "Hello, World!")
        self.assertEqual(truncate("Hello, World!", None), "Hello, World!")

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple(1), (1,))
        self.assertEqual(ensure_tuple("Hello, World!"), ("Hello, World!",))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))
        self.assertEqual(ensure_tuple({"a": 1, "b": 2}), ("a", 1, "b", 2))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockStream(WritableStream):
            def write(self, s):
                self.written = s
        stream = MockStream()
        stream.write("Hello, World!")
        self.assertEqual(stream.written, "Hello, World!")

    def test_subclasshook(self):
        class MockStream(WritableStream):
            pass
        self.assertTrue(_check_methods(MockStream, 'write'))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode("Hello, World!"), "Hello, World!")

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(item):
            if isinstance(item, int):
                return "Custom repr for int"
            else:
                return repr(item)
        self.assertEqual(get_repr_function(1, custom_repr), "Custom repr for int")
        self.assertEqual(get_repr_function("Hello, World!", custom_repr), "'Hello, World!'")

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr("Hello, World! at 0x123456"), "Hello, World!")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr("Hello, World!"), "Hello, World!")
        self.assertEqual(get_shortish_repr("Hello, World!", max_length=10), "Hello, Wo...")
        self.assertEqual(get_shortish_repr("Hello, World!", normalize=True), "Hello, World!")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate("Hello, World!", 10), "Hello, Wo...")
        self.assertEqual(truncate("Hello, World!", None), "Hello, World!")

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple("Hello, World!"), ("Hello, World!",))
        self.assertEqual(ensure_tuple((1, 2, 3)), (1, 2, 3))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))

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

    def test_file_reading_errors(self):
        for error in file_reading_errors:
            self.assertTrue(isinstance(error, Exception))

    def test_shitcode(self):
        self.assertEqual(shitcode('Hello, World!'), 'Hello, World!')

    def test_get_repr_function(self):
        class TestClass:
            def __repr__(self):
                return 'Test Class'
        self.assertEqual(get_repr_function(TestClass(), []), TestClass().__repr__)

    def test_get_repr_function_custom_repr(self):
        class TestClass:
            def __repr__(self):
                return 'Test Class'
        custom_repr = [(lambda x: isinstance(x, TestClass), lambda x: 'Custom Repr')]
        self.assertEqual(get_repr_function(TestClass(), custom_repr), custom_repr[1])

    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('Test at 0x123456'), 'Test')

    def test_get_shortish_repr(self):
        class TestClass:
            def __repr__(self):
                return 'Test Class'
        self.assertEqual(get_shortish_repr(TestClass()), 'Test Class')

    def test_get_shortish_repr_max_length(self):
        class TestClass:
            def __repr__(self):
                return 'Test Class'
        self.assertEqual(get_shortish_repr(TestClass(), max_length=5), 'Test')

    def test_truncate(self):
        self.assertEqual(truncate('Hello, World!', 10), 'Hello, Wo...')

    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('Hello'), ('Hello',))
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class TestStream(WritableStream):
            def write(self, s):
                return s
        stream = TestStream()
        result = stream.write("Hello, World!")
        self.assertEqual(result, "Hello, World!")

    def test_subclasshook(self):
        class TestStream(WritableStream):
            pass
        result = _check_methods(TestStream, 'write')
        self.assertTrue(result)

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        result = shitcode("Hello, World!")
        self.assertEqual(result, "Hello, World!")

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        custom_repr = [(int, lambda x: str(x))]
        result = get_repr_function(123, custom_repr)
        self.assertEqual(result, str(123))

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr("Hello, World! at 0x123456")
        self.assertEqual(result, "Hello, World!")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        result = get_shortish_repr("Hello, World!", max_length=10)
        self.assertEqual(result, "Hello, Wor...")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        result = truncate("Hello, World!", 10)
        self.assertEqual(result, "Hello, Wor...")

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        result = ensure_tuple((1, 2, 3))
        self.assertEqual(result, (1, 2, 3))
        result = ensure_tuple([1, 2, 3])
        self.assertEqual(result, (1, 2, 3))
        result = ensure_tuple("Hello, World!")
        self.assertEqual(result, ("Hello, World!",))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MyStream(WritableStream):
            def write(self, s):
                return s
        stream = MyStream()
        result = stream.write("Hello, World!")
        self.assertEqual(result, "Hello, World!")

    def test_subclasshook(self):
        class MyStream(WritableStream):
            pass
        self.assertTrue(_check_methods(MyStream, 'write'))

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(item):
            if isinstance(item, int):
                return str(item)
            else:
                return repr(item)
        result = get_repr_function(1, custom_repr)
        self.assertEqual(result, "1")

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr("Hello, World! at 0x12345678")
        self.assertEqual(result, "Hello, World!")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        result = get_shortish_repr(1, max_length=5)
        self.assertEqual(result, "1")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        result = truncate("Hello, World!", 10)
        self.assertEqual(result, "Hell...")

if __name__ == '__main__':
    unittest.main()