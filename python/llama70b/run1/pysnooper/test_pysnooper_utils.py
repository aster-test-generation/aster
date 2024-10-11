import unittest
from pysnooper.utils import *


class TestWritableStream(unittest.TestCase):
    def test_init(self):
        ws = WritableStream()
        self.assertIsInstance(ws, WritableStream)

    def test_write_abstract(self):
        with self.assertRaises(TypeError):
            WritableStream().write('')

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
        self.assertEqual(shitcode('hello'), 'hello')
        self.assertEqual(shitcode('hello\x80'), 'hello?')

    def test_get_repr_function(self):
        custom_repr = [(int, lambda x: 'int repr')]
        self.assertEqual(get_repr_function(1, custom_repr)(1), 'int repr')

    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('<object at 0x12345678>'), '<object>')

    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr(1), '1')
        self.assertEqual(get_shortish_repr('hello', max_length=5), 'he...')

    def test_truncate(self):
        self.assertEqual(truncate('hello', 5), 'he...')
        self.assertEqual(truncate('hello', None), 'hello')

    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple([1, 2, 3]), (1, 2, 3))
        self.assertEqual(ensure_tuple('hello'), ('hello',))

if __name__ == '__main__':
    unittest.main()