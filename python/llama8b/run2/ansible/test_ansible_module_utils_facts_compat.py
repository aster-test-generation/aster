import unittest
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts


class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = {'gather_subset': ['all']}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_gather_subset(self):
        module = {'gather_subset': ['apparmor']}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_gather_timeout(self):
        module = {'gather_subset': ['all'], 'gather_timeout': 20}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_filter(self):
        module = {'gather_subset': ['all'], 'filter': 'env'}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

    def test_get_all_facts_minimal_gather_subset(self):
        module = {'gather_subset': ['apparmor'], 'minimal_gather_subset': ['apparmor']}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts(self):
        module = {'gather_subset': ['all']}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_gather_subset(self):
        module = {'gather_subset': ['apparmor']}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_gather_timeout(self):
        module = {'gather_subset': ['all'], 'gather_timeout': 20}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_filter(self):
        module = {'gather_subset': ['all'], 'filter': 'env'}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

    def test_ansible_facts_minimal_gather_subset(self):
        module = {'gather_subset': ['apparmor'], 'minimal_gather_subset': ['apparmor']}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()