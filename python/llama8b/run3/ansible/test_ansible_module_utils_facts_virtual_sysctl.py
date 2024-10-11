import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def setUp(self):
        self.mixin = VirtualSysctlDetectionMixin()

    def test_detect_sysctl(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin.detect_sysctl()
        self.assertEqual(self.mixin.sysctl_path, 'sysctl')

    def test_detect_virt_product(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin.detect_virt_product('security.jail.jailed')
        self.assertIn('virtualization_type', self.mixin.virtual_product_facts)
        self.assertIn('virtualization_role', self.mixin.virtual_product_facts)
        self.assertIn('virtualization_tech_guest', self.mixin.virtual_product_facts)
        self.assertIn('virtualization_tech_host', self.mixin.virtual_product_facts)

    def test_detect_virt_vendor(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin.detect_virt_vendor('security.jail.jailed')
        self.assertIn('virtualization_type', self.mixin.virtual_vendor_facts)
        self.assertIn('virtualization_role', self.mixin.virtual_vendor_facts)
        self.assertIn('virtualization_tech_guest', self.mixin.virtual_vendor_facts)
        self.assertIn('virtualization_tech_host', self.mixin.virtual_vendor_facts)

    def test_detect_sysctl_private_method(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin._VirtualSysctlDetectionMixin__detect_sysctl()
        self.assertEqual(self.mixin.sysctl_path, 'sysctl')

    def test_detect_virt_product_private_method(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin._VirtualSysctlDetectionMixin__detect_virt_product('security.jail.jailed')
        self.assertIn('virtualization_type', self.mixin.virtual_product_facts)
        self.assertIn('virtualization_role', self.mixin.virtual_product_facts)
        self.assertIn('virtualization_tech_guest', self.mixin.virtual_product_facts)
        self.assertIn('virtualization_tech_host', self.mixin.virtual_product_facts)

    def test_detect_virt_vendor_private_method(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.mixin._VirtualSysctlDetectionMixin__detect_virt_vendor('security.jail.jailed')
        self.assertIn('virtualization_type', self.mixin.virtual_vendor_facts)
        self.assertIn('virtualization_role', self.mixin.virtual_vendor_facts)
        self.assertIn('virtualization_tech_guest', self.mixin.virtual_vendor_facts)
        self.assertIn('virtualization_tech_host', self.mixin.virtual_vendor_facts)

    def test_str_method(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.assertEqual(str(self.mixin), 'VirtualSysctlDetectionMixin')

    def test_repr_method(self):
        self.mixin.module = object()
        self.mixin.module.get_bin_path.return_value = 'sysctl'
        self.assertEqual(repr(self.mixin), 'VirtualSysctlDetectionMixin()')

if __name__ == '__main__':
    unittest.main()