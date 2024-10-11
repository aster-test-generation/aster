import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.yumdnf import YumDnf


class ConcreteYumDnf(YumDnf):
    def is_lockfile_pid_valid(self):
        raise NotImplementedError

    def run(self):
        raise NotImplementedError

class TestYumDnf(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.module.params = {
            'allow_downgrade': False,
            'autoremove': False,
            'bugfix': False,
            'cacheonly': False,
            'conf_file': None,
            'disable_excludes': None,
            'disable_gpg_check': False,
            'disable_plugin': [],
            'disablerepo': [],
            'download_only': False,
            'download_dir': None,
            'enable_plugin': [],
            'enablerepo': [],
            'exclude': [],
            'installroot': "/",
            'install_repoquery': True,
            'install_weak_deps': True,
            'list': None,
            'name': [],
            'releasever': None,
            'security': False,
            'skip_broken': False,
            'state': None,
            'update_cache': False,
            'update_only': "no",
            'validate_certs': True,
            'lock_timeout': 30,
        }
        self.yumdnf = ConcreteYumDnf(self.module)

    def test_init(self):
        self.assertEqual(self.yumdnf.allow_downgrade, False)
        self.assertEqual(self.yumdnf.autoremove, False)
        self.assertEqual(self.yumdnf.bugfix, False)
        self.assertEqual(self.yumdnf.cacheonly, False)
        self.assertEqual(self.yumdnf.conf_file, None)
        self.assertEqual(self.yumdnf.disable_excludes, None)
        self.assertEqual(self.yumdnf.disable_gpg_check, False)
        self.assertEqual(self.yumdnf.disable_plugin, [])
        self.assertEqual(self.yumdnf.disablerepo, [])
        self.assertEqual(self.yumdnf.download_only, False)
        self.assertEqual(self.yumdnf.download_dir, None)
        self.assertEqual(self.yumdnf.enable_plugin, [])
        self.assertEqual(self.yumdnf.enablerepo, [])
        self.assertEqual(self.yumdnf.exclude, [])
        self.assertEqual(self.yumdnf.installroot, "/")
        self.assertEqual(self.yumdnf.install_repoquery, True)
        self.assertEqual(self.yumdnf.install_weak_deps, True)
        self.assertEqual(self.yumdnf.list, None)
        self.assertEqual(self.yumdnf.names, [])
        self.assertEqual(self.yumdnf.releasever, None)
        self.assertEqual(self.yumdnf.security, False)
        self.assertEqual(self.yumdnf.skip_broken, False)
        self.assertEqual(self.yumdnf.state, "present")
        self.assertEqual(self.yumdnf.update_only, "no")
        self.assertEqual(self.yumdnf.update_cache, False)
        self.assertEqual(self.yumdnf.validate_certs, True)
        self.assertEqual(self.yumdnf.lock_timeout, 30)

    def test_is_lockfile_pid_valid(self):
        with self.assertRaises(NotImplementedError):
            self.yumdnf.is_lockfile_pid_valid()

    @patch('os.path.isfile', return_value=True)
    @patch('glob.glob', return_value=True)
    def test_is_lockfile_present(self, mock_glob, mock_isfile):
        self.yumdnf.is_lockfile_pid_valid = Mock(return_value=True)
        result = self.yumdnf._is_lockfile_present()
        self.assertTrue(result)

    @patch('time.sleep', return_value=None)
    def test_wait_for_lock(self, mock_sleep):
        self.yumdnf._is_lockfile_present = Mock(side_effect=[True, False])
        self.yumdnf.wait_for_lock()
        self.assertEqual(self.yumdnf._is_lockfile_present.call_count, 2)

    def test_listify_comma_sep_strings_in_list(self):
        result = self.yumdnf.listify_comma_sep_strings_in_list(['a,b', 'c'])
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_run(self):
        with self.assertRaises(NotImplementedError):
            self.yumdnf.run()

if __name__ == '__main__':
    unittest.main()