import unittest
from pytutils.python import PyInfo


class TestPyInfo(unittest.TestCase):
    def test_py2(self):
        result = PyInfo.PY2
        self.assertEqual(result, False)

    def test_py3(self):
        result = PyInfo.PY3
        self.assertEqual(result, True)

    def test_string_types(self):
        result = PyInfo.string_types
        self.assertEqual(result, str)

    def test_text_type(self):
        result = PyInfo.text_type
        self.assertEqual(result, str)

    def test_binary_type(self):
        result = PyInfo.binary_type
        self.assertEqual(result, bytes)

    def test_integer_types(self):
        result = PyInfo.integer_types
        self.assertEqual(result, (int,))

    def test_class_types(self):
        result = PyInfo.class_types
        self.assertEqual(result, (type,))

    def test_maxsize(self):
        result = PyInfo.maxsize
        self.assertEqual(result, 9223372036854775807)

if __name__ == '__main__':
    unittest.main()