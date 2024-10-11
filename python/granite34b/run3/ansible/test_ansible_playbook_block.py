import unittest
from ansible.playbook.block import Block


class TestBlock(unittest.TestCase):
    def test_get_parent_attribute(self):
        block = Block()
        self.assertEqual(block._get_parent_attribute('attr'), 'value')

    def test_filter_tagged_tasks(self):
        block = Block()
        all_vars = {}
        filtered_block = block.filter_tagged_tasks(all_vars, exclude_parent=True)
        self.assertEqual(filtered_block.has_tasks(), False)

    def test_has_tasks(self):
        block = Block()
        self.assertEqual(block.has_tasks(), True)

    def test_get_include_params(self):
        block = Block()
        self.assertEqual(block.get_include_params(), {})

    def test_all_parents_static(self):
        block = Block()
        self.assertEqual(block.all_parents_static(), True)

    def test_get_first_parent_include(self):
        block = Block()
        self.assertEqual(block.get_first_parent_include(), None)

if __name__ == '__main__':
    unittest.main()