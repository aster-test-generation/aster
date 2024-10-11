from ansible.errors import AnsibleParserError
import unittest
from ansible.playbook.block import Block


class TestBlock(unittest.TestCase):
    def test_get_vars(self):
        block = Block()
        block.vars = {'var1': 'value1', 'var2': 'value2'}
        block._parent = Block()
        block._parent.vars = {'var3': 'value3'}
        self.assertEqual(block.get_vars(), {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'})

    def test_load(self):
        block = Block.load({'block': [{'task1': 'value1'}, {'task2': 'value2'}]})
        self.assertEqual(len(block.block), 2)
        self.assertEqual(block.block[0].task, 'task1')
        self.assertEqual(block.block[1].task, 'task2')

    def test_is_block(self):
        self.assertTrue(Block.is_block({'block': []}))
        self.assertTrue(Block.is_block({'rescue': []}))
        self.assertTrue(Block.is_block({'always': []}))
        self.assertFalse(Block.is_block([]))
        self.assertFalse(Block.is_block({}))
        self.assertFalse(Block.is_block(''))
        self.assertFalse(Block.is_block(None))

    def test_preprocess_data(self):
        block = Block()
        self.assertEqual(block.preprocess_data({'block': []}), {'block': []})
        self.assertEqual(block.preprocess_data([]), {'block': []})
        self.assertEqual(block.preprocess_data({}), {'block': []})
        self.assertEqual(block.preprocess_data(''), {'block': []})
        self.assertEqual(block.preprocess_data(None), {'block': []})

    def test__load_block(self):
        block = Block()
        self.assertEqual(len(block._load_block('block', [{'task1': 'value1'}])), 1)
        self.assertEqual(block._load_block('block', [{'task1': 'value1'}])[0].task, 'task1')

    def test__load_rescue(self):
        block = Block()
        self.assertEqual(len(block._load_rescue('rescue', [{'task1': 'value1'}])), 1)
        self.assertEqual(block._load_rescue('rescue', [{'task1': 'value1'}])[0].task, 'task1')

    def test__load_always(self):
        block = Block()
        self.assertEqual(len(block._load_always('always', [{'task1': 'value1'}])), 1)
        self.assertEqual(block._load_always('always', [{'task1': 'value1'}])[0].task, 'task1')

    def test__validate_always(self):
        block = Block()
        block.block = []
        with self.assertRaises(AnsibleParserError):
            block._validate_always('always', 'always', [{'task1': 'value1'}])

    def test_get_dep_chain(self):
        block = Block()
        self.assertIsNone(block.get_dep_chain())
        block._dep_chain = [1, 2, 3]
        self.assertEqual(block.get_dep_chain(), [1, 2, 3])

if __name__ == '__main__':
    unittest.main()