import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_install(self):
        pip = Pip(module_args='name=ansible state=present')
        result = pip.install()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'present')

    def test_pip_upgrade(self):
        pip = Pip(module_args='name=ansible state=latest')
        result = pip.install()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'latest')

    def test_pip_uninstall(self):
        pip = Pip(module_args='name=ansible state=absent')
        result = pip.install()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'absent')

    def test_pip_forcereinstall(self):
        pip = Pip(module_args='name=ansible state=forcereinstall')
        result = pip.install()
        self.assertEqual(result['changed'], True)
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['state'], 'forcereinstall')

if __name__ == '__main__':
    unittest.main()