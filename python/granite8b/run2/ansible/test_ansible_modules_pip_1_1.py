import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_install(self):
        pip = Pip(module=None)
        result = pip.install('ansible')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')

    def test_pip_uninstall(self):
        pip = Pip(module=None)
        result = pip.uninstall('ansible')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'absent')

    def test_pip_upgrade(self):
        pip = Pip(module=None)
        result = pip.upgrade('ansible')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'latest')

    def test_pip_downgrade(self):
        pip = Pip(module=None)
        result = pip.downgrade('ansible')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'forcereinstall')

    def test_pip_get_executable(self):
        pip = Pip(module=None)
        result = pip.get_executable()
        self.assertEqual(result, 'pip')

    def test_pip_get_package_version(self):
        pip = Pip(module=None)
        result = pip.get_package_version('ansible')
        self.assertEqual(result, '2.5.1')

    def test_pip_get_package_info(self):
        pip = Pip(module=None)
        result = pip.get_package_info('ansible')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['version'], '2.5.1')

if __name__ == '__main__':
    unittest.main()