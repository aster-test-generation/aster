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

        mock_register = MockRegister("mock_register")
        mute(mock_register)
        self.assertTrue(mock_register.muted)

    def test_mute_with_invalid_object(self):
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

        mock_register = MockRegister("mock_register")
        mock_register.muted = True
        unmute(mock_register)
        self.assertFalse(mock_register.muted)

    def test_unmute_with_invalid_object(self):
        with self.assertRaises(ValueError):
            unmute(123)

if __name__ == '__main__':
    unittest.main()