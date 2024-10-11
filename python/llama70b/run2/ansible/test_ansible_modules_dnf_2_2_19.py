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

    def test_install_remote_rpms(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        filenames = ['/path/to/httpd.rpm']
        dnf_module._install_remote_rpms(filenames)
        # Assert that the package is installed

    def test_update_only(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        pkgs = ['httpd']
        dnf_module._update_only(pkgs)
        # Assert that only updates are installed

    def test__is_newer_version_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        nevra = 'httpd-2.4-1.el7.x86_64'
        self.assertFalse(dnf_module._is_newer_version_installed(nevra))

    def test__package_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        pkg = 'httpd-2.4-1.el7.x86_64'
        package_dict = dnf_module._package_dict(pkg)
        self.assertIsInstance(package_dict, dict)

    def test_lockfile(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.with_modules)

    def test_allowerasing(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule()')

class TestYumDnf(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(yum_dnf, YumDnf)

if __name__ == '__main__':
    unittest.main()