import unittest
from ansible.module_utils.facts.compat import ansible_facts, get_all_facts
from ansible.module_utils.facts.namespace import PrefixFactNamespace
from ansible.module_utils.facts import default_collectors
from ansible.module_utils.facts import ansible_collector
from ansible.module_utils.facts import ansible_collector, default_collectors


class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts(self):
        module = None  # Replace with the actual module
        gather_subset = ['all']
        gather_timeout = 10
        filter_spec = '*'
        minimal_gather_subset = frozenset(['apparmor', 'caps', 'cmdline', 'date_time',
                                           'distribution', 'dns', 'env', 'fips', 'local',
                                           'lsb', 'pkg_mgr', 'platform', 'python', 'selinux',
                                           'service_mgr', 'ssh_pub_keys', 'user'])
        all_collector_classes = default_collectors.collectors
        namespace = PrefixFactNamespace(namespace_name='ansible', prefix='')
        fact_collector = \
            ansible_collector.get_ansible_collector(all_collector_classes=all_collector_classes,
                                                    namespace=namespace,
                                                    filter_spec=filter_spec,
                                                    gather_subset=gather_subset,
                                                    gather_timeout=gather_timeout,
                                                    minimal_gather_subset=minimal_gather_subset)
        facts_dict = fact_collector.collect(module=module)
        self.assertEqual(facts_dict, {'default_ipv4': '192.168.1.1'})

    def test_get_all_facts(self):
        module = None  # Replace with the actual module
        gather_subset = ['all']
        facts_dict = get_all_facts(module)
        self.assertEqual(facts_dict, {'default_ipv4': '192.168.1.1'})

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