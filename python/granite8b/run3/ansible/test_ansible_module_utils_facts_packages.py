import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr


class TestPkgMgr(unittest.TestCase):
    def test_is_available(self):
        self.assertFalse(PkgMgr().is_available())

    def test_list_installed(self):
        self.assertListEqual(PkgMgr().list_installed(), [])

    def test_get_package_details(self):
        self.assertDictEqual(PkgMgr().get_package_details(''), {})

    def test_get_packages(self):
        self.assertDictEqual(PkgMgr().get_packages(), {})

class TestLibMgr(unittest.TestCase):
    def test_is_available(self):
        self.assertFalse(LibMgr().is_available())

    def test_list_installed(self):
        self.assertListEqual(LibMgr().list_installed(), [])

    def test_get_package_details(self):
        self.assertDictEqual(LibMgr().get_package_details(''), {})

    def test_get_packages(self):
        self.assertDictEqual(LibMgr().get_packages(), {})

class TestCLIMgr(unittest.TestCase):
    def test_is_available(self):
        self.assertFalse(CLIMgr().is_available())

    def test_list_installed(self):
        self.assertListEqual(CLIMgr().list_installed(), [])

    def test_get_package_details(self):
        self.assertDictEqual(CLIMgr().get_package_details(''), {})

    def test_get_packages(self):
        self.assertDictEqual(CLIMgr().get_packages(), {})

if __name__ == '__main__':
    unittest.main()