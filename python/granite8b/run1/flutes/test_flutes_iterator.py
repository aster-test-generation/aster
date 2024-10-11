import unittest
from flutes.iterator import chunk, take, drop, drop_until, split_by, scanl, scanr, LazyList, Range, MapList


class TestChunk(unittest.TestCase):
    def test_chunk(self):
        self.assertEqual(list(chunk(3, [1, 2, 3, 4, 5])), [[1, 2, 3], [4, 5]])
        self.assertEqual(list(chunk(2, [1, 2, 3, 4, 5])), [[1, 2], [3, 4], [5]])
        self.assertEqual(list(chunk(1, [1, 2, 3, 4, 5])), [[1], [2], [3], [4], [5]])
        self.assertEqual(list(chunk(0, [1, 2, 3, 4, 5])), [])

class TestTake(unittest.TestCase):
    def test_take(self):
        self.assertEqual(list(take(3, [1, 2, 3, 4, 5])), [1, 2, 3])
        self.assertEqual(list(take(0, [1, 2, 3, 4, 5])), [])
        self.assertEqual(list(take(5, [1, 2, 3, 4, 5])), [1, 2, 3, 4, 5])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        self.assertEqual(list(drop(3, [1, 2, 3, 4, 5])), [4, 5])
        self.assertEqual(list(drop(0, [1, 2, 3, 4, 5])), [1, 2, 3, 4, 5])
        self.assertEqual(list(drop(5, [1, 2, 3, 4, 5])), [])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        self.assertEqual(list(drop_until(lambda x: x > 3, [1, 2, 3, 4, 5])), [4, 5])
        self.assertEqual(list(drop_until(lambda x: x > 5, [1, 2, 3, 4, 5])), [6, 7, 8, 9, 10])
        self.assertEqual(list(drop_until(lambda x: x > 1, [1, 2, 3, 4, 5])), [2, 3, 4, 5])

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], separator=3)), [[1, 2], [4, 5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x > 3)), [[1, 2, 3], [4, 5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], separator=3, empty_segments=True)), [[1, 2], [], [4, 5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x > 3, empty_segments=True)), [[1, 2, 3], [], [4, 5]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        self.assertEqual(list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5])), [1, 3, 6, 10, 15])
        self.assertEqual(list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5])), [0, 1, 3, 6, 10, 15])


class TestChunk(unittest.TestCase):
    def test_chunk(self):
        self.assertEqual(list(chunk(2, [1, 2, 3, 4, 5])), [[1, 2], [3, 4], [5]])
        self.assertEqual(list(chunk(3, [1, 2, 3, 4, 5])), [[1, 2, 3], [4, 5]])
        self.assertEqual(list(chunk(0, [1, 2, 3, 4, 5])), [])
        self.assertEqual(list(chunk(-1, [1, 2, 3, 4, 5])), [])

class TestTake(unittest.TestCase):
    def test_take(self):
        self.assertEqual(list(take(2, [1, 2, 3, 4, 5])), [1, 2])
        self.assertEqual(list(take(0, [1, 2, 3, 4, 5])), [])
        self.assertEqual(list(take(-1, [1, 2, 3, 4, 5])), [])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        self.assertEqual(list(drop(2, [1, 2, 3, 4, 5])), [3, 4, 5])
        self.assertEqual(list(drop(0, [1, 2, 3, 4, 5])), [1, 2, 3, 4, 5])
        self.assertEqual(list(drop(-1, [1, 2, 3, 4, 5])), [1, 2, 3, 4, 5])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        self.assertEqual(list(drop_until(lambda x: x > 3, [1, 2, 3, 4, 5])), [4, 5])
        self.assertEqual(list(drop_until(lambda x: x > 5, [1, 2, 3, 4, 5])), [1, 2, 3, 4, 5])
        self.assertEqual(list(drop_until(lambda x: x > 3, [])), [])

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        self.assertEqual(list(split_by([1, 2, 3, 4, 5])), [[1], [2], [3], [4], [5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], empty_segments=True)), [[], [1], [2], [3], [4], [5], []])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x % 2 == 0)), [[1], [3], [5]])
        self.assertEqual(list(split_by([1, 2, 3, 4, 5], separator=2)), [[1], [3], [4, 5]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        self.assertEqual(list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5])), [1, 3, 6, 10, 15])
        self.assertEqual(list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5], initial=0)), [0, 1, 3, 6, 10, 15])


if __name__ == '__main__':
    unittest.main()