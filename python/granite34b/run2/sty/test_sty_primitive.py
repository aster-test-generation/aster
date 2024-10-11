import unittest
from sty.primitive import Style, Register
from sty.primitive import *


class TestStyle(unittest.TestCase):
    def test_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))

    def test_render_rules(self):
        renderfuncs = {str: lambda x: x}
        rules = [Style("red"), RenderType("bold")]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "redbold")
        self.assertEqual(flattened_rules, [Style("red"), RenderType("bold")])

class TestRegister(unittest.TestCase):
    def test_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)

    def test_set_eightbit_call(self):
        register = Register()
        rendertype = None
        register.set_renderfunc(rendertype, lambda x: x)
        register.set_eightbit_call(rendertype)
        self.assertEqual(register.eightbit_call(1), 1)

    def test_set_rgb_call(self):
        register = Register()
        rendertype = 'RenderType'
        register.set_renderfunc(rendertype, lambda x, y, z: (x, y, z))
        register.set_rgb_call(rendertype)
        self.assertEqual(register.rgb_call(1, 2, 3), (1, 2, 3))

    def test_set_renderfunc(self):
        register = Register()
        rendertype = None
        func = lambda x: x
        register.set_renderfunc(rendertype, func)
        self.assertEqual(register.renderfuncs[rendertype], func)

    def test_mute(self):
        register = Register()
        register.mute()
        self.assertTrue(register.is_muted)

    def test_unmute(self):
        register = Register()
        register.unmute()
        self.assertFalse(register.is_muted)

    def test_as_dict(self):
        register = Register()
        register.red = Style("red", fg="red")
        register.bold = Style("bold")
        self.assertEqual(register.as_dict(), {"red": "\033[31m", "bold": "\033[1m"})

    def test_as_namedtuple(self):
        register = Register()
        register.red = Style("red",fg="red")
        register.bold = Style("bold")
        style_register = register.as_namedtuple()
        self.assertEqual(style_register.red, "\033[31m")
        self.assertEqual(style_register.bold, "\033[1m")

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