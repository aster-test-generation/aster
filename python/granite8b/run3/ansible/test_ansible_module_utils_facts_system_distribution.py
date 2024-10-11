import unittest
from ansible.module_utils.facts.system import Distribution, DistributionFiles


class TestDistribution(unittest.TestCase):
    def test_get_distribution_facts(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_facts()
        self.assertIn('distribution', facts)
        self.assertIn('distribution_release', facts)
        self.assertIn('distribution_version', facts)
        self.assertIn('os_family', facts)

    def test_get_distribution_AIX(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_AIX()
        self.assertIn('distribution_major_version', facts)
        self.assertIn('distribution_version', facts)
        self.assertIn('distribution_release', facts)

    def test_get_distribution_HPUX(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_HPUX()
        self.assertIn('distribution_version', facts)
        self.assertIn('distribution_release', facts)

    def test_get_distribution_Darwin(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_Darwin()
        self.assertIn('distribution', facts)
        self.assertIn('distribution_major_version', facts)
        self.assertIn('distribution_version', facts)

    def test_get_distribution_FreeBSD(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_FreeBSD()
        self.assertIn('distribution_release', facts)
        self.assertIn('distribution_version', facts)

    def test_get_distribution_OpenBSD(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_OpenBSD()
        self.assertIn('distribution_version', facts)
        self.assertIn('distribution_release', facts)

    def test_get_distribution_DragonFly(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_DragonFly()
        self.assertIn('distribution_release', facts)
        self.assertIn('distribution_major_version', facts)
        self.assertIn('distribution_version', facts)

    def test_get_distribution_NetBSD(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_NetBSD()
        self.assertIn('distribution_release', facts)
        self.assertIn('distribution_major_version', facts)
        self.assertIn('distribution_version', facts)

    def test_get_distribution_SMGL(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_SMGL()
        self.assertIn('distribution', facts)

    def test_get_distribution_SunOS(self):
        distribution = Distribution(module=None)
        facts = distribution.get_distribution_SunOS()
        self.assertIn('distribution', facts)
        self.assertIn('distribution_version', facts)
        self.assertIn('distribution_release', facts)
        self.assertIn('distribution_major_version', facts)


if __name__ == '__main__':
    unittest.main()