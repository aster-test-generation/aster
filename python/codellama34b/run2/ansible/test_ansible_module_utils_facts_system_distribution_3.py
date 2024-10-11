import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def test_init(self):
        instance = Distribution(None)
        self.assertIsInstance(instance, Distribution)

    def test_get_distribution_facts(self):
        instance = Distribution(None)
        result = instance.get_distribution_facts()
        self.assertIsInstance(result, dict)

    def test_get_distribution_AIX(self):
        instance = Distribution(None)
        result = instance.get_distribution_AIX()
        self.assertIsInstance(result, dict)

    def test_get_distribution_HPUX(self):
        instance = Distribution(None)
        result = instance.get_distribution_HPUX()
        self.assertIsInstance(result, dict)

    def test_get_distribution_Darwin(self):
        instance = Distribution(None)
        result = instance.get_distribution_Darwin()
        self.assertIsInstance(result, dict)

    def test_get_distribution_FreeBSD(self):
        instance = Distribution(None)
        result = instance.get_distribution_FreeBSD()
        self.assertIsInstance(result, dict)

    def test_get_distribution_OpenBSD(self):
        instance = Distribution(None)
        result = instance.get_distribution_OpenBSD()
        self.assertIsInstance(result, dict)

    def test_get_distribution_DragonFly(self):
        instance = Distribution(None)
        result = instance.get_distribution_DragonFly()
        self.assertIsInstance(result, dict)

    def test_get_distribution_NetBSD(self):
        instance = Distribution(None)
        result = instance.get_distribution_NetBSD()
        self.assertIsInstance(result, dict)

    def test_get_distribution_SMGL(self):
        instance = Distribution(None)
        result = instance.get_distribution_SMGL()
        self.assertIsInstance(result, dict)

    def test_get_distribution_SunOS(self):
        instance = Distribution(None)
        result = instance.get_distribution_SunOS()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()