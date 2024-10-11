import unittest
from ansible.module_utils.facts.packages import *

class TestPkgMgr(unittest.TestCase):
    def test_is_available(self):
        instance = PkgMgr()
        result = instance.is_available()
        self.assertEqual(result, False)

    def test_list_installed(self):
        instance = PkgMgr()
        result = instance.list_installed()
        self.assertEqual(result, [])

    def test_get_package_details(self):
        instance = PkgMgr()
        result = instance.get_package_details('package')
        self.assertEqual(result, {})

    def test_get_packages(self):
        instance = PkgMgr()
        result = instance.get_packages()
        self.assertEqual(result, {})

class TestLibMgr(unittest.TestCase):
    def test_is_available(self):
        instance = LibMgr()
        result = instance.is_available()
        self.assertEqual(result, False)

    def test_list_installed(self):
        instance = LibMgr()
        result = instance.list_installed()
        self.assertEqual(result, [])

    def test_get_package_details(self):
        instance = LibMgr()
        result = instance.get_package_details('package')
        self.assertEqual(result, {})

    def test_get_packages(self):
        instance = LibMgr()
        result = instance.get_packages()
        self.assertEqual(result, {})

class TestCLIMgr(unittest.TestCase):
    def test_is_available(self):
        instance = CLIMgr()
        result = instance.is_available()
        self.assertEqual(result, False)

    def test_list_installed(self):
        instance = CLIMgr()
        result = instance.list_installed()
        self.assertEqual(result, [])

    def test_get_package_details(self):
        instance = CLIMgr()
        result = instance.get_package_details('package')
        self.assertEqual(result, {})

    def test_get_packages(self):
        instance = CLIMgr()
        result = instance.get_packages()
        self.assertEqual(result, {})

class TestGetAllPkgManagers(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        result = get_all_pkg_managers()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()