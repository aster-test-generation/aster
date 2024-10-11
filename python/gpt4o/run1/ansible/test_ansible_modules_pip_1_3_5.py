import unittest
from ansible.modules.pip import _is_present


class TestPipModule(unittest.TestCase):
    def setUp(self):
        self.module = None  # Replace with actual AnsibleModule instance if needed
        self.pkg_command = None  # Replace with actual package command if needed

    def test_is_present_true(self):
        req = PackageRequirement('example', '==1.0.0')
        installed_pkgs = ['example==1.0.0']
        result = _is_present(self.module, req, installed_pkgs, self.pkg_command)
        self.assertTrue(result)

    def test_is_present_false(self):
        req = PackageRequirement('example', '==1.0.0')
        installed_pkgs = ['example==2.0.0']
        result = _is_present(self.module, req, installed_pkgs, self.pkg_command)
        self.assertFalse(result)

    def test_is_present_no_version(self):
        req = PackageRequirement('example', '==1.0.0')
        installed_pkgs = ['example']
        result = _is_present(self.module, req, installed_pkgs, self.pkg_command)
        self.assertFalse(result)

    def test_is_present_different_package(self):
        req = PackageRequirement('example', '==1.0.0')
        installed_pkgs = ['another_example==1.0.0']
        result = _is_present(self.module, req, installed_pkgs, self.pkg_command)
        self.assertFalse(result)

    def test_is_present_no_match(self):
        req = PackageRequirement('example', '==1.0.0')
        installed_pkgs = ['example==1.0.1']
        result = _is_present(self.module, req, installed_pkgs, self.pkg_command)
        self.assertFalse(result)

if __name__ == '__main__':
    unittest.main()