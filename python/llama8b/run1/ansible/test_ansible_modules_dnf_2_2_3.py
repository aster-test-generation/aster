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
        self.assertEqual(dnf_module.with_modules, False)

    def test_ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(dnf_module._ensure_dnf.called)

    def test_lockfile(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_sanitize_dnf_error_msg_remove(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        error = 'no package matched'
        result = dnf_module._sanitize_dnf_error_msg_remove('httpd', error)
        self.assertFalse(result[0])
        self.assertEqual(result[1], '{0} is not installed'.format('httpd'))

    def test_sanitize_dnf_error_msg_remove_no_match(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        error = 'No match for argument:'
        result = dnf_module._sanitize_dnf_error_msg_remove('httpd', error)
        self.assertFalse(result[0])
        self.assertEqual(result[1], '{0} is not installed'.format('httpd'))

    def test_sanitize_dnf_error_msg_remove_other_error(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        error = 'Some other error'
        result = dnf_module._sanitize_dnf_error_msg_remove('httpd', error)
        self.assertTrue(result[0])
        self.assertEqual(result[1], error)

if __name__ == '__main__':
    unittest.main()