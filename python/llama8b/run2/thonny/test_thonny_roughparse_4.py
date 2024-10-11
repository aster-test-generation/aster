import unittest
from thonny.roughparse import HyperParser


class TestHyperParser(unittest.TestCase):
    def test_init(self):
        hp = HyperParser('test', 0)
        self.assertEqual(hp.text, 'test')
        self.assertEqual(hp.index, 0)
        self.assertEqual(hp.rawtext, '')
        self.assertEqual(hp.stopatindex, '')
        self.assertEqual(hp.bracketing, [])
        self.assertEqual(hp.isopener, [])
        self.assertEqual(hp.indexinrawtext, 0)
        self.assertEqual(hp.indexbracket, 0)

    def test_set_index(self):
        hp = HyperParser('test', 0)
        hp.set_index(1)
        self.assertEqual(hp.indexinrawtext, 0)
        self.assertEqual(hp.indexbracket, 0)

    def test_is_in_string(self):
        hp = HyperParser('test', 0)
        hp.isopener = [True]
        hp.rawtext = '""'
        self.assertTrue(hp.is_in_string())

    def test_is_in_code(self):
        hp = HyperParser('test', 0)
        hp.isopener = [False]
        hp.rawtext = "'"
        self.assertTrue(hp.is_in_code())

    def test_get_surrounding_brackets(self):
        hp = HyperParser('test', 0)
        hp.bracketing = [(0, 1), (1, 2), (2, 3)]
        hp.isopener = [True, False, True]
        self.assertEqual(hp.get_surrounding_brackets(), (0, 2))

    def test_eat_identifier(self):
        hp = HyperParser('test', 0)
        self.assertEqual(hp._eat_identifier('abc', 0, 3), 3)
        self.assertEqual(hp._eat_identifier('abc', 1, 3), 2)
        self.assertEqual(hp._eat_identifier('abc', 2, 3), 1)
        self.assertEqual(hp._eat_identifier('abc', 3, 3), 0)

    def test_str(self):
        hp = HyperParser('test', 0)
        self.assertEqual(str(hp), 'HyperParser')

    def test_repr(self):
        hp = HyperParser('test', 0)
        self.assertEqual(repr(hp), 'HyperParser(0)')

    def test_eq(self):
        hp1 = HyperParser('test', 0)
        hp2 = HyperParser('test', 0)
        self.assertTrue(hp1 == hp2)

if __name__ == '__main__':
    unittest.main()