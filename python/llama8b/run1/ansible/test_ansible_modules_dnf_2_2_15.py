import unittest
from ansible.module_utils._text import to_native
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.module_utils.basic import AnsibleModule, missing_required_li


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test_mark_package_install(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module._mark_package_install('package_name')
        self.assertIsInstance(result, dict)

    def test_is_newer_version_installed(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module._is_newer_version_installed('package_name')
        self.assertIsInstance(result, bool)

    def test_is_installed(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module._is_installed('package_name')
        self.assertIsInstance(result, bool)

    def test_upgrade(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.base.upgrade('package_name')
        self.assertIsInstance(result, dict)

    def test_install(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.base.install('package_name')
        self.assertIsInstance(result, dict)

    def test__ensure_dnf(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module._ensure_dnf()
        self.assertIsInstance(result, bool)

    def test_lockfile(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.lockfile
        self.assertIsInstance(result, str)

    def test_pkg_mgr_name(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.pkg_mgr_name
        self.assertIsInstance(result, str)

    def test_allowerasing(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.allowerasing
        self.assertIsInstance(result, bool)

    def test_nobest(self):
        module = AnsibleModule()
        dnf_module = DnfModule(module)
        result = dnf_module.nobest
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()