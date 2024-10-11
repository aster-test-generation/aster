import unittest
from ansible.playbook.block import Block


class TestBlock(unittest.TestCase):
    def setUp(self):
        self.block = Block()

    def test_get_parent_attribute(self):
        self.assertEqual(self.block._get_parent_attribute('attr'), 'value')

    def test_filter_tagged_tasks(self):
        all_vars = {}
        filtered_block = self.block.filter_tagged_tasks(all_vars, exclude_parent=True)
        self.assertEqual(filtered_block.has_tasks(), False)

    def test_has_tasks(self):
        self.assertEqual(self.block.has_tasks(), True)

    def test_get_include_params(self):
        self.assertEqual(self.block.get_include_params(), {})

    def test_all_parents_static(self):
        self.assertEqual(self.block.all_parents_static(), True)

    def test_get_first_parent_include(self):
        self.assertEqual(self.block.get_first_parent_include(), None)

if __name__ == '__main__':
    unittest.main()