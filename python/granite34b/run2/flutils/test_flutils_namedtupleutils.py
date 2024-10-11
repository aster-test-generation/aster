import unittest
from flutils.namedtupleutils import to_namedtuple


class TestNamedtupleUtils(unittest.TestCase):
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
        from collections import OrderedDict
        obj = OrderedDict([('a', 1), ('b', 2), ('c', 3)])
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_namedtuple(self):
        from collections import namedtuple
        MyTuple = namedtuple('MyTuple', ['a', 'b', 'c'])
        obj = MyTuple(1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_simplenamespace(self):
        from types import SimpleNamespace
        obj = SimpleNamespace(a=1, b=2, c=3)
        result = to_namedtuple(obj)
        self.assertEqual(result.a, 1)
        self.assertEqual(result.b, 2)
        self.assertEqual(result.c, 3)

    def test_to_namedtuple_invalid_type(self):
        with self.assertRaises(TypeError):
            obj = set([1, 2, 3])
            to_namedtuple(obj)

if __name__ == '__main__':
    unittest.main()