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
        result = instance.collect(module='mock_module')
        self.assertIsInstance(result, dict)

    def test_collect_with_collected_facts(self):
        instance = DnsFactCollector()
        result = instance.collect(collected_facts={'mock_fact': 'value'})
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = DnsFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'DnsFactCollector')

    def test_repr_method(self):
        instance = DnsFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'DnsFactCollector()')

    def test_eq_method(self):
        instance1 = DnsFactCollector()
        instance2 = DnsFactCollector()
        self.assertEqual(instance1, instance2)

    def test_private_method__init__(self):
        instance = DnsFactCollector()
        result = instance._DnsFactCollector__init__()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()