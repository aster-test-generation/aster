import unittest
from ansible.modules.pip import Pip

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