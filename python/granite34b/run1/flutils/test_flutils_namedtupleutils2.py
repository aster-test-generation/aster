from unittest import TestCase
from flutils.namedtupleutils import to_namedtuple

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