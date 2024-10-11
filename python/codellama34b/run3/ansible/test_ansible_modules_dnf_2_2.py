import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_specify_repositories(self):
        instance = DnfModule(None)
        instance._ensure_dnf()
        instance.lockfile = '/var/cache/dnf/*_lock.pid'
        instance.pkg_mgr_name = 'dnf'
        instance.allowerasing = None
        instance.nobest = None
        result = instance._specify_repositories(None, None, None)
        self.assertIsNone(result)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        result = instance._ensure_dnf()
        self.assertIsNone(result)

    def test_run(self):
        instance = DnfModule(None)
        result = instance.run()
        self.assertIsNone(result)

    def test_exit_module(self):
        instance = DnfModule(None)
        result = instance.exit_module()
        self.assertIsNone(result)

    def test_install_packages(self):
        instance = DnfModule(None)
        result = instance.install_packages()
        self.assertIsNone(result)

    def test_remove_packages(self):
        instance = DnfModule(None)
        result = instance.remove_packages()
        self.assertIsNone(result)

    def test_update_packages(self):
        instance = DnfModule(None)
        result = instance.update_packages()
        self.assertIsNone(result)

    def test_latest_packages(self):
        instance = DnfModule(None)
        result = instance.latest_packages()
        self.assertIsNone(result)

    def test_get_packages(self):
        instance = DnfModule(None)
        result = instance.get_packages()
        self.assertIsNone(result)

    def test_get_available_updates(self):
        instance = DnfModule(None)
        result = instance.get_available_updates()
        self.assertIsNone(result)

    def test_get_available_package_updates(self):
        instance = DnfModule(None)
        result = instance.get_available_package_updates()
        self.assertIsNone(result)

    def test_get_available_group_updates(self):
        instance = DnfModule(None)
        result = instance.get_available_group_updates()
        self.assertIsNone(result)

    def test_get_available_upgrades(self):
        instance = DnfModule(None)
        result = instance.get_available_upgrades()
        self.assertIsNone(result)

    def test_get_available_package_upgrades(self):
        instance = DnfModule(None)
        result = instance.get_available_package_upgrades()
        self.assertIsNone(result)

    def test_get_available_group_upgrades(self):
        instance = DnfModule(None)
        result = instance.get_available_group_upgrades()
        self.assertIsNone(result)

    def test_get_installed_packages(self):
        instance = DnfModule(None)
        result = instance.get_installed_packages()
        self.assertIsNone(result)

    def test_get_installed_groups(self):
        instance = DnfModule(None)
        result = instance.get_installed_groups()
        self.assertIsNone(result)

    def test_get_package_groups(self):
        instance = DnfModule(None)
        result = instance.get_package_groups()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()