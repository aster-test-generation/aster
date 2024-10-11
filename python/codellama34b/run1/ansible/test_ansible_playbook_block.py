import unittest
from ansible.playbook.block import Block


class TestBlock(unittest.TestCase):
    def test_init(self):
        instance = Block()
        self.assertIsInstance(instance, Block)

    def test_get_parent_attribute(self):
        instance = Block()
        result = instance._get_parent_attribute(attr)
        self.assertEqual(result, None)

    def test_filter_tagged_tasks(self):
        instance = Block()
        result = instance.filter_tagged_tasks(all_vars)
        self.assertEqual(result, None)

    def test_has_tasks(self):
        instance = Block()
        result = instance.has_tasks()
        self.assertEqual(result, False)

    def test_get_include_params(self):
        instance = Block()
        result = instance.get_include_params()
        self.assertEqual(result, {})

    def test_all_parents_static(self):
        instance = Block()
        result = instance.all_parents_static()
        self.assertEqual(result, True)

    def test_get_first_parent_include(self):
        instance = Block()
        result = instance.get_first_parent_include()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()