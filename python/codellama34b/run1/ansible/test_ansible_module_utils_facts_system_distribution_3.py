import unittest
from ansible.module_utils.facts.system.distribution import DistributionFactCollector
from ansible.module_utils.facts.utils import get_file_content
from ansible.module_utils.facts.collector import BaseFactCollector



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

    def test_get_file_content(self):
        instance = Distribution(None)
        result = instance._get_file_content('/etc/release')
        self.assertIsInstance(result, str)

    def test_get_uname(self):
        instance = Distribution(None)
        result = instance._get_uname(flags=['-r'])
        self.assertIsInstance(result, str)

    def test_OS_FAMILY(self):
        instance = Distribution(None)
        result = instance.OS_FAMILY
        self.assertIsInstance(result, dict)

    def test_get_distribution_version(self):
        instance = Distribution(None)
        result = instance._get_distribution_version()
        self.assertIsInstance(result, str)

    def test_get_distribution_codename(self):
        instance = Distribution(None)
        result = instance._get_distribution_codename()
        self.assertIsInstance(result, str)

    def test_get_distribution(self):
        instance = Distribution(None)
        result = instance._get_distribution()
        self.assertIsInstance(result, str)

    def test_get_distribution_release(self):
        instance = Distribution(None)
        result = instance._get_distribution_release()
        self.assertIsInstance(result, str)

    def test_get_distribution_major_version(self):
        instance = Distribution(None)
        result = instance._get_distribution_major_version()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()