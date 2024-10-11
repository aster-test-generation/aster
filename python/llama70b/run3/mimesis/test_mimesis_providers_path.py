import unittest
from mimesis.providers.path import Path


class TestPath(unittest.TestCase):
    def test_init(self):
        instance = Path()
        self.assertEqual(instance.platform, sys.platform)

    def test_init_with_platform(self):
        instance = Path('darwin')
        self.assertEqual(instance.platform, 'darwin')

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

    def test_Meta_name(self):
        self.assertEqual(Path.Meta.name, 'path')

    def test_str_method(self):
        instance = Path()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = Path()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = Path()
        instance2 = Path()
        self.assertTrue(instance1 == instance2)

    def test_private_method__init__(self):
        instance = Path()
        result = instance._Path__init__('darwin')
        self.assertEqual(instance.platform, 'darwin')

    def test_private_method_pathlib_home(self):
        instance = Path()
        result = instance._Path__pathlib_home
        self.assertIsInstance(result, (PurePosixPath, PureWindowsPath))

if __name__ == '__main__':
    unittest.main()