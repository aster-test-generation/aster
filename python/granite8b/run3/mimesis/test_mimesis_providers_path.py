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


class TestPathProvider:
    def test_root(self):
        provider = Path()
        assert provider.root() == str(PureWindowsPath().parent) if 'win' in sys.platform else str(PurePosixPath().parent)

    def test_home(self):
        provider = Path()
        assert provider.home() == str(PureWindowsPath() if 'win' in sys.platform else PurePosixPath())

    def test_user(self):
        provider = Path()
        user = provider.random.choice(USERNAMES)
        user = user.capitalize() if 'win' in sys.platform else user.lower()
        assert provider.user() == str(PureWindowsPath() if 'win' in sys.platform else PurePosixPath()) / user

    def test_users_folder(self):
        provider = Path()
        user = provider.user()
        folder = provider.random.choice(FOLDERS)
        assert provider.users_folder() == str(PureWindowsPath() if 'win' in sys.platform else PurePosixPath()) / user / folder

    def test_dev_dir(self):
        provider = Path()
        user = provider.user()
        folder = provider.random.choice(['Development', 'Dev'])
        stack = provider.random.choice(PROGRAMMING_LANGS)
        assert provider.dev_dir() == str(PureWindowsPath() if 'win' in sys.platform else PurePosixPath()) / user / folder / stack

if __name__ == '__main__':
    unittest.main()