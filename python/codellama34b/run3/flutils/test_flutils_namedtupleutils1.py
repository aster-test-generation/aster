
import unittest
from flutils.namedtupleutils import *

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

if __name__ == '__main__':
    unittest.main()