import unittest
from ansible.playbook.block import Block


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
        block._parent = object()
        block._role = object()
        block._play = object()
        block._dep_chain = [object(), object()]
        self.assertEqual(block._get_parent_attribute('attr'), block._attributes.get('attr'))
        self.assertEqual(block._get_parent_attribute('attr', extend=True), block._attributes['attr'])
        self.assertEqual(block._get_parent_attribute('attr', extend=True, prepend=True), block._attributes['attr'])
        self.assertEqual(block._get_parent_attribute('attr', extend=False), block._attributes['attr'])
        self.assertEqual(block._get_parent_attribute('attr', extend=False, prepend=True), block._attributes['attr'])

    def test_filter_tagged_tasks(self):
        block = Block()
        block.block = [object(), object(), object()]
        block.rescue = [object(), object(), object()]
        block.always = [object(), object(), object()]
        self.assertEqual(block.filter_tagged_tasks(object()).block, [object(), object()])
        self.assertEqual(block.filter_tagged_tasks(object()).rescue, [object(), object(), object()])
        self.assertEqual(block.filter_tagged_tasks(object()).always, [object(), object(), object()])

    def test_has_tasks(self):
        block = Block()
        self.assertFalse(block.has_block())
        block.block = [object()]
        self.assertTrue(block.has_tasks())
        block.rescue = [object()]
        self.assertTrue(block.has_tasks())
        block.always = [object()]
        self.assertTrue(block.has_tasks())

    def test_get_include_params(self):
        block = Block()
        self.assertEqual(block.get_include_params(), {})
        block._parent = object()
        self.assertEqual(block.get_include_params(), {'a': 1, 'b': 2})

    def test_all_parents_static(self):
        block = Block()
        self.assertTrue(block.all_parents_static())
        block._parent = object()
        self.assertTrue(block.all_parents_static)
        block._parent = object()
        self.assertTrue(block.all_parents_static())

    def test_get_first_parent_include(self):
        block = Block()
        self.assertIsNone(block.get_first_parent_include())
        block._parent = object()
        self.assertIsNone(block.get_first_parent_include())
        block._parent = object()
        self.assertIsNone(block.get_first_parent_include())

if __name__ == '__main__':
    unittest.main()