import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_install(self):
        pip = Pip(module=None)
        result = pip.install('ansible')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')

    def test_pip_upgrade(self):
        pip = Pip(module=None)
        result = pip.install('ansible', state='latest')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'latest')

    def test_pip_uninstall(self):
        pip = Pip(module=None)
        result = pip.install('ansible', state='absent')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'absent')

    def test_pip_forcereinstall(self):
        pip = Pip(module=None)
        result = pip.install('ansible', state='forcereinstall')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'forcereinstall')

    def test_pip_editable(self):
        pip = Pip(module=None)
        result = pip.install('ansible', editable=True)
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['editable'], True)

    def test_pip_version(self):
        pip = Pip(module=None)
        result = pip.install('ansible', version='2.5.1')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['version'], '2.5.1')

    def test_pip_requirements(self):
        pip = Pip(module=None)
        result = pip.install(requirements='/srv/git/project/requirements.txt')
        self.assertEqual(result['requirements'], '/srv/git/project/requirements.txt')

    def test_pip_virtualenv(self):
        pip = Pip(module=None)
        result = pip.install(name='ansible', virtualenv='/tmp/virtualenv')
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['virtualenv'], '/tmp/virtualenv')

if __name__ == '__main__':
    unittest.main()