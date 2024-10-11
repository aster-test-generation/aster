import unittest
from ansible.module_utils.common._utils import *
from ansible.module_utils.common._utils import get_all_subclasses


class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        cls = None
        result = get_all_subclasses(cls)
        self.assertIsInstance(result, set)

class TestGetAllSubclasses(unittest.TestCase):
    def test_get_all_subclasses(self):
        result = get_all_subclasses(object)
        self.assertIsInstance(result, set)

if __name__ == '__main__':
    unittest.main()