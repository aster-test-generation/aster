import unittest
from ansible.playbook.block import Block


class TestBlock(unittest.TestCase):
    def test_init(self):
        block = Block()
        self.assertEqual(block._play, None)
        self.assertEqual(block._role, None)
        self.assertEqual(block._parent, None)
        self.assertEqual(block._dep_chain, None)
        self.assertEqual(block._use_handlers, False)
        self.assertEqual(block._implicit, False)

    def test_repr(self):
        block = Block()
        self.assertEqual(repr(block), 'BLOCK(uuid=06a63712-bf35-0ca6-d587-000000000010)(id=140202906430976)(parent=None)')

    def test_eq(self):
        block1 = Block()
        block2 = Block()
        self.assertEqual(block1, block1)
        self.assertNotEqual(block1, block2)

    def test_ne(self):
        block1 = Block()
        block2 = Block()
        self.assertNotEqual(block1, block2)
        self.assertEqual(block1, block1)

    def test_get_vars(self):
        block = Block()
        self.assertEqual(block.get_vars(), block.vars)

    def test_load(self):
        block = Block.load({'block': []})
        self.assertEqual(block._play, None)
        self.assertEqual(block._role, None)
        self.assertEqual(block._parent, None)
        self.assertEqual(block._dep_chain, None)
        self.assertEqual(block._use_handlers, False)
        self.assertEqual(block._implicit, False)

    def test_is_block(self):
        self.assertFalse(Block.is_block({}))
        self.assertTrue(Block.is_block(dict(block=[])))

    def test_preprocess_data(self):
        block = Block.load({}, None)
        self.assertEqual(block.block, [])
        self.assertEqual(block.rescue, [])
        self.assertEqual(block.always, [])

    def test_load_block(self):
        block = Block.load(dict(block=dict(block=[])))
        self.assertEqual(block.block, [])

    def test_load_rescue(self):
        block = Block.load(dict( rescue=dict(rescue=[])))
        self.assertEqual(block.rescue, [])

    def test_load_always(self):
        block = Block.load(dict(always=list()))
        self.assertEqual(block.always, [])

    def test_validate_always(self):
        block = Block.load(dict(always=list()))
        self.assertEqual(block.always, [])

    def test_get_dep_chain(self):
        block = Block()
        self.assertEqual(block.get_dep_chain(), None)

    def test_copy(self):
        block = Block()
        new_block = block.block.copy()
        self.assertEqual(new_block._play, None)
        self.assertEqual(new_block._role, None)
        self.assertEqual(new_block._parent, None)
        self.assertEqual(new_block._dep_chain, None)
        self.assertEqual(new_block._use_handlers, False)
        self.assertEqual(new_block._implicit, False)

    def test_serialize(self):
        block = Block()
        self.assertEqual(block.serialize(), dict(dep_chain=None, role=None, parent=None))

    def test_deserialize(self):
        block = Block()
        block.deserialize(dict(dep_chain=None, role=None, parent=None))
        self.assertEqual(block._play, None)
        self.assertEqual(block._role, None)
        self.assertEqual(block._parent, None)
        self.assertEqual(block._dep_chain, None)
        self.assertEqual(block._use_handlers, False)
        self.assertEqual(block._implicit, False)

    def test_set_loader(self):
        block = Block()
        block.set_loader(None)
        self.assertEqual(block._loader, None)

if __name__ == '__main__':
    unittest.main()