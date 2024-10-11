import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect_nameservers(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('nameservers', result['dns'])

    def test_collect_domain(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('domain', result)

    def test_collect_search(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('search', result['dns'])

    def test_collect_sortlist(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('sortlist', result)

    def test_collect_options(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('options', result['dns'])

if __name__ == '__main__':
    unittest.main()