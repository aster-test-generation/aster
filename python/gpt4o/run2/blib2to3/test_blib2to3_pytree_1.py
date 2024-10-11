import unittest
from blib2to3.pytree import NegatedPattern


class TestNegatedPattern(unittest.TestCase):
    def test_init_with_content(self):
        content = BasePattern()
        instance = NegatedPattern(content)
        self.assertEqual(instance.content, content)

    def test_init_without_content(self):
        instance = NegatedPattern()
        self.assertIsNone(instance.content)

    def test_match(self):
        instance = NegatedPattern()
        result = instance.match(None)
        self.assertFalse(result)

    def test_match_seq_with_empty_nodes(self):
        instance = NegatedPattern()
        result = instance.match_seq([])
        self.assertTrue(result)

    def test_match_seq_with_non_empty_nodes(self):
        instance = NegatedPattern()
        result = instance.match_seq([1, 2, 3])
        self.assertFalse(result)

    def test_generate_matches_with_no_content_and_empty_nodes(self):
        instance = NegatedPattern()
        result = list(instance.generate_matches([]))
        self.assertEqual(result, [(0, {})])

    def test_generate_matches_with_no_content_and_non_empty_nodes(self):
        instance = NegatedPattern()
        result = list(instance.generate_matches([1, 2, 3]))
        self.assertEqual(result, [])

    def test_generate_matches_with_content(self):
        class MockPattern(BasePattern):
            def generate_matches(self, nodes):
                yield (1, {'key': 'value'})

        content = MockPattern()
        instance = NegatedPattern(content)
        result = list(instance.generate_matches([1, 2, 3]))
        self.assertEqual(result, [(0, {})])

if __name__ == '__main__':
    unittest.main()