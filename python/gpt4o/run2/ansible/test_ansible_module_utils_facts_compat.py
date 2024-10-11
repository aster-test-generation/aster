import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts
from ansible.module_utils.facts.namespace import PrefixFactNamespace
from ansible.module_utils.facts import default_collectors, ansible_collector


class TestGetAllFacts(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'gather_subset': ['all'],
            'gather_timeout': 10,
            'filter': '*'
        }

    def test_get_all_facts(self):
        result = get_all_facts(self.module)
        self.assertIsInstance(result, dict)

class TestAnsibleFacts(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'gather_subset': ['all'],
            'gather_timeout': 10,
            'filter': '*'
        }

    def test_ansible_facts(self):
        result = ansible_facts(self.module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_with_gather_subset(self):
        self.module.params['gather_subset'] = ['minimal']
        result = ansible_facts(self.module, gather_subset=['minimal'])
        self.assertIsInstance(result, dict)

    def test_ansible_facts_without_gather_subset(self):
        del self.module.params['gather_subset']
        result = ansible_facts(self.module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_with_custom_timeout(self):
        self.module.params['gather_timeout'] = 20
        result = ansible_facts(self.module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_with_custom_filter(self):
        self.module.params['filter'] = 'custom_filter'
        result = ansible_facts(self.module)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()