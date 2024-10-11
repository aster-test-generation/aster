import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, error

class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'base'))

    def test_install_remote_rpms(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        filenames = ['path/to/rpm1.rpm', 'path/to/rpm2.rpm']
        dnf_module._install_remote_rpms(filenames)
        self.assertTrue(dnf_module.base.add_remote_rpms.called)

    def test_update_only(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.update_only = True
        dnf_module._update_only(['package1', 'package2'])
        self.assertTrue(dnf_module.base.package_install.called)

    def test_allow_downgrade(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        dnf_module.allow_downgrade = True
        dnf_module._install_remote_rpms(['package1.rpm'])
        self.assertTrue(dnf_module.base.package_install.called)

    def test_private_method(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        with self.assertRaises(AttributeError):
            dnf_module.__private_method()

    def test_protected_method(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        with self.assertRaises(AttributeError):
            dnf_module._protected_method()

    def test_magic_method(self):
        module = AnsibleModule()
        dnf_module = dnf.DnfModule(module)
        self.assertEqual(str(dnf_module), 'dnf')
        self.assertEqual(repr(dnf_module), 'dnf')

if __name__ == '__main__':
    unittest.main()