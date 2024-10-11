import sys
import unittest
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_PY2(self):
        self.assertFalse(not PyInfo.PY2
        self.assertFalse(PyInfo.PY3)

    def test_PY3(self):
        self.assertFalse(PyInfo.PY2)
        self.assertTrue(PyInfo.PY3)

    def test_string_types(self):
        self.assertEqual(PyInfo.string_types, (str,))
        self.assertEqual(PyInfo.text_type, str)
        self.assertEqual(PyInfo.binary_type, bytes)

    def test_integer_types(self):
        self.assertEqual(PyInfo.integer_types, (int,))
        self.assertEqual(PyInfo.class_types, (type,))

    def test_maxsize(self):
        if PyInfo.PY3:
            self.assertEqual(PyInfo.maxsize, sys.maxsize)
        else:
            self.assertEqual(PyInfo.maxsize, int((1 << 31) - 1))

    def test__init__(self):
        instance = PyInfo()
        self.assertEqual(instance.PY2, sys.version_info[0] == 2)
        self.assertEqual(instance.PY3, sys.version_info[0] == 3)

    def test__str__(self):
        instance = PyInfo()
        self.assertEqual(instance.__str__(), str(instance)

    def test__repr__(self):
        instance = PyInfo()
        self.assertEqual(str(instance), "PyInfo()"

    def test__eq__(self):
        instance1 = PyInfo()
        instance2 = PyInfo()
        self.assertEqual(instance1.get_info(), instance2.get_info()

if __name__ == '__main__':
    unittest.main()