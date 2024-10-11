import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        hp = HyperParser("test text", "index")
        self.assertEqual(hp.text, "test text")
        self.assertEqual(hp.index, "index")
        self.assertEqual(hp.rawtext, "")
        self.assertEqual(hp.stopatindex, "")
        self.assertEqual(hp.bracketing, [])
        self.assertEqual(hp.isopener, [])
        self.assertEqual(hp.indexinrawtext, 0)
        self.assertEqual(hp.indexbracket, 0)

    def test_set_index(self):
        hp = HyperParser("test text", "index")
        hp.set_index("new index")
        self.assertEqual(hp.indexinrawtext, 0)
        self.assertEqual(hp.indexbracket, 0)

    def test_is_in_string(self):
        hp = HyperParser("test text", "index")
        self.assertFalse(hp.is_in_string())
        hp.isopener[0] = True
        self.assertTrue(hp.is_in_string())

    def test_is_in_code(self):
        hp = HyperParser("test text", "index")
        self.assertTrue(hp.is_in_code())
        hp.isopener[0] = False
        self.assertFalse(hp.is_in_code())

    def test_get_surrounding_brackets(self):
        hp = HyperParser("test text", "index")
        self.assertIsNone(hp.get_surrounding_brackets())
        hp.bracketing = [(0, 1), (2, 3)]
        self.assertEqual(hp.get_surrounding_brackets(), ("0-0", "2-2"))

    def test_eat_identifier(self):
        hp = HyperParser("test text", "index")
        self.assertEqual(hp._eat_identifier("test", 0, 4), 4)
        self.assertEqual(hp._eat_identifier("test", 0, 3), 3)
        self.assertEqual(hp._eat_identifier("test", 0, 5), 0)

    def test_str(self):
        hp = HyperParser("test text", "index")
        self.assertEqual(str(hp), "HyperParser")

    def test_repr(self):
        hp = HyperParser("test text", "index")
        self.assertEqual(repr(hp), "HyperParser('test text', 'index')")

    def test_eq(self):
        hp1 = HyperParser("test text", "index")
        hp2 = HyperParser("test text", "index")
        self.assertTrue(hp1 == hp2)
        hp3 = HyperParser("different text", "index")
        self.assertFalse(hp1 == hp3)

if __name__ == '__main__':
    unittest.main()