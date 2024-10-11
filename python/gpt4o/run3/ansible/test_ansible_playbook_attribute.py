import unittest
from ansible.playbook.attribute import Attribute, FieldAttribute


class TestAttribute(unittest.TestCase):
    def test_init(self):
        attr = Attribute(isa='list', private=True, default=lambda: [], required=True, listof=int, priority=1, class_type=str, always_post_validate=True, inherit=False, alias='test', extend=True, prepend=False, static=True)
        self.assertEqual(attr.isa, 'list')
        self.assertTrue(attr.private)
        self.assertTrue(callable(attr.default))
        self.assertTrue(attr.required)
        self.assertEqual(attr.listof, int)
        self.assertEqual(attr.priority, 1)
        self.assertEqual(attr.class_type, str)
        self.assertTrue(attr.always_post_validate)
        self.assertFalse(attr.inherit)
        self.assertEqual(attr.alias, 'test')
        self.assertTrue(attr.extend)
        self.assertFalse(attr.prepend)
        self.assertTrue(attr.static)

    def test_init_with_mutable_default(self):
        with self.assertRaises(TypeError):
            Attribute(isa='list', default=[])

    def test_eq(self):
        attr1 = Attribute(priority=1)
        attr2 = Attribute(priority=1)
        self.assertTrue(attr1 == attr2)

    def test_ne(self):
        attr1 = Attribute(priority=1)
        attr2 = Attribute(priority=2)
        self.assertTrue(attr1 != attr2)

    def test_lt(self):
        attr1 = Attribute(priority=1)
        attr2 = Attribute(priority=2)
        self.assertTrue(attr1 > attr2)

    def test_gt(self):
        attr1 = Attribute(priority=2)
        attr2 = Attribute(priority=1)
        self.assertTrue(attr1 < attr2)

    def test_le(self):
        attr1 = Attribute(priority=1)
        attr2 = Attribute(priority=2)
        self.assertTrue(attr1 <= attr2)
        attr3 = Attribute(priority=1)
        self.assertTrue(attr1 <= attr3)

    def test_ge(self):
        attr1 = Attribute(priority=2)
        attr2 = Attribute(priority=1)
        self.assertTrue(attr1 >= attr2)
        attr3 = Attribute(priority=2)
        self.assertTrue(attr1 >= attr3)

class TestFieldAttribute(unittest.TestCase):
    def test_field_attribute_inheritance(self):
        field_attr = FieldAttribute(priority=1)
        self.assertEqual(field_attr.priority, 1)

if __name__ == '__main__':
    unittest.main()