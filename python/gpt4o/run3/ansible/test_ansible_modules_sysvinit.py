import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.sysvinit import main, AnsibleModule, sysv_is_enabled, get_sysv_script, sysv_exists, fail_if_missing, get_ps, daemonize


class TestSysvinitModule(unittest.TestCase):

    @patch('ansible.modules.sysvinit.AnsibleModule')
    def test_main(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
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
        mock_module.check_mode = False
        mock_module.run_command = MagicMock(return_value=(0, '', ''))
        mock_module.get_bin_path = MagicMock(return_value='/usr/sbin/service')
        mock_module.exit_json = MagicMock()
        mock_module.fail_json = MagicMock()
        mock_module.warn = MagicMock()

        with patch('ansible.modules.sysvinit.sysv_exists', return_value=True), \
             patch('ansible.modules.sysvinit.get_sysv_script', return_value='/etc/init.d/apache2'), \
             patch('ansible.modules.sysvinit.sysv_is_enabled', return_value=True), \
             patch('ansible.modules.sysvinit.get_ps', return_value=False), \
             patch('ansible.modules.sysvinit.fail_if_missing'):

            main()

        mock_module.exit_json.assert_called_once()
        result = mock_module.exit_json.call_args[1]
        self.assertEqual(result['name'], 'apache2')
        self.assertFalse(result['changed'])
        self.assertIn('status', result)

    @patch('ansible.modules.sysvinit.AnsibleModule')
    def test_main_with_pattern(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
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
        mock_module.check_mode = False
        mock_module.run_command = MagicMock(return_value=(0, '', ''))
        mock_module.get_bin_path = MagicMock(return_value='/usr/sbin/service')
        mock_module.exit_json = MagicMock()
        mock_module.fail_json = MagicMock()
        mock_module.warn = MagicMock()

        with patch('ansible.modules.sysvinit.sysv_exists', return_value=True), \
             patch('ansible.modules.sysvinit.get_sysv_script', return_value='/etc/init.d/apache2'), \
             patch('ansible.modules.sysvinit.sysv_is_enabled', return_value=True), \
             patch('ansible.modules.sysvinit.get_ps', return_value=True), \
             patch('ansible.modules.sysvinit.fail_if_missing'):

            main()

        mock_module.exit_json.assert_called_once()
        result = mock_module.exit_json.call_args[1]
        self.assertEqual(result['name'], 'apache2')
        self.assertFalse(result['changed'])
        self.assertIn('status', result)

    @patch('ansible.modules.sysvinit.AnsibleModule')
    def test_main_with_runlevels(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
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
        mock_module.check_mode = False
        mock_module.run_command = MagicMock(return_value=(0, '', ''))
        mock_module.get_bin_path = MagicMock(return_value='/usr/sbin/service')
        mock_module.exit_json = MagicMock()
        mock_module.fail_json = MagicMock()
        mock_module.warn = MagicMock()

        with patch('ansible.modules.sysvinit.sysv_exists', return_value=True), \
             patch('ansible.modules.sysvinit.get_sysv_script', return_value='/etc/init.d/apache2'), \
             patch('ansible.modules.sysvinit.sysv_is_enabled', return_value=True), \
             patch('ansible.modules.sysvinit.get_ps', return_value=False), \
             patch('ansible.modules.sysvinit.fail_if_missing'):

            main()

        mock_module.exit_json.assert_called_once()
        result = mock_module.exit_json.call_args[1]
        self.assertEqual(result['name'], 'apache2')
        self.assertFalse(result['changed'])
        self.assertIn('status', result)

    @patch('ansible.modules.sysvinit.AnsibleModule')
    def test_main_with_daemonize(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
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
        mock_module.check_mode = False
        mock_module.run_command = MagicMock(return_value=(0, '', ''))
        mock_module.get_bin_path = MagicMock(return_value='/usr/sbin/service')
        mock_module.exit_json = MagicMock()
        mock_module.fail_json = MagicMock()
        mock_module.warn = MagicMock()

        with patch('ansible.modules.sysvinit.sysv_exists', return_value=True), \
             patch('ansible.modules.sysvinit.get_sysv_script', return_value='/etc/init.d/apache2'), \
             patch('ansible.modules.sysvinit.sysv_is_enabled', return_value=True), \
             patch('ansible.modules.sysvinit.get_ps', return_value=False), \
             patch('ansible.modules.sysvinit.fail_if_missing'), \
             patch('ansible.modules.sysvinit.daemonize', return_value=(0, '', '')):

            main()

        mock_module.exit_json.assert_called_once()
        result = mock_module.exit_json.call_args[1]
        self.assertEqual(result['name'], 'apache2')
        self.assertFalse(result['changed'])
        self.assertIn('status', result)

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
        mock_get_ps.return_value = False
        mock_daemonize.return_value = (0, '', '')

        # Mocking the run_command method
        mock_module.run_command.return_value = (0, 'apache2 is running', '')

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_once_with('apache2')
        mock_module.run_command.assert_called_with('/etc/init.d/apache2 status')
        mock_module.exit_json.assert_called_once_with(
            name='apache2',
            changed=False,
            status={
                'enabled': {
                    'changed': False,
                    'rc': None,
                    'stdout': None,
                    'stderr': None
                },
                'started': {
                    'changed': False,
                    'rc': None,
                    'stdout': None,
                    'stderr': None
                }
            }
        )

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.daemonize')
    def test_main_with_pattern(self, mock_daemonize, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_fail_if_missing, mock_sysv_exists, mock_AnsibleModule):
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
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.return_value = True
        mock_get_ps.return_value = True
        mock_daemonize.return_value = (0, '', '')

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_once_with('apache2')
        mock_get_ps.assert_called_once_with(mock_module, 'apache2')
        mock_module.exit_json.assert_called_once_with(
            name='apache2',
            changed=False,
            status={
                'enabled': {
                    'changed': False,
                    'rc': None,
                    'stdout': None,
                    'stderr': None
                },
                'started': {
                    'changed': False,
                    'rc': None,
                    'stdout': None,
                    'stderr': None
                }
            }
        )

    @patch('ansible.modules.sysvinit.AnsibleModule')
    @patch('ansible.modules.sysvinit.sysv_exists')
    @patch('ansible.modules.sysvinit.fail_if_missing')
    @patch('ansible.modules.sysvinit.get_sysv_script')
    @patch('ansible.modules.sysvinit.sysv_is_enabled')
    @patch('ansible.modules.sysvinit.get_ps')
    @patch('ansible.modules.sysvinit.daemonize')
    def test_main_with_runlevels(self, mock_daemonize, mock_get_ps, mock_sysv_is_enabled, mock_get_sysv_script, mock_fail_if_missing, mock_sysv_exists, mock_AnsibleModule):
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
        mock_sysv_exists.return_value = True
        mock_get_sysv_script.return_value = '/etc/init.d/apache2'
        mock_sysv_is_enabled.return_value = True
        mock_get_ps.return_value = False
        mock_daemonize.return_value = (0, '', '')

        # Mocking the run_command method
        mock_module.run_command.return_value = (0, 'apache2 is running', '')

        # Call the main function
        main()

        # Assertions to ensure the correct flow
        mock_fail_if_missing.assert_called_once_with(mock_module, True, 'apache2')
        mock_get_sysv_script.assert_called_once_with('apache2')
        mock_sysv_is_enabled.assert_called_with('apache2', runlevel='3')
        mock_sysv_is_enabled.assert_called_with('apache2', runlevel='5')
        mock_module.run_command.assert_called_with('/etc/init.d/apache2 status')
        mock_module.exit_json.assert_called_once_with(
            name='apache2',
            changed=False,
            status={
                'enabled': {
                    'changed': False,
                    'rc': None,
                    'stdout': None,
                    'stderr': None,
                    'runlevels': ['3', '5']
                },
                'started': {
                    'changed': False,
                    'rc': None,
                    'stdout': None,
                    'stderr': None
                }
            }
        )

if __name__ == '__main__':
    unittest.main()