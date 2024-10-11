import unittest
from ansible.modules.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_configure_base(self):
        instance = DnfModule(None)
        instance.configure_base(None, None, None, None)

    def test_configure_base_with_conf_file(self):
        instance = DnfModule(None)
        instance.configure_base(None, None, None, None)

    def test_configure_base_with_disable_gpg_check(self):
        instance = DnfModule(None)
        instance.configure_base(None, None, None, None)

    def test_configure_base_with_installroot(self):
        instance = DnfModule(None)
        instance.configure_base(None, None, None, None)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance.ensure_dnf()

    def test_get_best_version(self):
        instance = DnfModule(None)
        instance.get_best_version(None, None)

    def test_get_existing_packages(self):
        instance = DnfModule(None)
        instance.get_existing_packages()

    def test_get_installed_version(self):
        instance = DnfModule(None)
        instance.get_installed_version(None)

    def test_get_latest_version(self):
        instance = DnfModule(None)
        instance.get_latest_version(None, None)

    def test_get_repoquery(self):
        instance = DnfModule(None)
        instance.get_repoquery()

    def test_install_package(self):
        instance = DnfModule(None)
        instance.install_package(None, None)

    def test_is_group_environment(self):
        instance = DnfModule(None)
        instance.is_group_environment(None)

    def test_is_package_environment(self):
        instance = DnfModule(None)
        instance.is_package_environment(None)

    def test_is_src_package_environment(self):
        instance = DnfModule(None)
        instance.is_src_package_environment(None)

    def test_is_update_environment(self):
        instance = DnfModule(None)
        instance.is_update_environment(None)

    def test_latest_is_present(self):
        instance = DnfModule(None)
        instance.latest_is_present(None)

    def test_local_equals_remote(self):
        instance = DnfModule(None)
        instance.local_equals_remote(None, None)

    def test_local_needs_update(self):
        instance = DnfModule(None)
        instance.local_needs_update(None, None)

    def test_remove_package(self):
        instance = DnfModule(None)
        instance.remove_package(None, None)

    def test_remove_packages(self):
        instance = DnfModule(None)
        instance.remove_packages(None)

    def test_remove_unneeded_dependencies(self):
        instance = DnfModule(None)
        instance.remove_unneeded_dependencies(None)

    def test_run_check_update(self):
        instance = DnfModule(None)
        instance.run_check_update(None)

    def test_run_command(self):
        instance = DnfModule(None)
        instance.run_command(None, None)

    def test_run_install(self):
        instance = DnfModule(None)
        instance.run_install(None, None)

    def test_run_update(self):
        instance = DnfModule(None)
        instance.run_update(None)

if __name__ == '__main__':
    unittest.main()