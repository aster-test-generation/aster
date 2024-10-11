import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.pip import _get_packages


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.pip = ['pip']
        self.chdir = '/some/path'
        self.locale = 'en_US.UTF-8'
        self.lang_env = {'LANG': self.locale, 'LC_ALL': self.locale, 'LC_MESSAGES': self.locale}

    @patch('ansible.modules.pip.get_best_parsable_locale')
    def test_get_packages_success(self, mock_get_best_parsable_locale):
        mock_get_best_parsable_locale.return_value = self.locale
        self.module.run_command.return_value = (0, 'package==1.0.0', '')

        command, out, err = _get_packages(self.module, self.pip, self.chdir)

        self.assertEqual(command, 'pip list --format=freeze')
        self.assertEqual(out, 'package==1.0.0')
        self.assertEqual(err, '')

    @patch('ansible.modules.pip.get_best_parsable_locale')
    def test_get_packages_fallback_success(self, mock_get_best_parsable_locale):
        mock_get_best_parsable_locale.return_value = self.locale
        self.module.run_command.side_effect = [(1, '', 'error'), (0, 'package==1.0.0', '')]

        command, out, err = _get_packages(self.module, self.pip, self.chdir)

        self.assertEqual(command, 'pip freeze')
        self.assertEqual(out, 'package==1.0.0')
        self.assertEqual(err, '')

    @patch('ansible.modules.pip.get_best_parsable_locale')
    def test_get_packages_failure(self, mock_get_best_parsable_locale):
        mock_get_best_parsable_locale.return_value = self.locale
        self.module.run_command.side_effect = [(1, '', 'error'), (1, '', 'error')]

        with self.assertRaises(SystemExit):
            _get_packages(self.module, self.pip, self.chdir)

    def test_fail(self):
        with self.assertRaises(SystemExit):
            _fail(self.module, 'command', 'output', 'error')

if __name__ == '__main__':
    unittest.main()