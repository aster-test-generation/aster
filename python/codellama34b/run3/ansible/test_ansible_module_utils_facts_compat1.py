import unittest
from ansible.module_utils.facts.compat import *

class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = None
        result = get_all_facts(module)
        self.assertEqual(result, None)

    def test_ansible_facts(self):
        module = None
        result = ansible_facts(module)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()