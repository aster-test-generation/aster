import unittest
from ansible.playbook.attribute import Attribute, FieldAttribute


class TestAttribute(unittest.TestCase):
    def test_init(self):
        attribute = Attribute()
        self.assertIsNone(attribute.isa)
        self.assertFalse(attribute.private)
        self.assertIsNone(attribute.default)
        self.assertFalse(attribute.required)
        self.assertIsNone(attribute.listof)
        self.assertEqual(attribute.priority, 0)
        self.assertIsNone(attribute.class_type)
        self.assertFalse(attribute.always_post_validate)
        self.assertTrue(attribute.inherit)
        self.assertIsNone(attribute.alias)
        self.assertFalse(attribute.extend)
        self.assertFalse(attribute.prepend)
        self.assertFalse(attribute.static)

    def test_eq(self):
        attribute1 = Attribute(priority=1)
        attribute2 = Attribute(priority=1)
        self.assertEqual(attribute1, attribute2)

    def test_ne(self):
        attribute1 = Attribute(priority=1)
        attribute2 = Attribute(priority=2)
        self.assertNotEqual(attribute1, attribute2)

    def test_lt(self):
        attribute1 = Attribute(priority=1)
        attribute2 = Attribute(priority=2)
        self.assertLess(attribute2, attribute1)

    def test_gt(self):
        attribute1 = Attribute(priority=2)
        attribute2 = Attribute(priority=1)
        self.assertGreater(attribute1.value, attribute2.value)

    def test_le(self):
        attribute1 = Attribute(priority=1)
        attribute2 = Attribute(priority=1)
        self.assertLessEqual(attribute1, attribute2)

    def test_ge(self):
        attribute1 = Attribute(priority=1)
        attribute2 = Attribute(priority=1)
        self.assertGreaterEqual(attribute1, attribute2)

class TestFieldAttribute(unittest.TestCase):
    def test_init(self):
        field_attribute = FieldAttribute()
        self.assertIsNone(field_attribute.isa)
        self.assertFalse(field_attribute.private)
        self.assertIsNone(field_attribute.default)
        self.assertFalse(field_attribute.required)
        self.assertIsNone(field_attribute.listof)
        self.assertEqual(field_attribute.priority, 0)
        self.assertIsNone(field_attribute.class_type)
        self.assertFalse(field_attribute.always_post_validate)
        self.assertTrue(field_attribute.inherit)
        self.assertIsNone(field_attribute.alias)
        self.assertFalse(field_attribute.extend)
        self.assertFalse(field_attribute.prepend)
        self.assertFalse(field_attribute.static)

if __name__ == '__main__':
    unittest.main()