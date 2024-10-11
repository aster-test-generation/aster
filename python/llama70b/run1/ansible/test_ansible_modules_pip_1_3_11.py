import unittest
from ansible.modules.pip import *


class TestPackage(unittest.TestCase):
    def test_init(self):
        package = Package("bottle", "0.11")
        self.assertEqual(package.package_name, "bottle")
        self.assertIsNotNone(package._requirement)

    def test_canonicalize_name(self):
        self.assertEqual(Package.canonicalize_name("Bottle"), "bottle")

    def test__init_private_method(self):
        package = Package("bottle", "0.11")
        self.assertIsNotNone(package._Package__plain_package)

    def test__requirement_private_method(self):
        package = Package("bottle", "0.11")
        self.assertIsNotNone(package._Package__requirement)

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        self.assertIsNotNone(module)

    def test__log_private_method(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        module._AnsibleModule__log("Test log message")

    def test_run(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        module.run()

    def test_exit_json(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        module.exit_json(changed=True, msg="Test message")

    def test_fail_json(self):
        module = AnsibleModule(argument_spec=dict(name=dict(required=True)))
        module.fail_json(msg="Test error message")

class TestPipModule(unittest.TestCase):
    def test_init(self):
        module = PipModule(argument_spec=dict(name=dict(required=True)))
        self.assertIsNotNone(module)

    def test_run(self):
        module = PipModule(argument_spec=dict(name=dict(required=True)))
        module.run()

    def test_install_package(self):
        module = PipModule(argument_spec=dict(name=dict(required=True)))
        module.install_package("bottle", "0.11")

    def test__get_pip_command_private_method(self):
        module = PipModule(argument_spec=dict(name=dict(required=True)))
        self.assertIsNotNone(module._PipModule__get_pip_command())

    def test__get_virtualenv_command_private_method(self):
        module = PipModule(argument_spec=dict(name=dict(required=True)))
        self.assertIsNotNone(module._PipModule__get_virtualenv_command())

if __name__ == '__main__':
    unittest.main()