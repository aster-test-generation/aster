import unittest
from sty.primitive import *



class TestStyle(unittest.TestCase):
    def test_style(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(style.rules, [1, 2, 3])
        self.assertEqual(style, value)

    def test_style_new(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style.__new__(Style, *rules, value=value)
        self.assertEqual(style.rules, [1, 2, 3])
        self.assertEqual(style, value)

    def test_style_init(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style.__init__(Style, *rules, value=value)
        self.assertEqual(style.rules, rules)
        self.assertEqual(style, value)

    def test_style_str(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(str(style), value)

    def test_style_repr(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(repr(style), 'abc')

    def test_style_eq(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(style, value)

    def test_style_ne(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertNotEqual(style, "def")

    def test_style_hash(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(hash(style), hash(value))

    def test_style_add(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(style + "def", value + "def")

    def test_style_radd(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual("def" + style, "def" + value)

    def test_style_mul(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(style * 2, value * 2)

    def test_style_rmul(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(2 * style, 2 * value)

    def test_style_mod(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(style % 2, value % 2)

    def test_style_rmod(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(2 % style, 0)

    def test_style_getitem(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        self.assertEqual(style[0], value[0])

    def test_style_setitem(self):
        rules = [1, 2, 3]
        value = "abc"
        style = Style(*rules, value=value)
        style[0] = "d"
        self.assertEqual(style, "dbc")

if __name__ == '__main__':
    unittest.main()