import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector


class TestSunOSVirtual(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.instance = SunOSVirtual(self.module)

    @patch('os.path.isdir')
    @patch('os.path.exists')
    def test_get_virtual_facts(self, mock_exists, mock_isdir):
        # Mocking the module methods
        self.module.get_bin_path.side_effect = lambda x: x
        self.module.run_command.side_effect = [
            (0, "global\n", ""),  # zonename
            (0, "VMware\n", ""),  # modinfo
            (0, "DOMAINROLE|impl=LDoms|feature1=true|feature2=false\n", ""),  # virtinfo
            (0, "VMware\n", "")  # smbios
        ]
        mock_isdir.return_value = True
        mock_exists.return_value = True

        result = self.instance.get_virtual_facts()
        self.assertIn('container', result)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    @patch('os.path.isdir')
    @patch('os.path.exists')
    def test_get_virtual_facts_no_zonename(self, mock_exists, mock_isdir):
        # Mocking the module methods
        self.module.get_bin_path.side_effect = lambda x: None
        mock_isdir.return_value = False
        mock_exists.return_value = False

        result = self.instance.get_virtual_facts()
        self.assertEqual(result, {})

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._fact_class, SunOSVirtual)

    def test_platform(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._platform, 'SunOS')

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
        self.assertIn('zone', result['virtualization_tech_guest'])
        self.assertEqual(result['container'], 'zone')

    def test_get_virtual_facts_sunwnative(self):
        with patch('os.path.isdir', return_value=True):
            result = self.instance.get_virtual_facts()
            self.assertIn('zone', result['virtualization_tech_guest'])
            self.assertEqual(result['container'], 'zone')

    def test_get_virtual_facts_modinfo_vmware(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/bin/modinfo' if x == 'modinfo' else None
        self.module.run_command.return_value = (0, 'VMware\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('vmware', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'vmware')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_modinfo_virtualbox(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/bin/modinfo' if x == 'modinfo' else None
        self.module.run_command.return_value = (0, 'VirtualBox\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('virtualbox', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_virtinfo_ldom(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/virtinfo' if x == 'virtinfo' else None
        self.module.run_command.return_value = (0, 'DOMAINROLE|impl=LDoms|control=true\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('ldom', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'ldom')
        self.assertIn('host (control)', result['virtualization_role'])

    def test_get_virtual_facts_smbios_vmware(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'VMware\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('vmware', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'vmware')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_parallels(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'Parallels\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('parallels', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'parallels')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_virtualbox(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'VirtualBox\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('virtualbox', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_xen(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'HVM domU\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('xen', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_smbios_kvm(self):
        self.module.get_bin_path.side_effect = lambda x: '/usr/sbin/smbios' if x == 'smbios' else None
        self.module.run_command.return_value = (0, 'KVM\n', '')
        result = self.instance.get_virtual_facts()
        self.assertIn('kvm', result['virtualization_tech_guest'])
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_get_virtual_facts_no_smbios(self):
        self.module.get_bin_path.side_effect = lambda x: None
        result = self.instance.get_virtual_facts()
        self.assertIsNone(result)

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

if __name__ == '__main__':
    unittest.main()