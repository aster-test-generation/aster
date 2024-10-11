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
        self.assertEqual(repr(block), 'BLOCK(uuid=06a63712-bf35-834b-8056-00000000000e)(id=140244837156272)(parent=None)')

    def test_eq(self):
        block1 = Block()
        block2 = Block()
        self.assertEqual(block1, block1)
        self.assertNotEqual(block1, block2)

    def test_get_vars(self):
        block = Block()
        self.assertEqual(block.get_vars(), {})

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
        self.assertTrue(Block.is_block(dict(rescue=[])))
        self.assertTrue(Block.is_block(dict(always=[])))

    def test_preprocess_data(self):
        block = Block()
        self.assertEqual(block.preprocess_data({}), {'block': [{}]})
        self.assertEqual(block.preprocess_data([]), dict(block=[]))

    def test_load_block(self):
        block = Block()
        self.assertEqual(block._load_block('block', []), [])

    def test_load_rescue(self):
        block = Block()
        self.assertEqual(block._load_rescue('rescue', []), [])

    def test_load_always(self):
        block = Block()
        self.assertEqual(block._load_always('always', []), [])

    def test_validate_always(self):
        block = Block()
        block._validate_always('always', 'always', [])

    def test_get_dep_chain(self):
        block = Block()
        self.assertEqual(block.get_dep_chain(), None)

    def test_copy(self):
        block = Block()
        self.assertEqual(block.copy().block, block.block)

    def test_serialize(self):
        block = Block()
        self.assertEqual(block.serialize(), {'name': '', 'connection': None, 'port': None})

    def test_deserialize(self):
        block = Block()
        block.deserialize({})
        self.assertEqual(block._play, None)
        self.assertEqual(block._role, None)
        self.assertEqual(block._parent, None)
        self.assertEqual(block._dep_chain, None)
        self.assertEqual(block._use_handlers, False)
        self.assertEqual(block._implicit, False)

    def test_set_loader(self):
        block = Block()
        block.set_loader(None)

if __name__ == '__main__':
    unittest.main()