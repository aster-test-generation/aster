import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def test_detect_sysctl(self):
        mixin = VirtualSysctlDetectionMixin()
        mixin.module = None
        mixin.detect_sysctl()
        self.assertEqual(mixin.sysctl_path, None)

    def test_detect_virt_product(self):
        mixin = VirtualSysctlDetectionMixin()
        mixin.module = None
        result = mixin.detect_virt_product('security.jail.jailed')
        self.assertEqual(result, {'virtualization_type': None, 'virtualization_role': None, 'virtualization_tech_guest': set(), 'virtualization_tech_host': set()})

    def test_detect_virt_vendor(self):
        mixin = VirtualSysctlDetectionMixin()
        mixin.module = None
        result = mixin.detect_virt_vendor('machdep.cpu.brand_string')
        self.assertEqual(result, {'virtualization_type': None, 'virtualization_role': None, 'virtualization_tech_guest': set(), 'virtualization_tech_host': set()})

if __name__ == '__main__':
    unittest.main()