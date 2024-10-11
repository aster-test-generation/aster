import unittest
from sty.primitive import Style, Register, _render_rules


class TestStyle(unittest.TestCase):
    def test_init(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(style.value, "hello")
        self.assertEqual(style.rules, ["rule1", "rule2"])

    def test_str(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(str(style), "hello")

    def test_repr(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(repr(style), "Style('hello', rules=['rule1', 'rule2'])")

class TestRegister(unittest.TestCase):
    def test_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)

    def test_setattr(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.my_style = style
        self.assertEqual(register.my_style.value, "hello")
        self.assertEqual(register.my_style.rules, ["rule1", "rule2"])

    def test_call_eightbit(self):
        register = Register()
        self.assertEqual(register(1), "1")

    def test_call_rgb(self):
        register = Register()
        self.assertEqual(register(1, 2, 3), "(1, 2, 3)")

    def test_call_getattr(self):
        register = Register()
        register.my_style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(register("my_style"), "hello")

    def test_set_eightbit_call(self):
        register = Register()
        def eightbit_call(x):
            return f"eightbit:{x}"
        register.set_eightbit_call(RenderType)  # assume RenderType is defined
        self.assertEqual(register(1), "eightbit:1")

    def test_set_rgb_call(self):
        register = Register()
        def rgb_call(r, g, b):
            return f"rgb:{r},{g},{b}"
        register.set_rgb_call(RenderType)  # assume RenderType is defined
        self.assertEqual(register(1, 2, 3), "rgb:1,2,3")

    def test_set_renderfunc(self):
        register = Register()
        def renderfunc(rendertype):
            return f"rendered:{rendertype}"
        register.set_renderfunc(RenderType, renderfunc)  # assume RenderType is defined
        self.assertEqual(register.renderfuncs[RenderType], renderfunc)

    def test_mute(self):
        register = Register()
        register.my_style = Style("hello", rules=["rule1", "rule2"])
        register.mute()
        self.assertEqual(register.my_style.value, "")

    def test_unmute(self):
        register = Register()
        register.my_style = Style("hello", rules=["rule1", "rule2"])
        register.mute()
        register.unmute()
        self.assertEqual(register.my_style.value, "hello")

    def test_as_dict(self):
        register = Register()
        register.my_style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(register.as_dict(), {"my_style": "hello"})

    def test_as_namedtuple(self):
        register = Register()
        register.my_style = Style("hello", rules=["rule1", "rule2"])
        namedtuple_obj = register.as_namedtuple()
        self.assertEqual(namedtuple_obj.my_style, "hello")

    def test_copy(self):
        register = Register()
        register.my_style = Style("hello", rules=["rule1", "rule2"])
        copied_register = register.copy()
        self.assertEqual(copied_register.my_style.value, "hello")

class TestRenderRules(unittest.TestCase):
    def test_render_rules(self):
        renderfuncs = {RenderType: lambda x: f"rendered:{x}"}
        rules = [RenderType("rule1"), RenderType("rule2")]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered:rule1rendered:rule2")
        self.assertEqual(flattened_rules, [RenderType("rule1"), RenderType("rule2")])

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

class TestStyle(unittest.TestCase):
    def test_Style_init(self):
        style = Style("value", rules=["rule1", "rule2"])
        self.assertEqual(style, "value")
        self.assertEqual(style.rules, ["rule1", "rule2"])

    def test_Style_str(self):
        style = Style("value")
        self.assertEqual(str(style), "value")

    def test_Style_repr(self):
        style = Style("value")
        self.assertEqual(repr(style), "Style('value')")

class TestRegister(unittest.TestCase):
    def test_Register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)

    def test_Register_setattr(self):
        register = Register()
        register.test_style = Style("value", rules=["rule1", "rule2"])
        self.assertEqual(register.test_style, "value")
        self.assertEqual(register.test_style.rules, ["rule1", "rule2"])

    def test_Register_call_eightbit(self):
        register = Register()
        register.set_eightbit_call(type("RenderType", (), {}))
        self.assertEqual(register(1), "1")

    def test_Register_call_rgb(self):
        register = Register()
        register.set_rgb_call(type("RenderType", (), {}))
        self.assertEqual(register(1, 2, 3), "(1, 2, 3)")

    def test_Register_call_getattr(self):
        register = Register()
        register.test_style = Style("value")
        self.assertEqual(register("test_style"), "value")

    def test_Register_set_eightbit_call(self):
        register = Register()
        rendertype = type("RenderType", (), {})
        register.set_eightbit_call(rendertype)
        self.assertEqual(register.eightbit_call, register.renderfuncs[rendertype])

    def test_Register_set_rgb_call(self):
        register = Register()
        rendertype = type("RenderType", (), {})
        register.set_rgb_call(rendertype)
        self.assertEqual(register.rgb_call, register.renderfuncs[rendertype])

    def test_Register_set_renderfunc(self):
        register = Register()
        rendertype = type("RenderType", (), {})
        def func(): pass
        register.set_renderfunc(rendertype, func)
        self.assertEqual(register.renderfuncs[rendertype], func)

    def test_Register_mute(self):
        register = Register()
        register.test_style = Style("value", rules=["rule1", "rule2"])
        register.mute()
        self.assertTrue(register.is_muted)
        self.assertEqual(register.test_style, "")

    def test_Register_unmute(self):
        register = Register()
        register.test_style = Style("value", rules=["rule1", "rule2"])
        register.mute()
        register.unmute()
        self.assertFalse(register.is_muted)
        self.assertEqual(register.test_style, "value")

    def test_Register_as_dict(self):
        register = Register()
        register.test_style = Style("value")
        self.assertEqual(register.as_dict(), {"test_style": "value"})

    def test_Register_as_namedtuple(self):
        register = Register()
        register.test_style = Style("value")
        namedtuple_obj = register.as_namedtuple()
        self.assertEqual(namedtuple_obj.test_style, "value")

    def test_Register_copy(self):
        register = Register()
        register.test_style = Style("value")
        copied_register = register.copy()
        self.assertEqual(copied_register.test_style, "value")

class TestRenderRules(unittest.TestCase):
    def test_render_rules(self):
        renderfuncs = {type("RenderType", (), {}): lambda x: x}
        rules = [type("RenderType", (), {"args": ["arg1"]})()]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "arg1")
        self.assertEqual(flattened_rules, [rules[0]])

if __name__ == '__main__':
    unittest.main()