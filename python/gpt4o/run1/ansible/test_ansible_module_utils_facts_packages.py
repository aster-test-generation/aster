import unittest
from ansible.module_utils.facts.packages import *


class TestPkgMgr(unittest.TestCase):
    def test_get_packages(self):
        class TestPkgMgrImpl(PkgMgr):
            def is_available(self):
                return True

            def list_installed(self):
                return ['pkg1', 'pkg2']

            def get_package_details(self, package):
                return {'name': package, 'version': '1.0'}

        instance = TestPkgMgrImpl()
        result = instance.get_packages()
        expected = {
            'pkg1': [{'name': 'pkg1', 'version': '1.0', 'source': 'testpkgmgrimpl'}],
            'pkg2': [{'name': 'pkg2', 'version': '1.0', 'source': 'testpkgmgrimpl'}]
        }
        self.assertEqual(result, expected)

class TestLibMgr(unittest.TestCase):
    def test_init(self):
        instance = LibMgrMock()
        self.assertIsNone(instance._lib)

    def test_is_available_found(self):
        class TestLibMgr(LibMgr):
            LIB = 'math'

        instance = ConcreteLibMgr()
        result = instance.is_available()
        self.assertTrue(result)

    def test_is_available_not_found(self):
        class TestLibMgr(LibMgr):
            LIB = 'nonexistentlib'

        instance = TestLibMgrSubclass()
        result = instance.is_available()
        self.assertFalse(result)

class TestCLIMgr(unittest.TestCase):
    def test_init(self):
        instance = CLIMgrMock()
        self.assertIsNone(instance._cli)

    def test_is_available_found(self):
        class TestCLIMgr(CLIMgr):
            CLI = 'ls'

        instance = TestCLIMgrSubclass()
        result = instance.is_available()
        self.assertTrue(result)

    def test_is_available_not_found(self):
        class TestCLIMgr(CLIMgr):
            CLI = 'nonexistentcli'

        instance = TestCLIMgrMock()
        result = instance.is_available()
        self.assertFalse(result)

class TestGetAllPkgManagers(unittest.TestCase):
    def test_get_all_pkg_managers(self):
        result = get_all_pkg_managers()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()