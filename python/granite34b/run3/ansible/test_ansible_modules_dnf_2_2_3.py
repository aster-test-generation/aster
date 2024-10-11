import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = None
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.module, module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(dnf_module.with_modules)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_sanitize_dnf_error_msg_remove(self):
        dnf_module = DnfModule(AnsibleModule())
        spec = 'httpd'
        error = 'no package matched'
        result = dnf_module._sanitize_dnf_error_msg_remove(spec, error)
        self.assertFalse(result[0])
        self.assertEqual(result[1], 'httpd is not installed')

if __name__ == '__main__':
    unittest.main()