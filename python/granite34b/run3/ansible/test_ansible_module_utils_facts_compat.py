import unittest
from ansible.module_utils.facts.compat import ansible_facts, get_all_facts
from ansible.module_utils.facts.namespace import PrefixFactNamespace
from ansible.module_utils.facts import ansible_collector, default_collectors


class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts_with_gather_subset(self):
        module = MockModule()
        module.params = {'gather_subset': ['all'], 'gather_timeout': 10, 'filter': '*'}
        result = ansible_facts(module, gather_subset=['all'])
        self.assertEqual(result, {'selinux_python_present': True, 'selinux': True})

    def test_ansible_facts_without_gather_subset(self):
        module = MockModule()
        module.params = {'gather_subset': ['all'], 'gather_timeout': 10, 'filter': '*'}
        result = ansible_facts(module)
        self.assertEqual(result, {'selinux_python_present': True, 'selinux': True})

    def test_get_all_facts(self):
        module = MockModule()
        module.params = {'gather_subset': ['all'], 'gather_timeout': 10, 'filter': '*'}
        result = get_all_facts(module)
        self.assertEqual(result, {'selinux_python_present': True, 'selinux': True})

class MockModule:
    def __init__(self):
        self.params = {}

if __name__ == '__main__':
    unittest.main()