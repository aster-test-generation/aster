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
    def test_main_with_xdg_runtime_dir(self, mock_geteuid, mock_getenv):
        mock_getenv.return_value = None
        mock_geteuid.return_value = 1000

        with patch('ansible.modules.systemd.AnsibleModule') as MockAnsibleModule:
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

            self.assertEqual(os.environ['XDG_RUNTIME_DIR'], '/run/user/1000')

    @patch('ansible.modules.systemd.sysv_exists')
    @patch('ansible.modules.systemd.sysv_is_enabled')
    @patch('ansible.modules.systemd.fail_if_missing')
    @patch('ansible.modules.systemd.to_native')
    @patch('ansible.modules.systemd.is_chroot')
    def test_main_with_service_state(self, mock_is_chroot, mock_to_native, mock_fail_if_missing, mock_sysv_is_enabled, mock_sysv_exists):
        mock_is_chroot.return_value = False
        mock_to_native.side_effect = lambda x: x
        mock_sysv_exists.return_value = False
        mock_sysv_is_enabled.return_value = False

        with patch('ansible.modules.systemd.AnsibleModule') as MockAnsibleModule:
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
                (0, 'LoadState=loaded\nActiveState=inactive\n', ''),
                (0, '', ''),
                (0, '', '')
            ]

            main()

            mock_module.exit_json.assert_called_once_with(
                name='httpd',
                changed=True,
                status={'LoadState': 'loaded', 'ActiveState': 'inactive'},
                state='started'
            )

    @patch('ansible.modules.systemd.sysv_exists')
    @patch('ansible.modules.systemd.sysv_is_enabled')
    @patch('ansible.modules.systemd.fail_if_missing')
    @patch('ansible.modules.systemd.to_native')
    @patch('ansible.modules.systemd.is_chroot')
    def test_main_with_service_enabled(self, mock_is_chroot, mock_to_native, mock_fail_if_missing, mock_sysv_is_enabled, mock_sysv_exists):
        mock_is_chroot.return_value = False
        mock_to_native.side_effect = lambda x: x
        mock_sysv_exists.return_value = False
        mock_sysv_is_enabled.return_value = False

        with patch('ansible.modules.systemd.AnsibleModule') as MockAnsibleModule:
            mock_module = MockAnsibleModule.return_value
            mock_module.params = {
                'name': 'httpd',
                'state': None,
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
                (0, 'disabled', ''),
                (0, '', '')
            ]

            main()

            mock_module.exit_json.assert_called_once_with(
                name='httpd',
                changed=True,
                status={},
                enabled=True
            )

    @patch('ansible.modules.systemd.sysv_exists')
    @patch('ansible.modules.systemd.sysv_is_enabled')
    @patch('ansible.modules.systemd.fail_if_missing')
    @patch('ansible.modules.systemd.to_native')
    @patch('ansible.modules.systemd.is_chroot')
    def test_main_with_service_masked(self, mock_is_chroot, mock_to_native, mock_fail_if_missing, mock_sysv_is_enabled, mock_sysv_exists):
        mock_is_chroot.return_value = False
        mock_to_native.side_effect = lambda x: x
        mock_sysv_exists.return_value = False
        mock_sysv_is_enabled.return_value = False

        with patch('ansible.modules.systemd.AnsibleModule') as MockAnsibleModule:
            mock_module = MockAnsibleModule.return_value
            mock_module.params = {
                'name': 'httpd',
                'state': None,
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
                (0, 'unmasked', ''),
                (0, '', '')
            ]

            main()

            mock_module.exit_json.assert_called_once_with(
                name='httpd',
                changed=True,
                status={},
                masked=True
            )

if __name__ == '__main__':
    unittest.main()