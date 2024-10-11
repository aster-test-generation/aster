import unittest
from blib2to3.pytree import NodePattern, WildcardPattern, generate_matches


class MockNode:
    def __init__(self, children):
        self.children = children

class MockPattern(BasePattern):
    def match(self, node, results=None):
        return True

class TestNodePattern(unittest.TestCase):
    def test_init_with_type(self):
        instance = NodePattern(type=256)
        self.assertEqual(instance.type, 256)

    def test_init_with_content(self):
        content = [MockPattern(), MockPattern()]
        instance = NodePattern(content=content)
        self.assertEqual(instance.content, content)

    def test_init_with_name(self):
        instance = NodePattern(name="test")
        self.assertEqual(instance.name, "test")

    def test_init_with_wildcard(self):
        content = [WildcardPattern()]
        instance = NodePattern(content=content)
        self.assertTrue(instance.wildcards)

    def test_submatch_with_wildcards(self):
        content = [WildcardPattern()]
        instance = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        result = instance._submatch(node)
        self.assertFalse(result)

    def test_submatch_without_wildcards(self):
        content = [MockPattern()]
        instance = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        result = instance._submatch(node)
        self.assertTrue(result)

    def test_submatch_with_results(self):
        content = [MockPattern()]
        instance = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        results = {}
        result = instance._submatch(node, results)
        self.assertTrue(result)

    def test_submatch_with_mismatched_length(self):
        content = [MockPattern(), MockPattern()]
        instance = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        result = instance._submatch(node)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()