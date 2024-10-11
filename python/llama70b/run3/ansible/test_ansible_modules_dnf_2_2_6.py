import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, YumDnf)

    def test_ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()  # private method

    def test_packagename_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module._packagename_dict('httpd-2.4.6-1.el7.x86_64.rpm')
        self.assertEqual(result, {'name': 'httpd', 'epoch': '0', 'release': '1.el7', 'version': '2.4.6'})

    def test_split_package_arch(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        nevr, arch = dnf_module._split_package_arch('httpd-2.4.6-1.el7.x86_64')
        self.assertEqual(nevr, 'httpd-2.4.6-1.el7')
        self.assertEqual(arch, 'x86_64')

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = str(dnf_module)
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = repr(dnf_module)
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        from ansible.module_utils.basic import AnsibleModule
        module2 = AnsibleModule(argument_spec=dict())
        dnf_module1 = DnfModule(module1)
        dnf_module2 = DnfModule(module2)
        self.assertNotEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()