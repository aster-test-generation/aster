import unittest
from ansible.module_utils.facts.virtual.sysctl import *


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def test_detect_sysctl(self):
        instance = VirtualSysctlDetectionMixin()
        instance.detect_sysctl()
        self.assertIsNotNone(instance.sysctl_path)

    def test_detect_virt_product(self):
        instance = VirtualSysctlDetectionMixin()
        instance.detect_sysctl()
        result = instance.detect_virt_product('key')
        self.assertIsNotNone(result)

    def test_detect_virt_vendor(self):
        instance = VirtualSysctlDetectionMixin()
        instance.detect_sysctl()
        result = instance.detect_virt_vendor('key')
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()