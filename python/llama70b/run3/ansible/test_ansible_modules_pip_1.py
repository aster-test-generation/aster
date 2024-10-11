import unittest
from ansible.modules.pip import *


class TestPackage(unittest.TestCase):
    def test_init(self):
        package = Package('bottle')
        self.assertEqual(package.package_name, 'bottle')

    def test_init_with_version(self):
        package = Package('bottle', '0.11')
        self.assertEqual(package.package_name, 'bottle')

    def test_str(self):
        package = Package('bottle')
        self.assertEqual(str(package), 'bottle')

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name('Bottle'), 'bottle')

    def test__init_private_method(self):
        package = Package('bottle')
        self.assertEqual(package._Package__plain_package, False)

    def test__requirement_private_attribute(self):
        package = Package('bottle')
        self.assertIsNone(package._Package__requirement)

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(module, AnsibleModule)

    def test__log_private_method(self):
        module = AnsibleModule(argument_spec=dict())
        module._log('test message')

    def test_exit_json_protected_method(self):
        module = AnsibleModule(argument_spec=dict())
        module._exit_json({'test': 'test'})

    def test_fail_json_protected_method(self):
        module = AnsibleModule(argument_spec=dict())
        module._fail_json({'test': 'test'})

    def test_str_magic_method(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(str(module), str)

    def test_repr_magic_method(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(repr(module), str)

if __name__ == '__main__':
    unittest.main()