import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollector
from ansible.module_utils.facts.utils import get_file_content, get_file_lines


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
    def test_get_virtual_facts_virtualbox(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/bios_vendor'
        mock_get_file_content.return_value = 'innotek GmbH'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'virtualbox')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_ovirt(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'oVirt'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'oVirt')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_rhv(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_family'
        mock_get_file_content.return_value = 'RHV'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'RHV')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_openstack(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'OpenStack Compute'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'openstack')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_xen(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/bios_vendor'
        mock_get_file_content.return_value = 'Xen'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'xen')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_parallels(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'Parallels Software International Inc.'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'parallels')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_virtualpc(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'Microsoft Corporation'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'VirtualPC')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_kubevirt(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'KubeVirt'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'KubeVirt')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_ibm_systemz(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/bios_vendor'
        mock_get_file_content.return_value = 'IBM/S390'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'PR/SM')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_uml(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_content.return_value = 'User Mode Linux'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'uml')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_powervm_lx86(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_content.return_value = 'PowerVM Lx86'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'powervm_lx86')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_bhyve(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'BHYVE'

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'bhyve')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_na(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: False
        mock_get_file_content.return_value = None

        result = self.linux_virtual.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'NA')
        self.assertEqual(result['virtualization_role'], 'NA')

if __name__ == '__main__':
    unittest.main()