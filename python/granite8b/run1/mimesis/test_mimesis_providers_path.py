import unittest
import sys
from pathlib import PurePosixPath, PureWindowsPath
from mimesis.data import (
    FOLDERS,
    PLATFORMS,
    PROGRAMMING_LANGS,
    PROJECT_NAMES,
    USERNAMES,
)
from mimesis.providers.base import BaseProvider
from mimesis.providers.path import Path


class TestPathProvider(unittest.TestCase):
    def setUp(self):
        self.path_provider = Path()

    def test_root(self):
        root = self.path_provider.root()
        self.assertEqual(root, str(PureWindowsPath().parent))

    def test_home(self):
        home = self.path_provider.home()
        self.assertEqual(home, str(PureWindowsPath()))

    def test_user(self):
        user = self.path_provider.user()
        self.assertIn(user, USERNAMES)

    def test_users_folder(self):
        folder = self.path_provider.users_folder()
        self.assertIn(folder, FOLDERS)

    def test_dev_dir(self):
        dev_dir = self.path_provider.dev_dir()
        self.assertIn(dev_dir, PROGRAMMING_LANGS)

    def test_project_dir(self):
        project_dir = self.path_provider.project_dir()
        self.assertIn(project_dir, PROJECT_NAMES)

if __name__ == '__main__':
    unittest.main()