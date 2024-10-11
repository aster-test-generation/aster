import unittest
from sty.primitive import *

class TestStyle(unittest.TestCase):
    def test_style_new(self):
        result = Style(*[], value="")
        self.assertEqual(result, "")

    def test_style_rules(self):
        result = Style(*[], value="").rules
        self.assertEqual(result, [])

    def test_style_value(self):
        result = Style(*[], value="").value
        self.assertEqual(result, "")

class TestRegister(unittest.TestCase):
    def test_register_init(self):
        result = Register()
        self.assertEqual(result.renderfuncs, {})
        self.assertEqual(result.is_muted, False)
        self.assertEqual(result.eightbit_call, lambda x: x)
        self.assertEqual(result.rgb_call, lambda r, g, b: (r, g, b))

    def test_register_setattr(self):
        result = Register().__setattr__("", Style(*[], value=""))
        self.assertEqual(result, "")

    def test_register_call(self):
        result = Register().__call__()
        self.assertEqual(result, "")

    def test_register_set_eightbit_call(self):
        result = Register().set_eightbit_call(RenderType)
        self.assertEqual(result, None)

    def test_register_set_rgb_call(self):
        result = Register().set_rgb_call(RenderType)
        self.assertEqual(result, None)

    def test_register_set_renderfunc(self):
        result = Register().set_renderfunc(RenderType, lambda x: x)
        self.assertEqual(result, None)

    def test_register_mute(self):
        result = Register().mute()
        self.assertEqual(result, None)

    def test_register_unmute(self):
        result = Register().unmute()
        self.assertEqual(result, None)

    def test_register_as_dict(self):
        result = Register().as_dict()
        self.assertEqual(result, {})

    def test_register_as_namedtuple(self):
        result = Register().as_namedtuple()
        self.assertEqual(result, namedtuple("StyleRegister", [])())

    def test_register_copy(self):
        result = Register().copy()
        self.assertEqual(result, Register())

if __name__ == '__main__':
    unittest.main()