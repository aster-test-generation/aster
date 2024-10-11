import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def setUp(self):
        self.mixin = VirtualSysctlDetectionMixin()

    def test_detect_sysctl(self):
        self. mixin.detect_sysctl()
        self.assertIsNotNone(self.mixin.sysctl_path)

    def test_detect_virt_product(self):
        key = 'hw.model'
        result = self.mixin.detect_virt_product(key)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    def test_detect_virt_vendor(self):
        key = 'kern.ostype'
        result = self.mixin.detect_virt_vendor(key)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

if __name__ == '__main__':
    unittest.main()