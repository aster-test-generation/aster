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
    def test_split_by_criterion(self):
        result = list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x > 3))
        self.assertEqual(result, [[1, 2, 3], [4, 5]])

    def test_split_by_separator(self):
        result = list(split_by([1, 2, 3, 4, 5], separator=3))
        self.assertEqual(result, [[1, 2], [4, 5]])

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
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertIsInstance(lazy_list, LazyList)

    def test_lazy_list_iter(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        result = list(lazy_list)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_lazy_list_getitem(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertEqual(lazy_list[0], 1)

    def test_lazy_list_len(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertEqual(len(lazy_list), 5)

    def test_lazy_list_fetch_until(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        lazy_list._fetch_until(2)
        self.assertEqual(len(lazy_list.list), 3)

class TestRangeClass(unittest.TestCase):
    def test_range_init(self):
        range_obj = Range(5)
        self.assertIsInstance(range_obj, Range)

    def test_range_iter(self):
        range_obj = Range(5)
        result = list(range_obj)
        self.assertEqual(result, [0, 1, 2, 3, 4])

    def test_range_getitem(self):
        range_obj = Range(5)
        self.assertEqual(range_obj[0], 0)

    def test_range_len(self):
        range_obj = Range(5)
        self.assertEqual(len(range_obj), 5)

    def test_range_get_idx(self):
        range_obj = Range(5)
        self.assertEqual(range_obj._get_idx(2), 2)

class TestMapListClass(unittest.TestCase):
    def test_map_list_init(self):
        map_list = MapList(lambda x: x**2, [1, 2, 3, 4, 5])
        self.assertIsInstance(map_list, MapList)

    def test_map_list_iter(self):
        map_list = MapList(lambda x: x**2, [1, 2, 3, 4, 5])
        result = list(map_list)
        self.assertEqual(result, [1, 4, 9, 16, 25])

class TestSplitByFunction(unittest.TestCase):
    def test_split_by_function(self):
        result = list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x > 3))
        self.assertEqual(result, [[1, 2, 3], [4, 5]])

class TestLazyListClass(unittest.TestCase):
    def test_lazy_list_init(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertIsInstance(lazy_list, LazyList)

    def test_lazy_list_iter(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        result = list(lazy_list)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_lazy_list_getitem(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertEqual(lazy_list[0], 1)
        self.assertEqual(lazy_list[1:3], [2, 3])

    def test_lazy_list_len(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertEqual(len(lazy_list), 5)

    def test_lazy_list_fetch_until(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        lazy_list._fetch_until(2)
        self.assertEqual(lazy_list.list, [1, 2, 3])

class TestRangeClass(unittest.TestCase):
    def test_range_init(self):
        range_obj = Range(5)
        self.assertIsInstance(range_obj, Range)

    def test_range_iter(self):
        range_obj = Range(5)
        result = list(range_obj)
        self.assertEqual(result, [0, 1, 2, 3, 4])

    def test_range_getitem(self):
        range_obj = Range(5)
        self.assertEqual(range_obj[0], 0)
        self.assertEqual(range_obj[1:3], [1, 2])

    def test_range_len(self):
        range_obj = Range(5)
        self.assertEqual(len(range_obj), 5)

    def test_range_get_idx(self):
        range_obj = Range(5)
        self.assertEqual(range_obj._get_idx(2), 2)

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
        result = instance[1]
        self.assertEqual(result, 2)

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
        result = instance[1]
        self.assertEqual(result, 1)

    def test_range_len(self):
        instance = Range(5)
        result = len(instance)
        self.assertEqual(result, 5)

class TestMapListClass(unittest.TestCase):
    def test_map_list_init(self):
        instance = MapList(lambda x: x * 2, [1, 2, 3, 4, 5])
        self.assertIsInstance(instance, MapList)

    def test_map_list_iter(self):
        instance = MapList(lambda x: x * 2, [1, 2, 3, 4, 5])
        result = list(instance)
        self.assertEqual(result, [2, 4, 6, 8, 10])

    def test_map_list_getitem(self):
        instance = MapList(lambda x: x * 2, [1, 2, 3, 4, 5])
        result = instance[1]
        self.assertEqual(result, 4)

class TestChunk(unittest.TestCase):
    def test_chunk(self):
        result = list(chunk(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [[1, 2], [3, 4], [5]])

class TestTake(unittest.TestCase):
    def test_take(self):
        result = list(take(3, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [1, 2, 3])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        result = list(drop(2, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [3, 4, 5])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = list(drop_until(lambda x: x > 3, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [4, 5])

class TestSplitBy(unittest.TestCase):
    def test_split_by_criterion(self):
        result = list(split_by([1, 2, 3, 4, 5], criterion=lambda x: x % 2 == 0))
        self.assertEqual(result, [[1], [2], [3], [4], [5]])

    def test_split_by_separator(self):
        result = list(split_by([1, 2, 3, 4, 5], separator=3))
        self.assertEqual(result, [[1, 2], [4, 5]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5]))
        self.assertEqual(result, [1, 3, 6, 10, 15])

    def test_scanl_with_initial(self):
        result = list(scanl(lambda x, y: x + y, [1, 2, 3, 4, 5], 10))
        self.assertEqual(result, [10, 11, 13, 16, 20])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4, 5])
        self.assertEqual(result, [15, 14, 12, 9, 5])

    def test_scanr_with_initial(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4, 5], 10)
        self.assertEqual(result, [20, 19, 17, 14, 10])

class TestLazyList(unittest.TestCase):
    def test_lazy_list_init(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertEqual(lazy_list.list, [])

    def test_lazy_list_iter(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        result = list(lazy_list)
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_lazy_list_getitem(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertEqual(lazy_list[0], 1)
        self.assertEqual(lazy_list[1:3], [2, 3])

    def test_lazy_list_len(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        self.assertRaises(TypeError, lambda: len(lazy_list))

    def test_lazy_list_fetch_until(self):
        lazy_list = LazyList([1, 2, 3, 4, 5])
        lazy_list._fetch_until(2)
        self.assertEqual(lazy_list.list, [1, 2, 3])

class TestRange(unittest.TestCase):
    def test_range_init(self):
        range_obj = Range(5)
        self.assertEqual(range_obj.l, 0)
        self.assertEqual(range_obj.r, 5)
        self.assertEqual(range_obj.step, 1)

    def test_range_iter(self):
        range_obj = Range(5)
        result = list(range_obj)
        self.assertEqual(result, [0, 1, 2, 3, 4])

    def test_range_getitem(self):
        range_obj = Range(5)
        self.assertEqual(range_obj[0], 0)
        self.assertEqual(range_obj[1:3], [1, 2])

    def test_range_len(self):
        range_obj = Range(5)
        self.assertEqual(len(range_obj), 5)

if __name__ == '__main__':
    unittest.main()