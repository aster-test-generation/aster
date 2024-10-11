import unittest
from mimesis.providers.path import Path


class TestPath(unittest.TestCase):
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

if __name__ == '__main__':
    unittest.main()