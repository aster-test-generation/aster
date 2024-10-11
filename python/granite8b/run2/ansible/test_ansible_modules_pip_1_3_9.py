import unittest
from ansible.modules.pip import PipModule


class TestPipModule(unittest.TestCase):
    def test_pip_module_init(self):
        module = PipModule()
        self.assertIsInstance(module, PipModule)

    def test_get_package_info(self):
        module = PipModule()
        package = 'setuptools'
        env = None
        formatted_dep = module._get_package_info(package, env)
        self.assertEqual(formatted_dep, 'setuptools==57.4.0')

    def test_get_package_info_with_env(self):
        module = PipModule()
        package = 'setuptools'
        env = '/path/to/env'
        formatted_dep = module._get_package_info(package, env)
        self.assertEqual(formatted_dep, 'setuptools==57.4.0')

if __name__ == '__main__':
    unittest.main()