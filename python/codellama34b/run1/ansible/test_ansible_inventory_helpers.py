import unittest
from ansible.inventory.helpers import *


class TestSortGroups(unittest.TestCase):
    def test_sort_groups(self):
        groups = []
        result = sort_groups(groups)
        self.assertEqual(result, [])

class TestGetGroupVars(unittest.TestCase):
    def test_get_group_vars(self):
        groups = []
        result = get_group_vars(groups)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()