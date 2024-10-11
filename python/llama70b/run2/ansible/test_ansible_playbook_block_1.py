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

    def test_repr(self):
        block = Block()
        self.assertEqual(block.__repr__(), 'BLOCK(uuid=None)(id=%s)(parent=None)' % id(block))

    def test_eq(self):
        block1 = Block()
        block2 = Block()
        self.assertNotEqual(block1, block2)

    def test_ne(self):
        block1 = Block()
        block2 = Block()
        self.assertTrue(block1 != block2)

    def test_get_vars(self):
        block = Block()
        self.assertEqual(block.get_vars(), {})

    def test_load(self):
        data = {'block': []}
        block = Block.load(data)
        self.assertIsInstance(block, Block)

    def test_is_block(self):
        self.assertTrue(Block.is_block({'block': []}))
        self.assertFalse(Block.is_block({'foo': 'bar'}))

    def test_preprocess_data(self):
        block = Block()
        data = {'block': []}
        self.assertEqual(block.preprocess_data(data), data)

    def test_load_block(self):
        block = Block()
        data = {'block': []}
        self.assertRaises(AnsibleParserError, block._load_block, 'block', data)

    def test_load_rescue(self):
        block = Block()
        data = {'rescue': []}
        self.assertRaises(AnsibleParserError, block._load_rescue, 'rescue', data)

    def test_load_always(self):
        block = Block()
        data = {'always': []}
        self.assertRaises(AnsibleParserError, block._load_always, 'always', data)

    def test_validate_always(self):
        block = Block()
        self.assertRaises(AnsibleParserError, block._validate_always, 'always', 'always', True)

    def test_get_dep_chain(self):
        block = Block()
        self.assertIsNone(block.get_dep_chain())

    def test_copy(self):
        block = Block()
        new_block = block.copy()
        self.assertIsNot(block, new_block)

    def test_serialize(self):
        block = Block()
        self.assertEqual(block.serialize(), {})

    def test_deserialize(self):
        block = Block()
        data = {'foo': 'bar'}
        block.deserialize(data)
        self.assertEqual(block.foo, 'bar')

    def test_set_loader(self):
        block = Block()
        loader = object()
        block.set_loader(loader)
        self.assertEqual(block._loader, loader)

if __name__ == '__main__':
    unittest.main()