import sys
import unittest
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_py2(self):
        instance = PyInfo()
        result = instance.PY2
        self.assertEqual(result, sys.version_info[0] == 2)

    def test_py3(self):
        instance = PyInfo()
        result = instance.PY3
        self.assertEqual(result, sys.version_info[0] == 3)

    def test_string_types(self):
        instance = PyInfo()
        result = instance.string_types
        self.assertEqual(result, str)

    def test_text_type(self):
        instance = PyInfo()
        result = instance.text_type
        self.assertEqual(result, str)

    def test_binary_type(self):
        instance = PyInfo()
        result = instance.binary_type
        self.assertEqual(result, bytes)

    def test_integer_types(self):
        instance = PyInfo()
        result = instance.integer_types
        self.assertEqual(result, int)

    def test_class_types(self):
        instance = PyInfo()
        result = instance.class_types
        self.assertEqual(result, (type,))

    def test_maxsize(self):
        instance = PyInfo()
        result = instance.maxsize
        self.assertEqual(result, sys.maxsize)

if __name__ == '__main__':
    unittest.main()