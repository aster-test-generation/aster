import unittest
from ansible.modules.dnf import DnfModule
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


__metaclass__ = type
class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_get_best_version(self):
        instance = DnfModule(None)
        result = instance.get_best_version('name', 'version')
        self.assertIsNone(result)

    def test_get_best_version_available(self):
        instance = DnfModule(None)
        result = instance.get_best_version_available('name')
        self.assertIsNone(result)

    def test_get_existing_packages(self):
        instance = DnfModule(None)
        result = instance.get_existing_packages('name')
        self.assertIsNone(result)

    def test_get_installed_version(self):
        instance = DnfModule(None)
        result = instance.get_installed_version('name')
        self.assertIsNone(result)

    def test_get_latest_version(self):
        instance = DnfModule(None)
        result = instance.get_latest_version('name', 'version')
        self.assertIsNone(result)

    def test_get_latest_version_available(self):
        instance = DnfModule(None)
        result = instance.get_latest_version_available('name')
        self.assertIsNone(result)

    def test_get_repo_url(self):
        instance = DnfModule(None)
        result = instance.get_repo_url('name')
        self.assertIsNone(result)

    def test_get_updates_available(self):
        instance = DnfModule(None)
        result = instance.get_updates_available('name')
        self.assertIsNone(result)

    def test_install_package(self):
        instance = DnfModule(None)
        result = instance.install_package('name', 'version')
        self.assertIsNone(result)

    def test_is_group_environment(self):
        instance = DnfModule(None)
        result = instance.is_group_environment('name')
        self.assertIsNone(result)

    def test_is_group_installed(self):
        instance = DnfModule(None)
        result = instance.is_group_installed('name')
        self.assertIsNone(result)

    def test_is_package_installed(self):
        instance = DnfModule(None)
        result = instance.is_package_installed('name', 'version')
        self.assertIsNone(result)

    def test_is_package_available(self):
        instance = DnfModule(None)
        result = instance.is_package_available('name')
        self.assertIsNone(result)

    def test_is_package_version_installed(self):
        instance = DnfModule(None)
        result = instance.is_package_version_installed('name', 'version')
        self.assertIsNone(result)

    def test_latest_is_installed(self):
        instance = DnfModule(None)
        result = instance.latest_is_installed('name', 'version')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()