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
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test_base(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        conf_file = '/path/to/conf/file'
        disable_gpg_check = True
        disablerepo = ['repo1', 'repo2']
        enablerepo = ['repo3', 'repo4']
        installroot = '/path/to/install/root'
        base = dnf_module._base(conf_file, disable_gpg_check, disablerepo, enablerepo, installroot)
        self.assertIsInstance(base, dnf.Base)

    def test_configure_base(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf.Base()
        conf_file = '/path/to/conf/file'
        disable_gpg_check = True
        installroot = '/path/to/install/root'
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)
        self.assertTrue(hasattr(base, 'conf'))

    def test_specify_repositories(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf.Base()
        disablerepo = ['repo1', 'repo2']
        enablerepo = ['repo3', 'repo4']
        dnf_module._specify_repositories(base, disablerepo, enablerepo)
        self.assertTrue(hasattr(base, 'repos'))

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(str(dnf_module), str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(repr(dnf_module), str)

class TestYumDnf(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(yum_dnf, YumDnf)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(str(yum_dnf), str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(repr(yum_dnf), str)

if __name__ == '__main__':
    unittest.main()