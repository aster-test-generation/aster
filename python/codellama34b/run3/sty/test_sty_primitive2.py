import unittest
from sty.primitive import *

class TestStyle(unittest.TestCase):
    def test_style(self):
        rules = [1, 2, 3]
        value = "test"
        style = Style(*rules, value=value)
        self.assertEqual(style.rules, rules)
        self.assertEqual(str(style), value)

    def test_style_private_method(self):
        rules = [1, 2, 3]
        value = "test"
        style = Style(*rules, value=value)
        result = style._Style__new__(rules, value)
        self.assertEqual(result, style)

class TestRegister(unittest.TestCase):
    def test_register(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertEqual(register.is_muted, False)
        self.assertEqual(register.eightbit_call, lambda x: x)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_private_method(self):
        register = Register()
        self.assertEqual(register._Register__setattr__("test", "test"), None)

    def test_register_call(self):
        register = Register()
        self.assertEqual(register(1), "")
        self.assertEqual(register("test"), "test")
        self.assertEqual(register(1, 2, 3), (1, 2, 3))

    def test_register_set_eightbit_call(self):
        register = Register()
        self.assertEqual(register.set_eightbit_call(1), None)

    def test_register_set_rgb_call(self):
        register = Register()
        self.assertEqual(register.set_rgb_call(1), None)

    def test_register_set_renderfunc(self):
        register = Register()
        self.assertEqual(register.set_renderfunc(1, 2), None)

    def test_register_mute(self):
        register = Register()
        self.assertEqual(register.mute(), None)

    def test_register_unmute(self):
        register = Register()
        self.assertEqual(register.unmute(), None)

    def test_register_as_dict(self):
        register = Register()
        self.assertEqual(register.as_dict(), {})

    def test_register_as_namedtuple(self):
        register = Register()
        self.assertEqual(register.as_namedtuple(), None)

    def test_register_copy(self):
        register = Register()
        self.assertEqual(register.copy(), register)

if __name__ == '__main__':
    unittest.main()