import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DnsFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('dns', result)
        self.assertIsInstance(result['dns'], dict)
        self.assertIn('nameservers', result['dns'])
        self.assertIsInstance(result['dns']['nameservers'], list)
        self.assertIn('domain', result)
        self.assertIsInstance(result['dns']['domain'], str)
        self.assertIn('search', result['dns'])
        self.assertIsInstance(result['dns']['search'], list)
        self.assertIn('sortlist', result['dns'])
        self.assertIsInstance(result['dns']['sortlist'], list)
        self.assertIn('options', result['dns'])
        self.assertIsInstance(result['dns']['options'], dict)

if __name__ == '__main__':
    unittest.main()