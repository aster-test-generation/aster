import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def test_detect_sysctl(self):
        instance = VirtualSysctlDetectionMixin()
        from unittest import mock
        instance.detect_sysctl()
        self.assertIsNotNone(instance.sysctl_path)

    def test_detect_virt_product(self):
        instance = VirtualSysctlDetectionMixin()
        from unittest.mock import Mock
        instance.sysctl_path = 'sysctl'
        key = 'some_key'
        out = 'KVM'
        instance.module.run_command.return_value = (0, out, '')
        result = instance.detect_virt_product(key)
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_detect_virt_vendor(self):
        instance = VirtualSysctlDetectionMixin()
        from unittest.mock import Mock
        instance.sysctl_path = 'sysctl'
        key = 'some_key'
        out = 'QEMU'
        instance.module.run_command.return_value = (0, out, '')
        result = instance.detect_virt_vendor(key)
        self.assertEqual(result['virtualization_type'], 'kvm')
        self.assertEqual(result['virtualization_role'], 'guest')

    def test_private_method__detect_sysctl(self):
        instance = VirtualSysctlDetectionMixin()
        from unittest import mock
        instance._VirtualSysctlDetectionMixin__detect_sysctl()
        self.assertIsNotNone(instance.sysctl_path)

    def test_magic_method__init__(self):
        instance = VirtualSysctlDetectionMixin()
        self.assertIsInstance(instance, VirtualSysctlDetectionMixin)

    def test_magic_method__str__(self):
        instance = VirtualSysctlDetectionMixin()
        self.assertIsInstance(instance.__str__(), str)

    def test_magic_method__repr__(self):
        instance = VirtualSysctlDetectionMixin()
        self.assertIsInstance(instance.__repr__(), str)

if __name__ == '__main__':
    unittest.main()