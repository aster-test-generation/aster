import unittest
from ansible.module_utils.yumdnf import YumDnf


class TestYumDnf(unittest.TestCase):
    def setUp(self):
        self.module = {'allow_downgrade': False, 'autoremove': False, 'bugfix': False, 'cacheonly': False, 'conf_file': None, 'disable_excludes': None, 'disable_gpg_check': False, 'disable_plugin': [], 'disablerepo': [], 'download_only': False, 'download_dir': None, 'enable_plugin': [], 'enablerepo': [], 'exclude': [], 'installroot': '/', 'install_repoquery': True, 'install_weak_deps': True, 'list': None, 'name': [], 'releasever': None, 'security': False, 'skip_broken': False, 'state': None, 'update_cache': False, 'update_only': 'no', 'validate_certs': True, 'lock_timeout': 30}

    def test_init(self):
        yumdnf = YumDnf(self.module)
        self.assertEqual(yumdnf.allow_downgrade, False)
        self.assertEqual(yumdnf.autoremove, False)
        self.assertEqual(yumdnf.bugfix, False)
        self.assertEqual(yumdnf.cacheonly, False)
        self.assertEqual(yumdnf.conf_file, None)
        self.assertEqual(yumdnf.disable_excludes, None)
        self.assertEqual(yumdnf.disable_gpg_check, False)
        self.assertEqual(yumdnf.disable_plugin, [])
        self.assertEqual(yumdnf.disablerepo, [])
        self.assertEqual(yumdnf.download_only, False)
        self.assertEqual(yumdnf.download_dir, None)
        self.assertEqual(yumdnf.enable_plugin, [])
        self.assertEqual(yumdnf.enablerepo, [])
        self.assertEqual(yumdnf.exclude, [])
        self.assertEqual(yumdnf.installroot, '/')
        self.assertEqual(yumdnf.install_repoquery, True)
        self.assertEqual(yumdnf.install_weak_deps, True)
        self.assertEqual(yumdnf.list, None)
        self.assertEqual(yumdnf.name, [])
        self.assertEqual(yumdnf.releasever, None)
        self.assertEqual(yumdnf.security, False)
        self.assertEqual(yumdnf.skip_broken, False)
        self.assertEqual(yumdnf.state, None)
        self.assertEqual(yumdnf.update_cache, False)
        self.assertEqual(yumdnf.update_only, 'no')
        self.assertEqual(yumdnf.validate_certs, True)
        self.assertEqual(yumdnf.lock_timeout, 30)

    def test_is_lockfile_present(self):
        yumdnf = YumDnf(self.module)
        self.assertFalse(yumdnf._is_lockfile_present())

    def test_wait_for_lock(self):
        yumdnf = YumDnf(self.module)
        yumdnf.wait_for_lock()

    def test_listify_comma_sep_strings_in_list(self):
        yumdnf = YumDnf(self.module)
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a', 'b']), ['a', 'b'])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a, b']), ['a', 'b'])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a, b, c']), ['a', 'b', 'c'])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a, b, c,']), ['a', 'b', 'c'])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a']), ['a'])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a,']), ['a'])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['']), [])
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(['a, b, c, d, e']), ['a', 'b', 'c', 'd', 'e'])

    def test_run(self):
        yumdnf = YumDnf(self.module)
        with self.assertRaises(NotImplementedError):
            yumdnf.run()

if __name__ == '__main__':
    unittest.main()