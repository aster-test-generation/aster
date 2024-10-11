import unittest
from sty.primitive import Register, Style

class TestRegister(unittest.TestCase):
    def test_init(self):
        register = Register()
        self.assertEqual(register.renderfuncs, {})
        self.assertFalse(register.is_muted)
        self.assertEqual(register.eightbit_call, lambda x: x)
        self.assertEqual(register.rgb_call, lambda r, g, b: (r, g, b))

    def test_set_eightbit_call(self):
        register = Register()
        register.set_eightbit_call(Style)
        self.assertEqual(register.eightbit_call, register.renderfuncs[Style])

    def test_set_rgb_call(self):
        register = Register()
        register.set_rgb_call(Style)
        self.assertEqual(register.rgb_call, register.renderfuncs[Style])

    def test_set_renderfunc(self):
        register = Register()
        register.set_renderfunc(Style, lambda x: x)
        self.assertEqual(register.renderfuncs, {Style: lambda x: x})

    def test_mute(self):
        register = Register()
        register.mute()
        self.assertTrue(register.is_muted)

    def test_unmute(self):
        register = Register()
        register.mute()
        register.unmute()
        self.assertFalse(register.is_muted)

    def test_as_dict(self):
        register = Register()
        register.style = Style("style")
        self.assertEqual(register.as_dict(), {"style": "style"})

    def test_as_namedtuple(self):
        register = Register()
        register.style = Style("style")
        self.assertEqual(register.as_namedtuple()._asdict(), {"style": "style"})

    def test_copy(self):
        register = Register()
        register.style = Style("style")
        copied_register = register.copy()
        self.assertEqual(copied_register.style, "style")
        self.assertEqual(register.style, "style")

    def test_setattr(self):
        register = Register()
        register.style = Style("style")
        self.assertEqual(register.style, "style")

    def test_call(self):
        register = Register()
        register.style = Style("style")
        self.assertEqual(register(), "style")

    def test_call_muted(self):
        register = Register()
        register.style = Style("style")
        register.mute()
        self.assertEqual(register(), "")

    def test_call_eightbit(self):
        register = Register()
        register.style = Style("style")
        register.set_eightbit_call(Style)
        self.assertEqual(register(1), "style")

    def test_call_rgb(self):
        register = Register()
        register.style = Style("style")
        register.set_rgb_call(Style)
        self.assertEqual(register(1, 2, 3), "style")

    def test_call_invalid(self):
        register = Register()
        register.style = Style("style")
        self.assertEqual(register(1, 2), "")

    def test_call_invalid_muted(self):
        register = Register()
        register.style = Style("style")
        register.mute()
        self.assertEqual(register(1, 2), "")

    def test_call_invalid_eightbit(self):
        register = Register()
        register.style = Style("style")
        register.set_eightbit_call(Style)
        self.assertEqual(register(1, 2), "")

    def test_call_invalid_rgb(self):
        register = Register()
        register.style = Style("style")
        register.set_rgb_call(Style)
        self.assertEqual(register(1, 2, 3, 4), "")

if __name__ == '__main__':
    unittest.main()