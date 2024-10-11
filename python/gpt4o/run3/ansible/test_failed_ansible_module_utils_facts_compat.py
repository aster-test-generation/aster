import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts
from ansible.module_utils.facts.namespace import PrefixFactNamespace
from ansible.module_utils.facts import default_collectors, ansible_collector

class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = MagicMock()
        module.params = {'gather_subset': ['all']}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts_with_gather_subset(self):
        module = MagicMock()
        module.params = {
            'gather_subset': ['all'],
            'gather_timeout': 10,
            'filter': '*'
        }
        result = ansible_facts(module, gather_subset=['all'])
        self.assertIsInstance(result, dict)

    def test_ansible_facts_without_gather_subset(self):
        module = MagicMock()
        module.params = {
            'gather_timeout': 10,
            'filter': '*'
        }
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_with_minimal_gather_subset(self):
        module = MagicMock()
        module.params = {
            'gather_subset': ['minimal'],
            'gather_timeout': 10,
            'filter': '*'
        }
        result = ansible_facts(module, gather_subset=['all'])
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()