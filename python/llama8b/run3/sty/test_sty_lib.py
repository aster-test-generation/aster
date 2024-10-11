import unittest
from sty.lib import Register, mute, unmute


class TestRegister(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertEqual(register.muted, False)

    def test_register_mute(self):
        register = Register()
        register.mute()
        self.assertEqual(register.muted, True)

    def test_register_unmute(self):
        register = Register()
        register.unmute()
        self.assertEqual(register.muted, False)

    def test_register_mute_private_method(self):
        register = Register()
        register._Register__mute_private_method()
        self.assertEqual(register.muted, True)

    def test_register_unmute_private_method(self):
        register = Register()
        register._Register__unmute_private_method()
        self.assertEqual(register.muted, False)

    def test_register_str_method(self):
        register = Register()
        result = str(register)
        self.assertEqual(result, "Register")

    def test_register_repr_method(self):
        register = Register()
        result = repr(register)
        self.assertEqual(result, "Register()")

    def test_mute_method(self):
        register = Register()
        mute(register)
        self.assertEqual(register.muted, True)

    def test_unmute_method(self):
        register = Register()
        unmute(register)
        self.assertEqual(register.muted, False)

    def test_mute_invalid_object(self):
        with self.assertRaises(ValueError):
            mute("not a Register object")

    def test_unmute_invalid_object(self):
        with self.assertRaises(ValueError):
            unmute("not a Register object")

if __name__ == '__main__':
    unittest.main()