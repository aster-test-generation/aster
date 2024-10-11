import unittest
from sty.primitive import Style, _render_rules, Register, RenderType
from collections import namedtuple


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
        self.assertEqual(flattened_rules, rules)

    def test_render_rules_with_style(self):
        renderfuncs = {MockRenderType: lambda *args: f"rendered{args}"}
        nested_style = Style(MockRenderType(4, 5, 6), value="nested")
        rules = [nested_style]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered(4, 5, 6)")
        self.assertEqual(flattened_rules, [MockRenderType(4, 5, 7)])

    def test_render_rules_invalid_rule(self):
        renderfuncs = {}
        rules = ["invalid"]
        with self.assertRaises(ValueError):
            _render_rules(renderfuncs, rules)

class TestRegister(unittest.TestCase):
    def setUp(self):
        self.register = Register()

    def test_init(self):
        self.assertIsInstance(self.register.renderfuncs, dict)
        self.assertFalse(self.register.is_muted)

    def test_setattr_style(self):
        self.register.renderfuncs = {MockRenderType: lambda *args: f"rendered{args}"}
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = style
        self.assertEqual(self.register.test_style, "rendered(1, 2, 3)")

    def test_setattr_non_style(self):
        self.register.test_attr = "value"
        self.assertEqual(self.register.test_attr, "value")

    def test_call_eightbit(self):
        self.register.set_eightbit_call(MockRenderType())
        self.register.renderfuncs = {MockRenderType: lambda x: f"eightbit{x}"}
        result = self.register(42)
        self.assertEqual(result, "eightbit42")

    def test_call_rgb(self):
        self.register.set_rgb_call(MockRenderType())
        self.register.renderfuncs = {MockRenderType: lambda r, g, b: f"rgb{r}{g}{b}"}
        result = self.register(1, 2, 3)
        self.assertEqual(result, "rgb123")

    def test_call_string(self):
        self.register.test_attr = "value"
        result = self.register("test_attr")
        self.assertEqual(result, "value")

    def test_call_invalid(self):
        result = self.register(1, 2)
        self.assertEqual(result, "")

    def test_set_eightbit_call(self):
        self.register.renderfuncs = {MockRenderType: lambda x: f"eightbit{x}"}
        self.register.set_eightbit_call(MockRenderType)
        self.assertEqual(self.register.eightbit_call(42), "eightbit42")

    def test_set_rgb_call(self):
        self.register.renderfuncs = {MockRenderType: lambda r, g, b: f"rgb{r}{g}{b}"}
        self.register.set_rgb_call(MockRenderType)
        self.assertEqual(self.register.rgb_call(1, 2, 3), "rgb123")

    def test_set_renderfunc(self):
        self.register.renderfuncs = {MockRenderType: lambda x: f"eightbit{x}"}
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = lambda x, y=None: style(x)
        self.register.set_renderfunc(MockRenderType, lambda x: f"new_render{x}")
        self.assertEqual(self.register.test_style, "new_render(1, 2, 3)")

    def test_mute(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = MockRenderType
        self.register.mute()
        self.assertTrue(self.register.is_muted)
        self.assertEqual(self.register.test_style, "")

    def test_unmute(self):
        style = Style(MockRenderType(1, 2, 3), value="test")
        self.register.test_style = MockRenderType
        self.register.mute()
        self.register.unmute()
        self.assertFalse(self.register.is_muted)
        self.assertEqual(self.register.test_style, "rendered(1, 2, 3)")

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
        self.assertIsNot(copy_register, self.register)

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

class TestRenderRules(unittest.TestCase):
    def test_render_rules(self):
        def mock_render_func(*args):
            return f"rendered-{args[0]}"
        
        renderfuncs = {MockRenderType: mock_render_func}
        rules = [MockRenderType(1), MockRenderType(2)]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered-1rendered-2")
        self.assertEqual(flattened_rules, rules)

    def test_render_rules_with_style(self):
        def mock_render_func(*args):
            return f"rendered-{args[0]}"
        
        renderfuncs = {MockRenderType: mock_render_func}
        inner_style = Style(MockRenderType(2))
        rules = [MockRenderType(1), inner_style]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "rendered-1rendered-2")
        self.assertEqual(flattened_rules, [MockRenderType(1), MockRenderType(2)])

    def test_render_rules_invalid_rule(self):
        renderfuncs = {}
        rules = ["invalid"]
        with self.assertRaises(ValueError):
            _render_rules(renderfuncs, rules)

