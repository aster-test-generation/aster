import unittest
from pysnooper.utils import WritableStream, file_reading_errors, shitcode, get_repr_function, DEFAULT_REPR_RE, normalize_repr, get_shortish_repr, truncate, ensure_tuple


class TestWritableStream(unittest.TestCase):
    def test_write(self):
        class MockStream:
            def write(self, s):
                self.data = s
        stream = MockStream()
        instance = WritableStream(loop=loop)
        instance.write(stream, 'test')
        self.assertEqual(stream.data, 'test')

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        errors = file_reading_errors
        self.assertTrue(issubclass(IOError, errors))
        self.assertTrue(issubclass(OSError, errors))
        self.assertTrue(issubclass(ValueError, errors))

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode('abc'), 'abc')
        self.assertEqual(shitcode(b'abc'), b'abc')
        self.assertEqual(shitcode(u'abc'), 'abc')
        self.assertEqual(shitcode(123), '?')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        class MockClass:
            pass
        instance = MockClass()
        repr_function = get_repr_function(instance, [])
        self.assertEqual(repr_function(instance), repr(instance))

class TestDEFAULT_REPR_RE(unittest.TestCase):
    def test_DEFAULT_REPR_RE(self):
        self.assertEqual(DEFAULT_REPR_RE.sub('', 'abc at 0x12345678'), 'abc')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('abc at 0x12345678'), 'abc')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr('abc'), "'abc'")
        self.assertEqual(get_shortish_repr('abc', max_length=3), 'abc')
        self.assertEqual(get_shortish_repr('abc', max_length=2), 'ab...')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate('abc', 3), 'abc')
        self.assertEqual(truncate('abc', 2), 'ab...abc')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('abc'), ('abc',))
        self.assertEqual(ensure_tuple(['abc']), ('abc',))
        self.assertEqual(ensure_tuple(('abc',)), ('abc',))
        self.assertEqual(ensure_tuple({'abc'}), ('abc',))

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockStream:
            def write(self, s):
                self.written = s
        stream = MockStream()
        instance = WritableStream()
        instance.write(stream, 'test')
        self.assertEqual(stream.written, 'test')

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

class TestWritableStream(unittest.TestCase):
    def test_write_method(self):
        class MockStream:
            def write(self, s):
                self.data = s
        stream = MockStream()
        instance = WritableStream()
        instance.write(stream, "test")
        self.assertEqual(stream.data, "test")

    def test_subclasshook(self):
        class MockClass:
            pass
        result = WritableStream.__subclasshook__(MockClass)
        self.assertEqual(result, NotImplemented)

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        errors = file_reading_errors
        self.assertIn(IOError, errors)
        self.assertIn(OSError, errors)
        self.assertIn(ValueError, errors)

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        result = shitcode("test")
        self.assertEqual(result, "??")

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        class MockClass:
            def __repr__(self):
                return "MockClass"
        instance = MockClass()
        custom_repr = [(MockClass, lambda x: "Custom repr")]
        result = get_repr_function(instance, custom_repr)
        self.assertEqual(result("test"), "Custom repr")

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr("MockClass at 0x12345678")
        self.assertEqual(result, "MockClass")

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        class MockClass:
            def __repr__(self):
                return "MockClass"
        instance = MockClass()
        custom_repr = [(MockClass, lambda x: "Custom repr")]
        result = get_shortish_repr(instance, custom_repr, max_length=10)
        self.assertEqual(result, "MockClass")

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        result = truncate("test", 5)
        self.assertEqual(result, "test")
        result = truncate("test", 3)
        self.assertEqual(result, "tes...")

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        result = ensure_tuple("test")
        self.assertEqual(result, ("test",))
        result = ensure_tuple(["test"])
        self.assertEqual(result, ("test",))
        result = ensure_tuple(("test",))
        self.assertEqual(result, ("test",))

if __name__ == '__main__':
    unittest.main()