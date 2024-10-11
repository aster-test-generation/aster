import unittest
from ansible.module_utils.facts.system.distribution import Distribution, DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def test_get_distribution_facts(self):
        distribution = Distribution()
        distro_facts = distribution.get_distribution_facts()
        self.assertIn('ansible_distribution', distro_facts)
        self.assertIn('ansible_distribution_version', distro_facts)
        self.assertIn('ansible_distribution_release', distro_facts)
        self.assertIn('ansible_distribution_major_version', distro_facts)
        self.assertIn('ansible_distribution_minor_version', distro_facts)

class TestDistributionFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DistributionFactCollector()
        distro_facts = collector.collect()
        self.assertIn('ansible_distribution', distro_facts)
        self.assertIn('ansible_distribution_version', distro_facts)
        self.assertIn('ansible_distribution_release', distro_facts)
        self.assertIn('ansible_distribution_major_version', distro_facts)
        self.assertIn('ansible_distribution_minor_version', distro_facts)

if __name__ == '__main__':
    unittest.main()