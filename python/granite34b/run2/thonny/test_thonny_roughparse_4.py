import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        text = "    def test_method():\n        return 1\n"
        index = "1.10"
        parser = HyperParser(text, index)
        self.assertEqual(parser.rawtext, "def test_method():\n        return 1\n")
        self.assertEqual(parser.stopatindex, "2.0")
        self.assertEqual(parser.bracketing, [(0, 0), (4, 1), (13, 2)])
        self.assertEqual(parser.isopener, [True, False, True])

    def test_set_index(self):
        text = "    def test_method():\n        return 1\n"
        index = "1.10"
        parser = HyperParser(text, index)
        parser.set_index("1.10")
        self.assertEqual(parser.indexinrawtext, 10)
        self.assertEqual(parser.indexbracket, 1)

    def test_is_in_string(self):
        text = '    def test_method():\n        return "Hello"\n'
        index = "1.10"
        parser = HyperParser(text, index)
        parser.set_index("1.10")
        self.assertTrue(parser.is_in_string())

    def test_is_in_code(self):
        text = "    def test_method():\n        return 1\n"
        index = "1.10"
        parser = HyperParser(text, index)
        parser.set_index("1.10")
        self.assertFalse(parser.is_in_code())

    def test_get_surrounding_brackets(self):
        text = "    def test_method():\n        return 1\n"
        index = "1.10"
        parser = HyperParser(text, index)
        parser.set_index("1.10")
        self.assertEqual(parser.get_surrounding_brackets(), ("1.0", "2.0"))

if __name__ == '__main__':
    unittest.main()