import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_module(self):
        module = Pip()
        self.assertIsInstance(module, Pip)

    def test_get_packages(self):
        module = Pip()
        pip = ['pip']
        chdir = '/path/to/chdir'
        command, out, err = _get_packages(module, pip, chdir)
        self.assertEqual(command, 'pip list --format=freeze')
        self.assertEqual(out, 'package1==1.0\npackage2==2.0\n')
        self.assertEqual(err, '')

if __name__ == '__main__':
    unittest.main()