import unittest
from ansible.module_utils.facts.system.distribution import Distribution


class TestDistributionFactCollector(unittest.TestCase):
    def test_collect(self):
        distribution = Distribution()
        facts_dict = distribution.collect()
        self.assertIsInstance(facts_dict, dict)

if __name__ == '__main__':
    unittest.main()