import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_module(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

    def test_get_executable(self):
        pip = Pip()
        executable = pip.get_executable()
        self.assertIsNotNone(executable)

    def test_get_pip_version(self):
        pip = Pip()
        version = pip.get_pip_version()
        self.assertIsNotNone(version)

    def test_get_package_version(self):
        pip = Pip()
        version = pip.get_package_version('ansible')
        self.assertIsNotNone(version)

    def test_get_installed_version(self):
        pip = Pip()
        version = pip.get_installed_version('ansible')
        self.assertIsNotNone(version)

    def test_get_installed_version_not_installed(self):
        pip = Pip()
        version = pip.get_installed_version('this_package_does_not_exist')
        self.assertIsNone(version)

    def test_is_installed(self):
        pip = Pip()
        is_installed = pip.is_installed('ansible')
        self.assertTrue(is_installed)

    def test_is_installed_not_installed(self):
        pip = Pip()
        is_installed = pip.is_installed('this_package_does_not_exist')
        self.assertFalse(is_installed)

    def test_install(self):
        pip = Pip()
        result = pip.install('ansible')
        self.assertTrue(result)

    def test_install_with_version(self):
        pip = Pip()
        result = pip.install('ansible==2.5.1')
        self.assertTrue(result)

    def test_uninstall(self):
        pip = Pip()
        result = pip.uninstall('ansible')
        self.assertTrue(result)

    def test_uninstall_with_version(self):
        pip = Pip()
        result = pip.uninstall('ansible==2.5.1')
        self.assertTrue(result)

    def test_list(self):
        pip = Pip()
        packages = pip.list()
        self.assertIsNotNone(packages)

    def test_list_with_path(self):
        pip = Pip()
        packages = pip.list(path='/tmp/virtualenv')
        self.assertIsNotNone(packages)

if __name__ == '__main__':
    unittest.main()