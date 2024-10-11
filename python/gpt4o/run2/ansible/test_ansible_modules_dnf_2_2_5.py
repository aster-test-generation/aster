import unittest
from ansible.modules.dnf import DnfModule
from ansible.module_utils.basic import AnsibleModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec={
                'allowerasing': {'type': 'bool', 'default': False},
                'nobest': {'type': 'bool', 'default': False},
            }
        )
        self.dnf_module = DnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    def test_split_package_arch_with_arch(self):
        result = self.dnf_module._split_package_arch('package.x86_64')
        self.assertEqual(result, ('package', 'x86_64'))

    def test_split_package_arch_without_arch(self):
        result = self.dnf_module._split_package_arch('package')
        self.assertEqual(result, ('package', None))

    def test_split_package_arch_invalid_arch(self):
        result = self.dnf_module._split_package_arch('package.invalidarch')
        self.assertEqual(result, ('package.invalidarch', None))

if __name__ == '__main__':
    unittest.main()