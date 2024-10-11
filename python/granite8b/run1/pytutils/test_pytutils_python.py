import sys
import unittest
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_py2(self):
        self.assertFalse(PyInfo.PY2)
        self.assertFalse(PyInfo.PY3)

    def test_py3(self):
        self.assertFalse(PyInfo.PY2)
        self.assertTrue(PyInfo.PY3)

    def test_string_types(self):
        self.assertEqual(PyInfo.string_types, (str,))

    def test_text_type(self):
        self.assertEqual(PyInfo.text_type, str)

    def test_binary_type(self):
        self.assertEqual(PyInfo.binary_type, bytes)

    def test_integer_types(self):
        self.assertEqual(PyInfo.integer_types, (int,))

    def test_class_types(self):
        self.assertEqual(PyInfo.class_types, (type,))

    def test_maxsize(self):
        self.assertEqual(PyInfo.maxsize, sys.maxsize)

if __name__ == '__main__':
    unittest.main()