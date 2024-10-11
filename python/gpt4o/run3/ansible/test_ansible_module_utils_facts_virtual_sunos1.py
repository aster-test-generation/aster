import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector

class TestSunOSVirtual(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.instance = SunOSVirtual(self.module)

    def test_get_virtual_facts_zonename_global(self):
        self.module.get_bin_path.return_value = '/usr/bin/zonename'
        self.module.run_command.return_value = (0, 'global\n', '')

        result = self.instance.get_virtual_facts()

        self.assertIn('zone', result['virtualization_tech_host'])

    def test_get_virtual_facts_zonename_non_global(self):
        self.module.get_bin_path.return_value = '/usr/bin/zonename'
        self.module.run_command.return_value = (0, 'non-global\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['container'], 'zone')
        self.assertIn('zone', result['virtualization_tech_guest'])

    def test_get_virtual_facts_sunwnative(self):
        with patch('os.path.isdir', return_value=True):
            result = self.instance.get_virtual_facts()

        self.assertEqual(result['container'], 'zone')
        self.assertIn('zone', result['virtualization_tech_guest'])

    def test_get_virtual_facts_modinfo_vmware(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/bin/modinfo' if x == 'modinfo' else None
        self.module.run_command.return_value = (0, 'VMware\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'vmware')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_modinfo_virtualbox(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/bin/modinfo' if x == 'modinfo' else None
        self.module.run_command.return_value = (0, 'VirtualBox\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_virtinfo_ldom(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/virtinfo' if x == 'virtinfo' else None
        self.module.run_command.return_value = (0, 'DOMAINROLE|impl=LDoms|control=true\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'ldom')
        self.assertIn('control', result['virtualization_role'])

    def test_get_virtual_facts_smbios_vmware(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'VMware\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'vmware')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_parallels(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'Parallels\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'parallels')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_virtualbox(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'VirtualBox\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_xen(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'HVM domU\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_kvm(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'KVM\n', '')

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_no_virtualization(self):
        self.module.get_bin_path.return_value = None

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_tech_guest'], set())
        self.assertEqual(result['virtualization_tech_host'], set())

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._fact_class, SunOSVirtual)

    def test_platform(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()