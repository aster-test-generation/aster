import sys
import unittest
from pathlib import PurePosixPath, PureWindowsPath
from mimesis.providers.path import Path
from mimesis.data import PLATFORMS, PROGRAMMING_LANGS, PROJECT_NAMES, USERNAMES
from mimesis.providers.base import BaseProvider


class TestPath(unittest.TestCase):
    def test_init(self):
        path = Path()
        self.assertEqual(path.platform, sys.platform)
        self.assertIsInstance(path._pathlib_home, (PurePosixPath, PureWindowsPath))

    def test_root(self):
        path = Path()
        result = path.root()
        self.assertIsInstance(result, str)

    def test_home(self):
        path = Path()
        result = path.home()
        self.assertIsInstance(result, str)

    def test_user(self):
        path = Path()
        result = path.user()
        self.assertIsInstance(result, str)

    def test_users_folder(self):
        path = Path()
        result = path.users_folder()
        self.assertIsInstance(result, str)

    def test_dev_dir(self):
        path = Path()
        result = path.dev_dir()
        self.assertIsInstance(result, str)

    def test_project_dir(self):
        path = Path()
        result = path.project_dir()
        self.assertIsInstance(result, str)

    def test_str(self):
        path = Path()
        result = str(path)
        self.assertIsInstance(result, str)

    def test_repr(self):
        path = Path()
        result = repr(path)
        self.assertIsInstance(result, str)

    def test_eq(self):
        path1 = Path()
        path2 = Path()
        self.assertTrue(path1 == path2)

    def test_private_method(self):
        path = Path()
        result = path._Path__init__('linux')
        self.assertEqual(result, None)

    def test_protected_method(self):
        path = Path()
        result = path._Path__init__('linux')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()