class TestRegister(unittest.TestCase):
    def setUp(self):
        self.register = Register()

    def test_init(self):
        self.assertIsInstance(self.register.renderfuncs, dict)
        self.assertFalse(self.register.is_muted)
        self.assertTrue(callable(self.register.eightbit_call))
        self.assertTrue(callable(self.register.rgb_call))

    def test_setattr(self):
        style = Style(MockRenderType(1), value="test")
        self.register.renderfuncs = {MockRenderType: lambda x: f"rendered-{x}"}
        self.register.test_style = style
        self.assertEqual(self.register.test_style, "rendered-1")

    def test_call_single_int(self):
        self.register.eightbit_call = lambda x: f"eightbit-{x}"
        result = self.register(1)
        self.assertEqual(result, "eightbit-1")

    def test_call_single_str(self):
        self.register.test_attr = "test_value"
        result = self.register("test_attr")
        self.assertEqual(result, "test_value")

    def test_call_rgb(self):
        self.register.rgb_call = lambda r, g, b: f"rgb-{r}-{g}-{b}"
        result = self.register(1, 2, 3)
        self.assertEqual(result, "rgb-1-2-3")

    def test_call_invalid(self):
        result = self.register(1, 2)
        self.assertEqual(result, "")

    def test_set_eightbit_call(self):
        self.register.renderfuncs = {MockRenderType: lambda x: f"eightbit-{x}"}
        self.register.set_eightbit_call(MockRenderType)
        result = self.register.eightbit_call(1)
        self.assertEqual(result, "eightbit-1")

    def test_set_rgb_call(self):
        self.register.renderfuncs = {MockRenderType: lambda r, g, b: f"rgb-{r}-{g}-{b}"}
        self.register.set_rgb_call(MockRenderType)
        result = self.register.rgb_call(1, 2, 3)
        self.assertEqual(result, "rgb-1-2-3")

    def test_set_renderfunc(self):
        self.register.renderfuncs = {MockRenderType: lambda x: f"rendered-{x}"}
        style = Style(MockRenderType(1), value="test")
        self.register.test_style = style
        self.register.set_renderfunc(MockRenderType, lambda x: f"new-rendered-{x}")
        self.assertEqual(self.register.test_style, "new-rendered-1")

    def test_mute(self):
        style = Style(MockRenderType(1), value="test")
        self.register.test_style = style
        self.register.mute()
        self.assertTrue(self.register.is_muted)
        self.assertEqual(self.register.test_style, "")

    def test_unmute(self):
        style = Style(MockRenderType(1), value="test")
        self.register.test_style = style
        self.register.mute()
        self.register.unmute()
        self.assertFalse(self.register.is_muted)
        self.assertEqual(self.register.test_style, "rendered-1")

    def test_as_dict(self):
        self.register.test_attr = "test_value"
        result = self.register.as_dict()
        self.assertEqual(result, {"test_attr": "test_value"})

    def test_as_namedtuple(self):
        self.register.test_attr = "test_value"
        result = self.register.as_namedtuple()
        self.assertEqual(result, namedtuple("StyleRegister", ["test_attr"])("test_value"))

    def test_copy(self):
        copy_register = self.register.copy()
        self.assertIsInstance(copy_register, Register)
        self.assertIsNot(copy_register, self.register)

if __name__ == '__main__':
    unittest.main()