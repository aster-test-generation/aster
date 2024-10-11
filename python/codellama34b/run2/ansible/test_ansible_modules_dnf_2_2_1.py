import unittest
from ansible.module_utils.dnf import DnfModule
from ansible.modules.dnf import DnfModule
from ansible.module_utils.urls import fetch_file
from ansible.module_utils.six import PY2, text_type
from ansible.module_utils.compat.version import LooseVersion
from ansible.module_utils.common.locale import get_best_parsable_locale
from ansible.module_utils.common.respawn import has_respawned, probe_interpreters_for_module, respawn_module
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_is_lockfile_pid_valid(self):
        instance = DnfModule(None)
        result = instance.is_lockfile_pid_valid()
        self.assertTrue(result)


__metaclass__ = type
class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_lockfile_pid_valid(self):
        instance = DnfModule(None)
        result = instance.is_lockfile_pid_valid()
        self.assertTrue(result)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_get_best_version(self):
        instance = DnfModule(None)
        result = instance.get_best_version(None, None)
        self.assertIsNone(result)

    def test_get_best_candidate(self):
        instance = DnfModule(None)
        result = instance.get_best_candidate(None, None)
        self.assertIsNone(result)

    def test_get_best_candidate_with_version(self):
        instance = DnfModule(None)
        result = instance.get_best_candidate_with_version(None, None)
        self.assertIsNone(result)

    def test_get_candidate_version(self):
        instance = DnfModule(None)
        result = instance.get_candidate_version(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version_arch(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version_arch(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version_epoch(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version_epoch(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version_release(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version_release(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version_release_arch(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version_release_arch(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version_release_epoch(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version_release_epoch(None, None)
        self.assertIsNone(result)

    def test_get_package_name_with_version_release_epoch_arch(self):
        instance = DnfModule(None)
        result = instance.get_package_name_with_version_release_epoch_arch(None, None)
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()