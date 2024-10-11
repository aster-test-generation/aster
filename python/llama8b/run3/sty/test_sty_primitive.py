from sty.primitive import RenderType
import unittest
from sty.primitive import Style, Register


class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("Hello", value="World")
        self.assertEqual(str(style), "Hello")
        self.assertEqual(style.rules, [("Hello",)])

    def test_style_str(self):
        style = Style("Hello", value="World")
        self.assertEqual(str(style), "Hello")

    def test_style_repr(self):
        style = Style("Hello", value="World")
        self.assertEqual(repr(style), "Style('Hello')")

    def test_style_eq(self):
        style1 = Style("Hello", value="World")
        style2 = Style("Hello", value="World")
        self.assertTrue(style1 == style2)

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)

    def test_register_set_eightbit_call(self):
        register = Register()
        register.set_eightbit_call(RenderType)
        self.assertEqual(register.eightbit_call, register.renderfuncs[RenderType])

    def test_register_set_rgb_call(self):
        register = Register()
        register.set_rgb_call(RenderType)
        self.assertEqual(register.rgb_call, register.renderfuncs[RenderType])

    def test_register_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(RenderType, lambda x: x)
        self.assertEqual(register.renderfuncs, {RenderType: lambda x: x})

    def test_register_mute(self):
        register = Register()
        register.mute()
        self.assertTrue(register.is_muted)

    def test_register_unmute(self):
        register = Register()
        register.mute()
        register.unmute()
        self.assertFalse(register.is_muted)

    def test_register_as_dict(self):
        register = Register()
        register.style = Style("Hello", value="World")
        self.assertEqual(register.as_dict(), {"style": "Hello"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.style = Style("Hello", value="World")
        self.assertEqual(register.as_namedtuple()._asdict(), {"style": "Hello"})

    def test_register_copy(self):
        register = Register()
        register.style = Style("Hello", value="World")
        copy_register = register.copy()
        self.assertEqual(copy_register.style, "Hello")
        self.assertEqual(copy_register.as_dict(), register.as_dict())

    def test_register_call(self):
        register = Register()
        register.style = Style("Hello", value="World")
        self.assertEqual(register("Hello"), "Hello")

    def test_register_call_muted(self):
        register = Register()
        register.mute()
        self.assertEqual(register("Hello"), "")

if __name__ == '__main__':
    unittest.main()