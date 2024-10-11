import unittest
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts


class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        module = MagicMock()
        module.params = {'gather_subset': ['all']}
        result = get_all_facts(module)
        self.assertEqual(result, {'ansible_default_ipv4': {'address': '127.0.0.1', 'gateway': '127.0.0.1', 'interface': 'lo', 'macaddress': '00:00:00:00:00:00', 'mtu': 65536, 'netmask': '255.0.0.0', 'network': '127.0.0.0', 'type': 'lo'}})

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts(self):
        module = MagicMock()
        module.params = {'gather_subset': ['all']}
        result = ansible_facts(module)
        self.assertEqual(result, {'ansible_default_ipv4': {'address': '127.0.0.1', 'gateway': '127.0.0.1', 'interface': 'lo', 'macaddress': '00:00:00:00:00:00', 'mtu': 65536, 'netmask': '255.0.0.0', 'network': '127.0.0.0', 'type': 'lo'}})

if __name__ == '__main__':
    unittest.main()