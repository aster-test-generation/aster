import unittest
from flutes.iterator import *

class TestChunkFunction(unittest.TestCase):
    def test_chunk_positive_n(self):
        result = list(chunk(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [[1, 2], [3, 4], [5]])

    def test_chunk_zero_n(self):
        with self.assertRaises(ValueError):
            list(chunk(0, [1, 2, 3]))

class TestTakeFunction(unittest.TestCase):
    def test_take_positive_n(self):
        result = list(take(2, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 2])

    def test_take_negative_n(self):
        with self.assertRaises(ValueError):
            list(take(-1, [1, 2, 3]))

class TestDropFunction(unittest.TestCase):
    def test_drop_positive_n(self):
        result = list(drop(2, [1, 2, 3, 4]))
        self.assertEqual(result, [3, 4])

    def test_drop_negative_n(self):
        with self.assertRaises(ValueError):
            list(drop(-1, [1, 2, 3]))

class TestDropUntilFunction(unittest.TestCase):
    def test_drop_until(self):
        result = list(drop_until(lambda x: x > 2, [1, 2, 3, 4]))
        self.assertEqual(result, [3, 4])

class TestSplitByFunction(unittest.TestCase):
    def test_split_by_criterion(self):
        result = list(split_by([1, 2, 3, 4], criterion=lambda x: x % 2 == 0))
        self.assertEqual(result, [[1], [3], [4]])

    def test_split_by_separator(self):
        result = list(split_by([1, 2, 3, 4], separator=2))
        self.assertEqual(result, [[1], [3, 4]])

    def test_split_by_invalid_args(self):
        with self.assertRaises(ValueError):
            list(split_by([1, 2, 3, 4]))

class TestScanlFunction(unittest.TestCase):
    def test_scanl_no_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4]))
        self.assertEqual(result, [1, 3, 6, 10])

    def test_scanl_with_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4], 0))
        self.assertEqual(result, [0, 1, 3, 6, 10])

class TestScanrFunction(unittest.TestCase):
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

class TestRange(unittest.TestCase):
    def test_range_iteration(self):
        range_obj = Range(5)
        result = list(range_obj)
        self.assertEqual(result, [0, 1, 2, 3, 4])

    def test_range_getitem(self):
        range_obj = Range(5)
        self.assertEqual(range_obj[2], 2)

    def test_range_len(self):
        range_obj = Range(5)
        self.assertEqual(len(range_obj), 5)

class TestMapList(unittest.TestCase):
    def test_map_list_iteration(self):
        map_list = MapList(lambda x: x * 2, range(5))
        result = list(map_list)
        self.assertEqual(result, [0, 2, 4, 6, 8])

    def test_map_list_getitem(self):
        map_list = MapList(lambda x: x * 2, range(5))
        self.assertEqual(map_list[2], 4)

    def test_map_list_len(self):
        map_list = MapList(lambda x: x * 2, range(5))
        self.assertEqual(len(map_list), 5)

if __name__ == '__main__':
    unittest.main()