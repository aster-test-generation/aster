import unittest
from ansible.module_utils.facts.system.dns import *



class TestDnsFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = DnsFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None)
        self.assertEqual(result, {})

    def test_collect_with_collected_facts(self):
        instance = DnsFactCollector()
        result = instance.collect(collected_facts=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_dns_facts(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts={'dns': {}})
        self.assertEqual(result, {'dns': {}})

    def test_collect_with_module_and_collected_facts_and_dns_facts_and_nameservers(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts={'dns': {'nameservers': []}})
        self.assertEqual(result, {'dns': {'nameservers': []}})

    def test_collect_with_module_and_collected_facts_and_dns_facts_and_nameservers_and_domain(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts={'dns': {'nameservers': [], 'domain': ''}})
        self.assertEqual(result, {'dns': {'nameservers': [], 'domain': ''}})

    def test_collect_with_module_and_collected_facts_and_dns_facts_and_nameservers_and_domain_and_search(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts={'dns': {'nameservers': [], 'domain': '', 'search': []}})
        self.assertEqual(result, {'dns': {'nameservers': [], 'domain': '', 'search': []}})

    def test_collect_with_module_and_collected_facts_and_dns_facts_and_nameservers_and_domain_and_search_and_sortlist(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts={'dns': {'nameservers': [], 'domain': '', 'search': [], 'sortlist': []}})
        self.assertEqual(result, {'dns': {'nameservers': [], 'domain': '', 'search': [], 'sortlist': []}})

    def test_collect_with_module_and_collected_facts_and_dns_facts_and_nameservers_and_domain_and_search_and_sortlist_and_options(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts={'dns': {'nameservers': [], 'domain': '', 'search': [], 'sortlist': [], 'options': {}}})
        self.assertEqual(result, {'dns': {'nameservers': [], 'domain': '', 'search': [], 'sortlist': [], 'options': {}}})

if __name__ == '__main__':
    unittest.main()