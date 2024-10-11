import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip(module_args={})
        self.assertIsInstance(pip, Pip)

    def test_pip_install(self):
        pip = Pip(module_args={'name': 'ansible'})
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')

    def test_pip_uninstall(self):
        pip = Pip(module_args={'name': 'ansible', 'state': 'absent'})
        result = pip.uninstall()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'absent')

    def test_pip_upgrade(self):
        pip = Pip(module_args={'name': 'ansible', 'state': 'latest'})
        result = pip.upgrade()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'latest')

    def test_pip_download(self):
        pip = Pip(module_args={'name': 'ansible', 'state': 'forcereinstall'})
        result = pip.download()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'forcereinstall')

if __name__ == '__main__':
    unittest.main()