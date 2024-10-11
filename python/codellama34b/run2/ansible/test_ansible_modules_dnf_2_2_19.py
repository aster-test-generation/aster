import unittest
from ansible.module_utils.dnf import *
from ansible.modules.dnf import *



class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_install_remote_rpms(self):
        instance = DnfModule(None)
        instance._install_remote_rpms(None)

    def test_update_only(self):
        instance = DnfModule(None)
        instance._update_only(None)

    def test_is_newer_version_installed(self):
        instance = DnfModule(None)
        instance._is_newer_version_installed(None)

    def test_package_dict(self):
        instance = DnfModule(None)
        instance._package_dict(None)

    def test_get_best_version(self):
        instance = DnfModule(None)
        instance._get_best_version(None)

    def test_get_package_name_with_arch(self):
        instance = DnfModule(None)
        instance._get_package_name_with_arch(None)

    def test_get_package_name_without_arch(self):
        instance = DnfModule(None)
        instance._get_package_name_without_arch(None)

    def test_get_package_arch(self):
        instance = DnfModule(None)
        instance._get_package_arch(None)

    def test_get_package_version(self):
        instance = DnfModule(None)
        instance._get_package_version(None)

    def test_get_package_release(self):
        instance = DnfModule(None)
        instance._get_package_release(None)

    def test_get_package_nevra(self):
        instance = DnfModule(None)
        instance._get_package_nevra(None)

    def test_get_package_envra(self):
        instance = DnfModule(None)
        instance._get_package_envra(None)

    def test_get_package_nevr(self):
        instance = DnfModule(None)
        instance._get_package_nevr(None)

    def test_get_package_env(self):
        instance = DnfModule(None)
        instance._get_package_env(None)

    def test_get_package_name(self):
        instance = DnfModule(None)
        instance._get_package_name(None)

    def test_get_package_provides(self):
        instance = DnfModule(None)
        instance._get_package_provides(None)

    def test_get_package_requires(self):
        instance = DnfModule(None)
        instance._get_package_requires(None)

    def test_get_package_obsoletes(self):
        instance = DnfModule(None)
        instance._get_package_obsoletes(None)

    def test_get_package_conflicts(self):
        instance = DnfModule(None)
        instance._get_package_conflicts(None)

    def test_get_package_recommends(self):
        instance = DnfModule(None)
        instance._get_package_recommends(None)

    def test_get_package_suggests(self):
        instance = DnfModule(None)
        instance._get_package_suggests(None)

    def test_get_package_info(self):
        instance = DnfModule(None)
        instance._get_package_info(None)

    def test_get_package_url(self):
        instance = DnfModule(None)
        instance._get_package_url(None)

class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertEqual(instance.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(instance.pkg_mgr_name, 'dnf')
        self.assertEqual(instance.allowerasing, None)
        self.assertEqual(instance.nobest, None)

if __name__ == '__main__':
    unittest.main()