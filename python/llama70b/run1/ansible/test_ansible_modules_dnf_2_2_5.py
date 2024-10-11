import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test__init__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test__ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()  # This method is not implemented, so it should raise an exception

    def test_split_package_arch(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module._split_package_arch('package-name.noarch')
        self.assertEqual(result, ('package-name', 'noarch'))

    def test_split_package_arch_no_arch(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module._split_package_arch('package-name')
        self.assertEqual(result, ('package-name', None))

class TestYumDnf(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(yum_dnf, YumDnf)

    def test__init__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertEqual(yum_dnf.module, module)

if __name__ == '__main__':
    unittest.main()