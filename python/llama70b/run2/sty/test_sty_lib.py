import unittest
from sty.lib import mute, unmute
from sty.primitive import Register


class TestMuteFunction(unittest.TestCase):
    def test_mute_function(self):
        register = Register()
        mute(register)
        self.assertTrue(register.is_muted)

    def test_mute_function_multiple_registers(self):
        register1 = Register()
        register2 = Register()
        mute(register1, register2)
        self.assertTrue(register1.is_muted)
        self.assertTrue(register2.is_muted)

    def test_mute_function_non_register_object(self):
        with self.assertRaises(ValueError):
            mute("not a register")

class TestUnmuteFunction(unittest.TestCase):
    def test_unmute_function(self):
        register = Register()
        register.mute()
        unmute(register)
        self.assertFalse(register.is_muted)

    def test_unmute_function_multiple_registers(self):
        register1 = Register()
        register2 = Register()
        register1.mute()
        register2.mute()
        unmute(register1, register2)
        self.assertFalse(register1.is_muted)
        self.assertFalse(register2.is_muted)

    def test_unmute_function_non_register_object(self):
        with self.assertRaises(ValueError):
            unmute("not a register")

class TestRegisterClass(unittest.TestCase):
    def test_init_method(self):
        register = Register()
        self.assertIsNotNone(register)

    def test_mute_method(self):
        register = Register()
        register.mute()
        self.assertTrue(register.is_muted)

    def test_unmute_method(self):
        register = Register()
        register.mute()
        register.unmute()
        self.assertFalse(register.is_muted)

    def test_str_method(self):
        register = Register()
        self.assertEqual(str(register), "Register")

    def test_repr_method(self):
        register = Register()
        self.assertEqual(repr(register), "Register()")

if __name__ == '__main__':
    unittest.main()