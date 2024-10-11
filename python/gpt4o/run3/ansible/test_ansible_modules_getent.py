import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.getent import main, AnsibleModule


class TestGetentModule(unittest.TestCase):

    @patch('ansible.modules.getent.AnsibleModule')
    def test_main_success(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'database': 'passwd',
            'key': 'root',
            'service': None,
            'split': None,
            'fail_key': True
        }
        mock_module.get_bin_path.return_value = '/usr/bin/getent'
        mock_module.run_command.return_value = (0, 'root:x:0:0:root:/root:/bin/bash\n', '')

        main()

        mock_module.exit_json.assert_called_once_with(ansible_facts={'getent_passwd': {'root': ['x', '0', '0', 'root', '/root', '/bin/bash']}})

    @patch('ansible.modules.getent.AnsibleModule')
    def test_main_missing_arguments(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'database': 'unknown_db',
            'key': None,
            'service': None,
            'split': None,
            'fail_key': True
        }
        mock_module.get_bin_path.return_value = '/usr/bin/getent'
        mock_module.run_command.return_value = (1, '', '')

        main()

        mock_module.fail_json.assert_called_once_with(msg="Missing arguments, or database unknown.")

    @patch('ansible.modules.getent.AnsibleModule')
    def test_main_key_not_found(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'database': 'passwd',
            'key': 'nonexistent',
            'service': None,
            'split': None,
            'fail_key': True
        }
        mock_module.get_bin_path.return_value = '/usr/bin/getent'
        mock_module.run_command.return_value = (2, '', '')

        main()

        mock_module.fail_json.assert_called_once_with(msg="One or more supplied key could not be found in the database.")

    @patch('ansible.modules.getent.AnsibleModule')
    def test_main_enumeration_not_supported(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'database': 'passwd',
            'key': None,
            'service': None,
            'split': None,
            'fail_key': True
        }
        mock_module.get_bin_path.return_value = '/usr/bin/getent'
        mock_module.run_command.return_value = (3, '', '')

        main()

        mock_module.fail_json.assert_called_once_with(msg="Enumeration not supported on this database.")

    @patch('ansible.modules.getent.AnsibleModule')
    def test_main_key_not_found_no_fail(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'database': 'passwd',
            'key': 'nonexistent',
            'service': None,
            'split': None,
            'fail_key': False
        }
        mock_module.get_bin_path.return_value = '/usr/bin/getent'
        mock_module.run_command.return_value = (2, '', '')

        main()

        mock_module.exit_json.assert_called_once_with(ansible_facts={'getent_passwd': {'nonexistent': None}}, msg="One or more supplied key could not be found in the database.")

    @patch('ansible.modules.getent.AnsibleModule')
    def test_main_exception(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'database': 'passwd',
            'key': 'root',
            'service': None,
            'split': None,
            'fail_key': True
        }
        mock_module.get_bin_path.return_value = '/usr/bin/getent'
        mock_module.run_command.side_effect = Exception('Test exception')

        rc = main()

        mock_module.fail_json.assert_called_once_with(msg='Test exception', exception=unittest.mock.ANY)

if __name__ == '__main__':
    unittest.main()