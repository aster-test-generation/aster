import unittest
from ansible.module_utils.facts.packages import get_all_pkg_managers, PkgMgr, LibMgr, CLIMgr


class TestGetPkgManagers(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        pkg_managers = get_all_pkg_managers()
        self.assertIsInstance(pkg_managers, dict)
        self.assertGreater(len(pkg_managers), 0)
        for manager in pkg_managers.values():
            self.assertIsInstance(manager, type)
            self.assertTrue(issubclass(manager, PkgMgr))

class TestPkgMgr(unittest.TestCase):
    def test_is_available(self):
        pkg_mgr = PkgMgr()
        self.assertFalse(pkg_mgr.is_available())

class TestLibMgr(unittest.TestCase):
    def test_is_available(self):
        lib_mgr = LibMgr()
        self.assertFalse(lib_mgr.is_available())

class TestCLIMgr(unittest.TestCase):
    def test_is_available(self):
        cli_mgr = CLIMgr()
        self.assertFalse(cli_mgr.is_available())

if __name__ == '__main__':
    unittest.main()