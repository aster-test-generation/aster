import unittest
from ansible.module_utils.dnf import DnfModule
from ansible.module_utils.dnf import dnf



class TestDnfModule(unittest.TestCase):
    def test_ensure(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        dnf_module = DnfModule(None)
        dnf_module.names = None
        dnf_module.autoremove = None
        dnf_module.ensure()
        self.assertEqual(response, dnf_module.ensure())

    def test_install_remote_rpms(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        dnf_module = DnfModule(None)
        dnf_module.filenames = None
        dnf_module._install_remote_rpms(None)
        self.assertEqual(response, dnf_module._install_remote_rpms(None))

    def test_update_only(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        dnf_module = DnfModule(None)
        dnf_module.update_only = None
        dnf_module._update_only(None)
        self.assertEqual(response, dnf_module._update_only(None))

    def test_mark_package_install(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        dnf_module = DnfModule(None)
        dnf_module.pkg_spec = None
        dnf_module.upgrade = None
        dnf_module._mark_package_install(None)
        self.assertEqual(response, dnf_module._mark_package_install(None))

    def test_is_module_installed(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        dnf_module = DnfModule(None)
        dnf_module.module_base = None
        dnf_module.module = None
        dnf_module.with_modules = None
        dnf_module._is_module_installed(None)
        self.assertEqual(response, dnf_module._is_module_installed(None))

    def test_sanitize_dnf_error_msg_install(self):
        response = {'msg': '', 'changed': False, 'results': [], 'rc': 0}
        failure_response = {'msg': '', 'failures': [], 'results': [], 'rc': 1}
        dnf_module = DnfModule(None)
        dnf_module.pkg_spec = None
        dnf_module.failure = None
        dnf_module._sanitize_dnf_error_msg_install(None, None)
        self.assertEqual(response, dnf_module._sanitize_dnf_error_msg_install(None, None))

if __name__ == '__main__':
    unittest.main()