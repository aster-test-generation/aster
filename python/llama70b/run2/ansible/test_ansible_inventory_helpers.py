import unittest
from ansible.inventory.helpers import yaml


class TestSortGroupsFunction(unittest.TestCase):
    def test_sort_groups(self):
        groups = [{'depth': 1, 'priority': 2, 'name': 'group1'}, {'depth': 2, 'priority': 1, 'name': 'group2'}]
        result = sort_groups(groups)
        self.assertEqual(result, [{'depth': 1, 'priority': 2, 'name': 'group1'}, {'depth': 2, 'priority': 1, 'name': 'group2'}])

class TestGetGroupVarsFunction(unittest.TestCase):
    def test_get_group_vars(self):
        groups = [{'depth': 1, 'priority': 2, 'name': 'group1', 'vars': {'var1': 'value1'}}, {'depth': 2, 'priority': 1, 'name': 'group2', 'vars': {'var2': 'value2'}}]
        result = get_group_vars(groups)
        self.assertEqual(result, {'var1': 'value1', 'var2': 'value2'})

if __name__ == '__main__':
    unittest.main()