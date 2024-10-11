import unittest
from ansible.module_utils.facts.system import DistributionFactCollecto


class TestDistribution(unittest.TestCase):
    def test_init(self):
        module = object()
        distribution = Distribution(module)
        self.assertEqual(distribution.module, module)

    def test_get_distribution_facts(self):
        module = object()
        distribution = Distribution(module)
        distribution_facts = distribution.get_distribution_facts()
        self.assertIn('distribution', distribution_facts)
        self.assertIn('distribution_release', distribution_facts)
        self.assertIn('distribution_version', distribution_facts)

    def test_get_distribution_AIX(self):
        module = object()
        distribution = Distribution(module)
        aix_facts = distribution.get_distribution_AIX()
        self.assertIn('distribution_major_version', aix_facts)
        self.assertIn('distribution_version', aix_facts)
        self.assertIn('distribution_release', aix_facts)

    def test_get_distribution_HPUX(self):
        module = object()
        distribution = Distribution(module)
        hpux_facts = distribution.get_distribution_HPUX()
        self.assertIn('distribution_version', hpux_facts)
        self.assertIn('distribution_release', hpux_facts)

    def test_get_distribution_Darwin(self):
        module = object()
        distribution = Distribution(module)
        darwin_facts = distribution.get_distribution_Darwin()
        self.assertIn('distribution', darwin_facts)
        self.assertIn('distribution_major_version', darwin_facts)
        self.assertIn('distribution_version', darwin_facts)

    def test_get_distribution_FreeBSD(self):
        module = object()
        distribution = Distribution(module)
        freebsd_facts = distribution.get_distribution_FreeBSD()
        self.assertIn('distribution_release', freebsd_facts)
        self.assertIn('distribution_major_version', freebsd_facts)
        self.assertIn('distribution_version', freebsd_facts)

    def test_get_distribution_OpenBSD(self):
        module = object()
        distribution = Distribution(module)
        openbsd_facts = distribution.get_distribution_OpenBSD()
        self.assertIn('distribution_version', openbsd_facts)
        self.assertIn('distribution_release', openbsd_facts)

    def test_get_distribution_DragonFly(self):
        module = object()
        distribution = Distribution(module)
        dragonfly_facts = distribution.get_distribution_DragonFly()
        self.assertIn('distribution_release', dragonfly_facts)
        self.assertIn('distribution_major_version', dragonfly_facts)
        self.assertIn('distribution_version', dragonfly_facts)

    def test_get_distribution_NetBSD(self):
        module = object()
        distribution = Distribution(module)
        netbsd_facts = distribution.get_distribution_NetBSD()
        self.assertIn('distribution_release', netbsd_facts)
        self.assertIn('distribution_major_version', netbsd_facts)
        self.assertIn('distribution_version', netbsd_facts)

    def test_get_distribution_SMGL(self):
        module = object()
        distribution = Distribution(module)
        smgl_facts = distribution.get_distribution_SMGL()
        self.assertIn('distribution', smgl_facts)

    def test_get_distribution_SunOS(self):
        module = object()
        distribution = Distribution(module)
        sunos_facts = distribution.get_distribution_SunOS()
        self.assertIn('distribution', sunos_facts)
        self.assertIn('distribution_version', sunos_facts)
        self.assertIn('distribution_release', sunos_facts)

    def test_get_distribution_files(self):
        module = object()
        distribution_files = DistributionFiles(module)
        dist_file_facts = distribution_files.process_dist_files()
        self.assertIn('distribution_files', dist_file_facts)

if __name__ == '__main__':
    unittest.main()