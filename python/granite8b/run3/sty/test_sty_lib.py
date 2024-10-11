import unittest
from sty.lib import mute, unmute


class TestMute(unittest.TestCase):
    def test_mute(self):
        class MockRegister:
            def __init__(self, name):
                self.name = name
                self.muted = False

            def mute(self):
                self.muted = True

            def unmute(self):
                self.muted = False

        reg1 = MockRegister("Reg1")
        reg2 = MockRegister("Reg2")

        reg1.mute()

        self.assertTrue(reg1.muted)
        self.assertTrue(reg2.muted)

    def test_mute_invalid_type(self):
        with self.assertRaises(ValueError):
            mute(123)

class TestUnmute(unittest.TestCase):
    def test_unmute(self):
        class MockRegister:
            def __init__(self, name):
                self.name = name
                self.muted = False

            def mute(self):
                self.muted = True

            def unmute(self):
                self.muted = False

        reg1 = MockRegister("Reg1")
        reg2 = MockRegister("Reg2")

        reg1.muted = True
        reg2.muted = True

        unmute(reg1, reg2)

        self.assertFalse(reg1.muted)
        self.assertFalse(reg2.muted)

    def test_unmute_invalid_type(self):
        with self.assertRaises(ValueError):
            unmute(123)

if __name__ == '__main__':
    unittest.main()