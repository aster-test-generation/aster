import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        pattern = WildcardPattern(content=[('a', 'b')], min=1, max=1, name='test')
        self.assertEqual(pattern.content, [('a', 'b')])
        self.assertEqual(pattern.min, 1)
        self.assertEqual(pattern.max, 1)
        self.assertEqual(pattern.name, 'test')

    def test_optimize(self):
        pattern = WildcardPattern(content=[('a', 'b')], min=1, max=1, name='test')
        optimized = pattern.optimize()
        self.assertEqual(optimized.content, [('a', 'b')])
        self.assertEqual(optimized.min, 1)
        self.assertEqual(optimized.max, 1)
        self.assertEqual(optimized.name, 'test')

    def test_match(self):
        pattern = WildcardPattern(content=[('a', 'b')], min=1, max=1, name='test')
        self.assertTrue(pattern.match(['a', 'b']))
        self.assertFalse(pattern.match(['c', 'd']))

    def test_generate_matches(self):
        pattern = WildcardPattern(content=[('a', 'b')], min=1, max=1, name='test')
        matches = list(pattern.generate_matches(['a', 'b']))
        self.assertEqual(len(matches), 1)
        self.assertEqual(matches[0][0], 2)
        self.assertEqual(matches[0][1]['test'], ['a', 'b'])

if __name__ == '__main__':
    unittest.main()