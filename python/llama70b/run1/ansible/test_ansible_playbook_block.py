import unittest
from ansible.playbook import bloc


class TestBlock(unittest.TestCase):
    def test_init(self):
        block = Block()
        self.assertIsNone(block._play)
        self.assertIsNone(block._role)
        self.assertIsNone(block._parent)
        self.assertIsNone(block._dep_chain)
        self.assertFalse(block._use_handlers)
        self.assertFalse(block._implicit)

    def test_get_parent_attribute(self):
        block = Block()
        block._attributes = {'attr': 'value'}
        self.assertEqual(block._get_parent_attribute('attr'), 'value')

    def test_get_parent_attribute_extend(self):
        block = Block()
        block._attributes = {'attr': 'value'}
        block._valid_attrs = {'attr': FieldAttribute(extend=True)}
        parent_block = Block()
        parent_block._attributes = {'attr': 'parent_value'}
        block._parent = parent_block
        self.assertEqual(block._get_parent_attribute('attr'), ['value', 'parent_value'])

    def test_get_parent_attribute_prepend(self):
        block = Block()
        block._attributes = {'attr': 'value'}
        block._valid_attrs = {'attr': FieldAttribute(prepend=True)}
        parent_block = Block()
        parent_block._attributes = {'attr': 'parent_value'}
        block._parent = parent_block
        self.assertEqual(block._get_parent_attribute('attr'), ['parent_value', 'value'])

    def test_filter_tagged_tasks(self):
        block = Block()
        block.block = [1, 2, 3]
        self.assertEqual(block.filter_tagged_tasks({}).block, [1, 2, 3])

    def test_has_tasks(self):
        block = Block()
        block.block = [1, 2, 3]
        self.assertTrue(block.has_tasks())

    def test_get_include_params(self):
        block = Block()
        self.assertEqual(block.get_include_params(), {})

    def test_all_parents_static(self):
        block = Block()
        self.assertTrue(block.all_parents_static())

    def test_get_first_parent_include(self):
        block = Block()
        self.assertIsNone(block.get_first_parent_include())

    def test_private_method__extend_value(self):
        block = Block()
        self.assertEqual(block._Block__extend_value([1, 2], [3, 4], False), [1, 2, 3, 4])

    def test_magic_method__str__(self):
        block = Block()
        self.assertEqual(str(block), "Block")

    def test_magic_method__repr__(self):
        block = Block()
        self.assertEqual(repr(block), "Block()")

if __name__ == '__main__':
    unittest.main()