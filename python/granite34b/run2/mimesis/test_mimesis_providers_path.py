import unittest
from mimesis.providers.path import Path


class TestPath(unittest.TestCase):
    def setUp(self):
        self.path = Path()

    def test_root(self):
        root = self.path.root()
        self.assertEqual(root, '/home')

    def test_home(self):
        home = self.path.home()
        self.assertEqual(home, '/home')

    def test_user(self):
        user = self.path.user()
        self.assertIn(user, ['User1', 'User2', 'User3'])

    def test_users_folder(self):
        folder = self.path.users_folder()
        self.assertIn(folder, ['Folder1', 'Folder2', 'Folder3'])

    def test_dev_dir(self):
        dev_dir = self.path.dev_dir()
        self.assertIn(dev_dir, ['Development', 'Dev'])

    def test_project_dir(self):
        project_dir = self.path.project_dir()
        self.assertIn(project_dir, ['Project1', 'Project2', 'Project3'])

if __name__ == '__main__':
    unittest.main()