import unittest
from ansible.module_utils.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_get_best_version(self):
        instance = DnfModule(None)
        instance.get_best_version()

    def test_get_best_candidate(self):
        instance = DnfModule(None)
        instance.get_best_candidate()

    def test_get_update_outcome(self):
        instance = DnfModule(None)
        instance.get_update_outcome()

    def test_get_downgrade_outcome(self):
        instance = DnfModule(None)
        instance.get_downgrade_outcome()

    def test_get_reinstall_outcome(self):
        instance = DnfModule(None)
        instance.get_reinstall_outcome()

    def test_get_install_outcome(self):
        instance = DnfModule(None)
        instance.get_install_outcome()

    def test_get_remove_outcome(self):
        instance = DnfModule(None)
        instance.get_remove_outcome()

    def test_get_latest_outcome(self):
        instance = DnfModule(None)
        instance.get_latest_outcome()

    def test_get_latest_outcome_for_group(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_group()

    def test_get_latest_outcome_for_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_package()

    def test_get_latest_outcome_for_local_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_local_package()

    def test_get_latest_outcome_for_url_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_url_package()

    def test_get_latest_outcome_for_binary_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_binary_package()

    def test_get_latest_outcome_for_src_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_src_package()

    def test_get_latest_outcome_for_appstream_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_appstream_package()

    def test_get_latest_outcome_for_modular_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_modular_package()

    def test_get_latest_outcome_for_modular_stream_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_modular_stream_package()

    def test_get_latest_outcome_for_modular_profile_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_modular_profile_package()

    def test_get_latest_outcome_for_modular_stream_profile_package(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_modular_stream_profile_package()

    def test_get_latest_outcome_for_modular_stream_profile_package_with_version(self):
        instance = DnfModule(None)
        instance.get_latest_outcome_for_modular_stream_profile_package_with_version()

if __name__ == '__main__':
    unittest.main()