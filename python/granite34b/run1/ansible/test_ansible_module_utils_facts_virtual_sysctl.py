import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def setUp(self):
        self.mixin = VirtualSysctlDetectionMixin()

    def test_detect_sysctl(self):
        self. mixin.detect_sysctl()
        self.assertIsNotNone(self.mixin.sysctl_path)

    def test_detect_virt_product(self):
        self. mixin.detect_virt_product('some_key')
        self.assertIsInstance(self.mixin.virtual_product_facts, dict)

    def test_detect_virt_vendor(self):
        self.mixin.detect_virt_vendor('some_key')
        self.assertIsInstance(self.mixin.virtual_vendor_facts, dict)

if __name__ == '__main__':
    unittest.main()