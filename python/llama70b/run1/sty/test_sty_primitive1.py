import unittest
from sty.primitive import Style, Register, _render_rules

class TestStyle(unittest.TestCase):
    def test_Style_init(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(style.rules, ["rule1", "rule2"])
        self.assertEqual(style, "hello")

    def test_Style_str(self):
        style = Style("hello")
        self.assertEqual(str(style), "hello")

    def test_Style_repr(self):
        style = Style("hello")
        self.assertEqual(repr(style), "Style('hello')")

class TestRegister(unittest.TestCase):
    def test_Register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)

    def test_Register_setattr(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        self.assertEqual(register.foo, style)

    def test_Register_call_eightbit(self):
        register = Register()
        self.assertEqual(register(1), "")

    def test_Register_call_rgb(self):
        register = Register()
        self.assertEqual(register(1, 2, 3), (1, 2, 3))

    def test_Register_set_eightbit_call(self):
        register = Register()
        def eightbit_call(x):
            return x * 2
        register.set_eightbit_call(RenderType)  # assume RenderType is defined
        self.assertEqual(register.eightbit_call(2), 4)

    def test_Register_set_rgb_call(self):
        register = Register()
        def rgb_call(r, g, b):
            return (r * 2, g * 2, b * 2)
        register.set_rgb_call(RenderType)  # assume RenderType is defined
        self.assertEqual(register.rgb_call(1, 2, 3), (2, 4, 6))

    def test_Register_set_renderfunc(self):
        register = Register()
        def renderfunc(rendertype):
            return "rendered"
        register.set_renderfunc(RenderType, renderfunc)  # assume RenderType is defined
        self.assertEqual(register.renderfuncs[RenderType], renderfunc)

    def test_Register_mute(self):
        register = Register()
        register.mute()
        self.assertTrue(register.is_muted)

    def test_Register_unmute(self):
        register = Register()
        register.mute()
        register.unmute()
        self.assertFalse(register.is_muted)

    def test_Register_as_dict(self):
        register = Register()
        register.foo = "bar"
        self.assertEqual(register.as_dict(), {"foo": "bar"})

    def test_Register_as_namedtuple(self):
        register = Register()
        register.foo = "bar"
        namedtuple_obj = register.as_namedtuple()
        self.assertEqual(namedtuple_obj.foo, "bar")

    def test_Register_copy(self):
        register = Register()
        register.foo = "bar"
        copied_register = register.copy()
        self.assertEqual(copied_register.foo, "bar")

class TestRenderRules(unittest.TestCase):
    def test_render_rules(self):
        renderfuncs = {RenderType: lambda x: "rendered"}  # assume RenderType is defined
        rules = [RenderType("arg1", "arg2")]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered")
        self.assertEqual(flattened_rules, [RenderType("arg1", "arg2")])

if __name__ == '__main__':
    unittest.main()