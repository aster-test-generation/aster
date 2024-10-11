import unittest
from flutils.namedtupleutils import *


class TestToNamedtuple(unittest.TestCase):
    def test_to_namedtuple(self):
        obj = AllowedTypes()
        result = to_namedtuple(obj)
        self.assertEqual(result, None)

    def test__to_namedtuple(self):
        obj = Any
        result = _to_namedtuple(obj)
        self.assertEqual(result, None)

    def test__to_namedtuple_Mapping(self):
        from collections import Mapping
        result = _to_namedtuple(obj)
        self.assertEqual(result, None)

    def test__to_namedtuple_Sequence(self):
        obj = sequence.Sequence()
        result = _to_namedtuple(obj)
        self.assertEqual(result, None)

    def test__to_namedtuple_SimpleNamespace(self):
        from types import SimpleNamespace
        result = _to_namedtuple(obj)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()