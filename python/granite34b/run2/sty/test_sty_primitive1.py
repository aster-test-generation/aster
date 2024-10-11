import unittest
from sty.primitive import *

class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))

    def test_style_render(self):
        style = Style("red", "bold")
        self.assertEqual(str(style), "\x1b[31m\x1b[1m")

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertEqual(register.is_muted, False)
        self.assertEqual(register.eightbit_call, lambda x: x)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_set_eightbit_call(self):
        register = Register()
        register.set_renderfunc(EightBit, lambda x: x)
        register.set_eightbit_call(EightBit)
        self.assertEqual(register.eightbit_call, lambda x: x)

    def test_register_set_rgb_call(self):
        register = Register()
        register.set_renderfunc(RGB, lambda r, g, b: (r, g, b))
        register.set_rgb_call(RGB)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(EightBit, lambda x: x)
        self.assertEqual(register.renderfuncs[EightBit], lambda x: x)

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
        register.red = Style("red")
        register.green = Style("green")
        self.assertEqual(register.as_dict(), {"red": "\x1b[31m", "green": "\x1b[32m"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.red = Style("red")
        register.green = Style("green")
        self.assertEqual(register.as_namedtuple(), namedtuple("StyleRegister", ["red", "green"])("\x1b[31m", "\x1b[32m"))

    def test_register_copy(self):
        register = Register()
        register.red = Style("red")
        register.green = Style("green")
        copied_register = register.copy()
        self.assertEqual(copied_register.red, Style("red"))
        self.assertEqual(copied_register.green, Style("green"))

if __name__ == '__main__':
    unittest.main()