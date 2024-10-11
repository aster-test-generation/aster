import unittest
from flutils.namedtupleutils import to_namedtuple


class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple_list(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_tuple(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_dict(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_namedtuple(self):
        obj = namedtuple('NamedTuple', ['a', 'b', 'c'])(1, 2, 3)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, obj.__class__)

    def test_to_namedtuple_simple_namespace(self):
        obj = SimpleNamespace(a=1, b=2, c=3)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_invalid_type(self):
        obj = 'string'
        with self.assertRaises(TypeError):
            to_namedtuple(obj)

    def test_to_namedtuple_empty_list(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_empty_tuple(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_empty_dict(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_empty_namedtuple(self):
        obj = namedtuple('NamedTuple', ['a', 'b', 'c'])(None, None, None)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, obj.__class__)

    def test_to_namedtuple_empty_simple_namespace(self):
        obj = SimpleNamespace(a=None, b=None, c=None)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()