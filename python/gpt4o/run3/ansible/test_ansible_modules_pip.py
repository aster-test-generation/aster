import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.pip import *


class TestPipModule(unittest.TestCase):

    @patch('ansible.modules.pip.AnsibleModule')
    def test_main(self, MockAnsibleModule):
        mock_module = MockAnsibleModule.return_value
        mock_module.params = {
            'state': 'present',
            'name': ['bottle'],
            'version': None,
            'requirements': None,
            'virtualenv': None,
            'virtualenv_site_packages': False,
            'virtualenv_command': 'virtualenv',
            'virtualenv_python': None,
            'extra_args': None,
            'editable': False,
            'chdir': None,
            'executable': None,
            'umask': None
        }
        mock_module.check_mode = False
        mock_module.run_command.return_value = (0, 'Successfully installed', '')

        main()

        mock_module.exit_json.assert_called_with(
            changed=True,
            cmd=['pip', 'install', 'bottle'],
            name=['bottle'],
            version=None,
            state='present',
            requirements=None,
            virtualenv=None,
            stdout='Successfully installed',
            stderr=''
        )

    def test__is_vcs_url(self):
        self.assertTrue(_is_vcs_url('git+https://example.com/repo.git'))
        self.assertFalse(_is_vcs_url('https://example.com/repo.git'))

    def test__recover_package_name(self):
        self.assertEqual(_recover_package_name(['bottle==0.12']), ['bottle==0.12'])
        self.assertEqual(_recover_package_name(['bottle']), ['bottle'])

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    @patch('ansible.modules.pip.setup_virtualenv')
    def test_setup_virtualenv(self, mock_setup_virtualenv, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = False
        mock_get_pip.return_value = 'pip'

        out, err = setup_virtualenv(mock_module, '/path/to/venv', '/tmp', '', '')

        mock_setup_virtualenv.assert_called_with(mock_module, '/path/to/venv', '/tmp', '', '')
        self.assertEqual(out, '')
        self.assertEqual(err, '')

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__get_pip(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = True

        result = _get_pip(mock_module, '/path/to/venv', None)
        self.assertEqual(result, '/path/to/venv/bin/pip')

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__get_pip_no_venv(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = False

        result = _get_pip(mock_module, None, None)
        self.assertEqual(result, 'pip')

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__get_pip_with_executable(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = False

        result = _get_pip(mock_module, None, 'pip3')
        self.assertEqual(result, 'pip3')

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__get_packages(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = True
        mock_get_pip.return_value = 'pip'

        result = _get_packages(mock_module, 'pip', '/tmp')
        self.assertEqual(result, ('pip freeze', '', ''))

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__is_present(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = True
        mock_get_pip.return_value = 'pip'

        package = Package('bottle==0.12')
        pkg_list = ['bottle==0.12']

        result = _is_present(mock_module, package, pkg_list, 'pip freeze')
        self.assertTrue(result)

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__is_present_not_found(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = True
        mock_get_pip.return_value = 'pip'

        package = Package('bottle==0.12')
        pkg_list = ['django==1.11']

        result = _is_present(mock_module, package, pkg_list, 'pip freeze')
        self.assertFalse(result)

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__get_package_info(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = True
        mock_get_pip.return_value = 'pip'

        result = _get_package_info(mock_module, 'bottle', '/path/to/venv')
        self.assertIsNone(result)

    @patch('ansible.modules.pip.os.path.exists')
    @patch('ansible.modules.pip._get_pip')
    def test__fail(self, mock_get_pip, mock_path_exists):
        mock_module = MagicMock()
        mock_path_exists.return_value = True
        mock_get_pip.return_value = 'pip'

        with self.assertRaises(SystemExit):
            _fail(mock_module, 'pip install bottle', 'output', 'error')

        mock_module.fail_json.assert_called_with(
            cmd='pip install bottle',
            stdout='output',
            stderr='error'
        )

if __name__ == '__main__':
    unittest.main()