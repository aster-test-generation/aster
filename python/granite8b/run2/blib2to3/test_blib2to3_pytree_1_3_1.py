import unittest
from blib2to3.pytree import BasePattern


class TestNodePattern(unittest.TestCase):
    def test_init(self):
        pattern = NodePattern(type=257, content=[])
        self.assertEqual(pattern.type, 257)
        self.assertEqual(pattern.content, [])

    def test_submatch(self):
        pattern = NodePattern(type=257, content=[])
        node = Node(257, [])
        self.assertTrue(pattern._submatch(node))

    def test_submatch_false(self):
        pattern = NodePattern(type=257, content=[])
        node = Node(258, [])
        self.assertFalse(pattern._submatch(node))

if __name__ == '__main__':
    unittest.main()