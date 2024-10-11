import unittest
from ansible.module_utils.facts.compat import get_all_facts, ansible_facts, PrefixFactNamespace, default_collectors, ansible_collector


class TestGetAllFacts(unittest.TestCase):
    def test_get_all_facts(self):
        # mock module instance
        module = {'params': {'gather_subset': ['all']}}
        result = get_all_facts(module)
        self.assertIsInstance(result, dict)

class TestAnsibleFacts(unittest.TestCase):
    def test_ansible_facts_with_gather_subset(self):
        # mock module instance
        module = {'params': {'gather_subset': ['all']}}
        result = ansible_facts(module, gather_subset=['all'])
        self.assertIsInstance(result, dict)

    def test_ansible_facts_without_gather_subset(self):
        # mock module instance
        module = {'params': {}}
        result = ansible_facts(module)
        self.assertIsInstance(result, dict)

class TestPrefixFactNamespace(unittest.TestCase):
    def test_init(self):
        namespace = PrefixFactNamespace(namespace_name='ansible', prefix='')
        self.assertEqual(namespace.namespace_name, 'ansible')
        self.assertEqual(namespace.prefix, '')

    def test_str(self):
        namespace = PrefixFactNamespace(namespace_name='ansible', prefix='')
        result = str(namespace)
        self.assertEqual(result, 'ansible')

    def test_repr(self):
        namespace = PrefixFactNamespace(namespace_name='ansible', prefix='')
        result = repr(namespace)
        self.assertEqual(result, "PrefixFactNamespace(namespace_name='ansible', prefix='')")

class TestDefaultCollectors(unittest.TestCase):
    def test_collectors(self):
        collectors = default_collectors.collectors
        self.assertIsInstance(collectors, list)

class TestAnsibleCollector(unittest.TestCase):
    def test_get_ansible_collector(self):
        all_collector_classes = default_collectors.collectors
        namespace = PrefixFactNamespace(namespace_name='ansible', prefix='')
        filter_spec = '*'
        gather_subset = ['all']
        gather_timeout = 10
        minimal_gather_subset = frozenset(['apparmor', 'caps', 'cmdline', 'date_time',
                                           'distribution', 'dns', 'env', 'fips', 'local',
                                           'lsb', 'pkg_mgr', 'platform', 'python', 'selinux',
                                           'service_mgr', 'ssh_pub_keys', 'user'])
        fact_collector = ansible_collector.get_ansible_collector(all_collector_classes=all_collector_classes,
                                                                namespace=namespace,
                                                                filter_spec=filter_spec,
                                                                gather_subset=gather_subset,
                                                                gather_timeout=gather_timeout,
                                                                minimal_gather_subset=minimal_gather_subset)
        self.assertIsInstance(fact_collector, object)

if __name__ == '__main__':
    unittest.main()