import unittest
from unittest.mock import patch
from mimesis.providers.path import Path
from mimesis.data import (
    FOLDERS,
    PLATFORMS,
    PROGRAMMING_LANGS,
    PROJECT_NAMES,
    USERNAMES,
)


class TestPath(unittest.TestCase):
    def setUp(self):
        self.instance = Path()

    def test_init(self):
        instance = Path(platform='win32')
        self.assertEqual(instance.platform, 'win32')

    def test_root(self):
        result = self.instance.root()
        expected = str(self.instance._pathlib_home.parent)
        self.assertEqual(result, expected)

    def test_home(self):
        result = self.instance.home()
        expected = str(self.instance._pathlib_home)
        self.assertEqual(result, expected)

    @patch('mimesis.providers.path.Path.random')
    def test_user(self, mock_random):
        mock_random.choice.return_value = USERNAMES[0]
        result = self.instance.user()
        expected_user = USERNAMES[0].capitalize() if 'win' in self.instance.platform else USERNAMES[0].lower()
        expected = str(self.instance._pathlib_home / expected_user)
        self.assertEqual(result, expected)

    @patch('mimesis.providers.path.Path.random')
    def test_users_folder(self, mock_random):
        mock_random.choice.side_effect = [USERNAMES[0], FOLDERS[0]]
        result = self.instance.users_folder()
        expected_user = USERNAMES[0].capitalize() if 'win' in self.instance.platform else USERNAMES[0].lower()
        expected = str(self.instance._pathlib_home / expected_user / FOLDERS[0])
        self.assertEqual(result, expected)

    @patch('mimesis.providers.path.Path.random')
    def test_dev_dir(self, mock_random):
        mock_random.choice.side_effect = [USERNAMES[0], 'Development', PROGRAMMING_LANGS[0]]
        result = self.instance.dev_dir()
        expected_user = USERNAMES[0].capitalize() if 'win' in self.instance.platform else USERNAMES[0].lower()
        expected = str(self.instance._pathlib_home / expected_user / 'Development' / PROGRAMMING_LANGS[0])
        self.assertEqual(result, expected)

    @patch('mimesis.providers.path.Path.random')
    def test_project_dir(self, mock_random):
        mock_random.choice.side_effect = [USERNAMES[0], 'Development', PROGRAMMING_LANGS[0], PROJECT_NAMES[0]]
        result = self.instance.project_dir()
        expected_user = USERNAMES[0].capitalize() if 'win' in self.instance.platform else USERNAMES[0].lower()
        expected_dev_dir = str(self.instance._pathlib_home / expected_user / 'Development' / PROGRAMMING_LANGS[0])
        expected = str(self.instance._pathlib_home / expected_dev_dir / PROJECT_NAMES[0])
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()