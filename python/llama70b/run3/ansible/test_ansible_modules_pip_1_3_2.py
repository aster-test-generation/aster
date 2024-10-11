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

    def test_run_command(self):
        instance = AnsibleModule()
        result = instance.run_command(['pip', '--version'])
        self.assertIsInstance(result, tuple)

    def test_is_executable(self):
        instance = AnsibleModule()
        result = instance.is_executable('/usr/bin/pip')
        self.assertIsInstance(result, bool)

    def test_missing_required_lib(self):
        instance = AnsibleModule()
        result = instance.missing_required_lib('setuptools')
        self.assertIsInstance(result, bool)

    def test_get_best_parsable_locale(self):
        instance = AnsibleModule()
        result = instance.get_best_parsable_locale()
        self.assertIsInstance(result, str)

class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, PipModule)

    def test_run(self):
        instance = PipModule()
        result = instance.run()
        self.assertIsInstance(result, dict)

    def test_install_package(self):
        instance = PipModule()
        result = instance.install_package('bottle')
        self.assertIsInstance(result, dict)

    def test_uninstall_package(self):
        instance = PipModule()
        result = instance.uninstall_package('bottle')
        self.assertIsInstance(result, dict)

    def test__recover_package_name(self):
        instance = PipModule()
        result = instance._recover_package_name(['bottle', 'django'])
        self.assertIsInstance(result, list)

    def test__is_package_name(self):
        instance = PipModule()
        result = instance._is_package_name('bottle')
        self.assertIsInstance(result, bool)

    def test__parse_version_specifier(self):
        instance = PipModule()
        result = instance._parse_version_specifier('bottle>0.10,<0.20,!=0.11')
        self.assertIsInstance(result, dict)

    def test__get_package_info(self):
        instance = PipModule()
        result = instance._get_package_info('bottle')
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()