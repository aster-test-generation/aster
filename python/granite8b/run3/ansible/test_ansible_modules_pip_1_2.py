import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip(module=None)
        self.assertIsInstance(pip, Pip)

    def test_pip_install(self):
        pip = Pip(module=None)
        result = pip.install(name='ansible', version='2.5.1')
        self.assertEqual(result, 0)

    def test_pip_uninstall(self):
        pip = Pip(module=None)
        result = pip.uninstall(name='ansible')
        self.assertEqual(result, 0)

    def test_pip_download(self):
        pip = Pip(module=None)
        result = pip.download(name='ansible', version='2.5.1')
        self.assertEqual(result, 0)

    def test_pip_list(self):
        pip = Pip(module=None)
        result = pip.list(pattern='ansible')
        self.assertEqual(result, 0)

    def test_pip_freeze(self):
        pip = Pip(module=None)
        result = pip.freeze()
        self.assertEqual(result, 0)

    def test_pip_main(self):
        pip = Pip(module=None)
        result = pip.main()
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()