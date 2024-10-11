import unittest
from sty.lib import mute, unmute
from sty.lib import Register


class TestMuteFunction(unittest.TestCase):
    def test_mute_function(self):
        register1 = Register()
        register2 = Register()
        mute(register1, register2)
        self.assertTrue(register1.is_muted)
        self.assertTrue(register2.is_muted)

    def test_mute_function_non_register(self):
        register = Register()
        non_register = object()
        with self.assertRaises(ValueError):
            mute(register, non_register)

    def test_unmute_function(self):
        register1 = Register()
        register2 = Register()
        register1.mute()
        register2.mute()
        unmute(register1, register2)
        self.assertFalse(register1.is_muted)
        self.assertFalse(register2.is_muted)

    def test_unmute_function_non_register(self):
        register = Register()
        non_register = object()
        with self.assertRaises(ValueError):
            unmute(register, non_register)

class TestRegisterClass(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertFalse(register.is_muted)

    def test_register_str(self):
        register = Register()
        result = str(register)
        self.assertEqual(result, "Register")

    def test_register_repr(self):
        register = Register()
        result = repr(register)
        self.assertEqual(result, "Register()")

    def test_register_eq(self):
        register1 = Register()
        register2 = Register()
        self.assertTrue(register1 == register2)

    def test_register_ne(self):
        register1 = Register()
        register2 = object()
        self.assertTrue(register1 != register2)

if __name__ == '__main__':
    unittest.main()