import unittest
from flutils.namedtupleutils import *


class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple(self):
        obj = AllowedTypes
        result = to_namedtuple(obj)
        self.assertEqual(result, obj)

    def test__to_namedtuple(self):
        obj = Any()
        _started = False
        result = _to_namedtuple(obj, _started)
        self.assertEqual(result, obj)

    def test__to_namedtuple_Mapping(self):
        obj = Mapping
        _started = False
        result = _to_namedtuple(obj, _started)
        self.assertEqual(result, obj)

    def test__to_namedtuple_Sequence(self):
        from collections import Sequence
        _started = False
        result = _to_namedtuple(obj, _started)
        self.assertEqual(result, obj)

    def test__to_namedtuple_SimpleNamespace(self):
        from types import SimpleNamespace
        _started = False
        result = _to_namedtuple(obj, _started)
        self.assertEqual(result, obj)



class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertEqual(result, [])

    def test_to_namedtuple_1(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_2(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_3(self):
        obj = SimpleNamespace()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_4(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertEqual(result, [])

    def test_to_namedtuple_5(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_6(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_7(self):
        obj = SimpleNamespace()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_8(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertEqual(result, [])

    def test_to_namedtuple_9(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_10(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_11(self):
        obj = SimpleNamespace()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_12(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertEqual(result, [])

    def test_to_namedtuple_13(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_14(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_15(self):
        obj = SimpleNamespace()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_16(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertEqual(result, [])

    def test_to_namedtuple_17(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_18(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_19(self):
        obj = SimpleNamespace()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_20(self):
        obj = []
        result = to_namedtuple(obj)
        self.assertEqual(result, [])

    def test_to_namedtuple_21(self):
        obj = ()
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

    def test_to_namedtuple_22(self):
        obj = {}
        result = to_namedtuple(obj)
        self.assertEqual(result, ())

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
        obj = {1, 2, 3}
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