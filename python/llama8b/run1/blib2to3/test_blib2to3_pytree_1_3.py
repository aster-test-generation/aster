import unittest
from blib2to3.pytree import *


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern()
        self.assertIsNone(pattern.content)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, HUGE)
        self.assertIsNone(pattern.name)

    def test_init_with_content(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'])
        self.assertEqual(pattern.content, [('a',), ('b',), ('c',)])
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, HUGE)
        self.assertIsNone(pattern.name)

    def test_init_with_min_max(self):
        pattern = WildcardPattern(min=1, max=2)
        self.assertIsNone(pattern.content)
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 2)
        self.assertIsNone(pattern.name)

    def test_init_with_name(self):
        pattern = WildcardPattern(name='test')
        self.assertIsNone(pattern.content)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, HUGE)
        self.assertEqual(pattern.name, 'test')

    def test_optimize(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'], min=1, max=1)
        self.assertEqual(pattern.optimize(), NodePattern(name='test'))

    def test_match(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'])
        self.assertTrue(pattern.match(['a', 'b', 'c']))

    def test_match_seq(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'])
        self.assertTrue(pattern.match_seq(['a', 'b', 'c']))

    def test_generate_matches(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'])
        self.assertEqual(list(pattern.generate_matches(['a', 'b', 'c'])), [(1, {})])

    def test_iterative_matches(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'])
        self.assertEqual(list(pattern._iterative_matches(['a', 'b', 'c'])), [(1, {})])

    def test_bare_name_matches(self):
        pattern = WildcardPattern(content=[('a',)], name='bare_name')
        self.assertEqual(pattern._bare_name_matches(['a']), (1, {'bare_name': ['a']}))

    def test_recursive_matches(self):
        pattern = WildcardPattern(content=['a', 'b', 'c'])
        self.assertEqual(list(pattern._recursive_matches(['a', 'b', 'c'], 0)), [(0, {})])

    def test_str(self):
        pattern = WildcardPattern()
        self.assertEqual(str(pattern), 'WildcardPattern')

    def test_repr(self):
        pattern = WildcardPattern()
        self.assertEqual(repr(pattern), 'WildcardPattern()')

if __name__ == '__main__':
    unittest.main()