import unittest
from sty.primitive import *



class TestStyle(unittest.TestCase):
    def test_style(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        self.assertEqual(style.rules, [1, 2, 3])
        self.assertEqual(style, value)

    def test_style_with_style(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        style_with_style = Style(*rules, value=style)
        self.assertEqual(style_with_style.rules, [1, 2, 3])
        self.assertEqual(style_with_style, value)

    def test_style_with_render_type(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        render_type = RenderType()
        style_with_render_type = Style(*rules, value=render_type)
        self.assertEqual(style_with_render_type.rules, [1, 2, 3])
        self.assertEqual(style_with_render_type, value)

    def test_style_with_style_and_render_type(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        render_type = RenderType()
        style_with_style_and_render_type = Style(*rules, value=style)
        self.assertEqual(style_with_style_and_render_type.rules, [1, 2, 3])
        self.assertEqual(style_with_style_and_render_type, value)

    def test_style_with_render_type_and_style(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        render_type = RenderType()
        style_with_render_type_and_style = Style(*rules, value=render_type)
        self.assertEqual(style_with_render_type_and_style.rules, [1, 2, 3])
        self.assertEqual(style_with_render_type_and_style, value)

    def test_style_with_render_type_and_render_type(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        render_type = RenderType()
        style_with_render_type_and_render_type = Style(*rules, value=render_type)
        self.assertEqual(style_with_render_type_and_render_type.rules, [1, 2, 3])
        self.assertEqual(style_with_render_type_and_render_type, value)

    def test_style_with_style_and_render_type_and_style(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        render_type = RenderType()
        style_with_style_and_render_type_and_style = Style(*rules, value=style)
        self.assertEqual(style_with_style_and_render_type_and_style.rules, [1, 2, 3])
        self.assertEqual(style_with_style_and_render_type_and_style, value)

    def test_style_with_style_and_render_type_and_render_type(self):
        rules = [1, 2, 3]
        value = "value"
        style = Style(*rules, value=value)
        render_type = RenderType()
        style_with_style_and_render_type_and_render_type = Style(*rules, value=render_type)
        self.assertEqual(style_with_style_and_render_type_and_render_type.rules, [1, 2, 3])
        self.assertEqual(style_with_style_and_render_type_and_render_type, value)


class TestStyle(unittest.TestCase):
    def test_style_new(self):
        result = Style(*[], value="")
        self.assertEqual(result, "")

    def test_style_rules(self):
        result = Style(*[], value="").rules
        self.assertEqual(result, [])

    def test_style_value(self):
        result = Style(*[], value="").value
        self.assertEqual(result, "")

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        result = Register()
        self.assertEqual(result.renderfuncs, {})
        self.assertEqual(result.is_muted, False)
        self.assertEqual(result.eightbit_call, lambda x: x)
        self.assertEqual(result.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_setattr(self):
        result = Register().__setattr__("", Style(*[], value=""))
        self.assertEqual(result, "")

    def test_register_call(self):
        result = Register().__call__()
        self.assertEqual(result, "")

    def test_register_set_eightbit_call(self):
        result = Register().set_eightbit_call(RenderType)
        self.assertEqual(result, None)

    def test_register_set_rgb_call(self):
        result = Register().set_rgb_call(RenderType)
        self.assertEqual(result, None)

    def test_register_set_renderfunc(self):
        result = Register().set_renderfunc(RenderType, lambda x: x)
        self.assertEqual(result, None)

    def test_register_mute(self):
        result = Register().mute()
        self.assertEqual(result, None)

    def test_register_unmute(self):
        result = Register().unmute()
        self.assertEqual(result, None)

    def test_register_as_dict(self):
        result = Register().as_dict()
        self.assertEqual(result, {})

    def test_register_as_namedtuple(self):
        result = Register().as_namedtuple()
        self.assertEqual(result, namedtuple("StyleRegister", [])())

    def test_register_copy(self):
        result = Register().copy()
        self.assertEqual(result, Register())

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