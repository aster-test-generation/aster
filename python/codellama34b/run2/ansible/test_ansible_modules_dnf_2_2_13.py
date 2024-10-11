import unittest
from ansible.module_utils.dnf import DnfModule



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.base)
        self.assertIsNone(instance.conf)
        self.assertIsNone(instance.dnf)
        self.assertIsNone(instance.module)
        self.assertIsNone(instance.rpmdb)
        self.assertIsNone(instance.transaction)
        self.assertIsNone(instance.yumbase)
        self.assertIsNone(instance.yumdnf)
        self.assertIsNone(instance.yumplugin)
        self.assertEqual(instance.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(instance.pkg_mgr_name, 'dnf')
        self.assertFalse(instance.with_modules)
        self.assertFalse(instance.allowerasing)
        self.assertFalse(instance.nobest)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.ensure_dnf())

    def test_is_installed(self):
        instance = DnfModule(None)
        self.assertFalse(instance.is_installed('pkg'))

    def test_get_best_version(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_best_version('pkg'))

    def test_get_best_versions(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_best_versions('pkg'))

    def test_get_existing_packages(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_existing_packages('pkg'))

    def test_get_installed_version(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_installed_version('pkg'))

    def test_get_latest_version(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_latest_version('pkg'))

    def test_get_latest_versions(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_latest_versions('pkg'))

    def test_get_repo_data(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_repo_data('pkg'))

    def test_get_update_cmd(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_update_cmd('pkg'))

    def test_get_upgrade_cmd(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.get_upgrade_cmd('pkg'))

    def test_install(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.install('pkg'))

    def test_local_install(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.local_install('pkg'))

    def test_remove(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.remove('pkg'))

    def test_repoquery(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.repoquery('pkg'))

    def test_run(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.run('pkg'))

    def test_update(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.update('pkg'))

    def test_upgrade(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.upgrade('pkg'))

    def test_what_provides(self):
        instance = DnfModule(None)
        self.assertIsNone(instance.what_provides('pkg'))

if __name__ == '__main__':
    unittest.main()