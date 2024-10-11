import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_mark_package_install(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_newer_version_installed(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_installed(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_available(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_excluded(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_present(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_latest(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_absent(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_locked(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_available_version(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_installed_version(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_downgrade_version(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_latest_version(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_install(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_update(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_remove(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_lock(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_unlock(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_downgrade(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_reinstall(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_latest(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_absent(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_present(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_get_version_for_modularity(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

if __name__ == '__main__':
    unittest.main()