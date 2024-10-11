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

    def test_init(self):
        instance = Path()
        result = instance.__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = Path()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = Path()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance = Path()
        result = instance.__eq__()
        self.assertIsInstance(result, bool)

    def test_private_method(self):
        instance = Path()
        result = instance._Path__init__()
        self.assertIsNone(result)

    def test_protected_method(self):
        instance = Path()
        result = instance._Path__str__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()