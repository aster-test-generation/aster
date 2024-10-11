import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        text = "    def test_method(self):\n        pass\n"
        index = "1.0"
        parser = HyperParser(text, index)
        self.assertEqual(parser.rawtext, "def test_method(self):\n    pass\n")
        self.assertEqual(parser.stopatindex, "2.0")
        self.assertEqual(parser.bracketing, [(0, 0), (4, 1), (14, 0)])
        self.assertEqual(parser.isopener, [True, False, True])

    def test_set_index(self):
        text = "    def test_method(self):\n        pass\n"
        index = "1.0"
        parser = HyperParser(text, index)
        parser.set_index("1.5")
        self.assertEqual(parser.indexinrawtext, 5)
        self.assertEqual(parser.indexbracket, 1)

    def test_is_in_string(self):
        text = '    def test_method(self):\n        print("Hello, world!")\n'
        index = "1.10"
        parser = HyperParser(text, index)
        self.assertTrue(parser.is_in_string())

    def test_is_in_code(self):
        text = "    def test_method(self):\n        pass\n"
        index = "1.0"
        parser = HyperParser(text, index)
        self.assertTrue(parser.is_in_code())

    def test_get_surrounding_brackets(self):
        text = "    def test_method(self):\n        pass\n"
        index = "1.0"
        parser = HyperParser(text, index)
        self.assertEqual(parser.get_surrounding_brackets(), ("1.0", "2.0"))

if __name__ == '__main__':
    unittest.main()