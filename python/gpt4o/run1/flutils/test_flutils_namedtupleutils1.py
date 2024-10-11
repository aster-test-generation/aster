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

    def test__to_namedtuple_with_dict(self):
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

    def test__to_namedtuple_with_namedtuple(self):
        TestNamedTuple = namedtuple('TestNamedTuple', 'a b')
        obj = TestNamedTuple(a=1, b=2)
        result = _to_namedtuple(obj)
        self.assertEqual(result._fields, ('a', 'b'))
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)

    def test__to_namedtuple_with_empty_dict(self):
        obj = {}
        result = _to_namedtuple(obj)
        self.assertEqual(result._fields, ())

    def test__to_namedtuple_with_empty_list(self):
        obj = []
        result = _to_namedtuple(obj)
        self.assertEqual(result, ())

    def test__to_namedtuple_with_empty_tuple(self):
        obj = ()
        result = _to_namedtuple(obj)
        self.assertEqual(result, ())

    def test__to_namedtuple_with_empty_simple_namespace(self):
        obj = SimpleNamespace()
        result = _to_namedtuple(obj)
        self.assertEqual(result._fields, ())

if __name__ == '__main__':
    unittest.main()