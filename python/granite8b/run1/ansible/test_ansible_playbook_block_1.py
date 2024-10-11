from ansible.errors import AnsibleParserError
import unittest
from ansible.playbook.block import Block


class TestBlock(unittest.TestCase):
    def test_get_vars(self):
        block = Block()
        block.vars = {'key': 'value'}
        block._parent = Block()
        block._parent.vars = {'parent_key': 'parent_value'}
        self.assertEqual(block.get_vars(), {'key': 'value', 'parent_key': 'parent_value'})

    def test_load(self):
        block = Block.load({'block': [{'task1': 'value1'}, {'task2': 'value2'}]})
        self.assertEqual(len(block.block), 2)
        self.assertEqual(block.block[0].task, 'task1')
        self.assertEqual(block.block[1].task, 'task2')

    def test_is_block(self):
        self.assertTrue(Block.is_block({'block': []}))
        self.assertFalse(Block.is_block([]))
        self.assertFalse(Block.is_block({}))

    def test_preprocess_data(self):
        block = Block()
        data = {'block': [{'task1': 'value1'}, {'task2': 'value2'}]}
        preprocessed_data = block.preprocess_data(data)
        self.assertEqual(preprocessed_data, data)

    def test__load_block(self):
        block = Block()
        data = [{'task1': 'value1'}, {'task2': 'value2'}]
        loaded_tasks = block._load_block('block', data)
        self.assertEqual(len(loaded_tasks), 2)
        self.assertEqual(loaded_tasks[0].task, 'task1')
        self.assertEqual(loaded_tasks[1].task, 'task2')

    def test__load_rescue(self):
        block = Block()
        data = [{'task1': 'value1'}, {'task2': 'value2'}]
        loaded_tasks = block._load_rescue('rescue', data)
        self.assertEqual(len(loaded_tasks), 2)
        self.assertEqual(loaded_tasks[0].task, 'task1')
        self.assertEqual(loaded_tasks[1].task, 'task2')

    def test__load_always(self):
        block = Block()
        data = [{'task1': 'value1'}, {'task2': 'value2'}]
        loaded_tasks = block._load_always('always', data)
        self.assertEqual(len(loaded_tasks), 2)
        self.assertEqual(loaded_tasks[0].task, 'task1')
        self.assertEqual(loaded_tasks[1].task, 'task2')

    def test__validate_always(self):
        block = Block()
        block.block = []
        with self.assertRaises(AnsibleParserError) as cm:
            block._validate_always('always', 'always', [{'task1': 'value1'}, {'task2': 'value2'}])
        self.assertEqual(str(cm.exception), "'always' keyword cannot be used without 'block'")

    def test_get_dep_chain(self):
        block = Block()
        self.assertIsNone(block.get_dep_chain())
        block._dep_chain = ['task1', 'task2']
        self.assertEqual(block.get_dep_chain(), ['task1', 'task2'])

if __name__ == '__main__':
    unittest.main()