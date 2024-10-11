import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_update_only(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        pkgs = ['pkg1', 'pkg2']
        not_installed = dnf_module._update_only(pkgs)
        self.assertEqual(not_installed, [])

    def test_is_installed(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module._is_installed('pkg1'))
        self.assertFalse(dnf_module._is_installed('non_existent_pkg'))

    def test_upgrade(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.base.upgrade('pkg1'), None)

    def test_package_upgrade(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.base.package_upgrade('pkg1'), None)

    def test__ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module._ensure_dnf(), None)

    def test__is_installed(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module._is_installed('pkg1'))
        self.assertFalse(dnf_module._is_installed('non_existent_pkg'))

    def test__update_only(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        pkgs = ['pkg1', 'pkg2']
        not_installed = dnf_module._update_only(pkgs)
        self.assertEqual(not_installed, [])

    def test__str__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test__repr__(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule(module)')

    def test__eq__(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()