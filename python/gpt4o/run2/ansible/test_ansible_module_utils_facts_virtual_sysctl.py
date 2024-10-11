import unittest
from unittest.mock import MagicMock
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def setUp(self):
        self.instance = VirtualSysctlDetectionMixin()
        self.instance.module = MagicMock()

    def test_detect_sysctl(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.detect_sysctl()
        self.assertEqual(self.instance.sysctl_path, '/sbin/sysctl')

    def test_detect_virt_product_kvm(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'KVM', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('kvm', result['virtualization_tech_guest'])

    def test_detect_virt_product_vmware(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'VMware', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'VMware')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('VMware', result['virtualization_tech_guest'])

    def test_detect_virt_product_virtualbox(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'VirtualBox', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'virtualbox')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('virtualbox', result['virtualization_tech_guest'])

    def test_detect_virt_product_xen(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'XenPVH', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'xen')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('xen', result['virtualization_tech_guest'])

    def test_detect_virt_product_hyperv(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'Hyper-V', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'Hyper-V')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('Hyper-V', result['virtualization_tech_guest'])

    def test_detect_virt_product_parallels(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'Parallels', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'parallels')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('parallels', result['virtualization_tech_guest'])

    def test_detect_virt_product_rhev(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'RHEV Hypervisor', '')
        result = self.instance.detect_virt_product('some.key')
        self.assertEqual(result['virtualization_type'], 'RHEV')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('RHEV', result['virtualization_tech_guest'])

    def test_detect_virt_product_jails(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, '1', '')
        result = self.instance.detect_virt_product('security.jail.jailed')
        self.assertEqual(result['virtualization_type'], 'jails')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('jails', result['virtualization_tech_guest'])

    def test_detect_virt_vendor_qemu(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'QEMU', '')
        result = self.instance.detect_virt_vendor('some.key')
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('kvm', result['virtualization_tech_guest'])

    def test_detect_virt_vendor_openbsd(self):
        self.instance.module.get_bin_path.return_value = '/sbin/sysctl'
        self.instance.module.run_command.return_value = (0, 'OpenBSD', '')
        result = self.instance.detect_virt_vendor('some.key')
        self.assertEqual(result['virtualization_type'], 'vmm')
        self.assertEqual(result['virtualization_role'], 'guest')
        self.assertIn('vmm', result['virtualization_tech_guest'])

if __name__ == '__main__':
    unittest.main()