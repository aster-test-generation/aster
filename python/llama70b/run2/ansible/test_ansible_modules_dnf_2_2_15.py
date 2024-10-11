import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test__ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'base'))

    def test_mark_package_install(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module._mark_package_install('httpd')
        self.assertIsInstance(result, dict)

    def test__is_newer_version_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module._is_newer_version_installed('httpd')
        self.assertIsInstance(result, bool)

    def test__is_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module._is_installed('httpd')
        self.assertIsInstance(result, bool)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = str(dnf_module)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = repr(dnf_module)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        module2 = AnsibleModule({'name': 'httpd', 'state': 'latest'})
        dnf_module1 = DnfModule(module1)
        dnf_module2 = DnfModule(module2)
        result = dnf_module1 == dnf_module2
        self.assertIsInstance(result, bool)

class TestYumDnf(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(yum_dnf, YumDnf)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        result = str(yum_dnf)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        result = repr(yum_dnf)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        module2 = AnsibleModule({'name': 'httpd', 'state': 'latest'})
        yum_dnf1 = YumDnf(module1)
        yum_dnf2 = YumDnf(module2)
        result = yum_dnf1 == yum_dnf2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()