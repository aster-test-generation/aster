import unittest
from ansible.inventory.helpers import *


class TestSortGroups(unittest.TestCase):
    def test_sort_groups(self):
        groups = [Group('group1', 1, 1), Group('group2', 2, 2), Group('group3', 3, 3)]
        result = sort_groups(groups)
        self.assertEqual(result, [Group('group1', 1, 1), Group('group2', 2, 2), Group('group3', 3, 3)])

class TestGetGroupVars(unittest.TestCase):
    def test_get_group_vars(self):
        groups = [Group('group1', 1, 1), Group('group2', 2, 2), Group('group3', 3, 3)]
        result = get_group_vars(groups)
        self.assertEqual(result, {})

class TestGroup(unittest.TestCase):
    def test_group(self):
        group = Group('group1', 1, 1)
        self.assertEqual(group.name, 'group1')
        self.assertEqual(group.depth, 1)
        self.assertEqual(group.priority, 1)

    def test_get_vars(self):
        group = Group('group1', 1, 1)
        result = group.get_vars()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()