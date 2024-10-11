import unittest
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts
from unittest.mock import Mock


class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = Mock()
        module.params = {'gather_subset': ['all']}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts(self):
        module = Mock()
        module.params = {'gather_subset': ['all'], 'gather_timeout': 10, 'filter': '*'}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()