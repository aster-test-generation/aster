import unittest
from sty.primitive import Style, Register


class TestStyle(unittest.TestCase):
    def test_style_init(self):
        style = Style("red", "bold")
        self.assertEqual(style.rules, ("red", "bold"))

if __name__ == '__main__':
    unittest.main()