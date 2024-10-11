import unittest
from ansible.modules.pip import PipModule, LooseVersion, is_executable, missing_required_lib, get_best_parsable_locale


class TestPipModule(unittest.TestCase):
    def test___init__(self):
        instance = PipModule()
        self.assertIsInstance(instance, PipModule)

    def test___str__(self):
        instance = PipModule()
        result = instance.__str__()
        self.assertEqual(result, "pip")

    def test___repr__(self):
        instance = PipModule()
        result = instance.__repr__()
        self.assertEqual(result, "PipModule()")

    def test_run(self):
        instance = PipModule()
        result = instance.run()
        self.assertEqual(result, {'changed': False, 'cmd': '', 'name': [], 'requirements': '', 'version': ''})

    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale()
        self.assertIsInstance(result, str)

    def test_is_executable(self):
        result = is_executable('/usr/bin/pip')
        self.assertTrue(result)

    def test_missing_required_lib(self):
        result = missing_required_lib('setuptools')
        self.assertFalse(result)

    def test_LooseVersion(self):
        version = LooseVersion('1.2.3')
        self.assertIsInstance(version, LooseVersion)

    def test__check_package(self):
        instance = PipModule()
        result = instance._PipModule__check_package('setuptools')
        self.assertTrue(result)

    def test__install_package(self):
        instance = PipModule()
        result = instance._PipModule__install_package('setuptools')
        self.assertTrue(result)

    def test__uninstall_package(self):
        instance = PipModule()
        result = instance._PipModule__uninstall_package('setuptools')
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()