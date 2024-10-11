import unittest
from flutils.namedtupleutils import to_namedtuple, _to_namedtuple, _AllowedTypes


class TestToNamedtupleFunction(unittest.TestCase):
    def test_to_namedtuple_list(self):
        result = to_namedtuple([1, 2, 3])
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_tuple(self):
        result = to_namedtuple((1, 2, 3))
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_dict(self):
        result = to_namedtuple({'a': 1, 'b': 2, 'c': 3})
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_namedtuple(self):
        result = to_namedtuple(namedtuple('Test', ['a', 'b', 'c'])(1, 2, 3))
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_simple_namespace(self):
        result = to_namedtuple(SimpleNamespace(a=1, b=2, c=3))
        self.assertIsInstance(result, tuple)

class TestToNamedtuplePrivateMethods(unittest.TestCase):
    def test__to_namedtuple_any(self):
        result = _to_namedtuple(1, _started=True)
        self.assertEqual(result, 1)

    def test__to_namedtuple_mapping(self):
        result = _to_namedtuple({'a': 1, 'b': 2, 'c': 3}, _started=True)
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_sequence(self):
        result = _to_namedtuple([1, 2, 3], _started=True)
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_simple_namespace(self):
        result = _to_namedtuple(SimpleNamespace(a=1, b=2, c=3), _started=True)
        self.assertIsInstance(result, tuple)

class TestAllowedTypes(unittest.TestCase):
    def test_allowed_types(self):
        self.assertIsInstance(_AllowedTypes, type)

if __name__ == '__main__':
    unittest.main()