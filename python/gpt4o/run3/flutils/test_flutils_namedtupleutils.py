import unittest
from collections import OrderedDict
from types import SimpleNamespace
from flutils.namedtupleutils import to_namedtuple, _to_namedtuple


class TestToNamedTuple(unittest.TestCase):
    def test_to_namedtuple_with_list(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_with_tuple(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_with_dict(self):
        obj = {'a': 1, 'b': 2}
        result = to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_with_ordered_dict(self):
        obj = OrderedDict([('a', 1), ('b', 2)])
        result = to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_with_simple_namespace(self):
        obj = SimpleNamespace(a=1, b=2)
        result = to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_with_invalid_type(self):
        with self.assertRaises(TypeError):
            to_namedtuple(123)

class TestToNamedTuplePrivateMethods(unittest.TestCase):
    def test__to_namedtuple_with_invalid_type(self):
        with self.assertRaises(TypeError):
            _to_namedtuple(123)

    def test__to_namedtuple_with_mapping(self):
        obj = {'a': 1, 'b': 2}
        result = _to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test__to_namedtuple_with_sequence(self):
        obj = [1, 2, 3]
        result = _to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test__to_namedtuple_with_simple_namespace(self):
        obj = SimpleNamespace(a=1, b=2)
        result = _to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

class TestToNamedTuple(unittest.TestCase):
    def test_to_namedtuple_with_list(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_with_tuple(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_with_dict(self):
        obj = {'a': 1, 'b': 2}
        result = to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_with_ordered_dict(self):
        obj = OrderedDict([('a', 1), ('b', 2)])
        result = to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_with_simple_namespace(self):
        obj = SimpleNamespace(a=1, b=2)
        result = to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test_to_namedtuple_with_invalid_type(self):
        with self.assertRaises(TypeError):
            to_namedtuple(123)

    def test_to_namedtuple_with_string(self):
        with self.assertRaises(TypeError):
            to_namedtuple("string")

class TestToNamedTuplePrivateMethods(unittest.TestCase):
    def test__to_namedtuple_with_list(self):
        obj = [1, 2, 3]
        result = _to_namedtuple(obj, _started=True)
        self.assertEqual(result, [1, 2, 3])

    def test__to_namedtuple_with_tuple(self):
        obj = (1, 2, 3)
        result = _to_namedtuple(obj, _started=True)
        self.assertEqual(result, (1, 2, 3))

    def test__to_namedtuple_with_dict(self):
        obj = {'a': 1, 'b': 2}
        result = _to_namedtuple(obj, _started=True)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test__to_namedtuple_with_ordered_dict(self):
        obj = OrderedDict([('a', 1), ('b', 2)])
        result = _to_namedtuple(obj, _started=True)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test__to_namedtuple_with_simple_namespace(self):
        obj = SimpleNamespace(a=1, b=2)
        result = _to_namedtuple(obj, _started=True)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test__to_namedtuple_with_invalid_type(self):
        with self.assertRaises(TypeError):
            _to_namedtuple(123)

    def test__to_namedtuple_with_string(self):
        with self.assertRaises(TypeError):
            _to_namedtuple("string")

if __name__ == '__main__':
    unittest.main()