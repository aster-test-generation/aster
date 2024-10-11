import unittest
from blib2to3.pytree import BasePattern


class TestBasePattern(unittest.TestCase):
    def test_init(self):
        instance = BasePattern()
        self.assertEqual(instance.type, None)
        self.assertEqual(instance.content, None)
        self.assertEqual(instance.name, None)

    def test_repr(self):
        instance = BasePattern()
        instance.type = 'type'
        instance.content = 'content'
        instance.name = 'name'
        result = instance.__repr__()
        self.assertEqual(result, 'BasePattern(type, content, name)')

    def test_submatch(self):
        instance = BasePattern()
        with self.assertRaises(NotImplementedError):
            instance._submatch(None, None)

    def test_optimize(self):
        instance = BasePattern()
        result = instance.optimize()
        self.assertEqual(result, instance)

    def test_match(self):
        instance = BasePattern()
        instance.type = 'type'
        result = instance.match(None, None)
        self.assertFalse(result)

    def test_match_seq(self):
        instance = BasePattern()
        instance.type = 'type'
        result = instance.match_seq([None], None)
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = BasePattern()
        instance.type = 'type'
        result = list(instance.generate_matches([None]))
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()