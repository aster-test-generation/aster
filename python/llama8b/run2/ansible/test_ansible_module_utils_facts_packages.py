import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr


class TestPkgMgr(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        result = PkgMgr.get_all_pkg_managers()
        self.assertIsInstance(result, dict)

    def test_PkgMgr_is_available(self):
        pkg_mgr = PkgMgr()
        self.assertRaises(NotImplementedError, pkg_mgr.is_available)

    def test_PkgMgr_list_installed(self):
        pkg_mgr = PkgMgr()
        self.assertRaises(NotImplementedError, pkg_mgr.list_installed)

    def test_PkgMgr_get_package_details(self):
        pkg_mgr = PkgMgr()
        self.assertRaises(NotImplementedError, pkg_mgr.get_package_details, 'package')

    def test_PkgMgr_get_packages(self):
        pkg_mgr = PkgMgr()
        self.assertRaises(NotImplementedError, pkg_mgr.get_packages)

    def test_LibMgr_is_available(self):
        lib_mgr = LibMgr()
        self.assertFalse(lib_mgr.is_available())

    def test_CLIMgr_is_available(self):
        cli_mgr = CLIMgr()
        self.assertFalse(cli_mgr.is_available())

class TestLibMgr(unittest.TestCase):
    def test_LibMgr_init(self):
        lib_mgr = LibMgr()
        self.assertIsNone(lib_mgr._lib)

    def test_LibMgr_is_available(self):
        lib_mgr = LibMgr()
        self.assertFalse(lib_mgr.is_available())

class TestCLIMgr(unittest.TestCase):
    def test_CLIMgr_init(self):
        cli_mgr = CLIMgr()
        self.assertIsNone(cli_mgr._cli)

    def test_CLIMgr_is_available(self):
        cli_mgr = CLIMgr()
        self.assertFalse(cli_mgr.is_available())

if __name__ == '__main__':
    unittest.main()