import unittest
from ansible.playbook.block import Block
from ansible.utils.sentinel import Sentinel


class TestBlock(unittest.TestCase):
    def setUp(self):
        self.block = Block()

    def test_init(self):
        block = Block(play='play', parent_block='parent_block', role='role', task_include='task_include', use_handlers=True, implicit=True)
        self.assertEqual(block._play, 'play')
        self.assertEqual(block._role, 'role')
        self.assertEqual(block._parent, 'task_include')
        self.assertTrue(block._use_handlers)
        self.assertTrue(block._implicit)

    def test_get_parent_attribute(self):
        self.block._attributes = {'attr': 'value'}
        self.block._valid_attrs = {'attr': Sentinel}
        result = self.block._get_parent_attribute('attr', default=None)
        self.assertEqual(result, 'value')

    def test_filter_tagged_tasks(self):
        self.block.block = []
        self.block.rescue = []
        self.block.always = []
        result = self.block.filter_tagged_tasks({}, exclude_parent=False)
        self.assertEqual(result.block, [])
        self.assertEqual(result.rescue, [])
        self.assertEqual(result.always, [])

    def test_has_tasks(self):
        self.block.block = []
        self.block.rescue = []
        self.block.always = []
        result = self.block.has_tasks()
        self.assertFalse(result)

    def test_get_include_params(self):
        self.block._parent = None
        result = self.block.get_include_params()
        self.assertEqual(result, {})

    def test_all_parents_static(self):
        self.block._parent = None
        result = self.block.all_parents_static()
        self.assertTrue(result)

    def test_get_first_parent_include(self):
        self.block._parent = None
        result = self.block.get_first_parent_include()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()