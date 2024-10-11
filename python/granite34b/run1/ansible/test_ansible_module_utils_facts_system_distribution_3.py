import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def test_get_distribution_facts(self):
        distribution = Distribution(module=None)
        distribution_facts = distribution.get_distribution_facts()
        self.assertIsInstance(distribution_facts, dict)

    def test_get_distribution_AIX(self):
        distribution = Distribution(module=None)
        aix_facts = distribution.get_distribution_AIX()
        self.assertIsInstance(aix_facts, dict)

    def test_get_distribution_HPUX(self):
        distribution = Distribution(module=None)
        hpux_facts = distribution.get_distribution_HPUX()
        self.assertIsInstance(hpux_facts, dict)

    def test_get_distribution_Darwin(self):
        distribution = Distribution(module=None)
        darwin_facts = distribution.get_distribution_Darwin()
        self.assertIsInstance(darwin_facts, dict)

    def test_get_distribution_FreeBSD(self):
        distribution = Distribution(module=None)
        freebsd_facts = distribution.get_distribution_FreeBSD()
        self.assertIsInstance(freebsd_facts, dict)

    def test_get_distribution_OpenBSD(self):
        distribution = Distribution(module=None)
        openbsd_facts = distribution.get_distribution_OpenBSD()
        self.assertIsInstance(openbsd_facts, dict)

    def test_get_distribution_DragonFly(self):
        distribution = Distribution(module=None)
        dragonfly_facts = distribution.get_distribution_DragonFly()
        self.assertIsInstance(dragonfly_facts, dict)

    def test_get_distribution_NetBSD(self):
        distribution = Distribution(module=None)
        netbsd_facts = distribution.get_distribution_NetBSD()
        self.assertIsInstance(netbsd_facts, dict)

    def test_get_distribution_SMGL(self):
        distribution = Distribution(module=None)
        smgl_facts = distribution.get_distribution_SMGL()
        self.assertIsInstance(smgl_facts, dict)

    def test_get_distribution_SunOS(self):
        distribution = Distribution(module=None)
        sunos_facts = distribution.get_distribution_SunOS()
        self.assertIsInstance(sunos_facts, dict)

if __name__ == '__main__':
    unittest.main()