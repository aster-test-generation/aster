import unittest
from sty.lib import *


class TestMute(unittest.TestCase):
    def test_mute(self):
        result = mute()
        self.assertEqual(result, None)

    def test_mute_with_objects(self):
        obj = Register()
        result = mute(obj)
        self.assertEqual(result, None)

    def test_mute_with_invalid_objects(self):
        obj = "Invalid Object"
        with self.assertRaises(ValueError):
            mute(obj)

class TestUnmute(unittest.TestCase):
    def test_unmute(self):
        result = unmute()
        self.assertEqual(result, None)

    def test_unmute_with_objects(self):
        obj = Register()
        result = unmute(obj)
        self.assertEqual(result, None)

    def test_unmute_with_invalid_objects(self):
        obj = "Invalid Object"
        with self.assertRaises(ValueError):
            unmute(obj)

if __name__ == '__main__':
    unittest.main()