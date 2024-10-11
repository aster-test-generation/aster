import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_install(self):
        pip = Pip(module_args='name=ansible state=present')
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')

    def test_pip_uninstall(self):
        pip = Pip(module_args='name=ansible state=absent')
        result = pip.uninstall()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'absent')

    def test_pip_upgrade(self):
        pip = Pip(module_args='name=ansible state=latest')
        result = pip.upgrade()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'latest')

    def test_pip_version(self):
        pip = Pip(module_args='name=ansible state=present version=2.5.1')
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')
        self.assertEqual(result['version'], '2.5.1')

    def test_pip_virtualenv(self):
        pip = Pip(module_args='name=ansible state=present virtualenv=/tmp/virtualenv')
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')
        self.assertEqual(result['virtualenv'], '/tmp/virtualenv')

    def test_pip_executable(self):
        pip = Pip(module_args='name=ansible state=present executable=/usr/bin/pip3')
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')
        self.assertEqual(result['executable'], '/usr/bin/pip3')

    def test_pip_umask(self):
        pip = Pip(module_args='name=ansible state=present umask=0022')
        result = pip.install()
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')
        self.assertEqual(result['umask'], '0022')

if __name__ == '__main__':
    unittest.main()