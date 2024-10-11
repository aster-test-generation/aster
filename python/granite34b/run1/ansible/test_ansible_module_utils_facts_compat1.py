import unittest
from ansible.module_utils.facts.compat import ansible_facts, get_all_facts
from ansible.module_utils.facts.namespace import PrefixFactNamespace
from ansible.module_utils.facts import ansible_collector, default_collectors

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts_default(self):
        module = MockModule()
        result = ansible_facts(module)
        self.assertEqual(result, {})

    def test_ansible_facts_subset(self):
        module = MockModule(gather_subset=['all'])
        result = ansible_facts(module)
        self.assertEqual(result, {})

    def test_get_all_facts(self):
        module = MockModule(gather_subset=['all'])
        result = get_all_facts(module)
        self.assertEqual(result, {})

class MockModule:
    def __init__(self, gather_subset=None):
        self.params = {'gather_subset': gather_subset}

if __name__ == '__main__':
    unittest.main()