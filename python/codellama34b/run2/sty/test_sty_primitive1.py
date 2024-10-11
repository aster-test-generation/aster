import unittest
from sty.primitive import *

class TestStyle(unittest.TestCase):
    def test_style(self):
        rules = [1, 2, 3]
        value = "test"
        style = Style(*rules, value=value)
        self.assertEqual(style.rules, rules)
        self.assertEqual(style, value)

    def test_style_private_method(self):
        rules = [1, 2, 3]
        value = "test"
        style = Style(*rules, value=value)
        result = style._Style__render_rules(rules)
        self.assertEqual(result, value)

class TestRegister(unittest.TestCase):
    def test_register(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertEqual(register.is_muted, False)
        self.assertEqual(register.eightbit_call, lambda x: x)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_setattr(self):
        register = Register()
        value = "test"
        style = Style(value=value)
        register.test = style
        self.assertEqual(register.test, value)

    def test_register_call(self):
        register = Register()
        self.assertEqual(register(1), "")
        self.assertEqual(register("test"), "")
        self.assertEqual(register(1, 2, 3), "")

    def test_register_set_eightbit_call(self):
        register = Register()
        register.set_eightbit_call(1)
        self.assertEqual(register.eightbit_call, 1)

    def test_register_set_rgb_call(self):
        register = Register()
        register.set_rgb_call(1)
        self.assertEqual(register.rgb_call, 1)

    def test_register_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(1, 2)
        self.assertEqual(register.renderfuncs, {1: 2})

    def test_register_mute(self):
        register = Register()
        register.mute()
        self.assertEqual(register.is_muted, True)

    def test_register_unmute(self):
        register = Register()
        register.unmute()
        self.assertEqual(register.is_muted, False)

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