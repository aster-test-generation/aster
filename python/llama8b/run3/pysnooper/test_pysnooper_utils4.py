import unittest
from pysnooper.utils import WritableStream, _check_methods, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple

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

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        result = shitcode("Hello, World!")
        self.assertEqual(result, "Hello, World!")

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