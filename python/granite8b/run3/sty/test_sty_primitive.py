import unittest
from sty.primitive import Style, Register


class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))
        self.assertEqual(str(style), "")

    def test_style_str(self):
        style = Style("red", "bold")
        self.assertEqual(str(style), "")

    def test_style_repr(self):
        style = Style("red", "bold")
        self.assertEqual(repr(style), "''")

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertEqual(register.is_muted, False)
        self.assertEqual(register.eightbit_call, lambda x: x & 0xFF)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_setattr(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        self.assertEqual(register.style, style)

    def test_register_call(self):
        register = Register()
        self.assertEqual(register("red"), "red")

    def test_register_set_eightbit_call(self):
        register = Register()
        def func(*args, **kwargs):
            return "eightbit_call"
        register.set_eightbit_call(func)
        self.assertEqual(register.eightbit_call, func)

    def test_register_set_rgb_call(self):
        register = Register()
        def func(*args, **kwargs):
            return "rgb_call"
        register.set_rgb_call(func)
        self.assertEqual(register.rgb_call, func)

    def test_register_set_renderfunc(self):
        register = Register()
        def func(*args, **kwargs):
            return "renderfunc"
        register.set_renderfunc(func, 'render')
        self.assertEqual(register.renderfuncs, {func: func})

    def test_register_mute(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        register.mute()
        self.assertEqual(register.is_muted, True)

    def test_register_unmute(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        register.unmute()
        self.assertEqual(register.is_muted, False)

    def test_register_as_dict(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        self.assertEqual(register.as_dict(), {"style": ""})

    def test_register_as_namedtuple(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        self.assertEqual(register.as_namedtuple(), style)

    def test_register_copy(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        copied_register = register.copy()
        self.assertEqual(register.as_dict(), copied_register.as_dict())

if __name__ == '__main__':
    unittest.main()