import unittest
from ansible.modules.pip import *



class TestPip(unittest.TestCase):
    def test_is_present(self):
        module = AnsibleModule(argument_spec={})
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, True)

    def test_is_present_false(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, False)

    def test_is_present_true(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, True)

    def test_is_present_false(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, False)

    def test_is_present_true(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, True)

    def test_is_present_false(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, False)

    def test_is_present_true(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, True)

    def test_is_present_false(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, False)

    def test_is_present_true(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, True)

    def test_is_present_false(self):
        module = AnsibleModule()
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, False)

    def test_is_present_true(self):
        module = AnsibleModule(argument_spec={})
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, True)

    def test_is_present_false(self):
        module = AnsibleModule(argument_spec={})
        req = Requirement()
        installed_pkgs = []
        pkg_command = ''
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertEqual(result, False)

if __name__ == '__main__':
    unittest.main()