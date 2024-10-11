import unittest
from ansible.module_utils._text import to_native
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import AnsibleModul
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(dnf_module.with_modules, False)
        self.assertFalse(dnf_module.allowerasing)
        self.assertFalse(dnf_module.nobest)

    def test_sanitize_dnf_error_msg_remove(self):
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._sanitize_dnf_error_msg_remove('httpd', 'no package matched')
        self.assertFalse(result[0])
        self.assertEqual(result[1], '{0} is not installed'.format('httpd'))

    def test_sanitize_dnf_error_msg_remove_no_match(self):
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._sanitize_dnf_error_msg_remove('httpd', 'No match for argument:')
        self.assertFalse(result[0])
        self.assertEqual(result[1], '{0} is not installed'.format('httpd'))

    def test_sanitize_dnf_error_msg_remove_other_error(self):
        dnf_module = DnfModule(AnsibleModule())
        result = dnf_module._sanitize_dnf_error_msg_remove('httpd', 'Error: Package httpd-2.4.7-1.el7.x86_64 is already installed')
        self.assertTrue(result[0])
        self.assertEqual(result[1], 'Error: Package httpd-2.4.7-1.el7.x86_64 is already installed')

    def test_init_with_allowerasing(self):
        module = AnsibleModule()
        module.params['allowerasing'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_init_with_nobest(self):
        module = AnsibleModule()
        module.params['nobest'] = True
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

if __name__ == '__main__':
    unittest.main()