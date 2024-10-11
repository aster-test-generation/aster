import unittest
from youtube_dl.swfinterp import _Undefined


class TestUndefined(unittest.TestCase):
    def test_init(self):
        instance = _Undefined()
        self.assertIsInstance(instance, _Undefined)

    def test_bool(self):
        instance = _Undefined()
        result = instance.__bool__()
        self.assertFalse(result)

    def test_hash(self):
        instance = _Undefined()
        result = instance.__hash__()
        self.assertEqual(result, 0)

    def test_str(self):
        instance = _Undefined()
        result = instance.__str__()
        self.assertEqual(result, 'undefined')

if __name__ == '__main__':
    unittest.main()