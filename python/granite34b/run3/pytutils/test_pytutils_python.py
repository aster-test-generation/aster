import unittest
import sys
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_py2(self):
        self.assertEqual(PyInfo.PY2, sys.version_info[0] == 2)

    def test_py3(self):
        self.assertEqual(PyInfo.PY3, sys.version_info[0] == 3)

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
        if sys.platform.startswith("java"):
            self.assertEqual(PyInfo.maxsize, int((1 << 31) - 1))
        else:
            class X(object):
                def __len__(self):
                    return 1 << 31
            try:
                len(X())
            except OverflowError:
                self.assertEqual(PyInfo.maxsize, int((1 << 31) - 1))
            else:
                self.assertEqual(PyInfo.maxsize, int((1 << 63) - 1))
            del X

if __name__ == '__main__':
    unittest.main()