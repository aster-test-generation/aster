import unittest
from sty.primitive import Style, Register, _render_rules

class TestStyle(unittest.TestCase):
    def test_Style_init(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(style.value, "hello")
        self.assertEqual(style.rules, ["rule1", "rule2"])

    def test_Style_str(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(str(style), "hello")

    def test_Style_repr(self):
        style = Style("hello", rules=["rule1", "rule2"])
        self.assertEqual(repr(style), "Style('hello', rules=['rule1', 'rule2'])")

class TestRegister(unittest.TestCase):
    def test_Register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)

    def test_Register_setattr(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        self.assertEqual(register.foo.value, "hello")
        self.assertEqual(register.foo.rules, ["rule1", "rule2"])

    def test_Register_call_eightbit(self):
        register = Register()
        self.assertEqual(register(1), "1")

    def test_Register_call_rgb(self):
        register = Register()
        self.assertEqual(register(1, 2, 3), "(1, 2, 3)")

    def test_Register_call_str(self):
        register = Register()
        self.assertEqual(register("foo"), "foo")

    def test_Register_set_eightbit_call(self):
        register = Register()
        def eightbit_call(x):
            return f"eightbit:{x}"
        register.set_eightbit_call(RenderType)
        self.assertEqual(register(1), "eightbit:1")

    def test_Register_set_rgb_call(self):
        register = Register()
        def rgb_call(r, g, b):
            return f"rgb:{r},{g},{b}"
        register.set_rgb_call(RenderType)
        self.assertEqual(register(1, 2, 3), "rgb:1,2,3")

    def test_Register_set_renderfunc(self):
        register = Register()
        def renderfunc(rendertype):
            return f"rendered:{rendertype}"
        register.set_renderfunc(RenderType, renderfunc)
        self.assertEqual(register.renderfuncs[RenderType], renderfunc)

    def test_Register_mute(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        register.mute()
        self.assertEqual(register.foo.value, "")

    def test_Register_unmute(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        register.mute()
        register.unmute()
        self.assertEqual(register.foo.value, "hello")

    def test_Register_as_dict(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        self.assertEqual(register.as_dict(), {"foo": "hello"})

    def test_Register_as_namedtuple(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        namedtuple_obj = register.as_namedtuple()
        self.assertEqual(namedtuple_obj.foo, "hello")

    def test_Register_copy(self):
        register = Register()
        style = Style("hello", rules=["rule1", "rule2"])
        register.foo = style
        copied_register = register.copy()
        self.assertEqual(copied_register.foo.value, "hello")

    def test__render_rules(self):
        renderfuncs = {RenderType: lambda x: f"rendered:{x}"}
        rules = [RenderType("rule1"), Style("hello", rules=["rule2", "rule3"])]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered:rule1hello")
        self.assertEqual(flattened_rules, [RenderType("rule1"), RenderType("rule2"), RenderType("rule3")])

if __name__ == '__main__':
    unittest.main()