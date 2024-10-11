import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('dns', result)

    def test_collect_nameservers(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('nameservers', result['dns'])

    def test_collect_domain(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('domain', result['dns'])

    def test_collect_search(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('search', result['dns'])

    def test_collect_sortlist(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('sortlist', result['dns'])

    def test_collect_options(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIn('options', result['dns'])

    def test_collect_empty_file(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertEqual(result, {})

    def test_collect_invalid_file(self):
        collector = DnsFactCollector()
        with open('/non/existent/file', 'r') as f:
            collector._DnsFactCollector__collect_from_file(f)
        self.assertEqual(collector._fact_ids, set())

    def test_str_method(self):
        collector = DnsFactCollector()
        result = str(collector)
        self.assertEqual(result, 'DnsFactCollector')

    def test_repr_method(self):
        collector = DnsFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'DnsFactCollector()')

    def test_eq_method(self):
        collector1 = DnsFactCollector()
        collector2 = DnsFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()