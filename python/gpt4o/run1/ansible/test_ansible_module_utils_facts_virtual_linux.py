import unittest
from unittest.mock import patch, mock_open
from ansible.module_utils.facts.virtual.linux import LinuxVirtualCollector


class TestLinuxVirtual(unittest.TestCase):
    def setUp(self):
        self.instance = LinuxVirtual()

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_docker(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/1/cgroup'
        mock_get_file_lines.return_value = ['/docker/']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'docker')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_lxc(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/1/cgroup'
        mock_get_file_lines.return_value = ['/lxc/']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'lxc')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_containerd(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/1/cgroup'
        mock_get_file_lines.return_value = ['/system.slice/containerd.service']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'containerd')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_openvz(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x in ['/proc/vz', '/proc/bc']
        mock_get_file_lines.return_value = []

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'openvz')
        self.assertEqual(result['virtualization_role'], 'host')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_systemd_container(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/run/systemd/container'
        mock_get_file_content.return_value = 'systemd-nspawn'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'systemd-nspawn')
        self.assertEqual(result['virtualization_role'], 'guest')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_dmi(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x in [
            '/sys/devices/virtual/dmi/id/product_name',
            '/sys/devices/virtual/dmi/id/sys_vendor',
            '/sys/devices/virtual/dmi/id/product_family'
        ]
        mock_get_file_content.side_effect = ['KVM', 'oVirt', 'RHV']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_cpuinfo(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_lines.return_value = ['model name : QEMU Virtual CPU']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_modules(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/modules'
        mock_get_file_lines.return_value = ['kvm 12345 0 - Live 0x00000000']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'host')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_lines')
    def test_get_virtual_facts_vserver(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/self/status'
        mock_get_file_lines.return_value = ['VxID: 0']

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'linux_vserver')
        self.assertEqual(result['virtualization_role'], 'host')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_bios_vendor(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/bios_vendor'
        mock_get_file_content.return_value = 'Xen'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'xen')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_vendor(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'Microsoft Corporation'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'VirtualPC')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_amazon_ec2(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'Amazon EC2'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'kvm')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_kubevirt(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'KubeVirt'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'KubeVirt')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_parallels(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'Parallels Software International Inc.'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'parallels')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_openstack(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/sys_vendor'
        mock_get_file_content.return_value = 'OpenStack Foundation'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'openstack')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_vmware(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'VMware Virtual Platform'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'VMware')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_uml(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_content.return_value = 'vendor_id : User Mode Linux'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'uml')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_powervm_lx86(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_content.return_value = 'vendor_id : PowerVM Lx86'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'powervm_lx86')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_ibm_systemz(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/proc/cpuinfo'
        mock_get_file_content.return_value = 'vendor_id : IBM/S390'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'PR/SM')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_bhyve(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: x == '/sys/devices/virtual/dmi/id/product_name'
        mock_get_file_content.return_value = 'BHYVE'

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'bhyve')

    @patch('os.path.exists')
    @patch('ansible.module_utils.facts.utils.get_file_content')
    def test_get_virtual_facts_na(self, mock_get_file_content, mock_path_exists):
        mock_path_exists.side_effect = lambda x: False
        mock_get_file_content.return_value = None

        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'NA')
        self.assertEqual(result['virtualization_role'], 'NA')

if __name__ == '__main__':
    unittest.main()