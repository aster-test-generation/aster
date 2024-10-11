import unittest
from flutils.namedtupleutils import to_namedtuple


class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple_list(self):
        result = to_namedtuple([1, 2, 3])
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_dict(self):
        result = to_namedtuple({'a': 1, 'b': 2, 'c': 3})
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_namedtuple(self):
        result = to_namedtuple(namedtuple('NamedTuple', ['a', 'b', 'c'])('1', '2', '3'))
        self.assertIsInstance(result, namedtuple)

    def test_to_namedtuple_simple_namespace(self):
        result = to_namedtuple(SimpleNamespace(a=1, b=2, c=3))
        self.assertIsInstance(result, namedtuple)

    def test_to_namedtuple_sequence(self):
        result = to_namedtuple((1, 2, 3))
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_invalid_type(self):
        with self.assertRaises(TypeError):
            to_namedtuple('string')

    def test_to_namedtuple_empty_list(self):
        result = to_namedtuple([])
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_empty_dict(self):
        result = to_namedtuple({})
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_empty_namedtuple(self):
        result = to_namedtuple(namedtuple('NamedTuple', 'a b c')())
        self.assertIsInstance(result, namedtuple)

    def test_to_namedtuple_empty_simple_namespace(self):
        result = to_namedtuple(SimpleNamespace())
        self.assertIsInstance(result, namedtuple)

    def test_to_namedtuple_empty_sequence(self):
        result = to_namedtuple(())
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()