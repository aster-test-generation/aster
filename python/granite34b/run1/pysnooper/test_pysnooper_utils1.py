import unittest
from pysnooper.utils import *

class TestWritableStream(unittest.TestCase):
    def test_write(self):
        class TestStream(WritableStream):
            def write(self, s):
                return s
        stream = TestStream()
        self.assertEqual(stream.write('test'), 'test')

    def test_subclasshook(self):
        class TestStream(WritableStream):
            def write(self, s):
                return s
        self.assertIsInstance(TestStream(), WritableStream)

class TestFileReadingErrors(unittest.TestCase):
    def test_file_reading_errors(self):
        self.assertIn(IOError, file_reading_errors)
        self.assertIn(OSError, file_reading_errors)
        self.assertIn(ValueError, file_reading_errors)

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        self.assertEqual(shitcode('test'), 'test')
        self.assertEqual(shitcode('test\x80'), 'test?')
        self.assertEqual(shitcode('test\x80\x81'), 'test??')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        def custom_repr(x):
            return 'custom repr'
        self.assertEqual(get_repr_function(1, [(int, custom_repr)]), 'custom repr')
        self.assertEqual(get_repr_function('test', [(str, custom_repr)]), 'custom repr')

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        self.assertEqual(normalize_repr('test at 0x1234'), 'test')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        self.assertEqual(get_shortish_repr('test'), 'test')
        self.assertEqual(get_shortish_repr('test', max_length=3), 'tes...')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        self.assertEqual(truncate('test', 3), 'tes...')

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        self.assertEqual(ensure_tuple('test'), ('test',))
        self.assertEqual(ensure_tuple(['test']), ('test',))

if __name__ == '__main__':
    unittest.main()