import unittest
from sty.lib import mute, unmute
from sty.primitive import Register


class MockRegister(Register):
    def __init__(self):
        self.muted = False

    def mute(self):
        self.muted = True

    def unmute(self):
        self.muted = False

class TestMuteFunction(unittest.TestCase):
    def test_mute_with_valid_register(self):
        reg = MockRegister()
        mute(reg)
        self.assertTrue(reg.muted)

    def test_mute_with_invalid_register(self):
        with self.assertRaises(ValueError):
            mute("not a register")

class TestUnmuteFunction(unittest.TestCase):
    def test_unmute_with_valid_register(self):
        reg = MockRegister()
        reg.muted = True
        unmute(reg)
        self.assertFalse(reg.muted)

    def test_unmute_with_invalid_register(self):
        with self.assertRaises(ValueError):
            unmute("not a register")

if __name__ == '__main__':
    unittest.main()