import unittest
from flutes.iterator import *

class TestChunk(unittest.TestCase):
    def test_chunk_positive(self):
        result = list(chunk(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [[1, 2], [3, 4], [5]])

    def test_chunk_zero(self):
        with self.assertRaises(ValueError):
            list(chunk(0, [1, 2, 3]))

class TestTake(unittest.TestCase):
    def test_take_positive(self):
        result = list(take(2, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 2])

    def test_take_negative(self):
        with self.assertRaises(ValueError):
            list(take(-1, [1, 2, 3]))

class TestDrop(unittest.TestCase):
    def test_drop_positive(self):
        result = list(drop(2, [1, 2, 3, 4]))
        self.assertEqual(result, [3, 4])

    def test_drop_negative(self):
        with self.assertRaises(ValueError):
            list(drop(-1, [1, 2, 3]))

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = list(drop_until(lambda x: x > 2, [1, 2, 3, 4]))
        self.assertEqual(result, [3, 4])

class TestSplitBy(unittest.TestCase):
    def test_split_by_criterion(self):
        result = list(split_by([1, 2, 3, 4], criterion=lambda x: x % 2 == 0))
        self.assertEqual(result, [[1], [3], [4]])

    def test_split_by_separator(self):
        result = list(split_by([1, 2, 3, 2, 4], separator=2))
        self.assertEqual(result, [[1], [3], [4]])

    def test_split_by_invalid(self):
        with self.assertRaises(ValueError):
            list(split_by([1, 2, 3], criterion=lambda x: x, separator=2))

class TestScanl(unittest.TestCase):
    def test_scanl_no_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 3, 6, 10])

    def test_scanl_with_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4], 10))
        self.assertEqual(result, [10, 11, 13, 16, 20])

class TestScanr(unittest.TestCase):
    def test_scanr_no_initial(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4])
        self.assertEqual(result, [10, 9, 7, 4])

    def test_scanr_with_initial(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4], 10)
        self.assertEqual(result, [20, 19, 17, 14, 10])

class TestLazyList(unittest.TestCase):
    def test_lazy_list(self):
        ll = LazyList(range(5))
        self.assertEqual(ll[0], 0)
        self.assertEqual(ll[1], 1)
        self.assertEqual(ll[2], 2)
        self.assertEqual(ll[3], 3)
        self.assertEqual(ll[4], 4)

    def test_lazy_list_slice(self):
        ll = LazyList(range(5))
        self.assertEqual(ll[:3], [0, 1, 2])

    def test_lazy_list_len(self):
        ll = LazyList(range(5))
        with self.assertRaises(TypeError):
            len(ll)
        list(ll)
        self.assertEqual(len(ll), 5)

    def test_lazy_list_iter(self):
        ll = LazyList(range(5))
        self.assertEqual(list(ll), [0, 1, 2, 3, 4])

class TestRange(unittest.TestCase):
    def test_range(self):
        r = Range(5)
        self.assertEqual(list(r), [0, 1, 2, 3, 4])

    def test_range_with_start(self):
        r = Range(1, 5)
        self.assertEqual(list(r), [1, 2, 3, 4])

    def test_range_with_step(self):
        r = Range(1, 5, 2)
        self.assertEqual(list(r), [1, 3])

    def test_range_len(self):
        r = Range(1, 5, 2)
        self.assertEqual(len(r), 2)

    def test_range_getitem(self):
        r = Range(1, 5, 2)
        self.assertEqual(r[0], 1)
        self.assertEqual(r[1], 3)

    def test_range_getitem_slice(self):
        r = Range(1, 10, 2)
        self.assertEqual(r[:3], [1, 3, 5])

class TestMapList(unittest.TestCase):
    def test_map_list(self):
        ml = MapList(lambda x: x * 2, range(5))
        self.assertEqual(list(ml), [0, 2, 4, 6, 8])

    def test_map_list_getitem(self):
        ml = MapList(lambda x: x * 2, range(5))
        self.assertEqual(ml[0], 0)
        self.assertEqual(ml[1], 2)

    def test_map_list_getitem_slice(self):
        ml = MapList(lambda x: x * 2, range(5))
        self.assertEqual(ml[:3], [0, 2, 4])

    def test_map_list_len(self):
        ml = MapList(lambda x: x * 2, range(5))
        self.assertEqual(len(ml), 5)

if __name__ == '__main__':
    unittest.main()