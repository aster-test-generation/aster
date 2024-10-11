from youtube_dl.swfinterp import _read_int
import unittest
from youtube_dl.swfinterp import *



class TestUndefined(unittest.TestCase):
    def test_bool(self):
        instance = _Undefined()
        result = instance.__bool__()
        self.assertEqual(result, False)

    def test_hash(self):
        instance = _Undefined()
        result = instance.__hash__()
        self.assertEqual(result, 0)

    def test_str(self):
        instance = _Undefined()
        result = instance.__str__()
        self.assertEqual(result, "undefined")

class TestStringClass(unittest.TestCase):
    def test_init(self):
        instance = StringClass()
        self.assertEqual(instance.name, "(no name idx)")
        self.assertEqual(instance.super_name, "Object")
        self.assertEqual(instance.class_name, "String")

    def test_init_with_name(self):
        instance = StringClass("test")
        self.assertEqual(instance.name, "test")
        self.assertEqual(instance.super_name, "Object")
        self.assertEqual(instance.class_name, "String")

    def test_init_with_super_name(self):
        instance = StringClass(super_name="test")
        self.assertEqual(instance.name, "(no name idx)")
        self.assertEqual(instance.super_name, "test")
        self.assertEqual(instance.class_name, "String")

    def test_init_with_class_name(self):
        instance = StringClass(class_name="test")
        self.assertEqual(instance.name, "(no name idx)")
        self.assertEqual(instance.super_name, "Object")
        self.assertEqual(instance.class_name, "test")

    def test_init_with_name_super_name_class_name(self):
        instance = StringClass("test", "test", "test")
        self.assertEqual(instance.name, "test")
        self.assertEqual(instance.super_name, "test")
        self.assertEqual(instance.class_name, "test")

    def test_get_name(self):
        instance = StringClass()
        result = instance.get_name()
        self.assertEqual(result, "String")

    def test_get_super_name(self):
        instance = StringClass()
        result = instance.get_super_name()
        self.assertEqual(result, "Object")

    def test_get_class_name(self):
        instance = StringClass()
        result = instance.get_class_name()
        self.assertEqual(result, "String")

    def test_get_class_names(self):
        instance = StringClass()
        result = instance.get_class_names()
        self.assertEqual(result, ["String", "Object"])

    def test_get_class_names_with_super_name(self):
        instance = StringClass(super_name="test")
        result = instance.get_class_names()
        self.assertEqual(result, ["String", "test"])

    def test_get_class_names_with_class_name(self):
        instance = StringClass(class_name="test")
        result = instance.get_class_names()
        self.assertEqual(result, ["test", "Object"])

    def test_get_class_names_with_name_super_name_class_name(self):
        instance = StringClass("test", "test", "test")
        result = instance.get_class_names()
        self.assertEqual(result, ["test", "test"])

    def test_get_class_names_with_name_super_name_class_name_2(self):
        instance = StringClass("test", "test", "test")
        result = instance.get_class_names()
        self.assertEqual(result, ["test", "test"])

if __name__ == '__main__':
    unittest.main()