import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def test_detect_sysctl(self):
        instance = VirtualSysctlDetectionMixin()
        instance.module = object()
        instance.module.get_bin_path.return_value = 'sysctl'
        instance.detect_sysctl()
        self.assertEqual(instance.sysctl_path, 'sysctl')

    def test_detect_virt_product(self):
        instance = VirtualSysctlDetectionMixin()
        instance.module = object()
        instance.module.get_bin_path.return_value = 'sysctl'
        instance.detect_sysctl()
        instance.module.run_command.return_value = (0, 'KVM', '')
        result = instance.detect_virt_product('security.jail.jailed')
        self.assertEqual(result, {'virtualization_type': 'kvm', 'virtualization_role': 'guest', 'virtualization_tech_guest': {'kvm'}, 'virtualization_tech_host': set()})

    def test_detect_virt_vendor(self):
        instance = VirtualSysctlDetectionMixin()
        instance.module = object()
        instance.module.get_bin_path.return_value = 'sysctl'
        instance.detect_sysctl()
        instance.module.run_command.return_value = (0, 'QEMU', '')
        result = instance.detect_virt_vendor('security.jail.jailed')
        self.assertEqual(result, {'virtualization_type': 'kvm', 'virtualization_role': 'guest', 'virtualization_tech_guest': {'kvm'}, 'virtualization_tech_host': set()})

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