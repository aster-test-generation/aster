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
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', '/usr/bin/modinfo']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'VMware\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'vmware')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_modinfo_virtualbox(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', '/usr/bin/modinfo']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'VirtualBox\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_proc_vz(self):
        with patch('os.path.exists', return_value=True):
            result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'virtuozzo')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_virtinfo(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', '/usr/sbin/virtinfo']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'DOMAINROLE|impl=LDoms|arg1=true|arg2=false\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'ldom')
        self.assertEqual(result['virtualization_role'], 'host (arg1)')

    def test_get_virtual_facts_smbios_vmware(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', None, '/usr/sbin/smbios']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'VMware\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'vmware')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_parallels(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', None, '/usr/sbin/smbios']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'Parallels\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'parallels')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_virtualbox(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', None, '/usr/sbin/smbios']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'VirtualBox\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_xen(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', None, '/usr/sbin/smbios']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'HVM domU\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_kvm(self):
        self.module.get_bin_path.side_effect = ['/usr/bin/zonename', None, '/usr/sbin/smbios']
        self.module.run_command.side_effect = [(0, 'non-global\n', ''), (0, 'KVM\n', '')]

        result = self.instance.get_virtual_facts()

        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._fact_class, SunOSVirtual)

    def test_platform(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()