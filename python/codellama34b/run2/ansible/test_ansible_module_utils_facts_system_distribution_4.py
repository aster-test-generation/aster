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
        result = instance.collect(collected_facts={})
        self.assertEqual(result, {})

    def test_collect_with_module_and_collected_facts(self):
        instance = DistributionFactCollector()
        result = instance.collect(module=None, collected_facts={})
        self.assertEqual(result, {})




class TestDistribution(unittest.TestCase):
    def test_init(self):
        instance = Distribution()
        self.assertIsInstance(instance, Distribution)

    def test_get_distribution_facts(self):
        instance = Distribution()
        result = instance.get_distribution_facts()
        self.assertEqual(result, {})

    def test_get_distribution_facts_with_module(self):
        instance = Distribution()
        result = instance.get_distribution_facts(module=None)
        self.assertEqual(result, {})

    def test_get_distribution_facts_with_collected_facts(self):
        instance = Distribution()
        result = instance.get_distribution_facts(collected_facts={})
        self.assertEqual(result, {})

    def test_get_distribution_facts_with_module_and_collected_facts(self):
        instance = Distribution()
        result = instance.get_distribution_facts(module=None, collected_facts={})
        self.assertEqual(result, {})




class TestDistributionGetDistribution(unittest.TestCase):
    def test_get_distribution(self):
        result = Distribution.get_distribution()
        self.assertEqual(result, {})

    def test_get_distribution_with_module(self):
        result = Distribution.get_distribution(module=None)
        self.assertEqual(result, {})

    def test_get_distribution_with_collected_facts(self):
        result = Distribution.get_distribution(collected_facts={})
        self.assertEqual(result, {})

    def test_get_distribution_with_module_and_collected_facts(self):
        result = Distribution.get_distribution(module=None, collected_facts={})
        self.assertEqual(result, {})




class TestDistributionGetDistributionVersion(unittest.TestCase):
    def test_get_distribution_version(self):
        result = Distribution.get_distribution_version()
        self.assertEqual(result, {})

    def test_get_distribution_version_with_module(self):
        result = Distribution.get_distribution_version(module=None)
        self.assertEqual(result, {})

    def test_get_distribution_version_with_collected_facts(self):
        result = Distribution.get_distribution_version(collected_facts={})
        self.assertEqual(result, {})

    def test_get_distribution_version_with_module_and_collected_facts(self):
        result = Distribution.get_distribution_version(module=None, collected_facts={})
        self.assertEqual(result, {})




class TestDistributionGetDistributionCodename(unittest.TestCase):
    def test_get_distribution_codename(self):
        result = Distribution.get_distribution_codename()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()