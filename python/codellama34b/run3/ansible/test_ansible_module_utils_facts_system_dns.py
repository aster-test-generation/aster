import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector
from ansible.module_utils.facts.utils import get_file_content
from ansible.module_utils.facts.collector import BaseFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = DnsFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test_name(self):
        instance = DnsFactCollector()
        result = instance.name
        self.assertEqual(result, 'dns')

    def test_fact_ids(self):
        instance = DnsFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test_get_file_content(self):
        result = get_file_content('/etc/resolv.conf', '')
        self.assertIsInstance(result, str)

    def test_BaseFactCollector(self):
        instance = BaseFactCollector()
        self.assertIsInstance(instance, BaseFactCollector)

if __name__ == '__main__':
    unittest.main()