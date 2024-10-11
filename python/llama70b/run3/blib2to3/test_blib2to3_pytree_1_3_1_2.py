import unittest
from blib2to3.pytree import BasePattern, _P, NL, Context, RawNode, _Results, _Convert


class TestBasePattern(unittest.TestCase):
    def test___init__(self):
        instance = BasePattern.__new__(BasePattern)
        self.assertIsInstance(instance, BasePattern)

    def test___new__(self):
        instance = BasePattern.__new__(BasePattern, 'type', 'content', 'name')
        self.assertIsInstance(instance, BasePattern)

    def test___repr__(self):
        instance = BasePattern.__new__(BasePattern)
        instance.type = 'type'
        instance.content = 'content'
        instance.name = 'name'
        result = instance.__repr__()
        self.assertEqual(result, 'BasePattern(type, content, name)')

    def test__submatch(self):
        instance = BasePattern.__new__(BasePattern)
        with self.assertRaises(NotImplementedError):
            instance._submatch('node', 'results')

    def test_optimize(self):
        instance = BasePattern.__new__(BasePattern)
        result = instance.optimize()
        self.assertEqual(result, instance)

    def test_match(self):
        instance = BasePattern.__new__(BasePattern)
        instance.type = 'type'
        result = instance.match('node')
        self.assertFalse(result)

    def test_match_seq(self):
        instance = BasePattern.__new__(BasePattern)
        result = instance.match_seq(['node'])
        self.assertFalse(result)

    def test_generate_matches(self):
        instance = BasePattern.__new__(BasePattern)
        result = list(instance.generate_matches(['node']))
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()