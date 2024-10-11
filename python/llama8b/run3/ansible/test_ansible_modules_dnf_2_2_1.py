import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible_collections community.general.plugins.module_utils.dnf import DnfModul


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_is_lockfile_pid_valid(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.is_lockfile_pid_valid())

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.with_modules)

    def test_get_best_parsable_locale(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        locale = get_best_parsable_locale()
        self.assertIsInstance(locale, text_type)

    def test_has_respawned(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertFalse(has_respawned())

    def test_probe_interpreters_for_module(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        interpreters = probe_interpreters_for_module()
        self.assertIsInstance(interpreters, list)

    def test_respawn_module(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        respawn_module()

    def test_yumdnf_argument_spec(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        spec = yumdnf_argument_spec()
        self.assertIsInstance(spec, dict)

    def test_DnfModule_private_method(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(AttributeError):
            dnf_module.__private_method()

    def test_DnfModule_protected_method(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        with self.assertRaises(AttributeError):
            dnf_module._protected_method()

    def test_DnfModule_magic_method_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.__init__(module), None)

    def test_DnfModule_magic_method_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_DnfModule_magic_method_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule({})'.format(module))

    def test_DnfModule_magic_method_eq(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module, dnf_module)

if __name__ == '__main__':
    unittest.main()