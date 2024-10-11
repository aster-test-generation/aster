import unittest
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_PY2(self):
        self.assertIsInstance(PyInfo.PY2, bool)

    def test_PY3(self):
        self.assertIsInstance(PyInfo.PY3, bool)

    def test_string_types(self):
        if PyInfo.PY3:
            self.assertEqual(PyInfo.string_types, (str,))
        else:
            self.assertEqual(PyInfo.string_types, (basestring,))

    def test_text_type(self):
        if PyInfo.PY3:
            self.assertEqual(PyInfo.text_type, str)
        else:
            self.assertEqual(PyInfo.text_type, unicode)

    def test_binary_type(self):
        if PyInfo.PY3:
            self.assertEqual(PyInfo.binary_type, bytes)
        else:
            self.assertEqual(PyInfo.binary_type, str)

    def test_integer_types(self):
        if PyInfo.PY3:
            self.assertEqual(PyInfo.integer_types, (int,))
        else:
            self.assertEqual(PyInfo.integer_types, (int, long))

    def test_class_types(self):
        if PyInfo.PY3:
            self.assertEqual(PyInfo.class_types, (type,))
        else:
            self.assertEqual(PyInfo.class_types, (type, types.ClassType))

    def test_maxsize(self):
        if PyInfo.PY3:
            import sys
        else:
            if sys.platform.startswith("java"):
                self.assertEqual(PyInfo.maxsize, int((1 << 31) - 1))
            else:
                self.assertIn(PyInfo.maxsize, [int((1 << 31) - 1), int((1 << 63) - 1)])

    def test_init(self):
        instance = PyInfo()
        self.assertIsInstance(instance, PyInfo)

    def test_str(self):
        instance = PyInfo()
        result = instance.__str__()
        self.assertEqual(str(result), "PyInfo"

    def test_repr(self):
        instance = PyInfo()
        result = instance.__repr__()
        self.assertEqual(str(result), "PyInfo()"

    def test_eq(self):
        instance1 = PyInfo()
        instance2 = PyInfo()
        self.assertFalse(instance1 == instance2

if __name__ == '__main__':
    unittest.main()