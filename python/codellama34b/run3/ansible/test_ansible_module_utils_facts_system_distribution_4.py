import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistributionFactCollector(unittest.TestCase):
    def test_init(self):
        instance = DistributionFactCollector()
        self.assertIsInstance(instance, DistributionFactCollector)

    def test_collect(self):
        instance = DistributionFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

    def test_collect_with_module(self):
        instance = DistributionFactCollector()
        result = instance.collect(module=None)
        self.assertEqual(result, {})

    def test_collect_with_collected_facts(self):
        instance = DistributionFactCollector()
        result = instance.collect(collected_facts=None)
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts(self):
        instance = DistributionFactCollector()
        result = instance.collect(module=None, collected_facts=None)
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()