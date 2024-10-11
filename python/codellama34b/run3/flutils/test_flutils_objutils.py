import unittest
from flutils.objutils import *



class TestHasAnyAttrs(unittest.TestCase):
    def test_has_any_attrs(self):
        result = has_any_attrs(1, 'a', 'b')
        self.assertEqual(result, False)

    def test_has_any_attrs_2(self):
        result = has_any_attrs(1, 'a', 'b', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_3(self):
        result = has_any_attrs(1, '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_4(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_5(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_6(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_7(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_8(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_9(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_10(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_11(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_12(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

    def test_has_any_attrs_13(self):
        result = has_any_attrs(1, '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__', '__class__')
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()