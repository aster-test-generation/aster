import unittest
from ansible.modules.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_configure_base(self):
        base = None
        conf_file = None
        disable_gpg_check = None
        installroot = None
        result = DnfModule._configure_base(base, conf_file, disable_gpg_check, installroot)
        self.assertEqual(result, None)

    def test_ensure_dnf(self):
        result = DnfModule._ensure_dnf()
        self.assertEqual(result, None)

    def test_get_best_version(self):
        result = DnfModule().get_best_version()
        self.assertEqual(result, None)

    def test_get_dnf_version(self):
        result = DnfModule().get_dnf_version()
        self.assertEqual(result, None)

    def test_get_package_name(self):
        result = DnfModule.get_package_name()
        self.assertEqual(result, None)

    def test_get_package_version(self):
        result = DnfModule().get_package_version()
        self.assertEqual(result, None)

    def test_get_packages_from_requirement(self):
        result = DnfModule.get_packages_from_requirement()
        self.assertEqual(result, None)

    def test_get_requirement_spec(self):
        result = DnfModule.get_requirement_spec
        self.assertEqual(result, None)

    def test_get_requirements(self):
        result = DnfModule().get_requirements()
        self.assertEqual(result, None)

    def test_get_yum_base(self):
        result = DnfModule().get_yum_base()
        self.assertEqual(result, None)

    def test_is_group_env_installed(self):
        result = DnfModule.is_group_env_installed
        self.assertEqual(result, None)

    def test_is_group_installed(self):
        result = DnfModule.is_group_installed('test')
        self.assertEqual(result, None)

    def test_is_installed(self):
        result = DnfModule.is_installed
        self.assertEqual(result, None)

    def test_is_package_env_installed(self):
        result = DnfModule.is_package_env_installed
        self.assertEqual(result, None)

    def test_is_package_installed(self):
        result = DnfModule.is_package_installed('dnf')
        self.assertEqual(result, None)

    def test_is_provided(self):
        result = DnfModule.is_provided
        self.assertEqual(result, None)

    def test_is_repoquery_installed(self):
        result = DnfModule.is_dnf_installed()
        self.assertEqual(result, None)

    def test_is_yum_base_available(self):
        result = DnfModule.is_dnf_base_available()
        self.assertEqual(result, None)

    def test_list_available_groups(self):
        result = DnfModule.list_available_groups()
        self.assertEqual(result, None)

    def test_list_available_packages(self):
        result = DnfModule().list_available_packages()
        self.assertEqual(result, None)

    def test_list_installed_groups(self):
        result = DnfModule.list_installed_groups()
        self.assertEqual(result, None)

    def test_list_installed_packages(self):
        result = DnfModule.list_installed_packages()
        self.assertEqual(result, None)

    def test_list_repos(self):
        result = DnfModule.list_repositories()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()