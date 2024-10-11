import unittest
from ansible.module_utils.common.collections import ImmutableDict


class TestAttribute(unittest.TestCase):
    def test_init(self):
        attr = Attribute(private=True, default=1)
        self.assertTrue(attr.private)
        self.assertEqual(attr.default, 1)

    def test_eq(self):
        attr1 = Attribute(priority=1)
        attr2 = Attribute(priority=2)
        self.assertTrue(attr1 < attr2)
        self.assertTrue(attr2 > attr1)
        self.assertTrue(attr1 <= attr2)
        self.assertTrue(attr2 >= attr1)
        self.assertFalse(attr1 == attr2)
        self.assertFalse(attr2 == attr1)
        self.assertTrue(attr1 != attr2)
        self.assertTrue(attr2 != attr1)

class TestFieldAttribute(unittest.TestCase):
    def test_init(self):
        attr = FieldAttribute(private=True, default=1)
        self.assertTrue(attr.private)
        self.assertEqual(attr.default, 1)

if __name__ == '__main__':
    unittest.main()