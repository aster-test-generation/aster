from flutes.structure import _NO_MAP_TYPES
import unittest
from flutes.structure import reverse_map, register_no_map_class, no_map_instance, map_structure, map_structure_zip


class TestReverseMap(unittest.TestCase):
    def test_reverse_map(self):
        d = {'a': 1, 'b': 2, 'c': 1}
        expected = ['a', 'c']
        actual = reverse_map(d)
        self.assertEqual(actual, expected)

class TestRegisterNoMapClass(unittest.TestCase):
    def test_register_no_map_class(self):
        register_no_map_class(list)
        self.assertTrue(list in _NO_MAP_TYPES)

class TestNoMapInstance(unittest.TestCase):
    def test_no_map_instance(self):
        obj = [1, 2, 3]
        expected = [1, 2, 3]
        actual = no_map_instance(obj)
        self.assertEqual(actual, expected)

class TestMapStructure(unittest.TestCase):
    def test_map_structure(self):
        obj = [1, 2, 3]
        expected = [2, 3, 4]
        actual = map_structure(lambda x: x + 1, obj)
        self.assertEqual(actual, expected)

class TestMapStructureZip(unittest.TestCase):
    def test_map_structure_zip(self):
        objs = [[1, 2, 3], [4, 5, 6]]
        expected = [(1, 4), (2, 5), (3, 6)]
        actual = map_structure_zip(lambda *x: x, objs)
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()