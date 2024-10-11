import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test__ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'base'))

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
        self.assertIsInstance(dnf_module.with_modules, bool)

    def test_allowerasing(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module.allowerasing, bool)

    def test_nobest(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module.nobest, bool)

    def test__is_newer_version_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        pkg_name = 'httpd'
        result = dnf_module._is_newer_version_installed(pkg_name)
        self.assertIsInstance(result, bool)

    def test__packagename_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        pkg_name = 'httpd'
        result = dnf_module._packagename_dict(pkg_name)
        self.assertIsInstance(result, dict)

    def test__compare_evr(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        epoch1, version1, release1 = '1', '2.4', '1'
        epoch2, version2, release2 = '1', '2.4', '2'
        result = dnf_module._compare_evr(epoch1, version1, release1, epoch2, version2, release2)
        self.assertIsInstance(result, int)

if __name__ == '__main__':
    unittest.main()