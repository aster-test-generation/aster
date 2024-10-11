import flutes
import unittest
from flutes.structure import reverse_map, register_no_map_class, no_map_instance, map_structure, map_structure_zip


class TestReverseMap(unittest.TestCase):
    def test_reverse_map(self):
        d = {"a": 1, "b": 2, "c": 3}
        result = reverse_map(d)
        self.assertEqual(result, ["a", "b", "c"])

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
        no_map_instance(instance)
        self.assertTrue(hasattr(instance, flutes.structure._NO_MAP_INSTANCE_ATTR))

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
        def fn(*args):
            return sum(args)
        obj1 = [1, 2, 3]
        obj2 = [4, 5, 6]
        result = map_structure_zip(fn, [obj1, obj2])
        self.assertEqual(result, [5, 7, 9])

if __name__ == '__main__':
    unittest.main()