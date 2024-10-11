import unittest
from unittest.mock import Mock, patch
from ansible.modules.pip import _get_packages, _VCS_RE, op_dict


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.pip = ['pip']
        self.chdir = '/some/path'
        self.locale = 'en_US.UTF-8'
        self.lang_env = {'LANG': self.locale, 'LC_ALL': self.locale, 'LC_MESSAGES': self.locale}

    @patch('ansible.modules.pip.get_best_parsable_locale')
    @patch('ansible.modules.pip._fail')
    def test_get_packages_success(self, mock_fail, mock_get_best_parsable_locale):
        mock_get_best_parsable_locale.return_value = self.locale
        self.module.run_command.side_effect = [(0, 'package==1.0.0', ''), (0, 'package==1.0.0', '')]

        cmd, out, err = _get_packages(self.module, self.pip, self.chdir)

        self.assertEqual(cmd, 'pip list --format=freeze')
        self.assertEqual(out, 'package==1.0.0')
        self.assertEqual(err, '')

    @patch('ansible.modules.pip.get_best_parsable_locale')
    @patch('ansible.modules.pip._fail')
    def test_get_packages_fallback_success(self, mock_fail, mock_get_best_parsable_locale):
        mock_get_best_parsable_locale.return_value = self.locale
        self.module.run_command.side_effect = [(1, '', 'error'), (0, 'package==1.0.0', '')]

        cmd, out, err = _get_packages(self.module, self.pip, self.chdir)

        self.assertEqual(cmd, 'pip freeze')
        self.assertEqual(out, 'package==1.0.0')
        self.assertEqual(err, '')

    @patch('ansible.modules.pip.get_best_parsable_locale')
    @patch('ansible.modules.pip._fail')
    def test_get_packages_failure(self, mock_fail, mock_get_best_parsable_locale):
        mock_get_best_parsable_locale.return_value = self.locale
        self.module.run_command.side_effect = [(1, '', 'error'), (1, '', 'error')]

        _get_packages(self.module, self.pip, self.chdir)

        mock_fail.assert_called()

    def test_vcs_re(self):
        self.assertTrue(_VCS_RE.match('git+https://example.com/repo.git'))
        self.assertFalse(_VCS_RE.match('https://example.com/repo.git'))

    def test_op_dict(self):
        self.assertTrue(op_dict['>='](2, 1))
        self.assertFalse(op_dict['<='](2, 1))
        self.assertTrue(op_dict['>'](2, 1))
        self.assertFalse(op_dict['<'](2, 1))
        self.assertTrue(op_dict['=='](2, 2))
        self.assertFalse(op_dict['!='](2, 2))
        self.assertTrue(op_dict['~='](2, 1))

if __name__ == '__main__':
    unittest.main()