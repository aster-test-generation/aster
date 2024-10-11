import unittest
from flutes.structure import *


class TestFlutesStructure(unittest.TestCase):
    def test_reverse_map(self):
        d = {'a': 1, 'b': 2, 'c': 3}
        result = reverse_map(d)
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_register_no_map_class(self):
        class TestClass:
            pass
        register_no_map_class(TestClass)
        self.assertIn(TestClass, _NO_MAP_TYPES)

    def test_no_map_instance(self):
        class TestClass:
            pass
        instance = TestClass()
        no_map_instance(instance)
        self.assertTrue(hasattr(instance, _NO_MAP_INSTANCE_ATTR))

    def test_no_map_type(self):
        class TestClass:
            pass
        new_type = _no_map_type(TestClass)
        instance = new_type()
        self.assertTrue(hasattr(instance, _NO_MAP_INSTANCE_ATTR))

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
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {'a': 2, 'b': 4, 'c': 6})

    def test_map_structure_set(self):
        def fn(x):
            return x * 2
        obj = {1, 2, 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2, 4, 6})

    def test_map_structure_zip_list(self):
        def fn(x, y):
            return x + y
        objs = [[1, 2, 3], [4, 5, 6]]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, [5, 7, 9])

    def test_map_structure_zip_tuple(self):
        def fn(x, y):
            return x + y
        objs = [(1, 2, 3), (4, 5, 6)]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, (5, 7, 9))

    def test_map_structure_zip_dict(self):
        def fn(x, y):
            return x + y
        objs = [{'a': 1, 'b': 2, 'c': 3}, {'a': 4, 'b': 5, 'c': 6}]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, {'a': 5, 'b': 7, 'c': 9})

class TestReverseMap(unittest.TestCase):
    def test_reverse_map(self):
        d = {'a': 1, 'b': 2, 'c': 3}
        result = reverse_map(d)
        self.assertEqual(result, ['a', 'b', 'c'])

class TestRegisterNoMapClass(unittest.TestCase):
    def test_register_no_map_class(self):
        class TestClass: pass
        register_no_map_class(TestClass)
        self.assertIn(TestClass, _NO_MAP_TYPES)

class TestNoMapInstance(unittest.TestCase):
    def test_no_map_instance(self):
        class TestClass: pass
        instance = TestClass()
        no_map_instance(instance)
        self.assertTrue(hasattr(instance, _NO_MAP_INSTANCE_ATTR))

class TestNoMapType(unittest.TestCase):
    def test_no_map_type(self):
        class TestClass: pass
        new_type = _no_map_type(TestClass)
        self.assertTrue(issubclass(new_type, TestClass))

class TestMapStructure(unittest.TestCase):
    def test_map_structure_list(self):
        def fn(x): return x * 2
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 4, 6])

    def test_map_structure_tuple(self):
        def fn(x): return x * 2
        obj = (1, 2, 3)
        result = map_structure(fn, obj)
        self.assertEqual(result, (2, 4, 6))

    def test_map_structure_dict(self):
        def fn(x): return x * 2
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {'a': 2, 'b': 4, 'c': 6})

    def test_map_structure_set(self):
        def fn(x): return x * 2
        obj = {1, 2, 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2, 4, 6})

    def test_map_structure_no_map(self):
        def fn(x): return x * 2
        class NoMapClass: pass
        register_no_map_class(NoMapClass)
        obj = NoMapClass()
        result = map_structure(fn, obj)
        self.assertEqual(result, obj)

class TestMapStructureZip(unittest.TestCase):
    def test_map_structure_zip_list(self):
        def fn(x, y): return x + y
        objs = [[1, 2, 3], [4, 5, 6]]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, [5, 7, 9])

    def test_map_structure_zip_tuple(self):
        def fn(x, y): return x + y
        objs = [(1, 2, 3), (4, 5, 6)]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, (5, 7, 9))

    def test_map_structure_zip_dict(self):
        def fn(x, y): return x + y
        objs = [{'a': 1, 'b': 2, 'c': 3}, {'a': 4, 'b': 5, 'c': 6}]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, {'a': 5, 'b': 7, 'c': 9})

    def test_map_structure_zip_no_map(self):
        def fn(x, y): return x + y
        class NoMapClass: pass
        register_no_map_class(NoMapClass)
        obj1 = NoMapClass()
        obj2 = NoMapClass()
        result = map_structure_zip(fn, [obj1, obj2])
        self.assertEqual(result, fn(obj1, obj2))

class TestNoMapInstance(unittest.TestCase):
    def test_no_map_instance(self):
        class TestClass: pass
        instance = TestClass()
        no_map_instance(instance)
        self.assertTrue(hasattr(instance, _NO_MAP_INSTANCE_ATTR))

    def test_no_map_instance_with_type(self):
        class TestClass: pass
        instance = TestClass()
        no_map_instance_type = _no_map_type(TestClass)
        self.assertEqual(no_map_instance_type, type(instance))

class TestMapStructure(unittest.TestCase):
    def test_map_structure_list(self):
        def fn(x): return x * 2
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 4, 6])

    def test_map_structure_tuple(self):
        def fn(x): return x * 2
        obj = (1, 2, 3)
        result = map_structure(fn, obj)
        self.assertEqual(result, (2, 4, 6))

    def test_map_structure_dict(self):
        def fn(x): return x * 2
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {'a': 2, 'b': 4, 'c': 6})

    def test_map_structure_set(self):
        def fn(x): return x * 2
        obj = {1, 2, 3}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2, 4, 6})

    def test_map_structure_no_map_type(self):
        class TestClass: pass
        register_no_map_class(TestClass)
        instance = TestClass()
        def fn(x): return x
        result = map_structure(fn, instance)
        self.assertEqual(result, instance)

    def test_map_structure_no_map_instance(self):
        instance = no_map_instance(object())
        def fn(x): return x
        result = map_structure(fn, instance)
        self.assertEqual(result, instance)

class TestMapStructureZip(unittest.TestCase):
    def test_map_structure_zip_list(self):
        def fn(x, y): return x + y
        objs = [[1, 2], [3, 4]]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, [4, 6])

    def test_map_structure_zip_tuple(self):
        def fn(x, y): return x + y
        objs = [(1, 2), (3, 4)]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, (4, 6))

    def test_map_structure_zip_dict(self):
        def fn(x, y): return x + y
        objs = [{'a': 1, 'b': 2}, {'a': 3, 'b': 4}]
        result = map_structure_zip(fn, objs)
        self.assertEqual(result, {'a': 4, 'b': 6})

    def test_map_structure_zip_no_map_type(self):
        class TestClass: pass
        register_no_map_class(TestClass)
        instance = TestClass()
        def fn(x, y): return x
        result = map_structure_zip(fn, [instance, instance])
        self.assertEqual(result, instance)

    def test_map_structure_zip_no_map_instance(self):
        instance = no_map_instance(object())
        def fn(x, y): return x
        result = map_structure_zip(fn, [instance, instance])
        self.assertEqual(result, instance)

if __name__ == '__main__':
    unittest.main()