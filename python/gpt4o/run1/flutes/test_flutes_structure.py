import unittest
from flutes.structure import *


class TestFlutesStructure(unittest.TestCase):
    def test_reverse_map(self):
        d = {'a': 3, 'b': 1, 'c': 2}
        result = reverse_map(d)
        self.assertEqual(result, ['b', 'c', 'a'])

    def test_register_no_map_class(self):
        class DummyClass:
            pass
        register_no_map_class(DummyClass)
        self.assertIn(DummyClass, _NO_MAP_TYPES)

    def test_no_map_instance(self):
        class DummyClass:
            pass
        instance = DummyClass()
        result = no_map_instance(instance)
        self.assertTrue(hasattr(result, _NO_MAP_INSTANCE_ATTR))

    def test_no_map_instance_with_attr_error(self):
        class DummyClass:
            __slots__ = ()
        instance = DummyClass()
        result = no_map_instance(instance)
        self.assertTrue(hasattr(result, _NO_MAP_INSTANCE_ATTR))

    def test_map_structure_list(self):
        fn = lambda x: x + 1
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 3, 4])

    def test_map_structure_tuple(self):
        fn = lambda x: x + 1
        obj = (1, 2, 3)
        result = map_structure(fn, obj)
        self.assertEqual(result, (2, 3, 4))

    def test_map_structure_namedtuple(self):
        from collections import namedtuple
        Point = namedtuple('Point', ['x', 'y'])
        fn = lambda x: x + 1
        obj = Point(1, 2)
        result = map_structure(fn, obj)
        self.assertEqual(result, Point(2, 3))

    def test_map_structure_dict(self):
        fn = lambda x: x + 1
        obj = {'a': 1, 'b': 2}
        result = map_structure(fn, obj)
        self.assertEqual(result, {'a': 2, 'b': 3})

    def test_map_structure_set(self):
        fn = lambda x: x + 1
        obj = {1, 2, 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2, 3, 4})

    def test_map_structure_no_map(self):
        class DummyClass:
            pass
        instance = DummyClass()
        no_map_instance(instance)
        fn = lambda x: x + 1
        result = map_structure(fn, instance)
        self.assertEqual(result, instance)

    def test_map_structure_zip_list(self):
        fn = lambda x, y: x + y
        objs = [[1, 2, 3], [4, 5, 6]]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, [5, 7, 9])

    def test_map_structure_zip_tuple(self):
        fn = lambda x, y: x + y
        objs = [(1, 2, 3), (4, 5, 6)]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, (5, 7, 9))

    def test_map_structure_zip_namedtuple(self):
        from collections import namedtuple
        Point = namedtuple('Point', ['x', 'y'])
        fn = lambda x, y: x + y
        objs = [Point(1, 2), Point(3, 4)]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, Point(4, 6))

    def test_map_structure_zip_dict(self):
        fn = lambda x, y: x + y
        objs = [{'a': 1, 'b': 2}, {'a': 3, 'b': 4}]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, {'a': 4, 'b': 6})

    def test_map_structure_zip_set_error(self):
        fn = lambda x, y: x + y
        objs = [{1, 2}, {3, 4}]
        with self.assertRaises(ValueError):
            map_structure_zip(fn, objs)

    def test_no_map_type(self):
        class DummyClass:
            pass
        result = _no_map_type(DummyClass)
        self.assertTrue(hasattr(result, _NO_MAP_INSTANCE_ATTR))

if __name__ == '__main__':
    unittest.main()