import unittest
from blib2to3.pytree import NodePattern


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(node_pattern.type, 256)
        self.assertEqual(node_pattern.content, ['a', 'b'])
        self.assertEqual(node_pattern.name, 'name')

    def test_init_type_none(self):
        node_pattern = NodePattern(type=None, content=['a', 'b'], name='name')
        self.assertIsNone(node_pattern.type)

    def test_init_content_none(self):
        node_pattern = NodePattern(type=256, content=None, name='name')
        self.assertIsNone(node_pattern.content)

    def test_init_name_none(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name=None)
        self.assertIsNone(node_pattern.name)

    def test_submatch(self):
        node_pattern = NodePattern(type=256, content=[NodePattern(type=1), NodePattern(type=2)], name='name')
        node = NodePattern(type=1, content=['a'], name='a')
        node.children = [node]
        node.children.append(NodePattern(type=2, content=['b'], name='b'))
        self.assertTrue(node_pattern._submatch(node))

    def test_submatch_wildcards(self):
        node_pattern = NodePattern(type=256, content=[WildcardPattern(), WildcardPattern()], name='name')
        node = NodePattern(type=1, content=['a', 'b'], name='a')
        node.children = [node]
        self.assertTrue(node_pattern._submatch(node))

    def test_submatch_failure(self):
        node_pattern = NodePattern(type=256, content=[NodePattern(type=1), NodePattern(type=2)], name='name')
        node = NodePattern(type=1, content=['a'], name='a')
        node.children = [node]
        node.children.append(NodePattern(type=3, content=['b'], name='b'))
        self.assertFalse(node_pattern._submatch(node))

    def test_str(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(str(node_pattern), 'NodePattern(type=256, content=[\'a\', \'b\'], name=\'name\')')

    def test_repr(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(repr(node_pattern), 'NodePattern(type=256, content=[\'a\', \'b\'], name=\'name\')')

if __name__ == '__main__':
    unittest.main()