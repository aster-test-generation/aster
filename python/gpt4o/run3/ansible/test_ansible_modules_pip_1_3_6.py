import unittest
from unittest.mock import Mock, patch
from ansible.modules.pip import _get_pip, _SPECIAL_PACKAGE_CHECKERS, _VCS_RE, op_dict
import os
import sys


class TestPipModule(unittest.TestCase):

    @patch('ansible.modules.pip.PY3', True)
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python3')
    @patch('ansible.modules.pip._have_pip', return_value=True)
    def test_get_pip_with_py3_and_pip_module(self, mock_have_pip):
        module = Mock()
        result = _get_pip(module)
        self.assertEqual(result, ['/usr/bin/python3', '-m', 'pip.__main__'])

    @patch('ansible.modules.pip.PY3', False)
    @patch('ansible.modules.pip.sys.executable', '/usr/bin/python2')
    @patch('ansible.modules.pip._have_pip', return_value=True)
    def test_get_pip_with_py2_and_pip_module(self, mock_have_pip):
        module = Mock()
        result = _get_pip(module)
        self.assertEqual(result, ['/usr/bin/python2', '-m', 'pip.__main__'])

    @patch('ansible.modules.pip.os.path.isabs', return_value=True)
    def test_get_pip_with_executable(self, mock_isabs):
        module = Mock()
        result = _get_pip(module, executable='/usr/local/bin/pip')
        self.assertEqual(result, ['/usr/local/bin/pip'])

    @patch('ansible.modules.pip.os.path.isabs', return_value=False)
    @patch('ansible.modules.pip.os.path.exists', return_value=True)
    @patch('ansible.modules.pip.is_executable', return_value=True)
    def test_get_pip_with_virtualenv(self, mock_isabs, mock_exists, mock_is_executable):
        module = Mock()
        result = _get_pip(module, env='/path/to/venv')
        self.assertEqual(result, ['/path/to/venv/bin/pip3'])

    @patch('ansible.modules.pip.os.path.isabs', return_value=False)
    @patch('ansible.modules.pip.os.path.exists', return_value=False)
    @patch('ansible.modules.pip.is_executable', return_value=False)
    def test_get_pip_with_virtualenv_not_found(self, mock_isabs, mock_exists, mock_is_executable):
        module = Mock()
        module.fail_json = Mock()
        _get_pip(module, env='/path/to/venv')
        module.fail_json.assert_called_once_with(msg='Unable to find pip in the virtualenv, /path/to/venv, under any of these names: pip3, pip. Make sure pip is present in the virtualenv.')

    @patch('ansible.modules.pip.os.path.isabs', return_value=False)
    @patch('ansible.modules.pip.os.path.exists', return_value=False)
    @patch('ansible.modules.pip.is_executable', return_value=False)
    def test_get_pip_not_found(self, mock_isabs, mock_exists, mock_is_executable):
        module = Mock()
        module.get_bin_path = Mock(return_value=None)
        module.fail_json = Mock()
        _have_pip(module)
        module.fail_json.assert_called_once_with(msg='Unable to find any of pip2, pip to use.  pip needs to be installed.')

    def test_special_package_checkers(self):
        self.assertIn('setuptools', _SPECIAL_PACKAGE_CHECKERS)
        self.assertIn('pip', _SPECIAL_PACKAGE_CHECKERS)

    def test_vcs_re(self):
        self.assertTrue(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertFalse(_VCS_RE.match('https://example.com/repo.git'))

    def test_op_dict(self):
        import operator
        self.assertEqual(op_dict['<='], operator.le)
        self.assertEqual(op_dict['>'], operator.gt)
        self.assertEqual(op_dict['<'], operator.lt)
        self.assertEqual(op_dict['=='], operator.eq)
        self.assertEqual(op_dict['!='], operator.ne)
        self.assertEqual(op_dict['~='], operator.ge)

if __name__ == '__main__':
    unittest.main()