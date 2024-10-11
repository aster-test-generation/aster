import unittest
from ansible.module_utils.common.yaml import AnsibleYAMLObject, AnsibleYAMLLoader, AnsibleYAMLDumper


class TestAttribute(unittest.TestCase):
    def test_init(self):
        attr = Attribute()
        self.assertIsNone(attr.isa)
        self.assertFalse(attr.private)
        self.assertIsNone(attr.default)
        self.assertFalse(attr.required)
        self.assertIsNone(attr.listof)
        self.assertEqual(attr.priority, 0)
        self.assertIsNone(attr.class_type)
        self.assertFalse(attr.always_post_validate)
        self.assertTrue(attr.inherit)
        self.assertIsNone(attr.alias)
        self.assertFalse(attr.extend)
        self.assertFalse(attr.prepend)
        self.assertFalse(attr.static)

    def test_eq(self):
        attr1 = Attribute(priority=1)
        attr2 = Attribute(priority=2)
        self.assertTrue(attr1 == attr2)
        self.assertFalse(attr1 != attr2)
        self.assertFalse(attr1 < attr2)
        self.assertTrue(attr1 > attr2)
        self.assertTrue(attr1 <= attr2)
        self.assertFalse(attr1 >= attr2)

    def test_init_field(self):
        attr = FieldAttribute()
        self.assertIsNone(attr.isa)
        self.assertFalse(attr.private)
        self.assertIsNone(attr.default)
        self.assertFalse(attr.required)
        self.assertIsNone(attr.listof)
        self.assertEqual(attr.priority, 0)
        self.assertIsNone(attr.class_type)
        self.assertFalse(attr.always_post_validate)
        self.assertTrue(attr.inherit)
        self.assertIsNone(attr.alias)
        self.assertFalse(attr.extend)
        self.assertFalse(attr.prepend)
        self.assertFalse(attr.static)

if __name__ == '__main__':
    unittest.main()