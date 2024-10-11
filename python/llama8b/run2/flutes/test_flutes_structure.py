import flutes
import unittest
from flutes.structure import reverse_map, register_no_map_class, no_map_instance, map_structure, map_structure_zip


class TestReverseMap(unittest.TestCase):
    def test_reverse_map(self):
        d = {"a": 1, "b": 2, "c": 3}
        result = reverse_map(d)
        self.assertEqual(result, ["a", "b", "c"])

    def test_reverse_map_empty_dict(self):
        d = {}
        result = reverse_map(d)
        self.assertEqual(result, [])

class TestRegisterNoMapClass(unittest.TestCase):
    def test_register_no_map_class(self):
        class MyClass:
            pass
        register_no_map_class(MyClass)
        self.assertIn(MyClass, flutes.structure._NO_MAP_TYPES)

class TestNoMapInstance(unittest.TestCase):
    def test_no_map_instance(self):
        class MyClass:
            pass
        instance = MyClass()
        result = no_map_instance(instance)
        self.assertEqual(result, instance)

    def test_no_map_instance_attribute_error(self):
        class MyClass:
            pass
        instance = MyClass()
        result = no_map_instance(instance)
        self.assertIsInstance(result, type(instance))

class TestMapStructure(unittest.TestCase):
    def test_map_structure_list(self):
        def fn(x):
            return x * 2
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 4, 6])

    def test_map_structure_tuple(self):
        def fn(x):
            return x * 2
        obj = (1, 2, 3)
        result = map_structure(fn, obj)
        self.assertEqual(result, (2, 4, 6))

    def test_map_structure_dict(self):
        def fn(x):
            return x * 2
        obj = {"a": 1, "b": 2, "c": 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {"a": 2, "b": 4, "c": 6})

    def test_map_structure_set(self):
        def fn(x):
            return x * 2
        obj = {1, 2, 3}
        with self.assertRaises(ValueError):
            map_structure(fn, obj)

class TestMapStructureZip(unittest.TestCase):
    def test_map_structure_zip(self):
        def fn(x, y, z):
            return (x, y, z)
        obj1 = [1, 2, 3]
        obj2 = [4, 5, 6]
        obj3 = [7, 8, 9]
        result = map_structure_zip(fn, [obj1, obj2, obj3])
        self.assertEqual(result, [(1, 4, 7), (2, 5, 8), (3, 6, 9)])

if __name__ == '__main__':
    unittest.main()