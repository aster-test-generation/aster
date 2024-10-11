import unittest
from ansible.inventory.helpers import sort_groups, get_group_vars


class TestAnsibleInventoryHelpers(unittest.TestCase):
    def test_sort_groups(self):
        groups = [{'name': 'group1', 'depth': 1, 'priority': 1}, 
                  {'name': 'group2', 'depth': 2, 'priority': 2}, 
                  {'name': 'group3', 'depth': 1, 'priority': 3}]
        result = sort_groups(groups)
        self.assertEqual(result, [{'name': 'group1', 'depth': 1, 'priority': 1}, 
                                  {'name': 'group3', 'depth': 1, 'priority': 3}, 
                                  {'name': 'group2', 'depth': 2, 'priority': 2}])

    def test_get_group_vars(self):
        groups = [{'name': 'group1', 'vars': {'var1': 'value1'}}, 
                  {'name': 'group2', 'vars': {'var2': 'value2'}}, 
                  {'name': 'group3', 'vars': {'var3': 'value3'}}]
        result = get_group_vars(groups)
        self.assertEqual(result, {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'})

if __name__ == '__main__':
    unittest.main()