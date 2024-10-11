import unittest
from ansible.modules.pip import *


class TestPackage(unittest.TestCase):
    def test_init(self):
        package = Package("bottle")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNone(package._requirement)

    def test_init_with_version_string(self):
        package = Package("bottle", "0.11")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNotNone(package._requirement)

    def test_has_version_specifier(self):
        package = Package("bottle", "0.11")
        self.assertTrue(package.has_version_specifier)

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name("Bottle"), "bottle")

    def test__init_private_method(self):
        package = Package("bottle")
        self.assertFalse(package._Package__plain_package)

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        self.assertIsNotNone(module)

    def test__str_magic_method(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        self.assertEqual(str(module), "AnsibleModule")

    def test__repr_magic_method(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        self.assertEqual(repr(module), "AnsibleModule({'name': {'required': True}})")

class TestPipModule(unittest.TestCase):
    def test_documentation(self):
        self.assertIsNotNone(DOCUMENTATION)

    def test_examples(self):
        self.assertIsNotNone(EXAMPLES)

    def test_return(self):
        self.assertIsNotNone(RETURN)

if __name__ == '__main__':
    unittest.main()