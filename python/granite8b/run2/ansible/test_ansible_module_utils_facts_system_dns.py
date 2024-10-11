import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect_nameservers(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('nameservers', dns_facts['dns'])
        self.assertEqual(dns_facts['dns']['nameservers'], ['9.0.0.2', '9.0.0.1', '10.0.80.11', '10.0.80.12'])

    def test_collect_domain(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('domain', dns_facts['dns']['search'])
        self.assertEqual(dns_facts['dns']['domain'], 'example.com')

    def test_collect_search(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('search', dns_facts['dns'])
        self.assertEqual(dns_facts['dns']['search'], ['sl.cloud9.ibm.com', 'cloud9.ibm.com', 'ibm.com'])

    def test_collect_sortlist(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('search', dns_facts['dns'])
        self.assertEqual(dns_facts['dns']['sortlist'], ['192.168.1.1', '192.168.1.2'])

    def test_collect_options(self):
        collector = DnsFactCollector()
        dns_facts = collector.collect()
        self.assertIn('options', dns_facts['dns'])
        self.assertEqual(dns_facts['dns']['options'], {'single-request-reopen': True})

if __name__ == '__main__':
    unittest.main()