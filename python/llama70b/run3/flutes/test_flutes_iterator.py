import unittest
from flutes.iterator import *


class TestChunkFunction(unittest.TestCase):
    def test_chunk_function(self):
        result = list(chunk(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [[1, 2], [3, 4], [5]])

class TestTakeFunction(unittest.TestCase):
    def test_take_function(self):
        result = list(take(3, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [1, 2, 3])

class TestDropFunction(unittest.TestCase):
    def test_drop_function(self):
        result = list(drop(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [3, 4, 5])

class TestDropUntilFunction(unittest.TestCase):
    def test_drop_until_function(self):
        result = list(drop_until(lambda x: x > 3, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [4, 5])

class TestSplitByFunction(unittest.TestCase):
    def test_split_by_function_criterion(self):
        result = list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x > 3))
        self.assertEqual(result, [[1, 2, 3], [4, 5]])

    def test_split_by_function_separator(self):
        result = list(split_by([1, 2, 3, 4, 5], separator=3))
        self.assertEqual(result, [[1, 2], [3], [4, 5]])

class TestScanlFunction(unittest.TestCase):
    def test_scanl_function(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [1, 3, 6, 10, 15])

class TestScanrFunction(unittest.TestCase):
    def test_scanr_function(self):
        result = list(scanr(lambda x, y: x + y, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [15, 14, 12, 9, 5])

class TestLazyListClass(unittest.TestCase):
    def test_lazy_list_init(self):
        instance = LazyList([1, 2, 3, 4, 5])
        self.assertIsInstance(instance, LazyList)

    def test_lazy_list_iter(self):
        instance = LazyList([1, 2, 3, 4, 5])
        result = list(instance)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_lazy_list_getitem(self):
        instance = LazyList([1, 2, 3, 4, 5])
        result = instance[2]
        self.assertEqual(result, 3)

    def test_lazy_list_len(self):
        instance = LazyList([1, 2, 3, 4, 5])
        result = len(instance)
        self.assertEqual(result, 5)

    def test_lazy_list_fetch_until(self):
        instance = LazyList([1, 2, 3, 4, 5])
        instance._fetch_until(2)
        self.assertEqual(instance.list, [1, 2, 3])

class TestRangeClass(unittest.TestCase):
    def test_range_init(self):
        instance = Range(5)
        self.assertIsInstance(instance, Range)

    def test_range_iter(self):
        instance = Range(5)
        result = list(instance)
        self.assertEqual(result, [0, 1, 2, 3, 4])

    def test_range_getitem(self):
        instance = Range(5)
        result = instance[2]
        self.assertEqual(result, 2)

    def test_range_len(self):
        instance = Range(5)
        result = len(instance)
        self.assertEqual(result, 5)

    def test_range_get_idx(self):
        instance = Range(5)
        result = instance._get_idx(2)
        self.assertEqual(result, 2)

class TestMapListClass(unittest.TestCase):
    def test_map_list_init(self):
        instance = MapList(lambda x: x**2, [1, 2, 3, 4, 5])
        self.assertIsInstance(instance, MapList)

    def test_map_list_iter(self):
        instance = MapList(lambda x: x**2, [1, 2, 3, 4, 5])
        result = list(instance)
        self.assertEqual(result, [1, 4, 9, 16, 25])

if __name__ == '__main__':
    unittest.main()