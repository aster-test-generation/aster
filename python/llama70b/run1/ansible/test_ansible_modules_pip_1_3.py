import unittest
from ansible.modules.pip import *


class TestPackage(unittest.TestCase):
    def test_init(self):
        package = Package("bottle")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNone(package._requirement)

    def test_init_with_version(self):
        package = Package("bottle", "0.11")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNotNone(package._requirement)

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name("Bottle-Framework"), "bottle-framework")

    def test__init_private_method(self):
        package = Package("bottle")
        self.assertFalse(package._Package__plain_package)

    def test__requirement_private_method(self):
        package = Package("bottle", "0.11")
        self.assertIsNotNone(package._Package__requirement)

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsNotNone(module)

    def test__str_magic_method(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertEqual(str(module), "AnsibleModule")

    def test__repr_magic_method(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertEqual(repr(module), "AnsibleModule({})".format(module.argument_spec))

class TestSETUPTOOLS_IMP_ERR(unittest.TestCase):
    def test_SETUPTOOLS_IMP_ERR(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

class Test_SPECIAL_PACKAGE_CHECKERS(unittest.TestCase):
    def test_SPECIAL_PACKAGE_CHECKERS(self):
        self.assertEqual(_SPECIAL_PACKAGE_CHECKERS, {'setuptools': 'import setuptools; print(setuptools.__version__)', 'pip': 'import pkg_resources; print(pkg_resources.get_distribution("pip").version)'})

class Test_op_dict(unittest.TestCase):
    def test_op_dict(self):
        self.assertEqual(op_dict, {'>=': operator.ge, '<=': operator.le, '>': operator.gt, '<': operator.lt, '==': operator.eq, '!=': operator.ne, '~=': operator.ge})

class Test_VCS_RE(unittest.TestCase):
    def test_VCS_RE(self):
        self.assertIsNotNone(_VCS_RE)

if __name__ == '__main__':
    unittest.main()