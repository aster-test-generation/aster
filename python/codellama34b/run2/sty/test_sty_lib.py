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
        obj = 1
        err = ValueError(
            "The mute() method can only be used with objects that inherit "
            "from the 'Register class'."
        )
        with self.assertRaises(ValueError) as e:
            mute(obj)
        self.assertEqual(e.exception.args, err.args)

class TestUnmute(unittest.TestCase):
    def test_unmute(self):
        result = unmute()
        self.assertEqual(result, None)

    def test_unmute_with_objects(self):
        obj = Register()
        result = unmute(obj)
        self.assertEqual(result, None)

    def test_unmute_with_invalid_objects(self):
        obj = 1
        err = ValueError(
            "The unmute() method can only be used with objects that inherit "
            "from the 'Register class'."
        )
        with self.assertRaises(ValueError) as e:
            unmute(obj)
        self.assertEqual(e.exception.args, err.args)

if __name__ == '__main__':
    unittest.main()