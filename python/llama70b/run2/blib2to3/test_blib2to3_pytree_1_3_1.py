import unittest
from blib2to3.pytree import NodePattern 


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        instance = NodePattern()
        self.assertIsNone(instance.type)
        self.assertIsNone(instance.content)
        self.assertIsNone(instance.name)

    def test_init_with_type(self):
        instance = NodePattern(type=256)
        self.assertEqual(instance.type, 256)
        self.assertIsNone(instance.content)
        self.assertIsNone(instance.name)

    def test_init_with_content(self):
        content = [BasePattern()]
        instance = NodePattern(content=content)
        self.assertIsNone(instance.type)
        self.assertEqual(instance.content, content)
        self.assertIsNone(instance.name)

    def test_init_with_name(self):
        instance = NodePattern(name='test')
        self.assertIsNone(instance.type)
        self.assertIsNone(instance.content)
        self.assertEqual(instance.name, 'test')

    def test_submatch(self):
        instance = NodePattern()
        node = BasePattern()
        results = {}
        self.assertFalse(instance._submatch(node, results))

    def test_submatch_with_wildcards(self):
        instance = NodePattern(content=[WildcardPattern()])
        instance.wildcards = True
        node = BasePattern()
        results = {}
        self.assertFalse(instance._submatch(node, results))

    def test_submatch_with_content(self):
        instance = NodePattern(content=[BasePattern()])
        node = BasePattern()
        results = {}
        self.assertFalse(instance._submatch(node, results))

    def test_private_method__submatch(self):
        instance = NodePattern()
        node = BasePattern()
        results = {}
        self.assertFalse(instance._NodePattern__submatch(node, results))

    def test_str_method(self):
        instance = NodePattern()
        self.assertEqual(str(instance), 'NodePattern')

    def test_repr_method(self):
        instance = NodePattern()
        self.assertEqual(repr(instance), 'NodePattern()')

    def test_eq_method(self):
        instance1 = NodePattern()
        instance2 = NodePattern()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()