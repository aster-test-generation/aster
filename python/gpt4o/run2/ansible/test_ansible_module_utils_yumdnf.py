import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.yumdnf import YumDnf, yumdnf_argument_spec


class ConcreteYumDnf(YumDnf):
    def run(self):
        pass

    def is_lockfile_pid_valid(self):
        pass

class TestYumDnf(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
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
        self.assertEqual(self.yumdnf.lockfile, '/var/run/yum.pid')

    def test_listify_comma_sep_strings_in_list(self):
        result = self.yumdnf.listify_comma_sep_strings_in_list(['a,b', 'c'])
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_is_lockfile_present(self):
        with patch('os.path.isfile', return_value=True):
            with patch.object(self.yumdnf, 'is_lockfile_pid_valid', return_value=True):
                result = self.yumdnf._is_lockfile_present()
                self.assertTrue(result)

    def test_wait_for_lock_no_lockfile(self):
        with patch.object(self.yumdnf, '_is_lockfile_present', return_value=False):
            self.yumdnf.wait_for_lock()
            self.module.fail_json.assert_not_called()

    def test_wait_for_lock_with_lockfile(self):
        with patch.object(self.yumdnf, '_is_lockfile_present', side_effect=[True, False]):
            with patch('time.sleep', return_value=None):
                self.yumdnf.wait_for_lock()
                self.module.fail_json.assert_not_called()

    def test_wait_for_lock_timeout(self):
        with patch.object(self.yumdnf, '_is_lockfile_present', return_value=True):
            with patch('time.sleep', return_value=None):
                self.yumdnf.wait_for_lock()
                self.module.fail_json.assert_called_once_with(msg='{0} lockfile is held by another process'.format(self.yumdnf.pkg_mgr_name))

    def test_abstract_methods(self):
        with self.assertRaises(NotImplementedError):
            self.yumdnf.run()

        with self.assertRaises(NotImplementedError):
            self.yumdnf.is_lockfile_pid_valid()

if __name__ == '__main__':
    unittest.main()