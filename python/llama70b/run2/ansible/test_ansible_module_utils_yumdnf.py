import unittest
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class TestYumDnf(unittest.TestCase):
    def setUp(self):
        self.module = MockModule()
        self.yumdnf = YumDnf(self.module)

    def test___init__(self):
        self.assertIsInstance(self.yumdnf, YumDnf)
        self.assertEqual(self.yumdnf.module, self.module)

    def test_allow_downgrade(self):
        self.assertEqual(self.yumdnf.allow_downgrade, False)

    def test_autoremove(self):
        self.assertEqual(self.yumdnf.autoremove, False)

    def test_bugfix(self):
        self.assertEqual(self.yumdnf.bugfix, False)

    def test_cacheonly(self):
        self.assertEqual(self.yumdnf.cacheonly, False)

    def test_conf_file(self):
        self.assertIsNone(self.yumdnf.conf_file)

    def test_disable_excludes(self):
        self.assertIsNone(self.yumdnf.disable_excludes)

    def test_disable_gpg_check(self):
        self.assertEqual(self.yumdnf.disable_gpg_check, False)

    def test_disable_plugin(self):
        self.assertEqual(self.yumdnf.disable_plugin, [])

    def test_disablerepo(self):
        self.assertEqual(self.yumdnf.disablerepo, [])

    def test_download_only(self):
        self.assertEqual(self.yumdnf.download_only, False)

    def test_download_dir(self):
        self.assertIsNone(self.yumdnf.download_dir)

    def test_enable_plugin(self):
        self.assertEqual(self.yumdnf.enable_plugin, [])

    def test_enablerepo(self):
        self.assertEqual(self.yumdnf.enablerepo, [])

    def test_exclude(self):
        self.assertEqual(self.yumdnf.exclude, [])

    def test_installroot(self):
        self.assertEqual(self.yumdnf.installroot, "/")

    def test_install_repoquery(self):
        self.assertEqual(self.yumdnf.install_repoquery, True)

    def test_install_weak_deps(self):
        self.assertEqual(self.yumdnf.install_weak_deps, True)

    def test_list(self):
        self.assertIsNone(self.yumdnf.list)

    def test_names(self):
        self.assertEqual(self.yumdnf.names, [])

    def test_releasever(self):
        self.assertIsNone(self.yumdnf.releasever)

    def test_security(self):
        self.assertEqual(self.yumdnf.security, False)

    def test_skip_broken(self):
        self.assertEqual(self.yumdnf.skip_broken, False)

    def test_state(self):
        self.assertIsNone(self.yumdnf.state)

    def test_update_only(self):
        self.assertEqual(self.yumdnf.update_only, False)

    def test_update_cache(self):
        self.assertEqual(self.yumdnf.update_cache, False)

    def test_validate_certs(self):
        self.assertEqual(self.yumdnf.validate_certs, True)

    def test_lock_timeout(self):
        self.assertEqual(self.yumdnf.lock_timeout, 30)

    def test_lockfile(self):
        self.assertEqual(self.yumdnf.lockfile, '/var/run/yum.pid')

    def test_is_lockfile_pid_valid(self):
        with self.assertRaises(NotImplementedError):
            self.yumdnf.is_lockfile_pid_valid()

    def test__is_lockfile_present(self):
        self.assertFalse(self.yumdnf._is_lockfile_present())

    def test_wait_for_lock(self):
        self.yumdnf.wait_for_lock()

    def test_listify_comma_sep_strings_in_list(self):
        input_list = ['a,b,c', 'd,e,f']
        expected_output = ['a', 'b', 'c', 'd', 'e', 'f']
        self.assertEqual(self.yumdnf.listify_comma_sep_strings_in_list(input_list), expected_output)

    def test_run(self):
        with self.assertRaises(NotImplementedError):
            self.yumdnf.run()

class MockModule:
    def __init__(self):
        self.params = {}

    def fail_json(self, **kwargs):
        pass

if __name__ == '__main__':
    unittest.main()