import unittest
from ansible.module_utils.common.sys_info import get_distribution, get_distribution_version, get_distribution_codename, get_platform_subclass


class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertIsInstance(result, str)

    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertIsInstance(result, (str, type(None)))

    def test_get_distribution_codename(self):
        result = get_distribution_codename()
        self.assertIsInstance(result, (str, type(None)))

    def test_get_platform_subclass(self):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertIsInstance(result, type)

class TestSysInfo(unittest.TestCase):
    def test_get_distribution(self):
        result = get_distribution()
        self.assertIsInstance(result, str)

    def test_get_distribution_version(self):
        result = get_distribution_version()
        self.assertIsInstance(result, str)

    def test_get_distribution_codename(self):
        result = get_distribution_codename()
        self.assertIsInstance(result, str)

    def test_get_platform_subclass(self):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertIsInstance(result, type)

    def test_get_distribution_linux(self):
        with unittest.mock.patch('platform.system', return_value='Linux'):
            result = get_distribution()
            self.assertIsInstance(result, str)

    def test_get_distribution_version_centos(self):
        with unittest.mock.patch('distro.id', return_value='centos'):
            with unittest.mock.patch('distro.version', return_value='7.8.2003'):
                result = get_distribution_version()
                self.assertEqual(result, '7.8')

    def test_get_distribution_version_debian(self):
        with unittest.mock.patch('distro.id', return_value='debian'):
            with unittest.mock.patch('distro.version', return_value='10.3'):
                result = get_distribution_version()
                self.assertEqual(result, '10.3')

    def test_get_distribution_codename_ubuntu(self):
        with unittest.mock.patch('distro.id', return_value='ubuntu'):
            with unittest.mock.patch('distro.os_release_info', return_value={'version_codename': 'focal'}):
                result = get_distribution_codename()
                self.assertEqual(result, 'focal')

    def test_get_platform_subclass_distribution_match(self):
        class TestClass:
            distribution = 'Redhat'
            platform = 'Linux'
        class TestSubclass(TestClass):
            distribution = 'Redhat'
            platform = 'Linux'
        result = get_platform_subclass(TestClass)
        self.assertEqual(result, TestSubclass)

    def test_get_platform_subclass_platform_match(self):
        class TestClass:
            distribution = None
            platform = 'Linux'
        class TestSubclass(TestClass):
            platform = 'Linux'
        result = get_platform_subclass(TestClass)
        self.assertEqual(result, TestSubclass)

    def test_get_platform_subclass_no_match(self):
        class TestClass:
            pass
        result = get_platform_subclass(TestClass)
        self.assertEqual(result, TestClass)

if __name__ == '__main__':
    unittest.main()