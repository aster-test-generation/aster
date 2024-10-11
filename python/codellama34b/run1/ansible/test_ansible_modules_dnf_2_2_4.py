import unittest
from ansible.module_utils.dnf import DnfModule
from ansible.modules.dnf import *


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.lockfile)
        self.assertIsNone(instance.pkg_mgr_name)
        self.assertFalse(instance.with_modules)
        self.assertFalse(instance.allowerasing)
        self.assertFalse(instance.nobest)

    def test_package_dict(self):
        instance = DnfModule(None)
        result = instance._package_dict(None)
        self.assertIsNone(result)



class TestDnfModule(unittest.TestCase):
    def test_package_dict(self):
        instance = DnfModule(None)
        result = instance._package_dict(None)
        self.assertEqual(result, None)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        result = instance._ensure_dnf()
        self.assertEqual(result, None)

    def test_get_best_version(self):
        instance = DnfModule(None)
        result = instance._get_best_version(None, None, None)
        self.assertEqual(result, None)

    def test_get_package_version(self):
        instance = DnfModule(None)
        result = instance._get_package_version(None, None)
        self.assertEqual(result, None)

    def test_get_package_name_with_version(self):
        instance = DnfModule(None)
        result = instance._get_package_name_with_version(None, None)
        self.assertEqual(result, None)

    def test_get_package_name_with_wildcard(self):
        instance = DnfModule(None)
        result = instance._get_package_name_with_wildcard(None, None)
        self.assertEqual(result, None)

    def test_get_package_name_with_regex(self):
        instance = DnfModule(None)
        result = instance._get_package_name_with_regex(None, None)
        self.assertEqual(result, None)

    def test_get_package_names_to_install(self):
        instance = DnfModule(None)
        result = instance._get_package_names_to_install(None, None, None)
        self.assertEqual(result, None)

    def test_get_package_names_to_update(self):
        instance = DnfModule(None)
        result = instance._get_package_names_to_update(None, None, None)
        self.assertEqual(result, None)

    def test_get_package_names_to_remove(self):
        instance = DnfModule(None)
        result = instance._get_package_names_to_remove(None, None, None)
        self.assertEqual(result, None)

    def test_get_exclude_packages(self):
        instance = DnfModule(None)
        result = instance._get_exclude_packages(None, None)
        self.assertEqual(result, None)

    def test_get_latest_version_available(self):
        instance = DnfModule(None)
        result = instance._get_latest_version_available(None, None, None)
        self.assertEqual(result, None)

    def test_get_latest_version_available_to_downgrade(self):
        instance = DnfModule(None)
        result = instance._get_latest_version_available_to_downgrade(None, None, None)
        self.assertEqual(result, None)

    def test_get_latest_version_available_to_install(self):
        instance = DnfModule(None)
        result = instance._get_latest_version_available_to_install(None, None, None)
        self.assertEqual(result, None)

    def test_get_latest_version_available_to_update(self):
        instance = DnfModule(None)
        result = instance._get_latest_version_available_to_update(None, None, None)
        self.assertEqual(result, None)

    def test_get_latest_version_available_to_reinstall(self):
        instance = DnfModule(None)
        result = instance._get_latest_version_available_to_reinstall(None, None, None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()