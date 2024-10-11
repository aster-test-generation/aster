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

        with patch('os.getenv', return_value=None):
            with patch('os.geteuid', return_value=1000):
                with patch('os.environ', {}):
                    main()

        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=False,
            status={}
        )

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
        mock_module.run_command.side_effect = [
            (0, '', ''),  # daemon-reload
            (0, '', '')   # show
        ]

        with patch('os.getenv', return_value=None):
            with patch('os.geteuid', return_value=1000):
                with patch('os.environ', {}):
                    main()

        mock_module.run_command.assert_any_call('/bin/systemctl daemon-reload')
        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=False,
            status={}
        )

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
        mock_module.run_command.side_effect = [
            (0, '', ''),  # daemon-reexec
            (0, '', '')   # show
        ]

        with patch('os.getenv', return_value=None):
            with patch('os.geteuid', return_value=1000):
                with patch('os.environ', {}):
                    main()

        mock_module.run_command.assert_any_call('/bin/systemctl daemon-reexec')
        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=False,
            status={}
        )

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
        mock_module.run_command.side_effect = [
            (0, '', ''),  # show
            (0, 'masked', '')  # is-enabled
        ]

        with patch('os.getenv', return_value=None):
            with patch('os.geteuid', return_value=1000):
                with patch('os.environ', {}):
                    main()

        mock_module.run_command.assert_any_call("/bin/systemctl is-enabled 'httpd'")
        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=True,
            status={}
        )

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
        mock_module.run_command.side_effect = [
            (0, '', ''),  # show
            (1, 'disabled', '')  # is-enabled
        ]

        with patch('os.getenv', return_value=None):
            with patch('os.geteuid', return_value=1000):
                with patch('os.environ', {}):
                    main()

        mock_module.run_command.assert_any_call("/bin/systemctl is-enabled 'httpd'")
        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=True,
            status={}
        )

    @patch('ansible.modules.systemd.AnsibleModule')
    def test_main_with_state(self, MockAnsibleModule):
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
        mock_module.run_command.side_effect = [
            (0, 'ActiveState=inactive\n', ''),  # show
            (0, '', '')  # start
        ]

        with patch('os.getenv', return_value=None):
            with patch('os.geteuid', return_value=1000):
                with patch('os.environ', {}):
                    main()

        mock_module.run_command.assert_any_call("/bin/systemctl start 'httpd'")
        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=True,
            status={'ActiveState': 'inactive'}
        )

if __name__ == '__main__':
    unittest.main()