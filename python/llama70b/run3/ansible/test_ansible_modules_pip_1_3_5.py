import unittest
from ansible.modules.pip import *


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test___str__(self):
        instance = AnsibleModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AnsibleModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_is_executable(self):
        result = is_executable('/usr/bin/pip')
        self.assertTrue(result)

    def test_missing_required_lib(self):
        result = missing_required_lib('setuptools')
        self.assertFalse(result)

class TestPackage(unittest.TestCase):
    def test_canonicalize_name(self):
        result = Package.canonicalize_name('bottle')
        self.assertEqual(result, 'bottle')

class TestOpDict(unittest.TestCase):
    def test_ge(self):
        result = op_dict['>='](1, 2)
        self.assertFalse(result)

    def test_le(self):
        result = op_dict['<='](1, 2)
        self.assertTrue(result)

    def test_gt(self):
        result = op_dict['>'](1, 2)
        self.assertFalse(result)

    def test_lt(self):
        result = op_dict['<'](1, 2)
        self.assertTrue(result)

    def test_eq(self):
        result = op_dict['=='](1, 1)
        self.assertTrue(result)

    def test_ne(self):
        result = op_dict['!='](1, 2)
        self.assertTrue(result)

    def test_ge_with_version(self):
        result = op_dict['>=']('1.0', '1.1')
        self.assertFalse(result)

class TestIsPresent(unittest.TestCase):
    def test_is_present(self):
        module = AnsibleModule()
        req = Package('bottle', '1.0')
        installed_pkgs = ['bottle==1.0']
        pkg_command = 'pip'
        result = _is_present(module, req, installed_pkgs, pkg_command)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()