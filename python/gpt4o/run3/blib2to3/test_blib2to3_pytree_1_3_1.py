import unittest
from blib2to3.pytree import NodePattern, WildcardPattern
from blib2to3.pgen2.grammar import Grammar


class MockNode:
    def __init__(self, children):
        self.children = children

class MockPattern(BasePattern):
    def match(self, node, results=None):
        return True

class TestNodePattern(unittest.TestCase):
    def test_init_with_type(self):
        pattern = NodePattern(type=256)
        self.assertEqual(pattern.type, 256)

    def test_init_with_content(self):
        content = [MockPattern(), MockPattern()]
        pattern = NodePattern(content=content)
        self.assertEqual(pattern.content, content)

    def test_init_with_name(self):
        pattern = NodePattern(name="test")
        self.assertEqual(pattern.name, "test")

    def test_init_with_wildcards(self):
        content = [WildcardPattern()]
        pattern = NodePattern(content=content)
        self.assertTrue(pattern.wildcards)

    def test_submatch_with_wildcards(self):
        content = [WildcardPattern()]
        pattern = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        result = pattern._submatch(node)
        self.assertFalse(result)

    def test_submatch_without_wildcards(self):
        content = [MockPattern()]
        pattern = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        result = pattern._submatch(node)
        self.assertTrue(result)

    def test_submatch_with_results(self):
        content = [MockPattern()]
        pattern = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        results = {}
        result = pattern._submatch(node, results)
        self.assertTrue(result)

    def test_submatch_length_mismatch(self):
        content = [MockPattern(), MockPattern()]
        pattern = NodePattern(content=content)
        node = MockNode(children=[MockNode([])])
        result = pattern._submatch(node)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()