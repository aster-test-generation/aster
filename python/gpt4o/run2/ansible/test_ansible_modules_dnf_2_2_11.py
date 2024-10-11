import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': False,
            'nobest': False
        }
        self.dnf_module = ConcreteDnfModule(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertFalse(self.dnf_module.with_modules)
        self.assertFalse(self.dnf_module.allowerasing)
        self.assertFalse(self.dnf_module.nobest)

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base(self, mock_base):
        mock_base_instance = mock_base.return_value
        mock_base_instance.setup_loggers = MagicMock()
        mock_base_instance.init_plugins = MagicMock()
        mock_base_instance.pre_configure_plugins = MagicMock()
        mock_base_instance.configure_plugins = MagicMock()
        mock_base_instance.fill_sack = MagicMock()
        mock_base_instance.update_cache = MagicMock()

        conf_file = 'dummy_conf'
        disable_gpg_check = False
        disablerepo = []
        enablerepo = []
        installroot = '/'

        base = self.dnf_module._base(conf_file, disable_gpg_check, disablerepo, enablerepo, installroot)
        self.assertEqual(base, mock_base_instance)

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_with_update_cache(self, mock_base):
        self.dnf_module.update_cache = True
        mock_base_instance = mock_base.return_value
        mock_base_instance.setup_loggers = MagicMock()
        mock_base_instance.init_plugins = MagicMock()
        mock_base_instance.pre_configure_plugins = MagicMock()
        mock_base_instance.configure_plugins = MagicMock()
        mock_base_instance.fill_sack = MagicMock()
        mock_base_instance.update_cache = MagicMock()

        conf_file = 'dummy_conf'
        disable_gpg_check = False
        disablerepo = []
        enablerepo = []
        installroot = '/'

        base = self.dnf_module._base(conf_file, disable_gpg_check, disablerepo, enablerepo, installroot)
        self.assertEqual(base, mock_base_instance)
        mock_base_instance.update_cache.assert_called_once()

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_with_repo_error(self, mock_base):
        self.dnf_module.update_cache = True
        mock_base_instance = mock_base.return_value
        mock_base_instance.setup_loggers = MagicMock()
        mock_base_instance.init_plugins = MagicMock()
        mock_base_instance.pre_configure_plugins = MagicMock()
        mock_base_instance.configure_plugins = MagicMock()
        mock_base_instance.fill_sack = MagicMock()
        mock_base_instance.update_cache = MagicMock(side_effect=Exception('RepoError'))

        conf_file = 'dummy_conf'
        disable_gpg_check = False
        disablerepo = []
        enablerepo = []
        installroot = '/'

        with self.assertRaises(Exception):
            self.dnf_module._base(conf_file, disable_gpg_check, disablerepo, enablerepo, installroot)

if __name__ == '__main__':
    unittest.main()