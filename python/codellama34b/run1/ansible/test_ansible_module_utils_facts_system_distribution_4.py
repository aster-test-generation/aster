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

if __name__ == '__main__':
    unittest.main()