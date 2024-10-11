import unittest
from ansible.modules.pip import Pip

class TestPip(unittest.TestCase):
    def test_is_present(self):
        module = Mock()
        req = Mock()
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = Mock()
        result = Pip._is_present(module, req, installed_pkgs, pkg_command)
        self.assertTrue(result)

    def test_is_installed(self):
        module = Mock()
        req = Mock()
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = Mock()
        result = Pip._is_installed(module, req, installed_pkgs, pkg_command)
        self.assertTrue(result)

    def test_get_package_to_install(self):
        module = Mock()
        req = Mock()
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = Mock()
        result = Pip._get_package_to_install(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, 'ansible==1.2.3')

    def test_get_installed_version(self):
        module = Mock()
        req = Mock()
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = Mock()
        result = Pip._get_installed_version(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, '1.2.3')

    def test_get_executable(self):
        module = Mock()
        result = Pip._get_executable(module)
        self.assertEqual(result, 'pip')

if __name__ == '__main__':
    unittest.main()