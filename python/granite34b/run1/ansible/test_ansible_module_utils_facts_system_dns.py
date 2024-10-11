import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect_nameservers(self):
        collector = DnsFactCollector()
        collected_facts = collector.collect()
        self.assertIn('nameservers', collected_facts['dns'])

    def test_collect_domain(self):
        collector = DnsFactCollector()
        collected_facts = collector.collect()
        self.assertIn('domain', collected_facts['ansible_dns'])

    def test_collect_search(self):
        collector = DnsFactCollector()
        collected_facts = collector.collect()
        self.assertIn('search', collected_facts['dns'])

    def test_collect_sortlist(self):
        collector = DnsFactCollector()
        collected_facts = collector.collect()
        self.assertIn('sortlist', collected_facts['ansible_dns'])

    def test_collect_options(self):
        collector = DnsFactCollector()
        collected_facts = collector.collect()
        self.assertIn('options', collected_facts['dns'])

if __name__ == '__main__':
    unittest.main()