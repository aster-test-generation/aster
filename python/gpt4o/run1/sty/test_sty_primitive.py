import unittest
from sty.primitive import Style, _render_rules, Register, RenderType


class MockRenderType(RenderType):
    def __init__(self, *args):
        self.args = args

class TestStyle(unittest.TestCase):
    def test_style_new(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.assertEqual(style, "test")
        self.assertEqual(len(style.rules), 1)
        self.assertIsInstance(style.rules[0], MockRenderType)

class TestRenderRules(unittest.TestCase):
    def test_render_rules(self):
        renderfuncs = {MockRenderType: lambda *args: f"rendered{args}"}
        rules = [MockRenderType(1, 2, 3), MockRenderType(4, 5, 6)]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered(1, 2, 3)rendered(4, 5, 6)")
        self.assertEqual(flattened_rules, rules)

    def test_render_rules_with_style(self):
        renderfuncs = {MockRenderType: lambda *args: f"rendered{args}"}
        nested_style = Style(MockRenderType(7, 8, 9), value="nested")
        rules = [MockRenderType(1, 2, 3), nested_style]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered(1, 2, 3)rendered(7, 8, 9)")
        self.assertEqual(len(flattened_rules), 2)

    def test_render_rules_invalid_rule(self):
        renderfuncs = {MockRenderType: lambda *args: f"rendered{args}"}
        rules = [MockRenderType(1, 2, 3), "invalid_rule"]
        with self.assertRaises(ValueError):
            _render_rules(renderfuncs, rules)

class TestRegister(unittest.TestCase):
    def setUp(self):
        self.register = Register()
        self.register.set_renderfunc(MockRenderType, lambda *args: f"rendered{args}")

    def test_setattr(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.assertEqual(self.register.test_style, "rendered(1, 2, 3)")

    def test_call_single_int(self):
        self.register.eightbit_call = lambda x: f"eightbit{x}"
        result = self.register(42)
        self.assertEqual(result, "eightbit42")

    def test_call_single_str(self):
        self.register.test_attr = "test_value"
        result = self.register("test_attr")
        self.assertEqual(result, "test_value")

    def test_call_rgb(self):
        self.register.rgb_call = lambda r, g, b: f"rgb({r},{g},{b})"
        result = self.register(255, 0, 0)
        self.assertEqual(result, "rgb(255,0,0)")

    def test_call_invalid(self):
        result = self.register(1, 2)
        self.assertEqual(result, "")

    def test_set_eightbit_call(self):
        self.register.set_eightbit_call(MockRenderType)
        result = self.register.eightbit_call(1, 2, 3)
        self.assertEqual(result, "rendered(1, 2, 3)")

    def test_set_rgb_call(self):
        self.register.set_rgb_call(MockRenderType)
        result = self.register.rgb_call(1, 2, 3)
        self.assertEqual(result, "rendered(1, 2, 3)")

    def test_set_renderfunc(self):
        self.register.set_renderfunc(MockRenderType, lambda *args: f"new_rendered{args}")
        result = self.register.eightbit_call((1, 2, 3))
        self.assertEqual(result, "new_rendered(1, 2, 3)")

    def test_mute(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.register.mute()
        self.assertEqual(self.register.test_style, "")

    def test_unmute(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.register.mute()
        self.register.unmute()
        self.assertEqual(self.register.test_style, "rendered(1, 2, 3)")

    def test_as_dict(self):
        self.register.test_attr = "test_value"
        result = self.register.as_dict()
        self.assertEqual(result, {"test_attr": "test_value"})

    def test_as_namedtuple(self):
        self.register.test_attr = "test_value"
        result = self.register.as_namedtuple()
        self.assertEqual(result.test_attr, "test_value")

    def test_copy(self):
        copy_register = self.register.copy()
        self.assertIsInstance(copy_register, Register)
        self.assertEqual(copy_register.renderfuncs, self.register.renderfuncs)

if __name__ == '__main__':
    unittest.main()