import unittest
from ansible.module_utils.facts.virtual.sysctl import VirtualSysctlDetectionMixin
from unittest.mock import Mock


class TestVirtualSysctlDetectionMixin(unittest.TestCase):
    def test_detect_sysctl(self):
        mixin = VirtualSysctlDetectionMixin()
        mixin.module = Mock()
        mixin.module.get_bin_path.return_value = 'sysctl'
        mixin.detect_sysctl()
        mixin.module.get_bin_path.assert_called_once_with('sysctl')

    def test_detect_virt_product(self):
        mixin = VirtualSysctlDetectionMixin()
        mixin.module = Mock()
        mixin.module.run_command.return_value = (0, 'KVM', '')
        result = mixin.detect_virt_product('some_key')
        mixin.module.run_command.assert_called_once_with('%s -n %s' % (mixin.sysctl_path, 'some_key'))
        self.assertEqual(result, {'virtualization_type': 'kvm', 'virtualization_role': 'guest', 'virtualization_tech_guest': {'kvm'}})

    def test_detect_virt_vendor(self):
        mixin = VirtualSysctlDetectionMixin()
        mixin.module = Mock()
        mixin.module.run_command.return_value = (0, 'QEMU', '')
        result = mixin.detect_virt_vendor('some_key')
        mixin.module.run_command.assert_called_once_with('%s -n %s' % (mixin.sysctl_path, 'some_key'))
        self.assertEqual(result, {'virtualization_type': 'kvm', 'virtualization_role': 'guest', 'virtualization_tech_guest': {'kvm'}})

if __name__ == '__main__':
    unittest.main()