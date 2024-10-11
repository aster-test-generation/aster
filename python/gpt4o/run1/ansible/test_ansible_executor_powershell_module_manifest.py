import unittest
from unittest.mock import patch, mock_open, MagicMock
from ansible.executor.powershell.module_manifest import _slurp, _strip_comments, _create_powershell_wrapper
from ansible.errors import AnsibleError


class TestModuleManifest(unittest.TestCase):

    @patch('os.path.exists')
    @patch('builtins.open', new_callable=mock_open, read_data=b'test data')
    def test_slurp(self, mock_open, mock_exists):
        mock_exists.return_value = True
        result = _slurp('fake_path')
        self.assertEqual(result, b'test data')

    @patch('os.path.exists')
    def test_slurp_file_not_exist(self, mock_exists):
        mock_exists.return_value = False
        with self.assertRaises(AnsibleError):
            _slurp('fake_path')

    def test_strip_comments(self):
        source = b"""
        # This is a comment
        <#
        This is a block comment
        #>
        This is code
        """
        expected_result = b'This is code'
        result = _strip_comments(source)
        self.assertEqual(result.strip(), expected_result)

    @patch('ansible.executor.powershell.module_manifest.PSModuleDepFinder')
    @patch('ansible.executor.powershell.module_manifest.to_text')
    @patch('ansible.executor.powershell.module_manifest.base64.b64encode')
    @patch('ansible.executor.powershell.module_manifest.random.randint')
    @patch('ansible.executor.powershell.module_manifest.C.config.get_config_value')
    @patch('ansible.executor.powershell.module_manifest.resource_from_fqcr')
    def test_create_powershell_wrapper(self, mock_resource_from_fqcr, mock_get_config_value, mock_randint, mock_b64encode, mock_to_text, mock_PSModuleDepFinder):
        mock_PSModuleDepFinder.return_value = MagicMock()
        mock_b64encode.return_value = b'encoded_data'
        mock_to_text.return_value = 'encoded_data'
        mock_randint.return_value = 123456789
        mock_get_config_value.side_effect = [10, 'coverage_output', 'coverage_enabled']
        mock_resource_from_fqcr.return_value = 'runas'

        b_module_data = b'module_data'
        module_path = 'module_path'
        module_args = 'module_args'
        environment = 'environment'
        async_timeout = 10
        become = True
        become_method = 'runas'
        become_user = 'user'
        become_password = 'password'
        become_flags = 'flags'
        substyle = 'powershell'
        task_vars = {}
        module_fqn = 'module_fqn'

        result = _create_powershell_wrapper(b_module_data, module_path, module_args, environment, async_timeout, become, become_method, become_user, become_password, become_flags, substyle, task_vars, module_fqn)
        self.assertIsInstance(result, bytes)

if __name__ == '__main__':
    unittest.main()