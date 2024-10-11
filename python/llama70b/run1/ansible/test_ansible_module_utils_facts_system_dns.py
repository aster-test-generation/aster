import unittest
from ansible.module_utils.facts.system.dns import DnsFactCollector


class TestDnsFactCollector(unittest.TestCase):
    def test_init(self):
        instance = DnsFactCollector()
        self.assertIsInstance(instance, DnsFactCollector)

    def test_name(self):
        instance = DnsFactCollector()
        self.assertEqual(instance.name, 'dns')

    def test_fact_ids(self):
        instance = DnsFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_collect(self):
        instance = DnsFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test_collect_with_module(self):
        instance = DnsFactCollector()
        result = instance.collect(module='test_module')
        self.assertIsInstance(result, dict)

    def test_collect_with_collected_facts(self):
        instance = DnsFactCollector()
        result = instance.collect(collected_facts={'test_fact': 'test_value'})
        self.assertIsInstance(result, dict)

    def test_private___init__(self):
        instance = DnsFactCollector()
        result = instance._DnsFactCollector__init__()
        self.assertIsNone(result)

    def test_protected__fact_ids(self):
        instance = DnsFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)

    def test_magic__str__(self):
        instance = DnsFactCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_magic__repr__(self):
        instance = DnsFactCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_magic__eq__(self):
        instance1 = DnsFactCollector()
        instance2 = DnsFactCollector()
        result = instance1 == instance2
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()