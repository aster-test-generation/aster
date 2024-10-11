import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.pip import _get_pip, _have_pip_module, _SPECIAL_PACKAGE_CHECKERS, _VCS_RE, op_dict
import os
import sys


class TestPipModule(unittest.TestCase):

    @patch('ansible.modules.pip.PY3', True)
    @patch('ansible.modules.pip.os.path.isabs')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    @patch('ansible.modules.pip._have_pip_module')
    def test_get_pip_with_executable(self, mock_have_pip_module, mock_isabs):
        mock_isabs.return_value = True
        mock_have_pip_module.return_value = True
        module = MagicMock()
        result = _get_pip(module, executable='/usr/bin/pip3')
        self.assertEqual(result, ['/usr/bin/pip3'])

    @patch('ansible.modules.pip.PY3', True)
    @patch('ansible.modules.pip.os.path.isabs')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    @patch('ansible.modules.pip._have_pip_module')
    def test_get_pip_with_env(self, mock_have_pip_module, mock_isabs):
        mock_isabs.return_value = False
        mock_have_pip_module.return_value = False
        module = MagicMock()
        module.get_bin_path.return_value = None
        module.fail_json.side_effect = Exception("Unable to find any of pip3 to use. pip needs to be installed.")
        with self.assertRaises(Exception) as context:
            _get_pip(module, env='/myenv')
        self.assertTrue('Unable to find pip in the virtualenv' in str(context.exception))

    @patch('ansible.modules.pip.PY3', True)
    @patch('ansible.modules.pip.os.path.isabs')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    @patch('ansible.modules.pip._have_pip_module')
    def test_get_pip_with_no_executable(self, mock_have_pip_module, mock_isabs):
        mock_isabs.return_value = False
        mock_have_pip_module.return_value = True
        module = MagicMock()
        result = _get_pip(module)
        self.assertEqual(result, ['/usr/bin/python3', '-m', 'pip.__main__'])

    @patch('ansible.modules.pip.PY3', False)
    @patch('ansible.modules.pip.os.path.isabs')
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python2')
    @patch('ansible.modules.pip._have_pip_module')
    def test_get_pip_with_python2(self, mock_have_pip_module, mock_isabs):
        mock_isabs.return_value = False
        mock_have_pip_module.return_value = False
        module = MagicMock()
        module.get_bin_path.return_value = '/usr/bin/pip2'
        result = _get_pip(module)
        self.assertEqual(result, ['/usr/bin/pip2'])

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)

    def test_vcs_re(self):
        self.assertTrue(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertFalse(_VCS_RE.match('https://example.com/repo.git'))

    def test_op_dict(self):
        self.assertEqual(op_dict['>='], operator.ge)
        self.assertEqual(op_dict['<='], operator.le)
        self.assertEqual(op_dict['>'], operator.gt)
        self.assertEqual(op_dict['<'], operator.lt)
        self.assertEqual(op_dict['=='], operator.eq)
        self.assertEqual(op_dict['!='], operator.ne)
        self.assertEqual(op_dict['~='], operator.ge)

if __name__ == '__main__':
    unittest.main()