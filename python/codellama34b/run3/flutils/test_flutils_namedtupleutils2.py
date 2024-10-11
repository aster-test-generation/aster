
import unittest
from flutils.namedtupleutils import *

class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple(self):
        obj = [1, 2, 3]
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_1(self):
        obj = (1, 2, 3)
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_2(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_3(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_4(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_5(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_6(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_7(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_8(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_9(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_10(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_11(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_12(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_13(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

    def test_to_namedtuple_14(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        result = to_namedtuple(obj)
        self.assertEqual(result, (1, 2, 3))

if __name__ == '__main__':
    unittest.main()