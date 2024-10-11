import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr


class TestPkgMgr(unittest.TestCase):
    def test_is_available(self):
        lib_mgr = LibMgr()
        self.assertFalse(lib_mgr.is_available())

    def test_list_installed(self):
        lib_mgr = LibMgr()
        with self.assertRaises(NotImplementedError):
            lib_mgr.list_installed()

    def test_get_package_details(self):
        lib_mgr = LibMgr()
        with self.assertRaises(NotImplementedError):
            lib_mgr.get_package_details('package')

    def test_get_packages(self):
        lib_mgr = LibMgr()
        with self.assertRaises(NotImplementedError):
            lib_mgr.get_packages()

    def test_str_method(self):
        lib_mgr = LibMgr()
        result = str(lib_mgr)
        self.assertEqual(result, '<ansible.module_utils.facts.packages.LibMgr object at 0x...>')

    def test_repr_method(self):
        lib_mgr = LibMgr()
        result = repr(lib_mgr)
        self.assertEqual(result, '<ansible.module_utils.facts.packages.LibMgr object at 0x...>')

    def test_eq_method(self):
        lib_mgr1 = LibMgr()
        lib_mgr2 = LibMgr()
        self.assertEqual(lib_mgr1, lib_mgr2)

class TestLibMgr(unittest.TestCase):
    def test_is_available(self):
        lib_mgr = LibMgr()
        self.assertFalse(lib_mgr.is_available())

    def test_list_installed(self):
        lib_mgr = LibMgr()
        with self.assertRaises(NotImplementedError):
            lib_mgr.list_installed()

    def test_get_package_details(self):
        lib_mgr = LibMgr()
        with self.assertRaises(NotImplementedError):
            lib_mgr.get_package_details('package')

    def test_get_packages(self):
        lib_mgr = LibMgr()
        with self.assertRaises(NotImplementedError):
            lib_mgr.get_packages()

class TestCLIMgr(unittest.TestCase):
    def test_is_available(self):
        cli_mgr = CLIMgr()
        self.assertFalse(cli_mgr.is_available())

    def test_list_installed(self):
        cli_mgr = CLIMgr()
        with self.assertRaises(NotImplementedError):
            cli_mgr.list_installed()

    def test_get_package_details(self):
        cli_mgr = CLIMgr()
        with self.assertRaises(NotImplementedError):
            cli_mgr.get_package_details('package')

    def test_get_packages(self):
        cli_mgr = CLIMgr()
        with self.assertRaises(NotImplementedError):
            cli_mgr.get_packages()

if __name__ == '__main__':
    unittest.main()