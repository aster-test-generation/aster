import unittest
from blib2to3.pytree import NodePattern


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(node_pattern.type, 256)
        self.assertEqual(node_pattern.content, ['a', 'b'])
        self.assertEqual(node_pattern.name, 'name')

    def test_init_without_type(self):
        node_pattern = NodePattern(content=['a', 'b'], name='name')
        self.assertIsNone(node_pattern.type)

    def test_init_without_content(self):
        node_pattern = NodePattern(type=256, name='name')
        self.assertIsNone(node_pattern.content)

    def test_init_without_name(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'])
        self.assertIsNone(node_pattern.name)

    def test_submatch(self):
        node_pattern = NodePattern(content=[NodePattern(type=256), NodePattern(type=256)], name='name')
        node = NodePattern(type=256, content=[NodePattern(type=256), NodePattern(type=256)], name='name')
        results = {}
        self.assertTrue(node_pattern._submatch(node, results))
        self.assertEqual(results, {})

    def test_submatch_with_results(self):
        node_pattern = NodePattern(content=[NodePattern(type=256), NodePattern(type=256)], name='name')
        node = NodePattern(type=256, content=[NodePattern(type=256), NodePattern(type=256)], name='name')
        results = {'a': NodePattern(type=256), 'b': NodePattern(type=256)}
        self.assertTrue(node_pattern._submatch(node, results))
        self.assertEqual(results, {'a': NodePattern(type=256), 'b': NodePattern(type=256)})

    def test_submatch_with_mismatch(self):
        node_pattern = NodePattern(content=[NodePattern(type=256), NodePattern(type=256)], name='name')
        node = NodePattern(type=256, content=[NodePattern(type=256), NodePattern(type=257)], name='name')
        results = {}
        self.assertFalse(node_pattern._submatch(node, results))

    def test_str_method(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(str(node_pattern), 'NodePattern(type=256, content=[\'a\', \'b\'], name=\'name\')')

    def test_repr_method(self):
        node_pattern = NodePattern(type=256, content=['a', 'b'], name='name')
        self.assertEqual(repr(node_pattern), 'NodePattern(type=256, content=[\'a\', \'b\'], name=\'name\')')

if __name__ == '__main__':
    unittest.main()