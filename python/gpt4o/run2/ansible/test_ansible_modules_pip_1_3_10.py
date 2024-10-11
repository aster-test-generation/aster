import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.pip import setup_virtualenv, _fail
from ansible.module_utils.basic import AnsibleModule


class TestPipModule(unittest.TestCase):

    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.check_mode = False
        self.module.params = {
            'virtualenv_command': 'virtualenv',
            'virtualenv_site_packages': False,
            'virtualenv_python': None
        }

    @patch('ansible.modules.pip.shlex.split')
    @patch('ansible.modules.pip.os.path.basename')
    @patch('ansible.modules.pip._get_cmd_options')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    def test_setup_virtualenv(self, mock_get_cmd_options, mock_basename, mock_split):
        mock_split.return_value = ['virtualenv']
        mock_basename.return_value = 'virtualenv'
        mock_get_cmd_options.return_value = []

        self.module.run_command.return_value = (0, 'output', 'error')

        out, err = setup_virtualenv(self.module, '/path/to/env', '/path/to/chdir', 'out', 'err')

        self.assertIn('/path/to/env', out)
        self.assertEqual(err, 'error')

    @patch('ansible.modules.pip.shlex.split')
    @patch('ansible.modules.pip.os.path.basename')
    @patch('ansible.modules.pip._get_cmd_options')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    def test_setup_virtualenv_with_site_packages(self, mock_get_cmd_options, mock_basename, mock_split):
        self.module.params['virtualenv_site_packages'] = True
        mock_split.return_value = ['virtualenv']
        mock_basename.return_value = 'virtualenv'
        mock_get_cmd_options.return_value = []

        self.module.run_command.return_value = (0, 'output', 'error')

        out, err = setup_virtualenv(self.module, '/path/to/env', '/path/to/chdir', 'out', 'err')

        self.assertIn('--system-site-packages', out)
        self.assertEqual(err, 'error')

    @patch('ansible.modules.pip.shlex.split')
    @patch('ansible.modules.pip.os.path.basename')
    @patch('ansible.modules.pip._get_cmd_options')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    def test_setup_virtualenv_with_python(self, mock_get_cmd_options, mock_basename, mock_split):
        self.module.params['virtualenv_python'] = '/usr/bin/python3.8'
        mock_split.return_value = ['virtualenv']
        mock_basename.return_value = 'virtualenv'
        mock_get_cmd_options.return_value = []

        self.module.run_command.return_value = (0, 'output', 'error')

        out, err = setup_virtualenv(self.module, '/path/to/env', '/path/to/chdir', 'out', 'err')

        self.assertIn('-p/usr/bin/python3.8', out)
        self.assertEqual(err, 'error')

    @patch('ansible.modules.pip.shlex.split')
    @patch('ansible.modules.pip.os.path.basename')
    @patch('ansible.modules.pip._get_cmd_options')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    def test_setup_virtualenv_fail(self, mock_get_cmd_options, mock_basename, mock_split):
        mock_split.return_value = ['virtualenv']
        mock_basename.return_value = 'virtualenv'
        mock_get_cmd_options.return_value = []

        self.module.run_command.return_value = (1, 'output', 'error')

        with self.assertRaises(SystemExit):
            setup_virtualenv(self.module, '/path/to/env', '/path/to/chdir', 'out', 'err')

    def test_get_cmd_options(self):
        self.module.get_bin_path.return_value = '/usr/bin/virtualenv'
        result = _get_cmd_options(self.module, 'virtualenv')
        self.assertIsInstance(result, list)

    def test_fail(self):
        with self.assertRaises(SystemExit):
            _fail(self.module, ['cmd'], 'out', 'err')

if __name__ == '__main__':
    unittest.main()