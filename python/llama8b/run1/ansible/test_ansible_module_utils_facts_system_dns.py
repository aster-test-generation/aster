import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('dns', result)
        self.assertIn('nameservers', result['dns'])
        self.assertIn('domain', result['dns'])
        self.assertIn('search', result['dns'])
        self.assertIn('sortlist', result['dns'])
        self.assertIn('options', result['dns'])

    def test_collect_nameservers(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('nameservers', result['dns'])
        self.assertIsInstance(result['dns']['nameservers'], list)

    def test_collect_domain(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('domain', result['dns'])
        self.assertIsInstance(result['dns']['domain'], str)

    def test_collect_search(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('search', result['dns'])
        self.assertIsInstance(result['dns']['search'], list)

    def test_collect_sortlist(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('sortlist', result['dns'])
        self.assertIsInstance(result['dns']['sortlist'], list)

    def test_collect_options(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('options', result['dns'])
        self.assertIsInstance(result['dns']['options'], dict)

    def test_collect_empty_file(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertEqual(result, {})

    def test_collect_invalid_file(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()