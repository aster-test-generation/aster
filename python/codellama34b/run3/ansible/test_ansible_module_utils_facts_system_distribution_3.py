import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def test_get_distribution_facts(self):
        instance = Distribution()
        result = instance.get_distribution_facts()
        self.assertIsNotNone(result)

    def test_get_distribution_AIX(self):
        instance = Distribution()
        result = instance.get_distribution_AIX()
        self.assertIsNotNone(result)

    def test_get_distribution_HPUX(self):
        instance = Distribution()
        result = instance.get_distribution_HPUX()
        self.assertIsNotNone(result)

    def test_get_distribution_Darwin(self):
        instance = Distribution()
        result = instance.get_distribution_Darwin()
        self.assertIsNotNone(result)

    def test_get_distribution_FreeBSD(self):
        instance = Distribution()
        result = instance.get_distribution_FreeBSD()
        self.assertIsNotNone(result)

    def test_get_distribution_OpenBSD(self):
        instance = Distribution()
        result = instance.get_distribution_OpenBSD()
        self.assertIsNotNone(result)

    def test_get_distribution_DragonFly(self):
        instance = Distribution()
        result = instance.get_distribution_DragonFly()
        self.assertIsNotNone(result)

    def test_get_distribution_NetBSD(self):
        instance = Distribution()
        result = instance.get_distribution_NetBSD()
        self.assertIsNotNone(result)

    def test_get_distribution_SMGL(self):
        instance = Distribution()
        result = instance.get_distribution_SMGL()
        self.assertIsNotNone(result)

    def test_get_distribution_SunOS(self):
        instance = Distribution()
        result = instance.get_distribution_SunOS()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()