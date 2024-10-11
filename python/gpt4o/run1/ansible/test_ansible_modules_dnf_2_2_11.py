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
        self.dnf_module = DnfModuleImplementation(self.module)

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
        mock_base_instance.update_cache = MagicMock()
        mock_base_instance.fill_sack = MagicMock()
        mock_base_instance.sack.query = MagicMock()
        mock_base_instance.sack.query().upgrades = MagicMock()
        mock_base_instance.sack.query().upgrades().filter = MagicMock()

        self.dnf_module.update_cache = True
        self.dnf_module.bugfix = True
        self.dnf_module.security = True

        base = self.dnf_module._base(None, None, None, None, None)

        mock_base_instance.setup_loggers.assert_called_once()
        mock_base_instance.init_plugins.assert_called_once()
        mock_base_instance.pre_configure_plugins.assert_called_once()
        mock_base_instance.configure_plugins.assert_called_once()
        mock_base_instance.update_cache.assert_called_once()
        mock_base_instance.fill_sack.assert_called_once()
        self.assertEqual(base, mock_base_instance)

    @patch('ansible.modules.dnf.dnf.Base')
    def test_base_no_update_cache(self, mock_base):
        mock_base_instance = mock_base.return_value
        mock_base_instance.setup_loggers = MagicMock()
        mock_base_instance.init_plugins = MagicMock()
        mock_base_instance.pre_configure_plugins = MagicMock()
        mock_base_instance.configure_plugins = MagicMock()
        mock_base_instance.fill_sack = MagicMock()
        mock_base_instance.sack.query = MagicMock()
        mock_base_instance.sack.query().upgrades = MagicMock()
        mock_base_instance.sack.query().upgrades().filter = MagicMock()

        self.dnf_module.update_cache = False
        self.dnf_module.bugfix = False
        self.dnf_module.security = False

        base = self.dnf_module._base(None, None, None, None, None)

        mock_base_instance.setup_loggers.assert_called_once()
        mock_base_instance.init_plugins.assert_called_once()
        mock_base_instance.pre_configure_plugins.assert_called_once()
        mock_base_instance.configure_plugins.assert_called_once()
        mock_base_instance.fill_sack.assert_called_once()
        self.assertEqual(base, mock_base_instance)

    def test_private_methods(self):
        with self.assertRaises(AttributeError):
            self.dnf_module.__ensure_dnf()

    def test_protected_methods(self):
        with self.assertRaises(AttributeError):
            self.dnf_module._configure_base(None, None, None, None)

    def test_magic_methods(self):
        self.assertIsInstance(self.dnf_module.__init__(self.module), type(None))

if __name__ == '__main__':
    unittest.main()