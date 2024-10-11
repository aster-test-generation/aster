import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

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

    def test_pip_freeze(self):
        pip = Pip()
        result = pip.freeze()
        self.assertIsInstance(result, list)

    def test_pip_list(self):
        pip = Pip()
        result = pip.list()
        self.assertIsInstance(result, list)

    def test_pip_version(self):
        pip = Pip()
        result = pip.version()
        self.assertIsInstance(result, str)

class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

    def test_pip_install(self):
        pip = Pip()
        result = pip.install('ansible')
        self.assertEqual(result, 0)

    def test_pip_uninstall(self):
        pip = Pip()
        result = pip.uninstall('ansible')
        self.assertEqual(result, 0)

    def test_pip_list(self):
        pip = Pip()
        result = pip.list()
        self.assertIsInstance(result, list)

    def test_pip_download(self):
        pip = Pip()
        result = pip.download('ansible')
        self.assertIsInstance(result, list)

    def test_pip_freeze(self):
        pip = Pip()
        result = pip.freeze()
        self.assertIsInstance(result, list)

    def test_pip_main(self):
        result = Pip.main()
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()