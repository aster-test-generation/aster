import unittest
from sty.primitive import Style, _render_rules, Register
from sty.primitive import Style, Register


class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))

    def test_render_rules(self):
        renderfuncs = {int: lambda x: str(x)}
        rules = [1, 2, 3]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "123")
        self.assertEqual(flattened_rules, [1, 2, 3])

class TestRegister(unittest.TestCase):
    def test_set_eightbit_call(self):
        register = Register()
        register.set_renderfunc(int, lambda x: str(x))
        register.set_eightbit_call(int)
        self.assertEqual(register.eightbit_call(1), "1")

    def test_set_rgb_call(self):
        register = Register()
        register.set_renderfunc(tuple, lambda r, g, b: (r, g, b))
        register.set_rgb_call(tuple)
        self.assertEqual(register.rgb_call(1, 2, 3), (1, 2, 3))

    def test_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(str, lambda x: x.upper())
        self.assertEqual(register.renderfuncs[str]("hello"), "HELLO")

    def test_mute(self):
        register = Register()
        register.set_renderfunc(str, lambda x: x.upper())
        register.mute()
        self.assertEqual(register("hello"), "")

    def test_unmute(self):
        register = Register()
        register.set_renderfunc(str, lambda x: x.upper())
        register.mute()
        register.unmute()
        self.assertEqual(register("hello"), "HELLO")

    def test_as_dict(self):
        register = Register()
        register.set_renderfunc(str, lambda x: x.upper())
        register.set_renderfunc(int, lambda x: str(x))
        self.assertEqual(register.as_dict(), {"str": "STR", "int": "1"})

    def test_as_namedtuple(self):
        register = Register()
        register.set_renderfunc(str, lambda x: x.upper())
        register.set_renderfunc(int, lambda x: str(x))
        self.assertEqual(register.as_namedtuple(), ("STR", "1"))

class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "on_blue", "bold", value="test")
        self.assertEqual(style.rules, ["red", "on_blue", "bold"])
        self.assertEqual(str(style), "test")

    def test_style_repr(self):
        style = Style("red", "on_blue", "bold", value="test")
        self.assertEqual(repr(style), "Style('red', 'on_blue', 'bold', value='test')")

    def test_style_eq(self):
        style1 = Style("red", "on_blue", "bold", value="test")
        style2 = Style("red", "on_blue", "bold", value="test")
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
        style = Style("red", "on_blue", "bold", value="test")
        register.test = style
        self.assertEqual(register.test.rules, ["red", "on_blue", "bold"])
        self.assertEqual(str(register.test), "test")

    def test_register_call(self):
        register = Register()
        result = register("red", "on_blue", "bold")
        self.assertEqual(result, "")

    def test_register_set_eightbit_call(self):
        register = Register()
        register.set_eightbit_call(int)
        self.assertEqual(register.eightbit_call, lambda x: x)

    def test_register_set_rgb_call(self):
        register = Register()
        register.set_rgb_call(int)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(int, lambda x: x)
        self.assertEqual(register.renderfuncs, {int: lambda x: x})

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
        register.test = Style("red", "on_blue", "bold", value="test")
        self.assertEqual(register.as_dict(), {"test": "test"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.test = Style("red", "on_blue", "bold", value="test")
        self.assertEqual(register.as_namedtuple().test, "test")

    def test_register_copy(self):
        register = Register()
        register.test = Style("red", "on_blue", "bold", value="test")
        copied_register = register.copy()
        self.assertEqual(copied_register.test.rules, ["red", "on_blue", "bold"])
        self.assertEqual(str(copied_register.test), "test")

if __name__ == '__main__':
    unittest.main()