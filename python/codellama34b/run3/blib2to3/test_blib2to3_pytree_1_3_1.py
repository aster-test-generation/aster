import unittest
from blib2to3.pytree import BasePattern


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        NodePattern(type=1, content=['a', 'b'], name='name')

    def test_submatch(self):
        node = NodePattern(type=1, content=['a', 'b'], name='name')
        results = {}
        node._submatch(node, results)
        self.assertEqual(results, {})


if __name__ == '__main__':
    unittest.main()