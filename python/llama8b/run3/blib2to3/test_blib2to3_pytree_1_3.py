import unittest
from blib2to3.pytree import WildcardPattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern()
        self.assertEqual(pattern.content, None)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, float('inf'))
        self.assertEqual(pattern.name, None)

    def test_init_with_content(self):
        pattern = WildcardPattern(content=['a', 'b'])
        self.assertEqual(pattern.content, [('a',), ('b',)])
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, float('inf'))
        self.assertEqual(pattern.name, None)

    def test_init_with_min_max(self):
        pattern = WildcardPattern(min=1, max=2)
        self.assertEqual(pattern.content, None)
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 2)
        self.assertEqual(pattern.name, None)

    def test_init_with_name(self):
        pattern = WildcardPattern(name='test')
        self.assertEqual(pattern.content, None)
        self.assertEqual(pattern.min, 0)
        self.assertEqual(pattern.max, float('inf'))
        self.assertEqual(pattern.name, 'test')

    def test_init_with_content_min_max_name(self):
        pattern = WildcardPattern(content=['a', 'b'], min=1, max=2, name='test')
        self.assertEqual(pattern.content, [('a',), ('b',)])
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 2)
        self.assertEqual(pattern.name, 'test')

    def test_optimize(self):
        pattern = WildcardPattern(content=['a', 'b'], min=1, max=1)
        optimized_pattern = pattern.optimize()
        self.assertIsInstance(optimized_pattern, WildcardPattern)
        self.assertEqual(optimized_pattern.content, [('a',)])
        self.assertEqual(optimized_pattern.min, 1)
        self.assertEqual(optimized_pattern.max, 1)

    def test_match(self):
        pattern = WildcardPattern(content=['a', 'b'], min=1, max=1)
        node = 'a'
        result = pattern.match(node)
        self.assertTrue(result)

    def test_match_seq(self):
        pattern = WildcardPattern(content=['a', 'b'], min=1, max=1)
        nodes = ['a', 'b']
        result = pattern.match_seq(nodes)
        self.assertTrue(result)

    def test_generate_matches(self):
        pattern = WildcardPattern(content=['a', 'b'], min=1, max=1)
        nodes = ['a', 'b']
        matches = list(pattern.generate_matches(nodes))
        self.assertEqual(len(matches), 2)
        self.assertEqual(matches[0][0], 1)
        self.assertEqual(matches[0][1], {'a': ['a']})
        self.assertEqual(matches[1][0], 2)
        self.assertEqual(matches[1][1], {'a': ['a', 'b']})

    def test_iterative_matches(self):
        pattern = WildcardPattern(content=['a', 'b'], min=1, max=2)
        nodes = ['a', 'b', 'c']
        matches = list(pattern._iterative_matches(nodes))
        self.assertEqual(len(matches), 4)
        self.assertEqual(matches[0][0], 1)
        self.assertEqual(matches[0][1], {})
        self.assertEqual(matches[1][0], 2)
        self.assertEqual(matches[1][1], {'a': ['a']})
        self.assertEqual(matches[2][0], 2)
        self.assertEqual(matches[2][1], {'a': ['a', 'b']})
        self.assertEqual(matches[3][0], 3)
        self.assertEqual(matches[3][1], {'a': ['a', 'b', 'c']})

    def test_bare_name_matches(self):
        pattern = WildcardPattern(content=['a', 'b'], name='test')
        nodes = ['a', 'b']
        match = pattern._bare_name_matches(nodes)
        self.assertEqual(match[0], 2)
        self.assertEqual(match[1], {'test': ['a', 'b']})

if __name__ == '__main__':
    unittest.main()