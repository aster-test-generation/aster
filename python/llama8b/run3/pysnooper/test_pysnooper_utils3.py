import unittest
from pysnooper.utils import WritableStream, _check_methods, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple

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

if __name__ == '__main__':
    unittest.main()