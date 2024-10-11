
import unittest
from flutes.structure import *

class TestReverseMap(unittest.TestCase):
    def test_reverse_map(self):
        d = {1: 2, 3: 4}
        result = reverse_map(d)
        self.assertEqual(result, [3, 1])

class TestRegisterNoMapClass(unittest.TestCase):
    def test_register_no_map_class(self):
        container_type = 1
        result = register_no_map_class(container_type)
        self.assertEqual(result, None)

class TestNoMapInstance(unittest.TestCase):
    def test_no_map_instance(self):
        instance = 1
        result = no_map_instance(instance)
        self.assertEqual(result, 1)

class TestMapStructure(unittest.TestCase):
    def test_map_structure(self):
        fn = lambda x: x + 1
        obj = [1, 2, 3]
        result = map_structure(fn, obj)
        self.assertEqual(result, [2, 3, 4])

    def test_map_structure_2(self):
        fn = lambda x: x + 1
        obj = (1, 2, 3)
        result = map_structure(fn, obj)
        self.assertEqual(result, (2, 3, 4))

    def test_map_structure_3(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_4(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_5(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_6(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_7(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_8(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_9(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_10(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

    def test_map_structure_11(self):
        fn = lambda x: x + 1
        obj = {1: 2, 3: 4}
        result = map_structure(fn, obj)
        self.assertEqual(result, {2: 3, 4: 5})

if __name__ == '__main__':
    unittest.main()