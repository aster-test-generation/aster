import unittest
from flutils.namedtupleutils import to_namedtuple


class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple_mapping(self):
        obj = {'a': 1, 'b': 2}
        expected = to_namedtuple(obj)
        self.assertEqual(expected.a, 1)
        self.assertEqual(expected.b, 2)

    def test_to_namedtuple_sequence(self):
        obj = [1, 2, 3]
        expected = to_namedtuple(obj)
        self.assertEqual(expected[0], 1)
        self.assertEqual(expected[1], 2)
        self.assertEqual(expected[2], 3)

    def test_to_namedtuple_simple_namespace(self):
        obj = type('SimpleNamespace', (object,), {'a': 1, 'b': 2})()
        expected = to_namedtuple(obj)
        self.assertEqual(expected.a, 1)
        self.assertEqual(expected.b, 2)

    def test_to_namedtuple_namedtuple(self):
        obj = type('NamedTuple', (object,), {'a': 1, 'b': 2})()
        expected = to_namedtuple(obj)
        self.assertEqual(expected.a, 1)
        self.assertEqual(expected.b, 2)

    def test_to_namedtuple_str(self):
        obj = 'abc'
        expected = to_namedtuple(obj)
        self.assertEqual(expected, 'abc')

    def test_to_namedtuple_private_method(self):
        obj = {'a': 1, 'b': 2}
        expected = to_namedtuple(obj)
        self.assertEqual(expected.started, False)

if __name__ == '__main__':
    unittest.main()