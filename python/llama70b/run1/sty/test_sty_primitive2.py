import unittest
from sty.primitive import Style, Register, _render_rules

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