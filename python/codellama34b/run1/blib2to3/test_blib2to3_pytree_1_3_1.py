import unittest
from blib2to3.pytree import BasePattern


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        instance = NodePattern()
        self.assertEqual(instance.type, None)
        self.assertEqual(instance.content, None)
        self.assertEqual(instance.name, None)

    def test_submatch(self):
        instance = NodePattern()
        node = Node()
        results = {}
        result = instance._submatch(node, results)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()