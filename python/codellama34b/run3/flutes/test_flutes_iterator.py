import unittest
from flutes.iterator import *



class TestChunk(unittest.TestCase):
    def test_chunk(self):
        result = chunk(1, [1, 2, 3])
        self.assertEqual(list(result), [[1], [2], [3]])

    def test_chunk_negative_n(self):
        with self.assertRaises(ValueError):
            chunk(-1, [1, 2, 3])

    def test_chunk_empty_iterable(self):
        result = chunk(1, [])
        self.assertEqual(list(result), [])

class TestTake(unittest.TestCase):
    def test_take(self):
        result = take(1, [1, 2, 3])
        self.assertEqual(list(result), [1])

    def test_take_negative_n(self):
        with self.assertRaises(ValueError):
            take(-1, [1, 2, 3])

    def test_take_empty_iterable(self):
        result = take(1, [])
        self.assertEqual(result, ())

class TestDrop(unittest.TestCase):
    def test_drop(self):
        result = drop(1, [1, 2, 3])
        self.assertEqual(list(result), [2, 3])

    def test_drop_negative_n(self):
        with self.assertRaises(ValueError):
            drop(-1, [1, 2, 3])

    def test_drop_empty_iterable(self):
        result = drop(1, [])
        self.assertEqual(list(result), [])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = drop_until(lambda x: x == 2, [1, 2, 3])
        self.assertEqual(list(result), [2, 3])

    def test_drop_until_empty_iterable(self):
        result = drop_until(lambda x: x == 2, [])
        self.assertEqual(result, drop_until(10, [1, 2, 3, 4, 5]))

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        result = split_by(lambda x: x == 2, [1, 2, 3])
        self.assertEqual(list(result), [[1], [3]])

    def test_split_by_empty_iterable(self):
        result = split_by(lambda x: x == 2, [])
        self.assertEqual(list(result), [])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        result = scanl(lambda x, y: x + y, [1, 2, 3])
        self.assertEqual(list(result), [1, 3, 6])

    def test_scanl_empty_iterable(self):
        result = scanl(lambda x, y: x + y, [])
        self.assertEqual(result, [1, 2, 3, 4, 5])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3])
        self.assertEqual(result, [6, 5, 3])

    def test_scanr_empty_iterable(self):
        result = scanr(lambda x, y: x + y, [1])
        self.assertEqual(result, [])

class TestLazyList(unittest.TestCase):
    def test_lazy_list(self):
        result = LazyList([1, 2, 3])
        self.assertEqual(list(result), [1, 2, 3])

    def test_lazy_list_empty_iterable(self):
        result = LazyList([])
        self.assertEqual(result, LazyList([]))

    def test_lazy_list_iterator(self):
        result = LazyList([1, 2, 3]).__iter__()
        self.assertEqual(result, LazyList([1, 2, 3]))


class TestChunk(unittest.TestCase):
    def test_chunk(self):
        result = chunk(1, [1, 2, 3])
        self.assertEqual(result, [[1], [2], [3]])

class TestTake(unittest.TestCase):
    def test_take(self):
        result = take(1, [1, 2, 3])
        self.assertEqual(result, [1])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        result = drop(1, [1, 2, 3])
        self.assertEqual(result, [2, 3])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = drop_until(lambda x: x == 2, [1, 2, 3])
        self.assertEqual(result, [2, 3])

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        result = split_by(lambda x: x == 2, [1, 2, 3])
        self.assertEqual(result, [[1], [3]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        result = scanl(lambda x, y: x + y, [1, 2, 3])
        self.assertEqual(result, [1, 3, 6])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3])
        self.assertEqual(result, [6, 5, 3])

class TestLazyList(unittest.TestCase):
    def test_lazy_list(self):
        result = LazyList([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

class TestRange(unittest.TestCase):
    def test_range(self):
        result = Range(1, 3)
        self.assertEqual(result, [1, 2])

class TestMapList(unittest.TestCase):
    def test_map_list(self):
        result = MapList(lambda x: x + 1, [1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

if __name__ == '__main__':
    unittest.main()