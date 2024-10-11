import unittest
from sty.lib import mute, unmute


class TestMute(unittest.TestCase):
    def test_mute(self):
        class MockRegister:
            def __init__(self):
                self.muted = False

            def mute(self):
                self.muted = True

        mock_register = MockRegister()
        mock_register.mute()
        self.assertTrue(mock_register.muted)

    def test_mute_with_invalid_object(self):
        class MockRegister:
            def __init__(self):
                self.muted = False

            def mute(self):
                self.muted = True

        mock_register = MockRegister()
        with self.assertRaises(ValueError):
            mute(mock_register, 123)

    def test_mute_with_multiple_objects(self):
        class MockRegister:
            def __init__(self):
                self.muted = False

            def mute(self):
                self.muted = True

        mock_register_1 = MockRegister()
        mock_register_2 = MockRegister()
        mock_register_1.mute()
        self.assertTrue(mock_register_1.muted)
        self.assertTrue(mock_register_2.muted)

class TestUnmute(unittest.TestCase):
    def test_unmute(self):
        class MockRegister:
            def __init__(self):
                self.muted = True

            def unmute(self):
                self.muted = False

        mock_register = MockRegister()
        mock_register.unmute()
        self.assertFalse(mock_register.muted)

    def test_unmute_with_invalid_object(self):
        class MockRegister:
            def __init__(self):
                self.muted = True

            def unmute(self):
                self.muted = False

        mock_register = MockRegister()
        with self.assertRaises(ValueError):
            unmute(mock_register, 123)

    def test_unmute_with_multiple_objects(self):
        class MockRegister:
            def __init__(self):
                self.muted = True

            def unmute(self):
                self.muted = False

        mock_register_1 = MockRegister()
        mock_register_2 = MockRegister()
        unmute(mock_register_1, mock_register_2)
        self.assertFalse(mock_register_1.muted)
        self.assertFalse(mock_register_2.muted)

if __name__ == '__main__':
    unittest.main()