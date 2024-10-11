import unittest
from ansible.module_utils.common.dict_transformations import camel_dict_to_snake_dict


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

    def test_init_with_args(self):
        attr = Attribute(
            isa=str,
            private=True,
            default=1,
            required=True,
            listof=list,
            priority=1,
            class_type=int,
            always_post_validate=True,
            inherit=False,
            alias='alias',
            extend=True,
            prepend=True,
            static=True,
        )
        self.assertEqual(attr.isa, str)
        self.assertTrue(attr.private)
        self.assertEqual(attr.default, 1)
        self.assertTrue(attr.required)
        self.assertEqual(attr.listof, list)
        self.assertEqual(attr.priority, 1)
        self.assertEqual(attr.class_type, int)
        self.assertTrue(attr.always_post_validate)
        self.assertFalse(attr.inherit)
        self.assertEqual(attr.alias, 'alias')
        self.assertTrue(attr.extend)
        self.assertTrue(attr.prepend)
        self.assertTrue(attr.static)

class TestFieldAttribute(unittest.TestCase):
    def test_init(self):
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