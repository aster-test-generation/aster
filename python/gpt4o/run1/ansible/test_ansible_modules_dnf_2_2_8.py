import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.params = {
            'allowerasing': True,
            'nobest': False
        }
        self.dnf_module = DnfModuleImplementation(self.module)

    def test_init(self):
        self.assertEqual(self.dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')
        self.assertEqual(self.dnf_module.pkg_mgr_name, 'dnf')
        self.assertTrue(hasattr(self.dnf_module, 'with_modules'))
        self.assertEqual(self.dnf_module.allowerasing, True)
        self.assertEqual(self.dnf_module.nobest, False)

    @patch('ansible.modules.dnf.get_best_parsable_locale', return_value='en_US.UTF-8')
    @patch('ansible.modules.dnf.os')
    @patch('ansible.modules.dnf.has_respawned', return_value=False)
    @patch('ansible.modules.dnf.probe_interpreters_for_module', return_value='/usr/bin/python3')
    @patch('ansible.modules.dnf.respawn_module')
    def test_ensure_dnf(self, mock_respawn_module, mock_probe_interpreters_for_module, mock_has_respawned, mock_os, mock_get_best_parsable_locale):
        self.dnf_module._ensure_dnf()
        mock_get_best_parsable_locale.assert_called_once_with(self.module)
        mock_os.environ.__setitem__.assert_any_call('LC_ALL', 'en_US.UTF-8')
        mock_os.environ.__setitem__.assert_any_call('LC_MESSAGES', 'en_US.UTF-8')
        mock_os.environ.__setitem__.assert_any_call('LANG', 'en_US.UTF-8')
        mock_has_respawned.assert_called_once()
        mock_probe_interpreters_for_module.assert_called_once_with(['/usr/libexec/platform-python', '/usr/bin/python3', '/usr/bin/python2', '/usr/bin/python'], 'dnf')
        mock_respawn_module.assert_called_once_with('/usr/bin/python3')

    @patch('ansible.modules.dnf.get_best_parsable_locale', return_value='en_US.UTF-8')
    @patch('ansible.modules.dnf.os')
    @patch('ansible.modules.dnf.has_respawned', return_value=True)
    @patch('ansible.modules.dnf.probe_interpreters_for_module', return_value=None)
    @patch('ansible.modules.dnf.respawn_module')
    def test_ensure_dnf_fail(self, mock_respawn_module, mock_probe_interpreters_for_module, mock_has_respawned, mock_os, mock_get_best_parsable_locale):
        with self.assertRaises(SystemExit):
            self.dnf_module._ensure_dnf()
        mock_get_best_parsable_locale.assert_called_once_with(self.module)
        mock_os.environ.__setitem__.assert_any_call('LC_ALL', 'en_US.UTF-8')
        mock_os.environ.__setitem__.assert_any_call('LC_MESSAGES', 'en_US.UTF-8')
        mock_os.environ.__setitem__.assert_any_call('LANG', 'en_US.UTF-8')
        mock_has_respawned.assert_called_once()
        mock_probe_interpreters_for_module.assert_called_once_with(['/usr/libexec/platform-python', '/usr/bin/python3', '/usr/bin/python2', '/usr/bin/python'], 'dnf')
        mock_respawn_module.assert_not_called()

if __name__ == '__main__':
    unittest.main()