import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr


class TestPkgMgr(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        pkg_managers = get_all_pkg_managers()
        self.assertIsInstance(pkg_managers, dict)
        self.assertGreater(len(pkg_managers), 0)
        for key, value in pkg_managers.items():
            self.assertIsInstance(key, str)
            self.assertTrue(issubclass(value, PkgMgr))

class TestPkgMgrMethods(unittest.TestCase):
    def setUp(self):
        self.pkg_mgr = PkgMgr()

    def test_is_available(self):
        self.assertFalse(self.pkg_mgr.is_available())

    def test_list_installed(self):
        self.assertRaises(NotImplementedError, self.pkg_mgr.list_installed)

    def test_get_package_details(self):
        self.assertRaises(NotImplementedError, self.pkg_mgr.get_package_details, 'package')

    def test_get_packages(self):
        installed_packages = self.pkg_mgr.get_packages()
        self.assertIsInstance(installed_packages, dict)

class TestLibMgr(unittest.TestCase):
    def setUp(self):
        self.lib_mgr = LibMgr()

    def test_is_available(self):
        self.assertFalse(self.lib_mgr.is_available())

    def test_lib(self):
        self.assertIsNone(self.lib_mgr._lib)

class TestCLIMgr(unittest.TestCase):
    def setUp(self):
        self.cli_mgr = CLIMgr()

    def test_is_available(self):
        self.assertFalse(self.cli_mgr.is_available())

    def test_cli(self):
        self.assertIsNone(self.cli_mgr._cli)

if __name__ == '__main__':
    unittest.main()