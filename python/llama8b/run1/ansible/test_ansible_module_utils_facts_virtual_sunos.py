import unittest
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector


class TestSunOSVirtual(unittest.TestCase):
    def test_get_virtual_facts(self):
        instance = SunOSVirtual(module='module')  # fixed
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_zone(self):
        instance = SunOSVirtual(module='module')  # fixed
        instance.module.get_bin_path.return_value = 'zonename'
        instance.module.run_command.return_value = (0, 'global', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_vmware(self):
        instance = SunOSVirtual(module='module')  # fixed
        instance.module.get_bin_path.return_value = 'modinfo'
        instance.module.run_command.return_value = (0, 'VMware', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_virtuozzo(self):
        instance = SunOSVirtual(module='module')  # fixed
        instance.module.get_bin_path.return_value = '/proc/vz'
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_ldom(self):
        instance = SunOSVirtual(module='module')  # fixed
        instance.module.get_bin_path.return_value = '/usr/sbin/virtinfo'
        instance.module.run_command.return_value = (0, 'DOMAINROLE|impl=LDoms', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_with_smbios(self):
        instance = SunOSVirtual(module='module')  # fixed
        instance.module.get_bin_path.return_value = 'smbios'
        instance.module.run_command.return_value = (0, 'VMware|Parallels|VirtualBox|HVM domU|KVM', '')
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

    def test_get_virtual_facts_without_smbios(self):
        instance = SunOSVirtual(module='module')  # fixed
        instance.module.get_bin_path.return_value = None
        virtual_facts = instance.get_virtual_facts()
        self.assertIn('container', virtual_facts)
        self.assertIn('virtualization_type', virtual_facts)
        self.assertIn('virtualization_role', virtual_facts)
        self.assertIn('virtualization_tech_guest', virtual_facts)
        self.assertIn('virtualization_tech_host', virtual_facts)

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_get_fact_class(self):
        instance = SunOSVirtualCollector()
        self.assertEqual(instance._fact_class, SunOSVirtual)

    def test_get_platform(self):
        instance = SunOSVirtualCollector()
        self.assertEqual(instance._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()