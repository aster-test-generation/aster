import unittest
from flutils.namedtupleutils import to_namedtuple, _to_namedtuple, _AllowedTypes


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
        obj = namedtuple('Test', 'a b c')(1, 2, 3)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_simplenamespace(self):
        obj = SimpleNamespace(a=1, b=2, c=3)
        result = to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_invalid_type(self):
        obj = 'invalid type'
        with self.assertRaises(TypeError):
            to_namedtuple(obj)

class Test_ToNamedtuple(unittest.TestCase):
    def test__to_namedtuple_mapping(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = _to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_sequence(self):
        obj = [1, 2, 3]
        result = _to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_simplenamespace(self):
        obj = SimpleNamespace(a=1, b=2, c=3)
        result = _to_namedtuple(obj)
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_invalid_type(self):
        obj = 'invalid type'
        with self.assertRaises(TypeError):
            _to_namedtuple(obj)

    def test__to_namedtuple_started_false(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        with self.assertRaises(TypeError):
            _to_namedtuple(obj, _started=False)

class Test_AllowedTypes(unittest.TestCase):
    def test_AllowedTypes(self):
        self.assertIsInstance(_AllowedTypes, type)

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
        result = to_namedtuple(namedtuple('Test', 'a b c')(1, 2, 3))
        self.assertIsInstance(result, tuple)

    def test_to_namedtuple_simplenamespace(self):
        result = to_namedtuple(SimpleNamespace(a=1, b=2, c=3))
        self.assertIsInstance(result, tuple)

class Test_ToNamedtupleFunction(unittest.TestCase):
    def test__to_namedtuple_any(self):
        with self.assertRaises(TypeError):
            _to_namedtuple(123)

    def test__to_namedtuple_mapping(self):
        result = _to_namedtuple({'a': 1, 'b': 2, 'c': 3})
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_sequence(self):
        result = _to_namedtuple([1, 2, 3])
        self.assertIsInstance(result, tuple)

    def test__to_namedtuple_simplenamespace(self):
        result = _to_namedtuple(SimpleNamespace(a=1, b=2, c=3))
        self.assertIsInstance(result, tuple)

if __name__ == '__main__':
    unittest.main()