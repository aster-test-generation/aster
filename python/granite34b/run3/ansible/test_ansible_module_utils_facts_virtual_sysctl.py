import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def setUp(self):
        self.mixin = VirtualSysctlDetectionMixin()

    def test_detect_sysctl(self):
        self.mixin.module = MockModule
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin.detect_sysctl()
        self.assertEqual(self.mixin.sysctl_path, 'sysctl')

    def test_detect_virt_product(self):
        self.mixin.module = mock.Mock()
        self.mixin.module.run_command.return_value = (0, 'KVM', '')
        self.mixin.detect_virt_product('key')
        self.assertEqual(self.mixin.virtual_product_facts['virtualization_type'], 'kvm')
        self.assertEqual(self.mixin.virtual_product_facts['virtualization_role'], 'guest')

    def test_detect_virt_vendor(self):
        self. mixin.module = MockModule
        self.mixin.module.run_command.return_value = (0, 'QEMU', '')
        self.mixin.detect_virt_vendor('key')
        self.assertEqual(self.mixin.virtual_vendor_facts['virtualization_type'], 'kvm')
        self.assertEqual(self.mixin.virtual_vendor_facts['virtualization_role'], 'guest')

if __name__ == '__main__':
    unittest.main()