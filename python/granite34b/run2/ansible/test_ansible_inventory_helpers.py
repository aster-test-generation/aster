import unittest
from ansible.inventory.helpers import sort_groups, get_group_vars


class TestInventoryHelpers(unittest.TestCase):
    def test_sort_groups(self):
        groups = [Group1(), Group2(), Group3()]
        sorted_groups = sort_groups(groups)
        self.assertEqual(sorted_groups, [Group3(), Group2(), Group1()])

    def test_get_group_vars(self):
        groups = [Group1, Group2, Group3]
        group_vars = get_group_vars(groups)
        self.assertEqual(group_vars, {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'})

if __name__ == '__main__':
    unittest.main()