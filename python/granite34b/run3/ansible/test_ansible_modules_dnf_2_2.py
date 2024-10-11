import unittest
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        self.assertTrue(dnf)

    def test_ensure_dnf(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        dnf._ensure_dnf()
        self.assertTrue(dnf.base)

    def test_parse_spec_group_file(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        pkg_specs, group_specs, module_specs, filenames = dnf._parse_spec_group_file()
        self.assertTrue(pkg_specs)
        self.assertTrue(group_specs)
        self.assertTrue(module_specs)
        self.assertTrue(filenames)

    def test_install_remote_rpms(self):
        module = AnsibleModule( yumdnf_argument_spec )
        dnf = DnfModule(module)
        dnf._install_remote_rpms()
        self.assertTrue(dnf.base)

    def test_mark_package_install(self):
        module = AnsibleModule( argument_spec )
        dnf = DnfModule(module)
        install_result = dnf._mark_package_install('test_package')
        self.assertTrue(install_result)

    def test_update_only(self):
        module = AnsibleModule( argument_spec )
        dnf = DnfModule(module)
        not_installed = dnf._update_only('test_package')
        self.assertTrue(not_installed)

    def test_sanitize_dnf_error_msg_install(self):
        module = AnsibleModule( argument_spec = yumdnf_argument_spec )
        dnf = DnfModule(module)
        failure_msg = dnf._sanitize_dnf_error_msg_install('test_package', 'test_failure_msg')
        self.assertTrue(failure_msg)

    def test_sanitize_dnf_error_msg_remove(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        is_failure, handled_remove_error = dnf._sanitize_dnf_error_msg_remove('test_package', 'test_remove_error_msg')
        self.assertTrue(is_failure)
        self.assertTrue(handled_remove_error)

    def test_is_module_installed(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        is_installed = dnf._is_module_installed('test_module')
        self.assertTrue(is_installed)

    def test_install_remote_rpms(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        dnf._install_remote_rpms()
        self.assertTrue(dnf.base)

    def test_install_local_rpms(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        dnf._install_local_rpms()
        self.assertTrue(dnf.base)

    def test_install_url_rpms(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        dnf._install_url_rpms()
        self.assertTrue(dnf.base)

    def test_install_binary_rpms(self):
        module = AnsibleModule( argument_spec=yumdnf_argument_spec )
        dnf = DnfModule(module)
        dnf._install_binary_rpms()
        self.assertTrue(dnf.base)

if __name__ == '__main__':
    unittest.main()