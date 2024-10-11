import unittest
from sty.primitive import Style, Register


class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("Hello", value="World")
        self.assertEqual(str(style), "World")
        self.assertEqual(style.rules, ("Hello",))

    def test_style_str(self):
        style = Style("Hello", value="World")
        self.assertEqual(str(style), "World")

    def test_style_repr(self):
        style = Style("Hello", value="World")
        self.assertEqual(repr(style), "Style('Hello', value='World')")

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
        register.set_eightbit_call(Style)
        self.assertEqual(register.eightbit_call, register.renderfuncs[Style])

    def test_register_set_rgb_call(self):
        register = Register()
        register.set_rgb_call(Style)
        self.assertEqual(register.rgb_call, register.renderfuncs[Style])

    def test_register_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(Style, lambda x: x)
        self.assertEqual(register.renderfuncs[Style], lambda x: x)

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
        register.value = "Hello"
        register.another_value = "World"
        self.assertEqual(register.as_dict(), {"value": "Hello", "another_value": "World"})

    def test_register_as_namedtuple(self):
        register = Register()
        register.value = "Hello"
        register.another_value = "World"
        result = register.as_namedtuple()
        self.assertEqual(result.value, "Hello")
        self.assertEqual(result.another_value, "World")

    def test_register_copy(self):
        register = Register()
        register.value = "Hello"
        register.another_value = "World"
        copied_register = register.copy()
        self.assertEqual(copied_register.value, "Hello")
        self.assertEqual(copied_register.another_value, "World")

    def test_register_call(self):
        register = Register()
        register.value = "Hello"
        self.assertEqual(register(), "Hello")

    def test_register_call_muted(self):
        register = Register()
        register.mute()
        self.assertEqual(register(), "")

    def test_register_call_eightbit(self):
        register = Register()
        register.set_eightbit_call(Style)
        self.assertEqual(register(1), "1")

    def test_register_call_rgb(self):
        register = Register()
        register.set_rgb_call(Style)
        self.assertEqual(register(1, 2, 3), "(1, 2, 3)")

    def test_register_call_invalid(self):
        register = Register()
        self.assertEqual(register(1, 2), "")

if __name__ == '__main__':
    unittest.main()