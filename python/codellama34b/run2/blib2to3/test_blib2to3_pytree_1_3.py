import unittest
from blib2to3.pytree import BasePattern


class TestWildcardPattern(unittest.TestCase):
    def test_init(self):
        instance = WildcardPattern()
        self.assertEqual(instance.content, None)
        self.assertEqual(instance.min, 0)
        self.assertEqual(instance.max, HUGE)
        self.assertEqual(instance.name, None)
        instance = WildcardPattern(content="content", min=1, max=2, name="name")
        self.assertEqual(instance.content, "content")
        self.assertEqual(instance.min, 1)
        self.assertEqual(instance.max, 2)
        self.assertEqual(instance.name, "name")
    def test_optimize(self):
        instance = WildcardPattern()
        result = instance.optimize()
        self.assertEqual(result, None)
    def test_match(self):
        instance = WildcardPattern()
        result = instance.match("node")
        self.assertEqual(result, None)
    def test_match_seq(self):
        instance = WildcardPattern()
        result = instance.match_seq("nodes")
        self.assertEqual(result, None)
    def test_generate_matches(self):
        instance = WildcardPattern()
        result = instance.generate_matches("nodes")
        self.assertEqual(result, None)
    def test__iterative_matches(self):
        instance = WildcardPattern()
        result = instance._iterative_matches("nodes")
        self.assertEqual(result, None)
    def test__bare_name_matches(self):
        instance = WildcardPattern()
        result = instance._bare_name_matches("nodes")
        self.assertEqual(result, None)
    def test__recursive_matches(self):
        instance = WildcardPattern()
        result = instance._recursive_matches("nodes", 0)
        self.assertEqual(result, None)


if __name__ == '__main__':
    unittest.main()