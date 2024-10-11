import unittest
from pysnooper.utils import *


class TestWritableStream(unittest.TestCase):
    def test_init(self):
        ws = WritableStream()
        self.assertIsInstance(ws, WritableStream)

    def test_write_abstract(self):
        with self.assertRaises(TypeError):
            WritableStream().write("")

    def test_subclasshook(self):
        class MyStream(WritableStream):
            def write(self, s):
                pass
        self.assertTrue(issubclass(MyStream, WritableStream))

class TestFunctions(unittest.TestCase):
    def test_check_methods(self):
        class MyClass:
            def method1(self):
                pass
            def method2(self):
                pass
        self.assertTrue(_check_methods(MyClass, 'method1', 'method2'))

    def test_shitcode(self):
        self.assertEqual(shitcode("hello"), "hello")
        self.assertEqual(shitcode("hello\x80"), "hello?")

    def test_get_repr_function(self):
        custom_repr = [(int, lambda x: "INT")]
        self.assertEqual(get_repr_function(1, custom_repr)(1), "INT")

    def test_normalize_repr(self):
        self.assertEqual(normalize_repr("obj at 0x1234"), "obj")

    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr("hello", max_length=5), "hello")
        self.assertEqual(get_shortish_repr("hello world", max_length=5), "he...ld")

    def test_truncate(self):
        self.assertEqual(truncate("hello", 5), "hello")
        self.assertEqual(truncate("hello world", 5), "he...ld")

    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple("hello"), ("hello",))
        self.assertEqual(ensure_tuple(["hello", "world"]), ("hello", "world"))

if __name__ == '__main__':
    unittest.main()