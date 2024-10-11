import unittest
from unittest.mock import MagicMock
from ansible.inventory.helpers import sort_groups, get_group_vars
from ansible.utils.vars import combine_vars


class MockGroup:
    def __init__(self, depth, priority, name, vars):
        self.depth = depth
        self.priority = priority
        self.name = name
        self.vars = vars

    def get_vars(self):
        return self.vars

class TestSortGroups(unittest.TestCase):
    def test_sort_groups(self):
        group1 = MockGroup(1, 10, 'group1', {})
        group2 = MockGroup(2, 5, 'group2', {})
        group3 = MockGroup(1, 5, 'group3', {})
        groups = [group1, group2, group3]
        sorted_groups = sort_groups(groups)
        self.assertEqual(sorted_groups, [group3, group1, group2])

class TestGetGroupVars(unittest.TestCase):
    def test_get_group_vars(self):
        group1 = MockGroup(1, 10, 'group1', {'var1': 'value1'})
        group2 = MockGroup(2, 5, 'group2', {'var2': 'value2'})
        group3 = MockGroup(1, 5, 'group3', {'var3': 'value3'})
        groups = [group1, group2, group3]
        combined_vars = get_group_vars(groups)
        expected_vars = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        self.assertEqual(combined_vars, expected_vars)

if __name__ == '__main__':
    unittest.main()