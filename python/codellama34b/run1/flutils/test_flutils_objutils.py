import unittest
from flutils.objutils import *


class TestHasAnyAttrs(unittest.TestCase):
    def test_has_any_attrs(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_any_attrs(obj, *attrs)
        self.assertEqual(result, False)

    def test_has_any_attrs_2(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_any_attrs(obj, *attrs)
        self.assertEqual(result, True)

class TestHasAnyCallables(unittest.TestCase):
    def test_has_any_callables(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_any_callables(obj, *attrs)
        self.assertEqual(result, False)

    def test_has_any_callables_2(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_any_callables(obj, *attrs)
        self.assertEqual(result, True)

class TestHasAttrs(unittest.TestCase):
    def test_has_attrs(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_attrs(obj, *attrs)
        self.assertEqual(result, False)

    def test_has_attrs_2(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_attrs(obj, *attrs)
        self.assertEqual(result, True)

class TestHasCallables(unittest.TestCase):
    def test_has_callables(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_callables(obj, *attrs)
        self.assertEqual(result, False)

    def test_has_callables_2(self):
        obj = Any()
        attrs = ('attr1', 'attr2')
        result = has_callables(obj, *attrs)
        self.assertEqual(result, True)

class TestIsListLike(unittest.TestCase):
    def test_is_list_like(self):
        obj = Any()
        result = is_list_like(obj)
        self.assertEqual(result, False)

    def test_is_list_like_2(self):
        obj = Any()
        result = is_list_like(obj)
        self.assertEqual(result, True)

class TestIsSubclassOfAny(unittest.TestCase):
    def test_is_subclass_of_any(self):
        obj = Any()
        classes = (_Any(), _Any())
        result = is_subclass_of_any(obj, *classes)
        self.assertEqual(result, False)

    def test_is_subclass_of_any_2(self):
        obj = Any()
        classes = (_Any(), _Any())
        result = is_subclass_of_any(obj, *classes)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()