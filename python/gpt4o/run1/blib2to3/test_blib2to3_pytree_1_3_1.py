import unittest
from blib2to3.pytree import NodePattern, WildcardPattern
from blib2to3.pgen2.grammar import Grammar


class TestNodePattern(unittest.TestCase):
    def test_init_with_type(self):
        instance = NodePattern(type=256)
        self.assertEqual(instance.type, 256)

    def test_init_with_content(self):
        content = [BasePattern(), BasePattern()]
        instance = NodePattern(content=content)
        self.assertEqual(instance.content, content)

    def test_init_with_name(self):
        instance = NodePattern(name="test_name")
        self.assertEqual(instance.name, "test_name")

    def test_init_with_wildcards(self):
        content = [WildcardPattern()]
        instance = NodePattern(content=content)
        self.assertTrue(instance.wildcards)

    def test_submatch_with_wildcards(self):
        content = [WildcardPattern()]
        instance = NodePattern(content=content)
        node = type('Node', (object,), {'children': []})()
        result = instance._submatch(node)
        self.assertFalse(result)

    def test_submatch_without_wildcards(self):
        content = [BasePattern()]
        instance = NodePattern(content=content)
        node = type('Node', (object,), {'children': [BasePattern()]})()
        result = instance._submatch(node)
        self.assertTrue(result)

    def test_submatch_with_results(self):
        content = [WildcardPattern()]
        instance = NodePattern(content=content)
        node = type('Node', (object,), {'children': []})()
        results = {}
        result = instance._submatch(node, results)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()