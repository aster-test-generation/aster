import ansible.playbook.play
import unittest


class TestBlock(unittest.TestCase):
    def test_get_parent_attribute(self):
        block = ansible.playbook.block.Block()
        self.assertEqual(block._get_parent_attribute('attr'), None)

    def test_filter_tagged_tasks(self):
        block = ansible.playbook.block.Block()
        self.assertEqual(block.filter_tagged_tasks({}), [])

    def test_has_tasks(self):
        block = ansible.playbook.block.Block()
        self.assertFalse(block.has_tasks())

    def test_get_include_params(self):
        block = ansible.playbook.block.Block()
        self.assertEqual(block.get_include_params(), {})

    def test_all_parents_static(self):
        block = ansible.playbook.block.Block()
        self.assertTrue(block.all_parents_static())

    def test_get_first_parent_include(self):
        block = ansible.playbook.block.Block()
        self.assertEqual(block.get_first_parent_include(), None)

if __name__ == '__main__':
    unittest.main()