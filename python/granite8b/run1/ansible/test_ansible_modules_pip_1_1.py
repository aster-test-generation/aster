import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip(module=None)
        self.assertIsInstance(pip, Pip)

    def test_pip_install(self):
        pip = Pip(module=None)
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_uninstall(self):
        pip = Pip(module=None)
        result = pip.uninstall('ansible')
        self.assertEqual(result, 0)

    def test_pip_list(self):
        pip = Pip(module=None)
        result = pip.list()
        self.assertIsInstance(result, list)

    def test_pip_download(self):
        pip = Pip(module=None)
        result = pip.download('ansible')
        self.assertIsInstance(result, list)

    def test_pip_freeze(self):
        pip = Pip(module=None)
        result = pip.freeze()
        self.assertIsInstance(result, list)

    def test_pip_main(self):
        result = Pip.main()
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()