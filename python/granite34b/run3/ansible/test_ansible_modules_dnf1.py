import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule

class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_ensure_dnf(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        self.assertTrue(dnf.dnf)

    def test_sanitize_dnf_error_msg_install(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        spec = 'httpd'
        error = 'No package httpd available.'
        result = dnf._sanitize_dnf_error_msg_install(spec, error)
        self.assertEqual(result, 'No package httpd available.')

    def test_get_available_packages(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.get_available_packages()
        self.assertTrue(result)

    def test_get_installed_packages(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.get_installed_packages()
        self.assertTrue(result)

    def test_get_updates(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.get_updates()
        self.assertTrue(result)

    def test_has_updates(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.has_updates()
        self.assertTrue(result)

    def test_has_security_updates(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.has_security_updates()
        self.assertTrue(result)

    def test_has_bugfix_updates(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.has_bugfix_updates()
        self.assertTrue(result)

    def test_has_package_updates(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.has_package_updates()
        self.assertTrue(result)

    def test_install(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.install()
        self.assertTrue(result)

    def test_remove(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.remove()
        self.assertTrue(result)

    def test_update(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.update()
        self.assertTrue(result)

    def test_list_transactions(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.list_transactions()
        self.assertTrue(result)

    def test_list_installed_packages(self):
        module = AnsibleModule( yumdnf_argument_spec() )
        dnf = DnfModule(module)
        result = dnf.list_installed_packages()
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()