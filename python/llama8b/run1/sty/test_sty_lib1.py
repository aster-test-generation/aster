import unittest
from sty.lib import Register, mute, unmute

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertEqual(register.value, 0)

    def test_register_mute(self):
        register = Register()
        register.mute()
        self.assertEqual(register.value, 0)

    def test_register_unmute(self):
        register = Register()
        register.unmute()
        self.assertEqual(register.value, 0)

    def test_register_mute_unmute(self):
        register = Register()
        register.mute()
        register.unmute()
        self.assertEqual(register.value, 0)

    def test_register_mute_unmute_multiple_times(self):
        register = Register()
        for _ in range(5):
            register.mute()
            register.unmute()
        self.assertEqual(register.value, 0)

    def test_register_mute_with_non_register_object(self):
        with self.assertRaises(ValueError):
            mute(Register(), object())

    def test_register_unmute_with_non_register_object(self):
        with self.assertRaises(ValueError):
            unmute(Register(), object())

    def test_register_str(self):
        register = Register()
        self.assertEqual(str(register), "Register")

    def test_register_repr(self):
        register = Register()
        self.assertEqual(repr(register), "Register()")

if __name__ == '__main__':
    unittest.main()