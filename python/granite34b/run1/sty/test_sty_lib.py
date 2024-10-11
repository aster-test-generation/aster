from unittest import TestCase
from sty.lib import mute, unmute, Register
import unittest


class TestRegister(TestCase):
    def test_mute(self):
        obj = Register()
        obj.mute()
        self.assertTrue(obj.mute)

    def test_unmute(self):
        obj = Register()
        obj.unmute()
        self.assertFalse(obj.mute)

class TestMute(TestCase):
    def test_mute_register(self):
        obj = Register()
        mute(obj)
        self.assertTrue(obj.mute)

    def test_mute_non_register(self):
        with self.assertRaises(ValueError):
            mute(1)

class TestUnmute(TestCase):
    def test_unmute_register(self):
        obj = Register()
        unmute(obj)
        self.assertFalse(obj.mute)

class TestRegister(unittest.TestCase):
    def test_mute(self):
        obj = Register()
        obj.mute()
        self.assertTrue(obj.muted)

    def test_unmute(self):
        obj = Register()
        obj.unmute()
        self.assertFalse(obj.muted)

class TestMute(unittest.TestCase):
    def test_mute_register(self):
        obj = Register()
        mute(obj)
        self.assertTrue(obj.muted)

    def test_mute_non_register(self):
        with self.assertRaises(ValueError):
            mute(object())

class TestUnmute(unittest.TestCase):
    def test_unmute_register(self):
        obj = Register()
        unmute(obj)
        self.assertFalse(obj.muted)

    def test_unmute_non_register(self):
        with self.assertRaises(ValueError):
            unmute(object())

if __name__ == '__main__':
    unittest.main()