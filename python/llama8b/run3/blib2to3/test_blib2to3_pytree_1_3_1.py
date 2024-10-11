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
        node = NodePattern(type=256, content=['a', 'b'], name='name')
        results = {'a': 'a', 'b': 'b'}
        self.assertTrue(node._submatch(node, results))
        self.assertEqual(results, {'a': 'a', 'b': 'b'})

    def test_submatch_wildcards(self):
        node = NodePattern(type=256, content=[NodePattern(), NodePattern()], name='name')
        results = {'a': 'a', 'b': 'b'}
        self.assertTrue(node._submatch(node, results))
        self.assertEqual(results, {'a': 'a', 'b': 'b'})

    def test_submatch_invalid(self):
        node = NodePattern(type=256, content=['a', 'b'], name='name')
        results = {'a': 'a'}
        self.assertFalse(node._submatch(node, results))

    def test_str(self):
        node = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(str(node), 'NodePattern(type=256, content=[\'a\', \'b\'], name=\'name\')')

    def test_repr(self):
        node = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(repr(node), 'NodePattern(type=256, content=[\'a\', \'b\'], name=\'name\')')

if __name__ == '__main__':
    unittest.main()