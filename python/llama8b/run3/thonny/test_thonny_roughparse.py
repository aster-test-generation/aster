import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        hp = HyperParser("test text", 0)
        self.assertEqual(hp.text, "test text")
        self.assertEqual(hp.index, 0)

    def test_get_expression(self):
        hp = HyperParser("test text", 0)
        hp.rawtext = "test expression"
        hp.bracketing = [(0, 0), (1, 1), (2, 2)]
        hp.indexbracket = 1
        hp.indexinrawtext = 1
        result = hp.get_expression()
        self.assertEqual(result, "test expression")

    def test_is_in_code(self):
        hp = HyperParser("test text", 0)
        self.assertFalse(hp.is_in_code())

    def test_eat_identifier(self):
        hp = HyperParser("test text", 0)
        result = hp._eat_identifier("test identifier", 0, 10)
        self.assertEqual(result, 10)

    def test_str(self):
        hp = HyperParser("test text", 0)
        result = str(hp)
        self.assertEqual(result, "HyperParser")

    def test_repr(self):
        hp = HyperParser("test text", 0)
        result = repr(hp)
        self.assertEqual(result, "HyperParser(0)")

    def test_eq(self):
        hp1 = HyperParser("test text", 0)
        hp2 = HyperParser("test text", 0)
        self.assertEqual(hp1, hp2)

    def test_ne(self):
        hp1 = HyperParser("test text", 0)
        hp2 = HyperParser("test text", 1)
        self.assertNotEqual(hp1, hp2)

if __name__ == '__main__':
    unittest.main()