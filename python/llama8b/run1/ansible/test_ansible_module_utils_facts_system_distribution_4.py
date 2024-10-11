import unittest
from ansible.module_utils.facts.system import DistributionFactCollector, Distributio


class TestDistributionFactCollector(unittest.TestCase):
    def test_init(self):
        collector = DistributionFactCollector()
        self.assertIsInstance(collector, DistributionFactCollector)

    def test_collect(self):
        module = object()
        collector = DistributionFactCollector()
        collected_facts = collector.collect(module)
        self.assertIsInstance(collected_facts, dict)

    def test_get_distribution_facts(self):
        distribution = Distribution()
        distro_facts = distribution.get_distribution_facts()
        self.assertIsInstance(distro_facts, dict)

    def test_distribution_init(self):
        distribution = Distribution()
        self.assertIsInstance(distribution, Distribution)

    def test_distribution_get_distribution_facts(self):
        distribution = Distribution()
        distro_facts = distribution.get_distribution_facts()
        self.assertIsInstance(distro_facts, dict)

    def test_distribution_get_distribution(self):
        distribution = Distribution()
        distro = distribution.get_distribution()
        self.assertIsInstance(distro, str)

    def test_distribution_get_distribution_version(self):
        distribution = Distribution()
        distro_version = distribution.get_distribution_version()
        self.assertIsInstance(distro_version, str)

    def test_distribution_get_distribution_codename(self):
        distribution = Distribution()
        distro_codename = distribution.get_distribution_codename()
        self.assertIsInstance(distro_codename, str)

    def test_distribution_get_file_content(self):
        distribution = Distribution()
        file_content = distribution.get_file_content('test_file')
        self.assertIsInstance(file_content, str)

    def test_distribution_get_distribution(self):
        distribution = Distribution()
        distro = distribution.get_distribution()
        self.assertIsInstance(distro, str)

    def test_distribution_get_distribution_version(self):
        distribution = Distribution()
        distro_version = distribution.get_distribution_version()
        self.assertIsInstance(distro_version, str)

    def test_distribution_get_distribution_codename(self):
        distribution = Distribution()
        distro_codename = distribution.get_distribution_codename()
        self.assertIsInstance(distro_codename, str)

    def test_distribution_get_distribution_facts(self):
        distribution = Distribution()
        distro_facts = distribution.get_distribution_facts()
        self.assertIsInstance(distro_facts, dict)

if __name__ == '__main__':
    unittest.main()