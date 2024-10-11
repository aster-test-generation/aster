import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
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

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module.with_modules)

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module.module.params['allowerasing'] = True
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module.module.params['nobest'] = True
        self.assertTrue(dnf_module.nobest)

    def test_get_best_parsable_locale(self):
        locale = get_best_parsable_locale()
        self.assertIsInstance(locale, str)

    def test_has_respawned(self):
        self.assertFalse(has_respawned())

    def test_probe_interpreters_for_module(self):
        interpreters = probe_interpreters_for_module()
        self.assertIsInstance(interpreters, list)

    def test_respawn_module(self):
        module = AnsibleModule()
        respawn_module(module)

    def test_yumdnf_argument_spec(self):
        spec = yumdnf_argument_spec()
        self.assertIsInstance(spec, dict)

    def test_dnf_module_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_dnf_module_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule')

    def test_dnf_module_eq(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()