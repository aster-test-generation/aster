import unittest
from blib2to3.pytree import BasePattern


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        instance = BasePattern()
        self.assertIsInstance(instance, BasePattern)

    def test_new(self):
        with self.assertRaises(AssertionError):
            BasePattern()

    def test_repr(self):
        class TestPattern(BasePattern):
            def __init__(self):
                self.type = 'test_type'
                self.content = 'test_content'
                self.name = 'test_name'
        instance = TestPattern()
        result = instance.__repr__()
        self.assertEqual(result, "TestPattern('test_type', 'test_content', 'test_name')")

    def test_submatch(self):
        instance = BasePattern()
        with self.assertRaises(NotImplementedError):
            instance._submatch(None)

    def test_optimize(self):
        instance = BasePattern()
        result = instance.optimize()
        self.assertIs(result, instance)

    def test_match(self):
        class TestPattern(BasePattern):
            def __init__(self):
                self.type = 'test_type'
                self.content = 'test_content'
                self.name = 'test_name'
            def _submatch(self, node, results=None):
                return True
        instance = TestPattern()
        node = type('Node', (object,), {'type': 'test_type'})
        results = {}
        result = instance.match(node, results)
        self.assertTrue(result)
        self.assertIn('test_name', results)

    def test_match_seq(self):
        class TestPattern(BasePattern):
            def __init__(self):
                self.type = 'test_type'
                self.content = 'test_content'
                self.name = 'test_name'
            def _submatch(self, node, results=None):
                return True
        instance = TestPattern()
        node = type('Node', (object,), {'type': 'test_type'})
        result = instance.match_seq([node])
        self.assertTrue(result)

    def test_generate_matches(self):
        class TestPattern(BasePattern):
            def __init__(self):
                self.type = 'test_type'
                self.content = 'test_content'
                self.name = 'test_name'
            def _submatch(self, node, results=None):
                return True
        instance = TestPattern()
        node = type('Node', (object,), {'type': 'test_type'})
        result = list(instance.generate_matches([node]))
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0][0], 1)
        self.assertIn('test_name', result[0][1])

if __name__ == '__main__':
    unittest.main()