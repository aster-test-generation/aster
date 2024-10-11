import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip
from ansible.modules.pip import PipModule


class TestPip(unittest.TestCase):
    def test_pip_install(self):
        pip = Pip()
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_uninstall(self):
        pip = Pip()
        result = pip.uninstall('ansible')
        self.assertEqual(result, 0)

    def test_pip_download(self):
        pip = Pip()
        result = pip.download('ansible')
        self.assertEqual(result, 0)

    def test_pip_list(self):
        pip = Pip()
        result = pip.list()
        self.assertTrue('ansible' in result)

    def test_pip_freeze(self):
        pip = Pip()
        result = pip.freeze()
        self.assertTrue('ansible' in result)

class TestPipModule(unittest.TestCase):
    def test_pip_module_init(self):
        module = PipModule()
        self.assertIsNotNone(module)

    def test_pip_module_run(self):
        module = PipModule()
        result = module.run()
        self.assertIsNotNone(result)

    def test_pip_module_install_package(self):
        module = PipModule()
        module.params = {'name': 'ansible'}
        result = module.install()
        self.assertTrue(result['changed'])

    def test_pip_module_uninstall_package(self):
        module = PipModule()
        module.params = {'name': 'ansible'}
        result = module.uninstall()
        self.assertTrue(result['changed'])

    def test_pip_module_upgrade_package(self):
        module = PipModule()
        module.params = {'name': 'ansible'}
        result = module.upgrade()
        self.assertTrue(result['changed'])

if __name__ == '__main__':
    unittest.main()