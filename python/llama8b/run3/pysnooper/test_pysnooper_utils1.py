import unittest
from pysnooper.utils import WritableStream, _check_methods, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple

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

if __name__ == '__main__':
    unittest.main()