import unittest
from ansible.module_utils.common._utils import *

class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        result = get_all_subclasses(object)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()