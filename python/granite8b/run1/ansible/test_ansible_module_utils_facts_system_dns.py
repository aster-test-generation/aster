import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect_nameservers(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('nameservers', dns_facts['dns'])
        self.assertEqual(len(dns_facts['dns']['nameservers']), 4)
        self.assertEqual(dns_facts['dns']['nameservers'][0], '127.0.0.1')

    def test_collect_domain(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('domain', dns_facts['dns']['search'])
        self.assertEqual(dns_facts['dns']['domain'], 'example.com')

    def test_collect_search(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('search', dns_facts['dns'])
        self.assertEqual(len(dns_facts['dns']['search']), 3)
        self.assertEqual(dns_facts['dns']['search'][0], 'example.com')
        self.assertEqual(dns_facts['dns']['search'][1], 'internal.example.com')

    def test_collect_sortlist(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('search', dns_facts['dns'])
        self.assertEqual(len(dns_facts['dns']['sortlist']), 1)
        self.assertEqual(dns_facts['dns']['sortlist'][0], '10.0.0.1')

    def test_collect_options(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('options', dns_facts['dns'])
        self.assertEqual(len(dns_facts['dns']['options']), 1)
        self.assertEqual(dns_facts['dns']['options']['ndots'], 1)

if __name__ == '__main__':
    unittest.main()