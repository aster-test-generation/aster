import unittest
from ansible.modules.pip import *


class TestAnsibleModule(unittest.TestCase):
    def test___init__(self):
        instance = AnsibleModule()
        self.assertIsInstance(instance, AnsibleModule)

    def test___str__(self):
        instance = AnsibleModule()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = AnsibleModule()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = AnsibleModule()
        instance2 = AnsibleModule()
        self.assertEqual(instance1, instance2)

class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, PipModule)

    def test_run_command(self):
        instance = PipModule()
        result = instance.run_command(['pip', 'install', 'ansible'])
        self.assertIsInstance(result, tuple)

    def test_install_package(self):
        instance = PipModule()
        result = instance.install_package('ansible')
        self.assertIsInstance(result, tuple)

    def test_uninstall_package(self):
        instance = PipModule()
        result = instance.uninstall_package('ansible')
        self.assertIsInstance(result, tuple)

    def test__is_present(self):
        instance = PipModule()
        result = instance._is_present('ansible', ['ansible==2.5.1'])
        self.assertIsInstance(result, bool)

    def test__get_installed_packages(self):
        instance = PipModule()
        result = instance._get_installed_packages()
        self.assertIsInstance(result, list)

    def test__get_package_version(self):
        instance = PipModule()
        result = instance._get_package_version('ansible')
        self.assertIsInstance(result, str)

class TestPackage(unittest.TestCase):
    def test_canonicalize_name(self):
        result = Package.canonicalize_name('ansible')
        self.assertEqual(result, 'ansible')

class TestFunctions(unittest.TestCase):
    def test_missing_required_lib(self):
        result = missing_required_lib('setuptools')
        self.assertIsInstance(result, bool)

    def test_is_executable(self):
        result = is_executable('/usr/bin/pip')
        self.assertIsInstance(result, bool)

    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()