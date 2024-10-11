import unittest
from ansible.module_utils._text import to_native, to_text
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils import dnf as dnf_module_util


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

    def test_sanitize_dnf_error_msg_install(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        error = 'No package matched'
        result = dnf_module._sanitize_dnf_error_msg_install('httpd', error)
        self.assertEqual(result, 'No package httpd available.')

    def test_str(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = str(dnf_module)
        self.assertEqual(result, 'DnfModule')

    def test_repr(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = repr(dnf_module)
        self.assertEqual(result, 'DnfModule({})'.format(dnf_module.__dict__))

    def test_eq(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = DnfModule(module)
        self.assertEqual(dnf_module1, dnf_module2)

    def test_ne(self):
        module = AnsibleModule()
        dnf_module1 = DnfModule(module)
        dnf_module2 = object()
        self.assertNotEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()