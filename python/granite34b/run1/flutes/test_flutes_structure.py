import unittest
from flutes.structure import reverse_map, register_no_map_class, no_map_instance, map_structure, map_structure_zip


class TestFlutesStructure(unittest.TestCase):
    def test_reverse_map(self):
        d = {1: 10, 2: 20, 3: 30}
        result = reverse_map(d)
        self.assertEqual(result, [1, 2, 3])

    def test_register_no_map_class(self):
        class TestClass:
            pass
        register_no_map_class(TestClass)
        self.assertIn(TestClass, _MAP_TYPES)

    def test_no_map_instance(self):
        class TestClass:
            pass
        instance = TestClass()
        no_map_instance(instance)
        self.assertTrue(hasattr(instance, '_NO_MAP_INSTANCE_ATTR'))

    def test_map_structure(self):
        def fn(x):
            return x + 1
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 3, 4])

    def test_map_structure_zip(self):
        def fn(x, y):
            return x + y
        objs = [[1, 2, 3], [4, 5, 6]]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, [5, 7, 9])

if __name__ == '__main__':
    unittest.main()