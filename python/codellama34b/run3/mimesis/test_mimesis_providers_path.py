import unittest
from mimesis.providers.path import Path


class TestPath(unittest.TestCase):
    def test_root(self):
        instance = Path()
        result = instance.root()
        self.assertIsInstance(result, str)

    def test_home(self):
        instance = Path()
        result = instance.home()
        self.assertIsInstance(result, str)

    def test_user(self):
        instance = Path()
        result = instance.user()
        self.assertIsInstance(result, str)

    def test_users_folder(self):
        instance = Path()
        result = instance.users_folder()
        self.assertIsInstance(result, str)

    def test_dev_dir(self):
        instance = Path()
        result = instance.dev_dir()
        self.assertIsInstance(result, str)

    def test_project_dir(self):
        instance = Path()
        result = instance.project_dir()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()