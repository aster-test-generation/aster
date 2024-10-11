import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollector


class TestLinuxVirtual(unittest.TestCase):
    def setUp(self):
        self.linux_virtual = LinuxVirtual()

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_docker(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/1/cgroup'
        mock_get_file_lines.return_value = ['/docker/']

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'docker')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_lxc(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/1/cgroup'
        mock_get_file_lines.return_value = ['/lxc/']

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'lxc')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_containerd(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/1/cgroup'
        mock_get_file_lines.return_value = ['/system.slice/containerd.service']

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'containerd')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_openvz(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x in ['/proc/vz', '/proc/bc']
        mock_get_file_lines.return_value = []

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'openvz')
        self.assertEqual(result['virtualization_role'], 'host')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_systemd_container(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/run/systemd/container'
        mock_get_file_content.return_value = 'systemd-nspawn'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'systemd-nspawn')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_kvm(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'KVM'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_vmware(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'VMware Virtual Platform'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'VMware')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_openstack(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'OpenStack Compute'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'openstack')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_virtualbox(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/bios_vendor'
        mock_get_file_content.return_value = 'innotek GmbH'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'virtualbox')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_kvm_sys_vendor(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'QEMU'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_linux_vserver(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/self/status'
        mock_get_file_lines.return_value = ['VxID: 0']

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'linux_vserver')
        self.assertEqual(result['virtualization_role'], 'host')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_cpuinfo(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_lines.return_value = ['model name : QEMU Virtual CPU']

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_modules(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/modules'
        mock_get_file_lines.return_value = ['kvm 123 0 - Live 0x00000000']

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'host')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_na(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.return_value = False
        mock_get_file_content.return_value = None

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'NA')
        self.assertEqual(result['virtualization_role'], 'NA')

if __name__ == '__main__':
    unittest.main()