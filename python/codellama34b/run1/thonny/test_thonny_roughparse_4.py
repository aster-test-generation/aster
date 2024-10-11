import unittest
from thonny.roughparse import *


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        text = "text"
        index = "index"
        instance = HyperParser(text, index)
        self.assertEqual(instance.text, text)
        self.assertEqual(instance.stopatindex, "5.end")
        self.assertEqual(instance.bracketing, [])
        self.assertEqual(instance.isopener, [])
        self.assertEqual(instance.indexinrawtext, 0)
        self.assertEqual(instance.indexbracket, 0)

    def test_set_index(self):
        text = "text"
        index = "index"
        instance = HyperParser(text, index)
        instance.set_index(index)
        self.assertEqual(instance.indexinrawtext, 0)
        self.assertEqual(instance.indexbracket, 0)

    def test_is_in_string(self):
        text = "text"
        index = "index"
        instance = HyperParser(text, index)
        result = instance.is_in_string()
        self.assertEqual(result, False)

    def test_is_in_code(self):
        text = "text"
        index = "index"
        instance = HyperParser(text, index)
        result = instance.is_in_code()
        self.assertEqual(result, False)

    def test_get_surrounding_brackets(self):
        text = "text"
        index = "index"
        instance = HyperParser(text, index)
        result = instance.get_surrounding_brackets()
        self.assertEqual(result, None)

    def test_eat_identifier(self):
        s = "s"
        limit = 0
        pos = 0
        result = HyperParser._eat_identifier(s, limit, pos)
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()