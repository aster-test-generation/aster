import unittest
from pysnooper.utils import *


class TestWritableStream(unittest.TestCase):
    def test_write(self):
        instance = WritableStream()
        result = instance.write(1)
        self.assertEqual(result, NotImplemented)

    def test___subclasshook__(self):
        result = WritableStream.__subclasshook__(1)
        self.assertEqual(result, NotImplemented)

class TestShitcode(unittest.TestCase):
    def test_shitcode(self):
        result = shitcode([1])
        self.assertEqual(result, '1')

class TestGetReprFunction(unittest.TestCase):
    def test_get_repr_function(self):
        result = get_repr_function(1, ())
        self.assertEqual(result, repr)

class TestNormalizeRepr(unittest.TestCase):
    def test_normalize_repr(self):
        result = normalize_repr(str(1))
        self.assertEqual(result, '1')

class TestGetShortishRepr(unittest.TestCase):
    def test_get_shortish_repr(self):
        result = get_shortish_repr(1, (), None, False)
        self.assertEqual(result, '1')

class TestTruncate(unittest.TestCase):
    def test_truncate(self):
        result = truncate(1, None)
        self.assertEqual(result, 1)

class TestEnsureTuple(unittest.TestCase):
    def test_ensure_tuple(self):
        result = ensure_tuple(1)
        self.assertEqual(result, (1,))

if __name__ == '__main__':
    unittest.main()