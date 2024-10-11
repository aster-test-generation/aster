import unittest
from flutes.iterator import chunk, take, drop, drop_until, split_by, scanl, scanr, LazyList, Range, MapList

class TestChunk(unittest.TestCase):
    def test_chunk(self):
        self.assertEqual(list(chunk(2, [1, 2, 3, 4, 5])), [[1, 2], [3, 4], [5]])
        self.assertEqual(list(chunk(3, [1, 2, 3, 4, 5])), [[1, 2, 3], [4, 5]])
        self.assertEqual(list(chunk(1, [1, 2, 3, 4, 5])), [[1], [2], [3], [4], [5]])
        with self.assertRaises(ValueError):
            list(chunk(-1, [1, 2, 3, 4, 5]))

class TestTake(unittest.TestCase):
    def test_take(self):
        self.assertEqual(list(take(2, [1, 2, 3, 4, 5])), [1, 2])
        self.assertEqual(list(take(0, [1, 2, 3, 4, 5])), [])
        with self.assertRaises(ValueError):
            list(take(-1, [1, 2, 3, 4, 5]))

class TestDrop(unittest.TestCase):
    def test_drop(self):
        self.assertEqual(list(drop(2, [1, 2, 3, 4, 5])), [3, 4, 5])
        self.assertEqual(list(drop(0, [1, 2, 3, 4, 5])), [1, 2, 3, 4, 5])
        with self.assertRaises(ValueError):
            list(drop(-1, [1, 2, 3, 4, 5]))

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        self.assertEqual(list(drop_until(lambda x: x > 2, [1, 2, 3, 4, 5])), [3, 4, 5])
        self.assertEqual(list(drop_until(lambda x: x > 5, [1, 2, 3, 4, 5])), [])

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x % 2 == 0)), [[1], [3], [5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], separator=3)), [[1, 2], [4, 5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], empty_segments=True, criterion=lambda x: x % 2 == 0)), [[1], [3], [5]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        self.assertEqual(list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5])), [1, 3, 6, 10, 15])
        self.assertEqual(list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5], 10)), [10, 11, 13, 16, 20, 25])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        self.assertEqual(list(scanr(lambda x, y: x + y, [1, 2, 3, 4, 5])), [15, 14, 12, 9, 5])
        self.assertEqual(list(scanr(lambda x, y: x + y, [1, 2, 3, 4, 5], 10)), [25, 24, 22, 19, 15, 10])


if __name__ == '__main__':
    unittest.main()