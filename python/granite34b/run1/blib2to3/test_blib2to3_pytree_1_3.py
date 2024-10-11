import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern()
        self.assertIsNone(pattern.content)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, 1000000)
        self.assertIsNone(pattern.name)

    def test_init_with_content(self):
        pattern = WildcardPattern(content='abc')
        self.assertEqual(pattern.content, (('abc',),))
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, 1000000)
        self.assertIsNone(pattern.name)

    def test_init_with_min_max(self):
        pattern = WildcardPattern(min=1, max=2)
        self.assertIsNone(pattern.content)
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 2)
        self.assertIsNone(pattern.name)

    def test_init_with_name(self):
        pattern = WildcardPattern(name='x')
        self.assertIsNone(pattern.content)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, 1000000)
        self.assertEqual(pattern.name, 'x')

    def test_init_with_content_min_max_name(self):
        pattern = WildcardPattern(content='abc', min=1, max=2, name='x')
        self.assertEqual(pattern.content, (('abc',),))
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 2)
        self.assertEqual(pattern.name, 'x')

    def test_optimize(self):
        pattern = WildcardPattern(content='abc', min=1, max=2, name='x')
        optimized_pattern = pattern.optimize()
        self.assertEqual(optimized_pattern.content, (('abc',),))
        self.assertEqual(optimized_pattern.min, 1)
        self.assertEqual(optimized_pattern.max, 2)
        self.assertEqual(optimized_pattern.name, 'x')

    def test_match(self):
        pattern = WildcardPattern(content='abc', min=1, max=2, name='x')
        node = 'a'
        results = {}
        self.assertTrue(pattern.match(node, results))
        self.assertEqual(results, {'x': ['a']})

    def test_match_seq(self):
        pattern = WildcardPattern(content='abc', min=1, max=2, name='x')
        nodes = ['a', 'b', 'c']
        results = {}
        self.assertTrue(pattern.match_seq(nodes, results))
        self.assertEqual(results, {'x': ['a', 'b', 'c']})

    def test_generate_matches(self):
        pattern = WildcardPattern(content='abc', min=1, max=2, name='x')
        nodes = ['a', 'b', 'c']
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(matches, [(3, {'x': ['a', 'b', 'c']})])

    def test_generate_matches_with_content_none(self):
        pattern = WildcardPattern(min=1, max=2, name='x')
        nodes = ['a', 'b', 'c']
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(matches, [(1, {'x': ['a']}), (2, {'x': ['a', 'b']}), (3, {'x': ['a', 'b', 'c']})])

    def test_generate_matches_with_content_not_none(self):
        pattern = WildcardPattern(content='abc', min=1, max=2, name='x')
        nodes = ['a', 'b', 'c']
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(matches, [(3, {'x': ['a', 'b', 'c']})])

if __name__ == '__main__':
    unittest.main()