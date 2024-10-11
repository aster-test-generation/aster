import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.sysvinit import main, AnsibleModule, sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestSysvinitModule(unittest.TestCase):

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.daemonize')
    def test_main(self, mock_daemonize, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_fail_if_missing, mock_sysv_exists, mock_AnsibleModule):
        # Mocking the AnsibleModule instance and its methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': None,
            'daemonize': False
        }
        mock_AnsibleModule.return_value = mock_module

        # Mocking the return values of the imported functions
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.return_value = True
        mock_get_ps.return_value = True
        mock_daemonize.return_value = (0, '', '')

        # Running the main function
        main()

        # Assertions to ensure the main function runs as expected
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_once_with('apache2')
        mock_module.exit_json.assert_called_once()

    @patch('ansible.modules.sysvinit.AnsibleModule')
    def test_main_fail_if_missing(self, mock_AnsibleModule):
        # Mocking the AnsibleModule instance and its methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'nonexistent_service',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': None,
            'daemonize': False
        }
        mock_AnsibleModule.return_value = mock_module

        # Mocking the return values of the imported functions
        with patch('ansible.modules.sysvinit.sysv_exists', return_value=False):
            with self.assertRaises(SystemExit):
                main()

        # Assertions to ensure the main function fails as expected
        mock_module.fail_json.assert_called_once_with(msg='Service nonexistent_service does not exist')

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    def test_main_with_runlevels(self, mock_sysv_is_enabled, mock_AnsibleModule):
        # Mocking the AnsibleModule instance and its methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': ['3', '5'],
            'daemonize': False
        }
        mock_AnsibleModule.return_value = mock_module

        # Mocking the return values of the imported functions
        mock_sysv_is_enabled.side_effect = [False, True]

        # Running the main function
        main()

        # Assertions to ensure the main function runs as expected
        self.assertEqual(mock_sysv_is_enabled.call_count, 2)
        mock_module.exit_json.assert_called_once()

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.get_ps')
    def test_main_with_pattern(self, mock_get_ps, mock_AnsibleModule):
        # Mocking the AnsibleModule instance and its methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': 'apache2',
            'arguments': None,
            'runlevels': None,
            'daemonize': False
        }
        mock_AnsibleModule.return_value = mock_module

        # Mocking the return values of the imported functions
        mock_get_ps.return_value = True

        # Running the main function
        main()

        # Assertions to ensure the main function runs as expected
        mock_get_ps.assert_called_once_with(mock_module, 'apache2')
        mock_module.exit_json.assert_called_once()

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.daemonize')
    def test_main_with_daemonize(self, mock_daemonize, mock_AnsibleModule):
        # Mocking the AnsibleModule instance and its methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': None,
            'daemonize': True
        }
        mock_AnsibleModule.return_value = mock_module

        # Mocking the return values of the imported functions
        mock_daemonize.return_value = (0, '', '')

        # Running the main function
        main()

        # Assertions to ensure the main function runs as expected
        mock_daemonize.assert_called_once()
        mock_module.exit_json.assert_called_once()

class TestSysvinitModule(unittest.TestCase):

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    def test_main(self, mock_fail_if_missing, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_sysv_exists, mock_ansible_module):
        # Mocking the AnsibleModule parameters and methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': None,
            'daemonize': False
        }
        mock_ansible_module.return_value = mock_module

        # Mocking the return values of the utility functions
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.return_value = True
        mock_get_ps.return_value = False

        # Mocking the run_command method
        mock_module.run_command.return_value = (0, 'apache2 is running', '')

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_once_with('apache2')
        mock_module.run_command.assert_called_with('/etc/init.d/apache2 status')
        mock_module.exit_json.assert_called_once_with(name='apache2', changed=False, status={'enabled': {'changed': False, 'rc': None, 'stdout': None, 'stderr': None}, 'started': {'changed': False, 'rc': None, 'stdout': None, 'stderr': None}})

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    def test_main_with_runlevels(self, mock_fail_if_missing, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_sysv_exists, mock_ansible_module):
        # Mocking the AnsibleModule parameters and methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': ['3', '5'],
            'daemonize': False
        }
        mock_ansible_module.return_value = mock_module

        # Mocking the return values of the utility functions
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.side_effect = [False, True]
        mock_get_ps.return_value = False

        # Mocking the run_command method
        mock_module.run_command.return_value = (0, 'apache2 is running', '')

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        self.assertEqual(mock_sysv_is_enabled.call_count, 2)
        mock_module.run_command.assert_called_with('/etc/init.d/apache2 status')
        mock_module.exit_json.assert_called_once_with(name='apache2', changed=True, status={'enabled': {'changed': True, 'rc': 0, 'stdout': 'apache2 is running', 'stderr': ''}, 'started': {'changed': False, 'rc': None, 'stdout': None, 'stderr': None}})

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    def test_main_with_pattern(self, mock_fail_if_missing, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_sysv_exists, mock_ansible_module):
        # Mocking the AnsibleModule parameters and methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'started',
            'enabled': True,
            'sleep': 1,
            'pattern': 'apache2',
            'arguments': None,
            'runlevels': None,
            'daemonize': False
        }
        mock_ansible_module.return_value = mock_module

        # Mocking the return values of the utility functions
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.return_value = True
        mock_get_ps.return_value = True

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_once_with('apache2')
        mock_get_ps.assert_called_once_with(mock_module, 'apache2')
        mock_module.exit_json.assert_called_once_with(name='apache2', changed=False, status={'enabled': {'changed': False, 'rc': None, 'stdout': None, 'stderr': None}, 'started': {'changed': False, 'rc': None, 'stdout': None, 'stderr': None}})

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    def test_main_with_restart(self, mock_fail_if_missing, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_sysv_exists, mock_ansible_module):
        # Mocking the AnsibleModule parameters and methods
        mock_module = MagicMock()
        mock_module.params = {
            'name': 'apache2',
            'state': 'restarted',
            'enabled': True,
            'sleep': 1,
            'pattern': None,
            'arguments': None,
            'runlevels': None,
            'daemonize': False
        }
        mock_ansible_module.return_value = mock_module

        # Mocking the return values of the utility functions
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.return_value = True
        mock_get_ps.return_value = False

        # Mocking the run_command method
        mock_module.run_command.return_value = (0, 'apache2 is running', '')

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_once_with('apache2')
        self.assertEqual(mock_module.run_command.call_count, 3)
        mock_module.exit_json.assert_called_once_with(name='apache2', changed=True, status={'enabled': {'changed': False, 'rc': None, 'stdout': None, 'stderr': None}, 'restarted': {'changed': True, 'rc': 0, 'stdout': 'apache2 is running', 'stderr': ''}})

if __name__ == '__main__':
    unittest.main()