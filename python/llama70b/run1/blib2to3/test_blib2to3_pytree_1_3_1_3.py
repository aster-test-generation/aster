import unittest
from blib2to3.pytree import LeafPattern, NL, Context, RawNode, _Results, _Convert


class TestLeafPattern(unittest.TestCase):
    def test_init(self):
        instance = LeafPattern(type=1, content='hello', name='my_leaf')
        self.assertEqual(instance.type, 1)
        self.assertEqual(instance.content, 'hello')
        self.assertEqual(instance.name, 'my_leaf')

    def test_init_default(self):
        instance = LeafPattern()
        self.assertIsNone(instance.type)
        self.assertIsNone(instance.content)
        self.assertIsNone(instance.name)

    def test_match(self):
        instance = LeafPattern(content='hello')
        node = Leaf(value='hello')
        self.assertTrue(instance.match(node))

    def test_match_false(self):
        instance = LeafPattern(content='hello')
        node = Leaf(value='goodbye')
        self.assertFalse(instance.match(node))

    def test_submatch(self):
        instance = LeafPattern(content='hello')
        node = Leaf(value='hello')
        self.assertTrue(instance._submatch(node))

    def test_submatch_false(self):
        instance = LeafPattern(content='hello')
        node = Leaf(value='goodbye')
        self.assertFalse(instance._submatch(node))

    def test_str_method(self):
        instance = LeafPattern(content='hello')
        self.assertEqual(str(instance), 'LeafPattern(content=\'hello\')')

    def test_repr_method(self):
        instance = LeafPattern(content='hello')
        self.assertEqual(repr(instance), 'LeafPattern(content=\'hello\')')

    def test_eq_method(self):
        instance1 = LeafPattern(content='hello')
        instance2 = LeafPattern(content='hello')
        self.assertTrue(instance1 == instance2)

    def test_eq_method_false(self):
        instance1 = LeafPattern(content='hello')
        instance2 = LeafPattern(content='goodbye')
        self.assertFalse(instance1 == instance2)

class TestBasePattern(unittest.TestCase):
    def test_match(self):
        instance = BasePattern()
        node = Leaf(value='hello')
        self.assertFalse(instance.match(node))

class TestNL(unittest.TestCase):
    def test_nl(self):
        self.assertTrue(issubclass(NL, object))

class TestContext(unittest.TestCase):
    def test_context(self):
        context = Context('hello', (1, 2))
        self.assertEqual(context[0], 'hello')
        self.assertEqual(context[1], (1, 2))

class TestRawNode(unittest.TestCase):
    def test_raw_node(self):
        raw_node = RawNode(1, 'hello', Context('hello', (1, 2)), [Leaf(value='hello')])
        self.assertEqual(raw_node[0], 1)
        self.assertEqual(raw_node[1], 'hello')
        self.assertEqual(raw_node[2], Context('hello', (1, 2)))
        self.assertEqual(raw_node[3], [Leaf(value='hello')])

class Test_Results(unittest.TestCase):
    def test_results(self):
        results = _Results({'hello': Leaf(value='hello')})
        self.assertEqual(results['hello'].value, 'hello')

class Test_Convert(unittest.TestCase):
    def test_convert(self):
        def convert(grammar, raw_node):
            return raw_node
        self.assertTrue(callable(convert))

if __name__ == '__main__':
    unittest.main()