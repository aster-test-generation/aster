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
        block._attributes = {'foo': 'bar'}
        self.assertEqual(block._get_parent_attribute('foo'), 'bar')

    def test_get_parent_attribute_extend(self):
        block = Block()
        block._attributes = {'foo': ['bar']}
        block._valid_attrs = {'foo': FieldAttribute(extend=True)}
        parent_block = Block()
        parent_block._attributes = {'foo': ['baz']}
        block._parent = parent_block
        self.assertEqual(block._get_parent_attribute('foo'), ['bar', 'baz'])

    def test_get_parent_attribute_prepend(self):
        block = Block()
        block._attributes = {'foo': ['bar']}
        block._valid_attrs = {'foo': FieldAttribute(prepend=True)}
        parent_block = Block()
        parent_block._attributes = {'foo': ['baz']}
        block._parent = parent_block
        self.assertEqual(block._get_parent_attribute('foo'), ['baz', 'bar'])

    def test_filter_tagged_tasks(self):
        block = Block()
        task1 = MockTask(action='debug', tags=['tag1'])
        task2 = MockTask(action='debug', tags=['tag2'])
        block.block = [task1, task2]
        all_vars = {}
        filtered_block = block.filter_tagged_tasks(all_vars)
        self.assertEqual(len(filtered_block.block), 2)

    def test_has_tasks(self):
        block = Block()
        self.assertFalse(block.has_tasks())
        block.block = [MockTask(action='debug')]
        self.assertTrue(block.has_tasks())

    def test_get_include_params(self):
        block = Block()
        self.assertEqual(block.get_include_params(), {})
        parent_block = Block()
        parent_block._include_params = {'foo': 'bar'}
        block._parent = parent_block
        self.assertEqual(block.get_include_params(), {'foo': 'bar'})

    def test_all_parents_static(self):
        block = Block()
        self.assertTrue(block.all_parents_static())
        parent_block = MockTaskInclude(statically_loaded=False)
        block._parent = parent_block
        self.assertFalse(block.all_parents_static())

    def test_get_first_parent_include(self):
        block = Block()
        self.assertIsNone(block.get_first_parent_include())
        parent_block = MockTaskInclude()
        block._parent = parent_block
        self.assertEqual(block.get_first_parent_include(), parent_block)

    def test_private_method__extend_value(self):
        block = Block()
        value = ['bar']
        parent_value = ['baz']
        prepend = False
        result = block._Block__extend_value(value, parent_value, prepend)
        self.assertEqual(result, ['bar', 'baz'])

    def test_magic_method__str__(self):
        block = Block()
        self.assertEqual(str(block), 'Block')

    def test_magic_method__repr__(self):
        block = Block()
        self.assertEqual(repr(block), 'Block()')

class MockTask:
    def __init__(self, action, tags=None):
        self.action = action
        self.tags = tags

    def evaluate_tags(self, only_tags, skip_tags, all_vars):
        return True

class MockTaskInclude:
    def __init__(self, statically_loaded=True):
        self.statically_loaded = statically_loaded

if __name__ == '__main__':
    unittest.main()