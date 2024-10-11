import unittest
from youtube_dl.swfinterp import _read_int


class TestUndefined(unittest.TestCase):
    def test_undefined(self):
        instance = undefined
        result = instance.__bool__()
        self.assertEqual(result, False)

    def test_undefined(self):
        instance = undefined
        result = instance.__hash__()
        self.assertEqual(result, 0)

    def test_undefined(self):
        instance = undefined
        result = instance.__str__()
        self.assertEqual(result, 'undefined')

if __name__ == '__main__':
    unittest.main()