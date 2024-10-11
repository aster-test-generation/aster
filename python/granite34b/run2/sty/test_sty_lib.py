import unittest
from sty.lib import mute, unmute, Register


class TestRegister(unittest.TestCase):
    def test_mute(self):
        obj = Register()
        obj.mute()
        self.assertTrue(obj.mute)

    def test_unmute(self):
        obj = Register()
        obj.unmute()
        self.assertFalse(obj.mute)

class TestMute(unittest.TestCase):
    def test_mute_with_register_object(self):
        obj = Register()
        mute(obj)
        self.assertTrue(obj.mute)

    def test_mute_with_non_register_object(self):
        with self.assertRaises(ValueError):
            mute(object())

class TestUnmute(unittest.TestCase):
    def test_unmute_with_register_object(self):
        obj = Register()
        unmute(obj)
        self.assertFalse(obj.mute)

    def test_unmute_with_non_register_object(self):
        with self.assertRaises(ValueError):
            unmute(object())

if __name__ == '__main__':
    unittest.main()