import unittest
from flutes.structure import *


class TestFlutesStructure(unittest.TestCase):
    def test_reverse_map(self):
        result = reverse_map({'a': 2, 'b': 1, 'c': 3})
        self.assertEqual(result, ['b', 'a', 'c'])

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
        result = map_structure(lambda x: x + 1, [1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

    def test_map_structure_tuple(self):
        result = map_structure(lambda x: x + 1, (1, 2, 3))
        self.assertEqual(result, (2, 3, 4))

    def test_map_structure_namedtuple(self):
        from collections import namedtuple
        Point = namedtuple('Point', ['x', 'y'])
        point = Point(1, 2)
        result = map_structure(lambda x: x + 1, point)
        self.assertEqual(result, Point(2, 3))

    def test_map_structure_dict(self):
        result = map_structure(lambda x: x + 1, {'a': 1, 'b': 2})
        self.assertEqual(result, {'a': 2, 'b': 3})

    def test_map_structure_set(self):
        result = map_structure(lambda x: x + 1, {1, 2, 3})
        self.assertEqual(result, {2, 3, 4})

    def test_map_structure_no_map_type(self):
        class DummyClass:
            pass
        register_no_map_class(DummyClass)
        instance = DummyClass()
        result = map_structure(lambda x: x + 1, instance)
        self.assertEqual(result, instance)

    def test_map_structure_zip_list(self):
        result = map_structure_zip(lambda x, y: x + y, [[1, 2], [3, 4]])
        self.assertEqual(result, [4, 6])

    def test_map_structure_zip_tuple(self):
        result = map_structure_zip(lambda x, y: x + y, [(1, 2), (3, 4)])
        self.assertEqual(result, (4, 6))

    def test_map_structure_zip_namedtuple(self):
        from collections import namedtuple
        Point = namedtuple('Point', ['x', 'y'])
        point1 = Point(1, 2)
        point2 = Point(3, 4)
        result = map_structure_zip(lambda x, y: x + y, [point1, point2])
        self.assertEqual(result, Point(4, 6))

    def test_map_structure_zip_dict(self):
        result = map_structure_zip(lambda x, y: x + y, [{'a': 1, 'b': 2}, {'a': 3, 'b': 4}])
        self.assertEqual(result, {'a': 4, 'b': 6})

    def test_map_structure_zip_set_error(self):
        with self.assertRaises(ValueError):
            map_structure_zip(lambda x, y: x + y, [{1, 2}, {3, 4}])

    def test_no_map_type(self):
        class DummyClass:
            pass
        result = _no_map_type(DummyClass)
        self.assertTrue(hasattr(result, _NO_MAP_INSTANCE_ATTR))

if __name__ == '__main__':
    unittest.main()