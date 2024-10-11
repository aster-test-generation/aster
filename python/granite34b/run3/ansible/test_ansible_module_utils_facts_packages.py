import unittest
from ansible.module_utils.facts.packages import *


class TestPkgMgr(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        result = get_all_pkg_managers()
        self.assertIsInstance(result, dict)

    def test_pkg_mgr_get_packages(self):
        instance = PkgMgr()
        result = instance.get_packages()
        self.assertIsInstance(result, dict)

class TestLibMgr(unittest.TestCase):
    def test_lib_mgr_init(self):
        instance = LibMgr()
        self.assertIsNone(instance._lib)

    def test_lib_mgr_is_available(self):
        instance = LibMgr()
        result = instance.is_available()
        self.assertIsInstance(result, bool)

class TestCLIMgr(unittest.TestCase):
    def test_cli_mgr_init(self):
        instance = CLIMgr()
        self.assertIsNone(instance._cli)

    def test_cli_mgr_is_available(self):
        instance = CLIMgr()
        result = instance.is_available()
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()