from flutes.structure import _NO_MAP_TYPES
import unittest
from flutes.structure import *


class TestReverseMap(unittest.TestCase):
    def test_reverse_map(self):
        d = {"a": 1, "b": 2, "c": 3}
        result = reverse_map(d)
        self.assertEqual(result, ["a", "b", "c"])

class TestRegisterNoMapClass(unittest.TestCase):
    def test_register_no_map_class(self):
        container_type = list
        register_no_map_class(container_type)
        self.assertEqual(_NO_MAP_TYPES, {list})

class TestNoMapInstance(unittest.TestCase):
    def test_no_map_instance(self):
        instance = [1, 2, 3]
        result = no_map_instance(instance)
        self.assertEqual(result, [1, 2, 3])

class TestMapStructure(unittest.TestCase):
    def test_map_structure(self):
        fn = lambda x: x + [1]
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 3, 4])

class TestMapStructureZip(unittest.TestCase):
    def test_map_structure_zip(self):
        fn = lambda x, y: x + y
        objs = [[1, 2, 3], [4, 5, 6]]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, [1, 2, 3, 4, 5, 6])

if __name__ == '__main__':
    unittest.main()