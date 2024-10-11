import unittest
from flutes.iterator import *

class TestChunk(unittest.TestCase):
    def test_chunk_positive(self):
        result = list(chunk(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [[1, 2], [3, 4], [5]])

    def test_chunk_zero(self):
        with self.assertRaises(ValueError):
            list(chunk(0, [1, 2, 3]))

    def test_chunk_negative(self):
        with self.assertRaises(ValueError):
            list(chunk(-1, [1, 2, 3]))

class TestTake(unittest.TestCase):
    def test_take_positive(self):
        result = list(take(2, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 2])

    def test_take_zero(self):
        result = list(take(0, [1, 2, 3, 4]))
        self.assertEqual(result, [])

    def test_take_negative(self):
        with self.assertRaises(ValueError):
            list(take(-1, [1, 2, 3]))

class TestDrop(unittest.TestCase):
    def test_drop_positive(self):
        result = list(drop(2, [1, 2, 3, 4]))
        self.assertEqual(result, [3, 4])

    def test_drop_zero(self):
        result = list(drop(0, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 2, 3, 4])

    def test_drop_negative(self):
        with self.assertRaises(ValueError):
            list(drop(-1, [1, 2, 3]))

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = list(drop_until(lambda x: x > 2, [1, 2, 3, 4]))
        self.assertEqual(result, [3, 4])

class TestSplitBy(unittest.TestCase):
    def test_split_by_criterion(self):
        result = list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x % 2 == 0))
        self.assertEqual(result, [[1], [3], [5]])

    def test_split_by_separator(self):
        result = list(split_by([1, 2, 3, 2, 4, 5], separator=2))
        self.assertEqual(result, [[1], [3], [4, 5]])

    def test_split_by_invalid(self):
        with self.assertRaises(ValueError):
            list(split_by([1, 2, 3], criterion=lambda x: x, separator=2))

class TestScanl(unittest.TestCase):
    def test_scanl_no_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 3, 6, 10])

    def test_scanl_with_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4], 0))
        self.assertEqual(result, [0, 1, 3, 6, 10])

class TestScanr(unittest.TestCase):
    def test_scanr_no_initial(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4])
        self.assertEqual(result, [10, 9, 7, 4])

    def test_scanr_with_initial(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4], 0)
        self.assertEqual(result, [10, 9, 7, 4, 0])

class TestLazyList(unittest.TestCase):
    def test_lazy_list_iteration(self):
        lazy_list = LazyList(range(5))
        result = list(lazy_list)
        self.assertEqual(result, [0, 1, 2, 3, 4])

    def test_lazy_list_getitem(self):
        lazy_list = LazyList(range(5))
        self.assertEqual(lazy_list[2], 2)

    def test_lazy_list_len(self):
        lazy_list = LazyList(range(5))
        with self.assertRaises(TypeError):
            len(lazy_list)

    def test_lazy_list_exhausted_len(self):
        lazy_list = LazyList(range(5))
        list(lazy_list)
        self.assertEqual(len(lazy_list), 5)

    def test_lazy_list_fetch_until(self):
        lazy_list = LazyList(range(5))
        lazy_list._fetch_until(3)
        self.assertEqual(lazy_list.list, [0, 1, 2, 3])

class TestRange(unittest.TestCase):
    def test_range_single_arg(self):
        r = Range(5)
        self.assertEqual(list(r), [0, 1, 2, 3, 4])

    def test_range_two_args(self):
        r = Range(1, 5)
        self.assertEqual(list(r), [1, 2, 3, 4])

    def test_range_three_args(self):
        r = Range(1, 5, 2)
        self.assertEqual(list(r), [1, 3])

    def test_range_len(self):
        r = Range(1, 5, 2)
        self.assertEqual(len(r), 2)

    def test_range_getitem(self):
        r = Range(1, 5, 2)
        self.assertEqual(r[1], 3)

    def test_range_getitem_slice(self):
        r = Range(1, 10, 2)
        self.assertEqual(r[1:3], [3, 5])

class TestMapList(unittest.TestCase):
    def test_maplist_getitem(self):
        m = MapList(lambda x: x * 2, [1, 2, 3])
        self.assertEqual(m[1], 4)

    def test_maplist_getitem_slice(self):
        m = MapList(lambda x: x * 2, [1, 2, 3])
        self.assertEqual(m[1:3], [4, 6])

    def test_maplist_len(self):
        m = MapList(lambda x: x * 2, [1, 2, 3])
        self.assertEqual(len(m), 3)

    def test_maplist_iter(self):
        m = MapList(lambda x: x * 2, [1, 2, 3])
        self.assertEqual(list(m), [2, 4, 6])

if __name__ == '__main__':
    unittest.main()