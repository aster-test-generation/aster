import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = None
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertEqual(dnf_module.allowerasing, False)
        self.assertEqual(dnf_module.nobest, False)

    def test_ensure_dnf(self):
        dnf_module = DnfModule(AnsibleModule())
        dnf_module._ensure_dnf()
        self.assertIsNotNone(dnf_module.dnf)

    def test_sanitize_dnf_error_msg_remove(self):
        dnf_module = DnfModule(AnsibleModule())
        spec = 'httpd'
        error = 'no package matched'
        result = dnf_module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (False, 'httpd is not installed'))

class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_ensure_dnf(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        self.assertTrue(dnf.dnf)

    def test_sanitize_dnf_error_msg_remove(self):
        module = AnsibleModule(
            argument_spec=yumdnf_argument_spec(),
            supports_check_mode=True
        )
        dnf = DnfModule(module)
        spec = 'httpd'
        error = 'no package matched'
        result = dnf._sanitize_dnf_error_msg_remove(spec, error)
        self.assertEqual(result, (False, 'httpd is not installed'))

if __name__ == '__main__':
    unittest.main()