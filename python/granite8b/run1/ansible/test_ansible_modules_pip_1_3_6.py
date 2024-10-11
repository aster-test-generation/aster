import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip(module_args={})
        self.assertIsInstance(pip, Pip)

    def test_pip_install_package(self):
        pip = Pip(module_args={'name': 'ansible'})
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')

    def test_pip_install_multiple_packages(self):
        pip = Pip(module_args={'name': ['ansible', 'six']})
        result = pip.install()
        self.assertEqual(result['name'], ['ansible', 'six'])

    def test_pip_install_package_with_version(self):
        pip = Pip(module_args={'name': 'ansible', 'version': '2.5.1'})
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['version'], '2.5.1')

    def test_pip_install_package_from_requirements_file(self):
        pip = Pip(module_args={'requirements': '/srv/git/project/requirements.txt'})
        result = pip.install()
        self.assertEqual(result['requirements'], '/srv/git/project/requirements.txt')

    def test_pip_install_package_in_virtualenv(self):
        pip = Pip(module_args={'name': 'ansible', 'virtualenv': '/tmp/virtualenv'})
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['virtualenv'], '/tmp/virtualenv')

    def test_pip_uninstall_package(self):
        pip = Pip(module_args={'name': 'ansible', 'state': 'absent'})
        result = pip.uninstall()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'absent')

    def test_pip_uninstall_multiple_packages(self):
        pip = Pip(module_args={'name': ['ansible', 'six'], 'state': 'absent'})
        result = pip.uninstall()
        self.assertEqual(result['name'], ['ansible', 'six'])
        self.assertEqual(result['state'], 'absent')

    def test_pip_uninstall_package_with_version(self):
        pip = Pip(module_args={'name': 'ansible', 'version': '2.5.1', 'state': 'absent'})
        result = pip.uninstall()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['version'], '2.5.1')
        self.assertEqual(result['state'], 'absent')

    def test_pip_uninstall_package_from_requirements_file(self):
        pip = Pip(module_args={'requirements': '/srv/git/project/requirements.txt', 'state': 'absent'})
        result = pip.uninstall()
        self.assertEqual(result['requirements'], '/srv/git/project/requirements.txt')
        self.assertEqual(result['state'], 'absent')

    def test_pip_uninstall_package_in_virtualenv(self):
        pip = Pip(module_args={'name': 'ansible', 'virtualenv': '/tmp/virtualenv', 'state': 'absent'})
        result = pip.uninstall()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['virtualenv'], '/tmp/virtualenv')
        self.assertEqual(result['state'], 'absent')

if __name__ == '__main__':
    unittest.main()