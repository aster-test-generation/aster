import unittest
from flutes.iterator import chunk, take, drop, drop_until, split_by, scanl, scanr, LazyList, Range, MapList

class TestChunk(unittest.TestCase):
    def test_chunk(self):
        self.assertEqual(list(chunk(3, [1, 2, 3, 4, 5, 6])), [[1, 2, 3], [4, 5, 6]])
        self.assertEqual(list(chunk(2, [1, 2, 3, 4, 5, 6])), [[1, 2], [3, 4], [5, 6]])
        self.assertEqual(list(chunk(1, [1, 2, 3, 4, 5, 6])), [[1], [2], [3], [4], [5], [6]])
        self.assertEqual(list(chunk(0, [1, 2, 3, 4, 5, 6])), [])

class TestTake(unittest.TestCase):
    def test_take(self):
        self.assertEqual(list(take(3, [1, 2, 3, 4, 5, 6])), [1, 2, 3])
        self.assertEqual(list(take(0, [1, 2, 3, 4, 5, 6])), [])
        self.assertEqual(list(take(10, [1, 2, 3, 4, 5, 6])), [1, 2, 3, 4, 5, 6])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        self.assertEqual(list(drop(3, [1, 2, 3, 4, 5, 6])), [4, 5, 6])
        self.assertEqual(list(drop(0, [1, 2, 3, 4, 5, 6])), [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(drop(10, [1, 2, 3, 4, 5, 6])), [])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        self.assertEqual(list(drop_until(lambda x: x > 3, [1, 2, 3, 4, 5, 6])), [4, 5, 6])
        self.assertEqual(list(drop_until(lambda x: x > 6, [1, 2, 3, 4, 5, 6])), [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(drop_until(lambda x: x > 0, [1, 2, 3, 4, 5, 6])), [1, 2, 3, 4, 5, 6])

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        self.assertEqual(list(split_by([1, 2, 3, 4, 5, 6], separator=3)), [[1, 2], [4, 5], [6]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5, 6], criterion=lambda x: x > 3)), [[1, 2, 3], [4, 5, 6]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5, 6], separator=3, empty_segments=True)), [[1, 2], [], [4, 5], [], [6]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5, 6], criterion=lambda x: x > 3, empty_segments=True)), [[1, 2, 3], [], [4, 5, 6]])


if __name__ == '__main__':
    unittest.main()