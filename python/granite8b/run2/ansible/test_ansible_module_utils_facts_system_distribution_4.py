import unittest
from ansible.module_utils.facts.system import Distribution, DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def test_get_distribution_facts(self):
        distribution = Distribution()
        distro_facts = distribution.get_distribution_facts()
        self.assertIsInstance(distro_facts, dict)
        self.assertIn("ansible_distribution", distro_facts)
        self.assertIn("ansible_distribution_version", distro_facts)
        self.assertIn("ansible_distribution_release", distro_facts)


if __name__ == '__main__':
    unittest.main()