import unittest
from ansible.inventory.helpers import sort_groups, get_group_vars


class TestInventoryHelpers(unittest.TestCase):
    def test_sort_groups(self):
        groups = [Group1(), Group2(), Group3()]
        expected_result = [Group1(), Group2(), Group3()]
        result = sort_groups(groups)
        self.assertEqual(result, expected_result)

    def test_get_group_vars(self):
        groups = [Group1(), Group2(), Group3()]
        expected_result = {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'}
        result = get_group_vars(groups)
        self.assertEqual(result, expected_result)

class Group1:
    def __init__(self):
        self.depth = 1
        self.priority = 1
        self.name = 'group1'

    def get_vars(self):
        return {'var1': 'value1'}

class Group2:
    def __init__(self):
        self.depth = 2
        self.priority = 2
        self.name = 'group2'

    def get_vars(self):
        return {'var2': 'value2'}

class Group3:
    def __init__(self):
        self.depth = 3
        self.priority = 3
        self.name = 'group3'

    def get_vars(self):
        return {'var3': 'value3'}

if __name__ == '__main__':
    unittest.main()