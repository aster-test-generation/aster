import unittest
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestYumDnf(unittest.TestCase):
    def test_init(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsInstance(instance, YumDnf)

    def test_allow_downgrade(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.allow_downgrade)

    def test_autoremove(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.autoremove)

    def test_bugfix(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.bugfix)

    def test_cacheonly(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.cacheonly)

    def test_conf_file(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsNone(instance.conf_file)

    def test_disable_excludes(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsNone(instance.disable_excludes)

    def test_disable_gpg_check(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.disable_gpg_check)

    def test_disable_plugin(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.disable_plugin, [])

    def test_disablerepo(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.disablerepo, [])

    def test_download_only(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.download_only)

    def test_download_dir(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsNone(instance.download_dir)

    def test_enable_plugin(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.enable_plugin, [])

    def test_enablerepo(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.enablerepo, [])

    def test_exclude(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.exclude, [])

    def test_installroot(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.installroot, "/")

    def test_install_repoquery(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertTrue(instance.install_repoquery)

    def test_install_weak_deps(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertTrue(instance.install_weak_deps)

    def test_list(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsNone(instance.list)

    def test_names(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.names, [])

    def test_releasever(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsNone(instance.releasever)

    def test_security(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.security)

    def test_skip_broken(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.skip_broken)

    def test_state(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertIsNone(instance.state)

    def test_update_only(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.update_only)

    def test_update_cache(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance.update_cache)

    def test_validate_certs(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertTrue(instance.validate_certs)

    def test_lock_timeout(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.lock_timeout, 30)

    def test_lockfile(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertEqual(instance.lockfile, '/var/run/yum.pid')

    def test_is_lockfile_pid_valid(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        with self.assertRaises(NotImplementedError):
            instance.is_lockfile_pid_valid()

    def test__is_lockfile_present(self):
        from unittest.mock import Mock
        instance = YumDnf(module)
        self.assertFalse(instance._is_lockfile_present())

if __name__ == '__main__':
    unittest.main()