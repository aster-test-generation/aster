import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr


class TestPkgMgr(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        result = PkgMgr().get_all_pkg_managers()
        self.assertIsInstance(result, dict)
        self.assertGreater(len(result), 0)

class TestLibMgr(unittest.TestCase):
    def test_is_available(self):
        result = LibMgr.is_available(self)
        self.assertIsInstance(result, bool)

class TestCLIMgr(unittest.TestCase):
    def test_is_available(self):
        result = self.CLIMgr.is_available()
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()