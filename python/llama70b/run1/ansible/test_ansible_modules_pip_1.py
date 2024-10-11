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

    def test_str(self):
        package = Package("bottle")
        self.assertEqual(str(package), "bottle")

    def test__str__(self):
        package = Package("bottle")
        self.assertEqual(package.__str__(), "bottle")

    def test__repr__(self):
        package = Package("bottle")
        self.assertEqual(package.__repr__(), "Package(bottle)")

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name("Bottle"), "bottle")

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsNotNone(module)

    def test__init__(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsNotNone(module)

    def test__str__(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertEqual(module.__str__(), "AnsibleModule")

    def test__repr__(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertEqual(module.__repr__(), "AnsibleModule()")

class TestPipModule(unittest.TestCase):
    def test_documentation(self):
        self.assertIsNotNone(DOCUMENTATION)

    def test_examples(self):
        self.assertIsNotNone(EXAMPLES)

    def test_return(self):
        self.assertIsNotNone(RETURN)

    def test_setuptools_imp_err(self):
        self.assertIsNone(SETUPTOOLS_IMP_ERR)

    def test_special_package_checkers(self):
        self.assertIsNotNone(_SPECIAL_PACKAGE_CHECKERS)

    def test_vcs_re(self):
        self.assertIsNotNone(_VCS_RE)

    def test_op_dict(self):
        self.assertIsNotNone(op_dict)

if __name__ == '__main__':
    unittest.main()