import os
import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.systemd import main, AnsibleModule, sysv_exists, sysv_is_enabled, fail_if_missing, to_native, is_chroot


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

        main()

        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=False,
            status={}
        )

    @patch('ansible.modules.systemd.os.getenv')
    @patch('ansible.modules.systemd.os.geteuid')
    def test_main_set_xdg_runtime_dir(self, mock_geteuid, mock_getenv):
        mock_getenv.return_value = None
        mock_geteuid.return_value = 1000
        mock_module = MagicMock()
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

        with patch('ansible.modules.systemd.AnsibleModule', return_value=mock_module):
            main()

        self.assertEqual(os.environ['XDG_RUNTIME_DIR'], '/run/user/1000')

    @patch('ansible.modules.systemd.sysv_exists')
    @patch('ansible.modules.systemd.sysv_is_enabled')
    @patch('ansible.modules.systemd.fail_if_missing')
    @patch('ansible.modules.systemd.to_native')
    def test_main_service_not_found(self, mock_to_native, mock_fail_if_missing, mock_sysv_is_enabled, mock_sysv_exists):
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'nonexistent',
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
        mock_module.run_command.return_value = (1, '', 'Failed to parse bus message')

        with patch('ansible.modules.systemd.AnsibleModule', return_value=mock_module):
            main()

        mock_module.fail_json.assert_called_once_with(
            msg='Service is in unknown state',
            status={}
        )

    @patch('ansible.modules.systemd.is_chroot')
    def test_main_is_chroot(self, mock_is_chroot):
        mock_is_chroot.return_value = True
        mock_module = MagicMock()
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

        with patch('ansible.modules.systemd.AnsibleModule', return_value=mock_module):
            main()

        mock_module.warn.assert_called_once_with(
            'Target is a chroot or systemd is offline. This can lead to false positives or prevent the init system tools from working.'
        )

    @patch('ansible.modules.systemd.sysv_exists')
    @patch('ansible.modules.systemd.sysv_is_enabled')
    @patch('ansible.modules.systemd.fail_if_missing')
    @patch('ansible.modules.systemd.to_native')
    def test_main_service_enabled(self, mock_to_native, mock_fail_if_missing, mock_sysv_is_enabled, mock_sysv_exists):
        mock_module = MagicMock()
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
            (0, '', ''),  # systemctl show
            (0, 'enabled', ''),  # is-enabled
            (0, '', '')  # enable
        ]

        with patch('ansible.modules.systemd.AnsibleModule', return_value=mock_module):
            main()

        mock_module.exit_json.assert_called_once_with(
            name='httpd',
            changed=True,
            status={}
        )

if __name__ == '__main__':
    unittest.main()