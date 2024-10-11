import unittest
from unittest.mock import patch, MagicMock
from ansible.modules.pip import _get_pip, _SPECIAL_PACKAGE_CHECKERS, _VCS_RE, op_dict
import os
import sys


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path = MagicMock(return_value='/usr/bin/pip')
        self.module.fail_json = MagicMock()

    @patch('ansible.modules.pip.PY3', True)
    def test_get_pip_with_py3(self):
        result = _get_pip(self._have_pip_module)
        self.assertEqual(result, ['/usr/bin/pip'])

    @patch('ansible.modules.pip.PY3', False)
    def test_get_pip_with_py2(self):
        result = _have_pip_module(self.module)
        self.assertEqual(result, ['/usr/bin/pip'])

    @patch('ansible.modules.pip.os.path.isabs', return_value=True)
    def test_get_pip_with_executable(self, mock_isabs):
        result = _get_pip(self.module, executable='/usr/local/bin/pip')
        self.assertEqual(result, ['/usr/local/bin/pip'])

    @patch('ansible.modules.pip.os.path.isabs', return_value=False)
    def test_get_pip_with_relative_executable(self, mock_isabs):
        result = _get_pip(self.module, executable='pip3')
        self.assertEqual(result, ['/usr/bin/pip'])

    @patch('ansible.modules.pip._have_pip', return_value=True)
    def test_get_pip_with_pip_module(self, mock_have_pip):
        result = _get_pip(self.module)
        self.assertEqual(result, [sys.executable, '-m', 'pip.__main__'])

    @patch('ansible.modules.pip.os.path.exists', return_value=True)
    @patch('ansible.modules.pip.is_executable', return_value=True)
    def test_get_pip_with_virtualenv(self, mock_exists, mock_is_executable):
        result = _get_pip(self.module, env='/path/to/venv')
        self.assertEqual(result, ['/path/to/venv/bin/pip3'])

    @patch('ansible.modules.pip.os.path.exists', return_value=False)
    def test_get_pip_virtualenv_not_found(self, mock_exists):
        _get_pip(self.module, env='/path/to/venv')
        self.module.fail_json.assert_called_once_with(msg='Unable to find pip in the virtualenv, /path/to/venv, under any of these names: pip2, pip3. Make sure pip is present in the virtualenv.')

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