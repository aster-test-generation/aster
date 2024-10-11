import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_get_package_version(self):
        pip = Pip()
        self.assertEqual(pip.get_package_version('ansible'), '2.9.1')

    def test_get_installed_version(self):
        pip = Pip()
        self.assertEqual(pip.get_installed_version('ansible'), '2.9.1')

    def test_is_installed(self):
        pip = Pip()
        self.assertTrue(pip.is_installed('ansible'))

    def test_is_upgradable(self):
        pip = Pip()
        self.assertTrue(pip.is_upgradable('ansible'))

    def test_get_executable(self):
        pip = Pip()
        self.assertEqual(pip.get_executable(), 'pip')

class TestPip(unittest.TestCase):
    def test_is_present(self):
        module = AnsibleModule()
        req = Pip._Package('ansible')
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = 'pip'
        self.assertTrue(Pip._is_present(module, req, installed_pkgs, pkg_command))

    def test_is_installed(self):
        module = AnsibleModule()
        req = Pip._Package('ansible')
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = 'pip'
        self.assertTrue(Pip._is_installed(module, req, installed_pkgs, pkg_command))

    def test_is_up_to_date(self):
        module = AnsibleModule()
        req = Pip._Package('ansible')
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = 'pip'
        self.assertTrue(Pip._is_up_to_date(module, req, installed_pkgs, pkg_command))

    def test_get_package_to_install(self):
        module = AnsibleModule()
        req = Pip._Package('ansible')
        installed_pkgs = ['ansible==1.2.3', 'boto==2.4.5']
        pkg_command = 'pip'
        self.assertEqual(Pip._get_package_to_install(module, req, installed_pkgs, pkg_command), 'ansible')

if __name__ == '__main__':
    unittest.main()