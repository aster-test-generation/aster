import unittest
from ansible_collections.ansible.utils.plugins.module_utils.pip import Pip


class TestPip(unittest.TestCase):
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
        self.assertIn('ansible', result)

    def test_pip_download(self):
        pip = Pip()
        result = pip.download('ansible')
        self.assertEqual(result, 0)

    def test_pip_freeze(self):
        pip = Pip()
        result = pip.freeze()
        self.assertIn('ansible', result)

if __name__ == '__main__':
    unittest.main()