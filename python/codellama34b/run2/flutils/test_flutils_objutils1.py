import unittest
from flutils.objutils import *

class TestHasAnyAttrs(unittest.TestCase):
    def test_has_any_attrs(self):
        result = has_any_attrs(1, 'a', 'b')
        self.assertEqual(result, False)

    def test_has_any_attrs_2(self):
        result = has_any_attrs(1, 'a', 'b', '__class__')
        self.assertEqual(result, True)

class TestHasAnyCallables(unittest.TestCase):
    def test_has_any_callables(self):
        result = has_any_callables(1, 'a', 'b')
        self.assertEqual(result, False)

    def test_has_any_callables_2(self):
        result = has_any_callables(1, 'a', 'b', '__class__')
        self.assertEqual(result, False)

class TestHasAttrs(unittest.TestCase):
    def test_has_attrs(self):
        result = has_attrs(1, 'a', 'b')
        self.assertEqual(result, False)

    def test_has_attrs_2(self):
        result = has_attrs(1, 'a', 'b', '__class__')
        self.assertEqual(result, True)

class TestHasCallables(unittest.TestCase):
    def test_has_callables(self):
        result = has_callables(1, 'a', 'b')
        self.assertEqual(result, False)

    def test_has_callables_2(self):
        result = has_callables(1, 'a', 'b', '__class__')
        self.assertEqual(result, False)

class TestIsListLike(unittest.TestCase):
    def test_is_list_like(self):
        result = is_list_like(1)
        self.assertEqual(result, False)

    def test_is_list_like_2(self):
        result = is_list_like([1, 2, 3])
        self.assertEqual(result, True)

class TestIsSubclassOfAny(unittest.TestCase):
    def test_is_subclass_of_any(self):
        result = is_subclass_of_any(1, 2)
        self.assertEqual(result, False)

    def test_is_subclass_of_any_2(self):
        result = is_subclass_of_any(1, int)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()