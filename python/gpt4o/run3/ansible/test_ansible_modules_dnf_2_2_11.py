import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.dnf import DnfModule, dnf


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
        base_instance = mock_base.return_value
        base_instance.setup_loggers = MagicMock()
        base_instance.init_plugins = MagicMock()
        base_instance.pre_configure_plugins = MagicMock()
        base_instance.configure_plugins = MagicMock()
        base_instance.fill_sack = MagicMock()
        base_instance.update_cache = MagicMock()

        self.dnf_module.update_cache = False
        result = self.dnf_module._base(None, None, None, None, None)
        self.assertEqual(result, base_instance)

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_with_update_cache(self, mock_base):
        base_instance = mock_base.return_value
        base_instance.setup_loggers = MagicMock()
        base_instance.init_plugins = MagicMock()
        base_instance.pre_configure_plugins = MagicMock()
        base_instance.configure_plugins = MagicMock()
        base_instance.fill_sack = MagicMock()
        base_instance.update_cache = MagicMock()

        self.dnf_module.update_cache = True
        result = self.dnf_module._base(None, None, None, None, None)
        self.assertEqual(result, base_instance)
        base_instance.update_cache.assert_called_once()

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_with_repo_error(self, mock_base):
        base_instance = mock_base.return_value
        base_instance.setup_loggers = MagicMock()
        base_instance.init_plugins = MagicMock()
        base_instance.pre_configure_plugins = MagicMock()
        base_instance.configure_plugins = MagicMock()
        base_instance.fill_sack = MagicMock()
        base_instance.update_cache = MagicMock()
        base_instance.update_cache.side_effect = dnf.exceptions.RepoError('Repo error')

        self.dnf_module.update_cache = True
        with self.assertRaises(SystemExit):
            self.dnf_module._base(None, None, None, None, None)
        self.module.fail_json.assert_called_once_with(msg='Repo error', results=[], rc=1)

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_with_security_filters(self, mock_base):
        base_instance = mock_base.return_value
        base_instance.setup_loggers = MagicMock()
        base_instance.init_plugins = MagicMock()
        base_instance.pre_configure_plugins = MagicMock()
        base_instance.configure_plugins = MagicMock()
        base_instance.fill_sack = MagicMock()
        base_instance.update_cache = MagicMock()
        base_instance.add_security_filters = MagicMock()

        self.dnf_module.security = True
        self.dnf_module.bugfix = True
        result = self.dnf_module._base(None, None, None, None, None)
        self.assertEqual(result, base_instance)
        base_instance.add_security_filters.assert_called_once_with('eq', types=['bugfix', 'security'])

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_without_security_filters(self, mock_base):
        base_instance = mock_base.return_value
        base_instance.setup_loggers = MagicMock()
        base_instance.init_plugins = MagicMock()
        base_instance.pre_configure_plugins = MagicMock()
        base_instance.configure_plugins = MagicMock()
        base_instance.fill_sack = MagicMock()
        base_instance.update_cache = MagicMock()
        base_instance.add_security_filters = None

        self.dnf_module.security = True
        self.dnf_module.bugfix = True
        result = self.dnf_module._base(None, None, None, None, None)
        self.assertEqual(result, base_instance)
        self.assertTrue(hasattr(base_instance, '_update_security_filters'))

if __name__ == '__main__':
    unittest.main()