import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, dnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': False,
            'nobest': False,
            'autoremove': False,
            'download_dir': None,
            'update_cache': False,
            'names': None,
            'list': None,
            'conf_file': None,
            'disable_gpg_check': False,
            'disablerepo': None,
            'enablerepo': None,
            'installroot': None,
            'state': None,
            'download_only': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.LooseVersion')
    def test_run_autoremove(self, mock_loose_version):
        self.dnf_module.autoremove = True
        mock_loose_version.return_value = LooseVersion('2.0.0')
        with self.assertRaises(SystemExit):
            self.dnf_module.run()
        self.module.fail_json.assert_called_with(msg='Autoremove requires dnf>=2.0.1. Current dnf version is 2.0.0', results=[])

    @patch('ansible.modules.dnf.LooseVersion')
    def test_run_download_dir(self, mock_loose_version):
        self.dnf_module.download_dir = '/some/dir'
        mock_loose_version.return_value = LooseVersion('2.6.0')
        with self.assertRaises(SystemExit):
            self.dnf_module.run()
        self.module.fail_json.assert_called_with(msg='download_dir requires dnf>=2.6.2. Current dnf version is 2.6.0', results=[])

    @patch('ansible.modules.dnf.dnf.util.am_i_root', return_value=False)
    def test_run_not_root(self, mock_am_i_root):
        self.dnf_module.download_only = False
        with self.assertRaises(SystemExit):
            self.dnf_module.run()
        self.module.fail_json.assert_called_with(msg='This command has to be run under the root user.', results=[])

    @patch('ansible.modules.dnf.DnfModule._base')
    def test_run_update_cache(self, mock_base):
        self.dnf_module.update_cache = True
        self.dnf_module.names = None
        self.dnf_module.list = None
        self.dnf_module.run()
        self.module.exit_json.assert_called_with(msg='Cache updated', changed=False, results=[], rc=0)

    @patch('ansible.modules.dnf.DnfModule._base')
    def test_run_list(self, mock_base):
        self.dnf_module.list = 'some_list'
        self.dnf_module.run()
        mock_base.assert_called_once()

    @patch('ansible.modules.dnf.DnfModule._base')
    def test_run_ensure(self, mock_base):
        self.dnf_module.state = 'present'
        self.dnf_module.run()
        mock_base.assert_called_once()

    def test_private_methods(self):
        with self.assertRaises(AttributeError):
            self.dnf_module.__ensure_dnf()

    def test_protected_methods(self):
        with self.assertRaises(AttributeError):
            self.dnf_module._base()

if __name__ == '__main__':
    unittest.main()