import unittest
from ansible.module_utils.facts.packages import PkgMgr, LibMgr, CLIMgr


class TestPkgMgr(unittest.TestCase):
    def test_is_available(self):
        self.assertTrue(PkgMgr().is_available())

    def test_list_installed(self):
        self.assertListEqual(PkgMgr().list_installed(), ['emacs', 'vim'])

    def test_get_package_details(self):
        self.assertDictEqual(PkgMgr().get_package_details(''), {'': []})

    def test_get_packages(self):
        self.assertDictEqual(PkgMgr().get_packages(), {})

class TestLibMgr(unittest.TestCase):
    def test_is_available(self):
        self.assertTrue(LibMgr().is_available())

    def test_list_installed(self):
        self.assertListEqual(LibMgr().list_installed(), ['django', 'flask', 'pyramid'])

    def test_get_package_details(self):
        self.assertDictEqual(LibMgr().get_package_details(''), {})

    def test_get_packages(self):
        self.assertDictEqual(LibMgr().get_packages(), {'pkg1': {'version': '1.0', 'location': '/usr/lib'}, 'pkg2': {'version': '2.0', 'location': '/usr/lib64'}})

class TestCLIMgr(unittest.TestCase):
    def test_is_available(self):
        self.assertTrue(CLIMgr().is_available())

    def test_list_installed(self):
        self.assertListEqual(CLIMgr().list_installed(), ['pkg1', 'pkg2'])

    def test_get_package_details(self):
        self.assertDictEqual(CLIMgr().get_package_details(''), {'': []})

    def test_get_packages(self):
        self.assertDictEqual(CLIMgr().get_packages(), {'a': '1.0', 'b': '2.0'})

if __name__ == '__main__':
    unittest.main()