import unittest
from mimesis.providers.path import Path


class TestPath(unittest.TestCase):
    def setUp(self):
        self.path = Path()

    def test_root(self):
        root = self.path.root()
        self.assertTrue(root.startswith('/'))

    def test_home(self):
        home = self.path.home()
        self.assertEqual(home, '/home')

    def test_user(self):
        user = self.path.user()
        self.assertTrue(user.startswith('/home/'))

    def test_users_folder(self):
        folder = self.path.users_folder()
        self.assertTrue(folder.startswith('/home/'))
        self.assertTrue(folder.endswith('/Documents'))

    def test_dev_dir(self):
        dev_dir = self.path.dev_dir()
        self.assertTrue(dev_dir.startswith('/home/'))
        self.assertTrue(dev_dir.endswith('/Development/Python'))

    def test_project_dir(self):
        project_dir = self.path.project_dir()
        self.assertTrue(project_dir.startswith('/home/'))
        self.assertTrue(project_dir.endswith('/Development/Python/mimesis'))

if __name__ == '__main__':
    unittest.main()