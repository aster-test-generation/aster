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
        rules = [MockRenderType(1, 2, 3)]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered(1, 2, 3)")
        self.assertEqual(len(flattened_rules), 1)
        self.assertIsInstance(flattened_rules[0], MockRenderType)

    def test_render_rules_with_style(self):
        renderfuncs = {MockRenderType: lambda *args: f"rendered{args}"}
        inner_style = Style(MockRenderType(4, 5, 6), value="")
        rules = [inner_style]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered(4, 5, 6)")
        self.assertEqual(len(flattened_rules), 1)
        self.assertIsInstance(flattened_rules[0], MockRenderType)

    def test_render_rules_invalid_rule(self):
        renderfuncs = {}
        rules = ["invalid_rule"]
        with self.assertRaises(ValueError):
            _render_rules(renderfuncs, rules)

class TestRegister(unittest.TestCase):
    def setUp(self):
        self.register = Register()
        self.register.set_renderfunc(MockRenderType, lambda *args: f"rendered{args}")

    def test_init(self):
        self.assertIsInstance(self.register.renderfuncs, dict)
        self.assertFalse(self.register.is_muted)

    def test_setattr(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.assertEqual(self.register.test_style, "rendered(1, 2, 3)")

    def test_call_eightbit(self):
        self.register.set_eightbit_call(MockRenderType)
        result = self.register(42)
        self.assertEqual(result, "rendered(42,)")

    def test_call_rgb(self):
        self.register.set_rgb_call(MockRenderType)
        result = self.register(255, 0, 0)
        self.assertEqual(result, "rendered(255, 0, 0)")

    def test_call_string(self):
        self.register.test_attr = "test_value"
        result = self.register("test_attr")
        self.assertEqual(result, "test_value")

    def test_call_invalid(self):
        result = self.register(1, 2)
        self.assertEqual(result, "")

    def test_set_eightbit_call(self):
        self.register.set_eightbit_call(MockRenderType)
        self.assertEqual(self.register.eightbit_call(42), "rendered(42,)")

    def test_set_rgb_call(self):
        self.register.set_rgb_call(MockRenderType)
        self.assertEqual(self.register.rgb_call(255, 0, 0), "rendered(255, 0, 0)")

    def test_set_renderfunc(self):
        self.register.set_renderfunc(MockRenderType, lambda *args: f"new_rendered{args}")
        self.assertEqual(self.register.eightbit_call(42), "new_rendered(42,)")

    def test_mute(self):
        self.register.test_style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.mute()
        self.assertTrue(self.register.is_muted)
        self.assertEqual(self.register.test_style, "")

    def test_unmute(self):
        self.register.test_style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.mute()
        self.register.unmute()
        self.assertFalse(self.register.is_muted)
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