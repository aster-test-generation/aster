import unittest
from flutils.namedtupleutils import to_namedtuple
from unittest import TestCase


class TestNamedtupleUtils(unittest.TestCase):
    def test_to_namedtuple_dict(self):
        obj = {'a': 1, 'b': 2}
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_list(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertEqual(result[0], 1)
        self.assertEqual(result[1], 2)
        self.assertEqual(result[2], 3)

    def test_to_namedtuple_tuple(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result[0], 1)
        self.assertEqual(result[1], 2)
        self.assertEqual(result[2], 3)

    def test_to_namedtuple_namedtuple(self):
        obj = namedtuple('Test', ['a', 'b'])(1, 2)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_simplenamespace(self):
        obj = SimpleNamespace(a=1, b=2)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_private_method(self):
        obj = ExampleClass()
        result = obj._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_to_namedtuple_protected_method(self):
        obj = ExampleClass()
        result = obj._protected_method(3)
        self.assertEqual(result, 6)

    def test_to_namedtuple_magic_method(self):
        obj = ExampleClass()
        result = obj.__str__()
        self.assertEqual(result, "ExampleClass")

class TestToNamedtuple(unittest.TestCase):
    def test_list(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_tuple(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_dict(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_ordered_dict(self):
        from collections import OrderedDict
        obj = OrderedDict([('a', 1), ('b', 2), ('c', 3)])
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_namedtuple(self):
        from collections import namedtuple
        MyTuple = namedtuple('MyTuple', ['a', 'b', 'c'])
        obj = MyTuple(1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_simplenamespace(self):
        from types import SimpleNamespace
        obj = SimpleNamespace(a=1, b=2, c=3)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_invalid_type(self):
        with self.assertRaises(TypeError):
            obj = set([1, 2, 3])
            to_namedtuple(obj)

class TestNamedtupleUtils(TestCase):
    def test_to_namedtuple_list(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_tuple(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_dict(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_ordered_dict(self):
        obj = OrderedDict([('a', 1), ('b', 2), ('c', 3)])
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_namedtuple(self):
        obj = namedtuple('Test', ['a', 'b', 'c'])(1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_simple_namespace(self):
        obj = SimpleNamespace(a=1, b=2, c=3)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_str(self):
        obj = 'test'
        result = to_namedtuple(obj)
        self.assertEqual(result, 'test')

if __name__ == '__main__':
    unittest.main()