import unittest
from sty.primitive import Style, Register, _render_rules

class TestStyle(unittest.TestCase):
    def test_Style_init(self):
        style = Style("test", value="Hello, World!")
        self.assertEqual(style, "Hello, World!")
        self.assertEqual(style.rules, ("test",))

    def test_Style_str(self):
        style = Style("test", value="Hello, World!")
        self.assertEqual(str(style), "Hello, World!")

    def test_Style_repr(self):
        style = Style("test", value="Hello, World!")
        self.assertEqual(repr(style), "Style('Hello, World!', ('test',))")

class TestRegister(unittest.TestCase):
    def test_Register_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)
        self.assertEqual(register.eightbit_call, lambda x: x)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_Register_setattr(self):
        register = Register()
        style = Style("test", value="Hello, World!")
        register.test_attr = style
        self.assertEqual(register.test_attr, style)

    def test_Register_call_eightbit(self):
        register = Register()
        self.assertEqual(register(1), 1)

    def test_Register_call_rgb(self):
        register = Register()
        self.assertEqual(register(1, 2, 3), (1, 2, 3))

    def test_Register_set_eightbit_call(self):
        register = Register()
        def test_func(x):
            return x * 2
        register.set_eightbit_call(type("TestRenderType", (), {}))
        register.set_renderfunc(type("TestRenderType", (), {}), test_func)
        self.assertEqual(register(1), 2)

    def test_Register_set_rgb_call(self):
        register = Register()
        def test_func(r, g, b):
            return (r * 2, g * 2, b * 2)
        register.set_rgb_call(type("TestRenderType", (), {}))
        register.set_renderfunc(type("TestRenderType", (), {}), test_func)
        self.assertEqual(register(1, 2, 3), (2, 4, 6))

    def test_Register_set_renderfunc(self):
        register = Register()
        def test_func(x):
            return x * 2
        register.set_renderfunc(type("TestRenderType", (), {}), test_func)
        self.assertIn(type("TestRenderType", (), {}), register.renderfuncs)

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
        register.test_attr = "Hello, World!"
        self.assertEqual(register.as_dict(), {"test_attr": "Hello, World!"})

    def test_Register_as_namedtuple(self):
        register = Register()
        register.test_attr = "Hello, World!"
        self.assertEqual(register.as_namedtuple()._asdict(), {"test_attr": "Hello, World!"})

    def test_Register_copy(self):
        register = Register()
        register.test_attr = "Hello, World!"
        copied_register = register.copy()
        self.assertEqual(copied_register.test_attr, "Hello, World!")

class TestRenderRules(unittest.TestCase):
    def test_render_rules(self):
        renderfuncs = {type("TestRenderType", (), {}): lambda x: x * 2}
        rules = [type("TestRenderType", (), {"args": (2,)})]
        rendered, flattened_rules = _render_rules(renderfuncs, rules)
        self.assertEqual(rendered, "4")
        self.assertEqual(flattened_rules, [type("TestRenderType", (), {"args": (2,)})])

if __name__ == '__main__':
    unittest.main()