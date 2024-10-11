import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr, get_all_pkg_managers


class TestPkgMgr(unittest.TestCase):
    def test_is_available(self):
        instance = PkgMgr()
        with self.assertRaises(NotImplementedError):
            instance.is_available()

    def test_list_installed(self):
        instance = PkgMgr()
        with self.assertRaises(NotImplementedError):
            instance.list_installed()

    def test_get_package_details(self):
        instance = PkgMgr()
        with self.assertRaises(NotImplementedError):
            instance.get_package_details('package')

    def test_get_packages(self):
        instance = PkgMgr()
        result = instance.get_packages()
        self.assertEqual(result, {})

class TestLibMgr(unittest.TestCase):
    def test_init(self):
        instance = LibMgr()
        self.assertIsNone(instance._lib)

    def test_is_available(self):
        instance = LibMgr()
        instance.LIB = 'mock_lib'
        result = instance.is_available()
        self.assertTrue(result)

    def test_is_available_import_error(self):
        instance = LibMgr()
        instance.LIB = 'non_existent_lib'
        result = instance.is_available()
        self.assertFalse(result)

class TestCLIMgr(unittest.TestCase):
    def test_init(self):
        instance = CLIMgr()
        self.assertIsNone(instance._cli)

    def test_is_available(self):
        instance = CLIMgr()
        instance.CLI = 'mock_cli'
        result = instance.is_available()
        self.assertTrue(result)

    def test_is_available_value_error(self):
        instance = CLIMgr()
        instance.CLI = 'non_existent_cli'
        result = instance.is_available()
        self.assertFalse(result)

class TestGetAllPkgManagers(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        result = get_all_pkg_managers()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()