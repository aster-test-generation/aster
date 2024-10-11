import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.systemd import main, AnsibleModule, os, sysv_exists, sysv_is_enabled, fail_if_missing, to_native, is_chroot

class TestSystemdModule(unittest.TestCase):

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'started',
            'enabled': None,
            'force': None,
            'masked': None,
            'daemon_reload': False,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.return_value = (0, '', '')

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.exit_json.assert_called_once_with(name='httpd', changed=False, status={})

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_glob_pattern(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd*',
            'state': 'started',
            'enabled': None,
            'force': None,
            'masked': None,
            'daemon_reload': False,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.return_value = (0, '', '')

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.fail_json.assert_called_once_with(msg="This module does not currently support using glob patterns, found '*' in service name: httpd*")

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_daemon_reload(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'started',
            'enabled': None,
            'force': None,
            'masked': None,
            'daemon_reload': True,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.side_effect = [(0, '', ''), (0, '', '')]

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.run_command.assert_any_call('/bin/systemctl daemon-reload')
        mock_module.exit_json.assert_called_once_with(name='httpd', changed=False, status={})

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_daemon_reexec(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'started',
            'enabled': None,
            'force': None,
            'masked': None,
            'daemon_reload': False,
            'daemon_reexec': True,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.side_effect = [(0, '', ''), (0, '', '')]

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.run_command.assert_any_call('/bin/systemctl daemon-reexec')
        mock_module.exit_json.assert_called_once_with(name='httpd', changed=False, status={})

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_masked(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'started',
            'enabled': None,
            'force': None,
            'masked': True,
            'daemon_reload': False,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.side_effect = [(0, 'masked', ''), (0, '', '')]

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.run_command.assert_any_call("/bin/systemctl mask 'httpd'")
        mock_module.exit_json.assert_called_once_with(name='httpd', changed=True, status={})

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_enabled(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'started',
            'enabled': True,
            'force': None,
            'masked': None,
            'daemon_reload': False,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.side_effect = [(0, 'disabled', ''), (0, '', '')]

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.run_command.assert_any_call("/bin/systemctl enable 'httpd'")
        mock_module.exit_json.assert_called_once_with(name='httpd', changed=True, status={}, enabled=True)

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_state_started(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'started',
            'enabled': None,
            'force': None,
            'masked': None,
            'daemon_reload': False,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.side_effect = [(0, 'inactive', ''), (0, '', '')]

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.run_command.assert_any_call("/bin/systemctl start 'httpd'")
        mock_module.exit_json.assert_called_once_with(name='httpd', changed=True, status={'ActiveState': 'inactive'}, state='started')

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_state_stopped(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'name': 'httpd',
            'state': 'stopped',
            'enabled': None,
            'force': None,
            'masked': None,
            'daemon_reload': False,
            'daemon_reexec': False,
            'scope': 'system',
            'no_block': False
        }
        mock_module.get_bin_path.return_value = '/bin/systemctl'
        mock_module.run_command.side_effect = [(0, 'active', ''), (0, '', '')]

        with patch('os.getenv', return_value=None), patch('os.geteuid', return_value=1000), patch('os.environ', {}):
            main()

        mock_module.run_command.assert_any_call("/bin/systemctl stop 'httpd'")
        mock_module.exit_json.assert_called_once_with(name='httpd', changed=True, status={'ActiveState': 'active'}, state='stopped')

if __name__ == '__main__':
    unittest.main()