import unittest
from ansible.playbook.attribute import *


class TestAttribute(unittest.TestCase):
    def test_init(self):
        instance = Attribute()
        self.assertEqual(instance.isa, None)
        self.assertEqual(instance.private, False)
        self.assertEqual(instance.default, None)
        self.assertEqual(instance.required, False)
        self.assertEqual(instance.listof, None)
        self.assertEqual(instance.priority, 0)
        self.assertEqual(instance.class_type, None)
        self.assertEqual(instance.always_post_validate, False)
        self.assertEqual(instance.inherit, True)
        self.assertEqual(instance.alias, None)
        self.assertEqual(instance.extend, False)
        self.assertEqual(instance.prepend, False)
        self.assertEqual(instance.static, False)

    def test_eq(self):
        instance = Attribute()
        other = Attribute()
        result = instance.__eq__(other)
        self.assertEqual(result, True)

    def test_ne(self):
        instance = Attribute()
        other = Attribute()
        result = instance.__ne__(other)
        self.assertEqual(result, False)

    def test_lt(self):
        instance = Attribute()
        other = Attribute()
        result = instance.__lt__(other)
        self.assertEqual(result, False)

    def test_gt(self):
        instance = Attribute()
        other = Attribute()
        result = instance.__gt__(other)
        self.assertEqual(result, False)

    def test_le(self):
        instance = Attribute()
        other = Attribute()
        result = instance.__le__(other)
        self.assertEqual(result, True)

    def test_ge(self):
        instance = Attribute()
        other = Attribute()
        result = instance.__ge__(other)
        self.assertEqual(result, True)

class TestFieldAttribute(unittest.TestCase):
    def test_init(self):
        instance = FieldAttribute()
        self.assertEqual(instance.isa, None)
        self.assertEqual(instance.private, False)
        self.assertEqual(instance.default, None)
        self.assertEqual(instance.required, False)
        self.assertEqual(instance.listof, None)
        self.assertEqual(instance.priority, 0)
        self.assertEqual(instance.class_type, None)
        self.assertEqual(instance.always_post_validate, False)
        self.assertEqual(instance.inherit, True)
        self.assertEqual(instance.alias, None)
        self.assertEqual(instance.extend, False)
        self.assertEqual(instance.prepend, False)
        self.assertEqual(instance.static, False)

    def test_eq(self):
        instance = FieldAttribute()
        other = FieldAttribute()
        result = instance.__eq__(other)
        self.assertEqual(result, True)

    def test_ne(self):
        instance = FieldAttribute()
        other = FieldAttribute()
        result = instance.__ne__(other)
        self.assertEqual(result, False)

    def test_lt(self):
        instance = FieldAttribute()
        other = FieldAttribute()
        result = instance.__lt__(other)
        self.assertEqual(result, False)

    def test_gt(self):
        instance = FieldAttribute()
        other = FieldAttribute()
        result = instance.__gt__(other)
        self.assertEqual(result, False)

    def test_le(self):
        instance = FieldAttribute()
        other = FieldAttribute()
        result = instance.__le__(other)
        self.assertEqual(result, True)

    def test_ge(self):
        instance = FieldAttribute()
        other = FieldAttribute()
        result = instance.__ge__(other)
        self.assertEqual(result, True)

if __name__ == '__main__':
    unittest.main()