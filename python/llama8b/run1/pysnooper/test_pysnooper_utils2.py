import unittest
from pysnooper.utils import WritableStream, _check_methods, shitcode, get_repr_function, normalize_repr, get_shortish_repr, truncate, ensure_tuple

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

if __name__ == '__main__':
    unittest.main()