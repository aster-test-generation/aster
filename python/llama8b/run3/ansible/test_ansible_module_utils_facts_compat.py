import unittest
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts


class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = {'params': {'gather_subset': ['all']}}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_gather_subset(self):
        module = {'params': {'gather_subset': ['apparmor', 'caps']}}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_gather_timeout(self):
        module = {'params': {'gather_subset': ['all'], 'gather_timeout': 20}}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_filter(self):
        module = {'params': {'gather_subset': ['all'], 'filter': 'lsb'}}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts(self):
        module = {'params': {'gather_subset': ['all']}}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_gather_subset(self):
        module = {'params': {'gather_subset': ['apparmor', 'caps']}}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_gather_timeout(self):
        module = {'params': {'gather_subset': ['all'], 'gather_timeout': 20}}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_filter(self):
        module = {'params': {'gather_subset': ['all'], 'filter': 'lsb'}}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()