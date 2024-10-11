import unittest
from sty.primitive import Style, Register

class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))
        self.assertEqual(style.value, "")

    def test_style_str(self):
        style = Style("red", "bold")
        self.assertEqual(str(style), "red,bold")

    def test_style_repr(self):
        style = Style("red", "bold")
        self.assertEqual(repr(style), "Style('red', 'bold', '')")

    def test_style_eq(self):
        style1 = Style("red", "bold")
        style2 = Style("red", "bold")
        self.assertEqual(style1, style2)

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertEqual(register.is_muted, False)
        self.assertEqual(register.eightbit_call, lambda x: x)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_setattr(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        self.assertEqual(register.style, style)

    def test_register_call(self):
        register = Register()
        self.assertEqual(register("red"), "")

    def test_register_set_eightbit_call(self):
        register = Register()
        def func(x):
            return x
        register.set_eightbit_call(func)
        self.assertEqual(register.eightbit_call, func)

    def test_register_set_rgb_call(self):
        register = Register()
        def func(r, g, b):
            return (r, g, b)
        register.set_rgb_call(func)
        self.assertEqual(register.rgb_call, func)

    def test_register_set_renderfunc(self):
        register = Register()
        def func(x):
            return x
        register.set_renderfunc(str, func)
        self.assertEqual(register.renderfuncs[str], func)

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
        register.style = Style("red", "bold")
        register.color = Style("blue", "bold")
        d = register.as_dict()
        self.assertEqual(d, {"style": "red,bold", "color": "blue,bold"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.style = Style("red", "bold")
        register.color = Style("blue", "bold")
        nt = register.as_namedtuple()
        self.assertEqual(nt, namedtuple("StyleRegister", ["style", "color"])("red,bold", "blue,bold"))

    def test_register_copy(self):
        register = Register()
        register.style = Style("red", "bold")
        register.color = Style("blue", "bold")
        copy = register.copy()
        self.assertEqual(copy.style, "red,bold")
        self.assertEqual(copy.color, "blue,bold")

if __name__ == '__main__':
    unittest.main()