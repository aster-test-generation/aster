import unittest
from ansible.module_utils.facts.system import DistributionFactCollecto


class TestDistribution(unittest.TestCase):
    def test_init(self):
        module = object()
        instance = Distribution(module)
        self.assertEqual(instance.module, module)

    def test_get_distribution_facts(self):
        module = object()
        instance = Distribution(module)
        distribution_facts = instance.get_distribution_facts()
        self.assertIn('distribution', distribution_facts)
        self.assertIn('distribution_release', distribution_facts)
        self.assertIn('distribution_version', distribution_facts)
        self.assertIn('os_family', distribution_facts)

    def test_get_distribution_AIX(self):
        module = object()
        instance = Distribution(module)
        aix_facts = instance.get_distribution_AIX()
        self.assertIn('distribution_major_version', aix_facts)
        self.assertIn('distribution_version', aix_facts)
        self.assertIn('distribution_release', aix_facts)

    def test_get_distribution_HPUX(self):
        module = object()
        instance = Distribution(module)
        hpux_facts = instance.get_distribution_HPUX()
        self.assertIn('distribution_version', hpux_facts)
        self.assertIn('distribution_release', hpux_facts)

    def test_get_distribution_Darwin(self):
        module = object()
        instance = Distribution(module)
        darwin_facts = instance.get_distribution_Darwin()
        self.assertIn('distribution', darwin_facts)
        self.assertIn('distribution_major_version', darwin_facts)
        self.assertIn('distribution_version', darwin_facts)

    def test_get_distribution_FreeBSD(self):
        module = object()
        instance = Distribution(module)
        freebsd_facts = instance.get_distribution_FreeBSD()
        self.assertIn('distribution_release', freebsd_facts)
        self.assertIn('distribution_major_version', freebsd_facts)
        self.assertIn('distribution_version', freebsd_facts)

    def test_get_distribution_OpenBSD(self):
        module = object()
        instance = Distribution(module)
        openbsd_facts = instance.get_distribution_OpenBSD()
        self.assertIn('distribution_version', openbsd_facts)
        self.assertIn('distribution_release', openbsd_facts)

    def test_get_distribution_DragonFly(self):
        module = object()
        instance = Distribution(module)
        dragonfly_facts = instance.get_distribution_DragonFly()
        self.assertIn('distribution_release', dragonfly_facts)
        self.assertIn('distribution_major_version', dragonfly_facts)
        self.assertIn('distribution_version', dragonfly_facts)

    def test_get_distribution_NetBSD(self):
        module = object()
        instance = Distribution(module)
        netbsd_facts = instance.get_distribution_NetBSD()
        self.assertIn('distribution_release', netbsd_facts)
        self.assertIn('distribution_major_version', netbsd_facts)
        self.assertIn('distribution_version', netbsd_facts)

    def test_get_distribution_SMGL(self):
        module = object()
        instance = Distribution(module)
        smgl_facts = instance.get_distribution_SMGL()
        self.assertIn('distribution', smgl_facts)

    def test_get_distribution_SunOS(self):
        module = object()
        instance = Distribution(module)
        sunos_facts = instance.get_distribution_SunOS()
        self.assertIn('distribution', sunos_facts)
        self.assertIn('distribution_version', sunos_facts)
        self.assertIn('distribution_release', sunos_facts)

    def test_str(self):
        module = object()
        instance = Distribution(module)
        self.assertEqual(str(instance), 'Distribution')

    def test_repr(self):
        module = object()
        instance = Distribution(module)
        self.assertEqual(repr(instance), 'Distribution(module=...)')

    def test_eq(self):
        module = object()
        instance1 = Distribution(module)
        instance2 = Distribution(module)
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()