import unittest
from unittest.mock import patch
from mimesis.providers.path import Path
from mimesis.data import FOLDERS, PLATFORMS, PROGRAMMING_LANGS, PROJECT_NAMES, USERNAMES


class TestPath(unittest.TestCase):
    def setUp(self):
        self.instance = Path(platform='linux')

    def test_init(self):
        instance = Path(platform='linux')
        self.assertEqual(instance.platform, 'linux')

    def test_root(self):
        result = self.instance.root()
        self.assertEqual(result, '/')

    def test_home(self):
        result = self.instance.home()
        self.assertEqual(result, '/home')

    @patch('mimesis.providers.path.Path.random')
    def test_user(self, mock_random):
        mock_random.choice.return_value = 'testuser'
        result = self.instance.user()
        self.assertEqual(result, '/home/testuser')

    @patch('mimesis.providers.path.Path.random')
    def test_users_folder(self, mock_random):
        mock_random.choice.side_effect = ['testuser', 'Documents']
        result = self.instance.users_folder()
        self.assertEqual(result, '/home/testuser/Documents')

    @patch('mimesis.providers.path.Path.random')
    def test_dev_dir(self, mock_random):
        mock_random.choice.side_effect = ['testuser', 'Development', 'Python']
        result = self.instance.dev_dir()
        self.assertEqual(result, '/home/testuser/Development/Python')

    @patch('mimesis.providers.path.Path.random')
    def test_project_dir(self, mock_random):
        mock_random.choice.side_effect = ['testuser', 'Development', 'Python', 'MyProject']
        result = self.instance.project_dir()
        self.assertEqual(result, '/home/testuser/Development/Python/MyProject')

    def test_meta_name(self):
        self.assertEqual(self.instance.Meta.name, 'path')

if __name__ == '__main__':
    unittest.main()