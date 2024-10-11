import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector



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

    def test_collect_with_module_and_collected_facts_and_line(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens_and_dns_facts(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None, dns_facts=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens_and_dns_facts_and_nameserver(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None, dns_facts=None, nameserver=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens_and_dns_facts_and_domain(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None, dns_facts=None, domain=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens_and_dns_facts_and_search(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None, dns_facts=None, search=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens_and_dns_facts_and_sortlist(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None, dns_facts=None, sortlist=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts_and_line_and_tokens_and_dns_facts_and_options(self):
        instance = DnsFactCollector()
        result = instance.collect(module=None, collected_facts=None, line=None, tokens=None, dns_facts=None, options=None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()