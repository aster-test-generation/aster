import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import dnf as dnf_module_utils


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_sanitize_dnf_error_msg_install(self):
        dnf_module = DnfModule(AnsibleModule())
        error = 'Error message'
        spec = 'package_name'
        result = dnf_module._sanitize_dnf_error_msg_install(spec, error)
        self.assertEqual(result, error)

        error = 'no package matched'
        result = dnf_module._sanitize_dnf_error_msg_install(spec, error)
        self.assertEqual(result, 'No package {0} available.'.format(spec))

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

    def test_DnfModule_methods(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

if __name__ == '__main__':
    unittest.main()