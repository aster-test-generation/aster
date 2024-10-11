import unittest
from sty.primitive import Style, Register


class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))
        self.assertEqual(style.value, "color: red;")

    def test_style_str(self):
        style = Style("red", "bold")
        self.assertEqual(str(style), '')

    def test_style_repr(self):
        style = Style("red", "bold")
        self.assertEqual(repr(style), "''")

    def test_style_eq(self):
        style1 = Style("red", "bold")
        style2 = Style("red", "bold")
        self.assertEqual(style1, style2)

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
        self.assertEqual(register("red", "bold"), "")
        self.assertEqual(register(1), "")
        self.assertEqual(register(1, 2, 3), "")

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
        style = Style("red", "bold")
        register.style = style
        self.assertEqual(register.style, style)
        register.mute()
        self.assertEqual(register.style, style)

    def test_register_unmute(self):
        register = Register()
        style = Style("red", "bold")
        register.style = style
        self.assertEqual(register.style, style)
        register.mute()
        self.assertEqual(register.style, style)
        register.unmute()
        self.assertEqual(register.style, style)

    def test_register_as_dict(self):
        register = Register()
        register.red = "red"
        register.blue = "blue"
        self.assertEqual(register.as_dict(), {"red": "red", "blue": "blue"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.red = "red"
        register.blue = "blue"
        self.assertEqual(register.as_namedtuple(), StyleRegister(blue='blue', red='red'))

    def test_register_copy(self):
        register = Register()
        register.red = "red"
        register.blue = "blue"
        copy = register.copy()
        self.assertEqual(copy.red, "red")
        self.assertEqual(copy.blue, "blue")
        self.assertNotEqual(copy, register)

class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.value, "redbold")
        self.assertEqual(style.rules, ("red", "bold"))

    def test_style_str(self):
        style = Style("red", "bold")
        self.assertEqual(str(style), "redbold")

    def test_style_repr(self):
        style = Style("red", "bold")
        self.assertEqual(repr(style), "Style('red', 'bold')")

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
        self.assertEqual(register.style.value, "redbold")
        self.assertEqual(register.style.rules, ("red", "bold"))

    def test_register_call(self):
        register = Register()
        self.assertEqual(register("red"), "red")
        self.assertEqual(register(1), "")
        self.assertEqual(register(1, 2, 3), "")

    def test_register_set_eightbit_call(self):
        register = Register()
        def func(x):
            return x * 2
        register.set_eightbit_call(func)
        self.assertEqual(register.eightbit_call, func)

    def test_register_set_rgb_call(self):
        register = Register()
        def func(r, g, b):
            return (r * 2, g * 2, b * 2)
        register.set_rgb_call(func)
        self.assertEqual(register.rgb_call, func)

    def test_register_set_renderfunc(self):
        register = Register()
        def func(x):
            return x * 3
        register.set_renderfunc(int, func)
        self.assertEqual(register.renderfuncs[int], func)

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
        register.color = Style("blue", "underline")
        d = register.as_dict()
        self.assertEqual(d, {"style": "redbold", "color": "blueunderline"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.style = Style("red", "bold")
        register.color = Style("blue", "underline")
        nt = register.as_namedtuple()
        self.assertEqual(nt, namedtuple("StyleRegister", ["style", "color"])("redbold", "blueunderline"))

    def test_register_copy(self):
        register = Register()
        register.style = Style("red", "bold")
        register.color = Style("blue", "underline")
        copy_register = register.copy()
        self.assertEqual(copy_register.style.value, "redbold")
        self.assertEqual(copy_register.color.value, "blueunderline")
        self.assertEqual(copy_register.renderfuncs, {})
        self.assertEqual(copy_register.is_muted, False)
        self.assertEqual(copy_register.eightbit_call, lambda x: x)
        self.assertEqual(copy_register.rgb_call, lambda r, g, b: (r, g, b))

if __name__ == '__main__':
    unittest.main()