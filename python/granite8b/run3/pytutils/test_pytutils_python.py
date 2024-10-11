import sys
import types
import unittest


class PyInfo(object):
    PY2 = sys.version_info[0] == 2
    PY3 = sys.version_info[0] == 3
    if PY3:
        string_types = str,
        text_type = str
        binary_type = bytes
        integer_types = int,
        class_types = type,
        maxsize = sys.maxsize
    else:  
        string_types = basestring,
        text_type = unicode
        binary_type = str
        integer_types = (int, long)
        class_types = (type, types.ClassType)
        if sys.platform.startswith("java"):
            maxsize = int((1 << 31) - 1)
        else:
            class X(object):
                def __len__(self):
                    return 1 << 31
            try:
                len(X())
            except OverflowError:
                maxsize = int((1 << 31) - 1)
            else:
                maxsize = int((1 << 63) - 1)
            del X

class TestPyInfo(unittest.TestCase):
    def test_py2(self):
        self.assertEqual(PyInfo.PY2, True)

    def test_py3(self):
        self.assertEqual(PyInfo.PY3, False)

    def test_string_types(self):
        self.assertEqual(PyInfo.string_types, (str,))

    def test_text_type(self):
        self.assertEqual(PyInfo.text_type, str)

    def test_binary_type(self):
        self.assertEqual(PyInfo.binary_type, str)

    def test_integer_types(self):
        self.assertEqual(PyInfo.integer_types, (int,))

    def test_class_types(self):
        self.assertEqual(PyInfo.class_types, (type,))

    def test_maxsize(self):
        self.assertEqual(PyInfo.maxsize, 2147483647)

if __name__ == '__main__':
    unittest.main()