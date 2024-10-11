import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import dnf as dnf_modul


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.with_modules)

    def test_is_newer_version_installed(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module._is_newer_version_installed('non-existent-package'))
        self.assertFalse(dnf_module._is_newer_version_installed('package-not-installed'))
        self.assertTrue(dnf_module._is_newer_version_installed('package-installed'))

    def test_compare_evr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module._compare_evr(1, '1.0', '1', 1, '1.1', '1'), 1)
        self.assertEqual(dnf_module._compare_evr(1, '1.0', '1', 1, '1.0', '1'), 0)
        self.assertEqual(dnf_module._compare_evr(1, '1.0', '1', 1, '1.2', '1'), -1)

    def test_packagename_dict(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module._packagename_dict('package-name'), {'name': 'package-name'})

    def test_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule(module)')

    def test_eq(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()