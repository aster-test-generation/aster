import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def test_detect_sysctl(self):
        instance = VirtualSysctlDetectionMixin()
        instance.detect_sysctl()
        self.assertIsNotNone(instance.sysctl_path)

    def test_detect_virt_product(self):
        instance = VirtualSysctlDetectionMixin()
        instance.detect_sysctl()
        result = instance.detect_virt_product('security.jail.jailed')
        self.assertIsInstance(result, dict)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    def test_detect_virt_vendor(self):
        instance = VirtualSysctlDetectionMixin()
        instance.detect_sysctl()
        result = instance.detect_virt_vendor('security.jail.jailed')
        self.assertIsInstance(result, dict)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    def test_str_method(self):
        instance = VirtualSysctlDetectionMixin()
        result = str(instance)
        self.assertEqual(result, 'VirtualSysctlDetectionMixin')

    def test_repr_method(self):
        instance = VirtualSysctlDetectionMixin()
        result = repr(instance)
        self.assertEqual(result, 'VirtualSysctlDetectionMixin()')

    def test_eq_method(self):
        instance1 = VirtualSysctlDetectionMixin()
        instance2 = VirtualSysctlDetectionMixin()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()