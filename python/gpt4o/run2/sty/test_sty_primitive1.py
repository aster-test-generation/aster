import unittest
from collections import namedtuple
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
    def test_render_rules(self):
        def mock_render_func(*args):
            return f"rendered({args})"
        
        renderfuncs = {MockRenderType: mock_render_func}
        rules = [MockRenderType(1, 2, 3), MockRenderType(4, 5, 6)]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered((1, 2, 3))rendered((4, 5, 6))")
        self.assertEqual(flattened_rules, rules)

    def test_render_rules_with_style(self):
        def mock_render_func(*args):
            return f"rendered({args})"
        
        renderfuncs = {MockRenderType: mock_render_func}
        inner_style = Style(MockRenderType(4, 5, 6), value="")
        rules = [MockRenderType(1, 2, 3), inner_style]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered((1, 2, 3))rendered((4, 5, 6))")
        self.assertEqual(flattened_rules, [MockRenderType(1, 2, 3), MockRenderType(4, 5, 6)])

    def test_render_rules_invalid_rule(self):
        renderfuncs = {}
        rules = [123]
        with self.assertRaises(ValueError):
            _render_rules(renderfuncs, rules)

class TestRegister(unittest.TestCase):
    def setUp(self):
        self.register = Register()

    def test_init(self):
        self.assertEqual(self.register.renderfuncs, {})
        self.assertFalse(self.register.is_muted)
        self.assertTrue(callable(self.register.eightbit_call))
        self.assertTrue(callable(self.register.rgb_call))

    def test_setattr(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.renderfuncs = {MockRenderType: lambda *args: "rendered"}
        self.register.is_muted = False
        self.register.test_style = style
        self.assertEqual(self.register.test_style, "rendered")
        self.assertEqual(self.register.test_style.rules, (MockRenderType(1, 2, 3),))

    def test_call(self):
        self.register.renderfuncs = {MockRenderType: lambda *args: "rendered"}
        self.register.eightbit_call = lambda x: f"eightbit({x})"
        self.register.rgb_call = lambda r, g, b: f"rgb({r}, {g}, {b})"
        
        self.assertEqual(self.register(1), "eightbit(1)")
        self.assertEqual(self.register(1, 2, 3), "rgb(1, 2, 3)")
        self.assertEqual(self.register("test"), "")
        self.assertEqual(self.register(), "")

    def test_set_eightbit_call(self):
        self.register.renderfuncs = {MockRenderType: lambda *args: "rendered"}
        self.register.set_eightbit_call(MockRenderType)
        self.assertEqual(self.register.eightbit_call(), "rendered")

    def test_set_rgb_call(self):
        self.register.renderfuncs = {MockRenderType: lambda *args: "rendered"}
        self.register.set_rgb_call(MockRenderType)
        self.assertEqual(self.register.rgb_call(), "rendered")

    def test_set_renderfunc(self):
        self.register.set_renderfunc(MockRenderType, lambda *args: "rendered")
        self.assertIn(MockRenderType, self.register.renderfuncs)

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
        self.assertEqual(self.register.test_style, "rendered")

    def test_as_dict(self):
        self.register.test_attr = "value"
        self.assertEqual(self.register.as_dict(), {"test_attr": "value"})

    def test_as_namedtuple(self):
        self.register.test_attr = "value"
        nt = self.register.as_namedtuple()
        self.assertEqual(nt.test_attr, "value")

    def test_copy(self):
        copy_register = self.register.copy()
        self.assertIsInstance(copy_register, Register)
        self.assertIsNot(copy_register, self.register)

if __name__ == '__main__':
    unittest.main()