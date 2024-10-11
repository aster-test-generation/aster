import unittest
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_PY2(self):
        result = PyInfo.PY2
        self.assertIsInstance(result, bool)

    def test_PY3(self):
        result = PyInfo.PY3
        self.assertIsInstance(result, bool)

    def test_string_types(self):
        result = PyInfo.string_types
        self.assertIsInstance(result, tuple)

    def test_text_type(self):
        result = PyInfo.text_type
        self.assertIsInstance(result, type)

    def test_binary_type(self):
        result = PyInfo.binary_type
        self.assertIsInstance(result, type)

    def test_integer_types(self):
        result = PyInfo.integer_types
        self.assertIsInstance(result, tuple)

    def test_class_types(self):
        result = PyInfo.class_types
        self.assertIsInstance(result, tuple)

    def test_maxsize(self):
        result = PyInfo.maxsize
        self.assertIsInstance(result, int)

    def test_init(self):
        instance = PyInfo()
        self.assertIsInstance(instance, PyInfo)

    def test_str_method(self):
        instance = PyInfo()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = PyInfo()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = PyInfo()
        instance2 = PyInfo()
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()