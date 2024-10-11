import unittest
from sty.primitive import Style, _render_rules, Register, RenderType

class MockRenderType(RenderType):
    def __init__(self, *args):
        self.args = args

class TestStyle(unittest.TestCase):
    def test_style_new(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.assertEqual(style, "test")
        self.assertEqual(style.rules, (MockRenderType(1, 2, 3),))

class TestRenderRules(unittest.TestCase):
    def test_render_rules_with_rendertype(self):
        def mock_renderfunc(*args):
            return f"rendered-{args}"
        
        renderfuncs = {MockRenderType: mock_renderfunc}
        rules = [MockRenderType(1, 2, 3)]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered-(1, 2, 3)")
        self.assertEqual(flattened_rules, rules)

    def test_render_rules_with_style(self):
        def mock_renderfunc(*args):
            return f"rendered-{args}"
        
        renderfuncs = {MockRenderType: mock_renderfunc}
        nested_style = Style(MockRenderType(1, 2, 3), value="nested")
        rules = [nested_style]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered-(1, 2, 3)")
        self.assertEqual(flattened_rules, [MockRenderType(1, 2, 3)])

    def test_render_rules_invalid_rule(self):
        renderfuncs = {}
        rules = ["invalid_rule"]
        with self.assertRaises(ValueError):
            _render_rules(renderfuncs, rules)

class TestRegister(unittest.TestCase):
    def setUp(self):
        self.register = Register()

    def test_init(self):
        self.assertEqual(self.register.renderfuncs, {})
        self.assertFalse(self.register.is_muted)
        self.assertEqual(self.register.eightbit_call(1), 1)
        self.assertEqual(self.register.rgb_call(1, 2, 3), (1, 2, 3))

    def test_setattr_with_style(self):
        def mock_renderfunc(*args):
            return f"rendered-{args}"
        
        self.register.renderfuncs = {MockRenderType: mock_renderfunc}
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.assertEqual(self.register.test_style, "rendered-(1, 2, 3)")

    def test_setattr_with_non_style(self):
        self.register.test_attr = "value"
        self.assertEqual(self.register.test_attr, "value")

    def test_call_with_one_int_arg(self):
        self.register.eightbit_call = lambda x: f"eightbit-{x}"
        result = self.register(1)
        self.assertEqual(result, "eightbit-1")

    def test_call_with_one_str_arg(self):
        self.register.test_attr = "value"
        result = self.register("test_attr")
        self.assertEqual(result, "value")

    def test_call_with_three_args(self):
        self.register.rgb_call = lambda r, g, b: f"rgb-{r}-{g}-{b}"
        result = self.register(1, 2, 3)
        self.assertEqual(result, "rgb-1-2-3")

    def test_call_with_invalid_args(self):
        result = self.register(1, 2)
        self.assertEqual(result, "")

    def test_set_eightbit_call(self):
        def mock_renderfunc(*args):
            return f"rendered-{args}"
        
        self.register.renderfuncs = {MockRenderType: mock_renderfunc}
        self.register.set_eightbit_call(MockRenderType)
        result = self.register.eightbit_call(1)
        self.assertEqual(result, "rendered-(1,)")

    def test_set_rgb_call(self):
        def mock_renderfunc(*args):
            return f"rendered-{args}"
        
        self.register.renderfuncs = {MockRenderType: mock_renderfunc}
        self.register.set_rgb_call(MockRenderType)
        result = self.register.rgb_call(1, 2, 3)
        self.assertEqual(result, "rendered-(1, 2, 3)")

    def test_set_renderfunc(self):
        def mock_renderfunc(*args):
            return f"rendered-{args}"
        
        self.register.renderfuncs = {MockRenderType: mock_renderfunc}
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.register.set_renderfunc(MockRenderType, mock_renderfunc)
        self.assertEqual(self.register.test_style, "rendered-(1, 2, 3)")

    def test_mute(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.register.mute()
        self.assertTrue(self.register.is_muted)
        self.assertEqual(self.register.test_style, "")

    def test_unmute(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.register.mute()
        self.register.unmute()
        self.assertFalse(self.register.is_muted)
        self.assertEqual(self.register.test_style, "rendered-(1, 2, 3)")

    def test_as_dict(self):
        self.register.test_attr = "value"
        result = self.register.as_dict()
        self.assertEqual(result, {"test_attr": "value"})

    def test_as_namedtuple(self):
        self.register.test_attr = "value"
        result = self.register.as_namedtuple()
        self.assertEqual(result.test_attr, "value")

    def test_copy(self):
        copy_register = self.register.copy()
        self.assertIsInstance(copy_register, Register)
        self.assertEqual(copy_register.renderfuncs, self.register.renderfuncs)
        self.assertEqual(copy_register.is_muted, self.register.is_muted)

if __name__ == '__main__':
    unittest.main()