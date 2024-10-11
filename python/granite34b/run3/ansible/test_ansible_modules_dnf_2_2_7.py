import unittest
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_compare_evr(self):
        dnf_module = DnfModule(AnsibleModule({}))
        self.assertEqual(dnf_module._compare_evr(1, 2, 3, 4, 5, 6), -1)
        self.assertEqual(dnf_module._compare_evr(1, 2, 3, 1, 2, 3), 0)
        self.assertEqual(dnf_module._compare_evr(1, 2, 3, 0, 2, 3), 1)

    def test_ensure_dnf(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        self.assertIsNotNone(dnf_module.dnf)

    def test_get_available_packages(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        available_packages = dnf_module.get_available_packages()
        self.assertGreater(len(available_packages), 0)

    def test_get_installed_packages(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        installed_packages = dnf_module.get_installed_packages()
        self.assertGreater(len(installed_packages), 0)

    def test_get_updates(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        updates = dnf_module.get_updates()
        self.assertGreater(len(updates), 0)

    def test_install_package(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.install_package('example_package')
        self.assertEqual(result['stdout'], 'Package installed successfully')

    def test_remove_package(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.remove_package('example_package')
        self.assertEqual(result['stdout'], 'Package removed successfully')

    def test_upgrade_packages(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.upgrade_packages()
        self.assertEqual(result['stdout'], 'All packages upgraded successfully')

    def test_list_available_packages(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.list_available_packages()
        self.assertGreater(len(result), 0)

    def test_list_installed_packages(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.list_installed_packages()
        self.assertGreater(len(result), 0)

    def test_list_updates(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.list_updates()
        self.assertGreater(len(result), 0)

    def test_list_upgrades(self):
        dnf_module = DnfModule(AnsibleModule({}))
        dnf_module._ensure_dnf()
        result = dnf_module.list_upgrades()
        self.assertGreater(len(result), 0)

if __name__ == '__main__':
    unittest.main()