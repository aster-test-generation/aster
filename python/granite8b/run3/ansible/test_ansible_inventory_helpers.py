import unittest
from ansible.inventory.helpers import sort_groups, get_group_vars


class TestSortGroups(unittest.TestCase):
    def test_sort_groups(self):
        groups = [Group(name='group1', depth=1, priority=1), Group(name='group2', depth=2, priority=2), Group(name='group3', depth=1, priority=2)]
        sorted_groups = sort_groups(groups)
        self.assertEqual([g.name for g in sorted_groups], ['group3', 'group1', 'group2'])

class TestGetGroupVars(unittest.TestCase):
    def test_get_group_vars(self):
        groups = [Group(name='group1', vars={'var1': 'value1'}), Group(name='group2', vars={'var2': 'value2'})]
        group_vars = get_group_vars(groups)
        self.assertEqual(group_vars, {'var1': 'value1', 'var2': 'value2'})

if __name__ == '__main__':
    unittest.main()