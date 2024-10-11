import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip(module=None)
        self.assertIsInstance(pip, Pip)

    def test_pip_install(self):
        pip = Pip(module=None)
        result = pip.install(name='ansible', version=None, requirements=None, virtualenv=None, virtualenv_site_packages=False, virtualenv_command='virtualenv', virtualenv_python=None, state='present', extra_args=None, executable=None, chdir=None, umask=None)
        self.assertEqual(result['name'], 'ansible')
        self.assertEqual(result['version'], '2.5.1')
        self.assertEqual(result['requirements'], None)
        self.assertEqual(result['virtualenv'], None)
        self.assertEqual(result['virtualenv_site_packages'], False)
        self.assertEqual(result['virtualenv_command'], 'virtualenv')
        self.assertEqual(result['virtualenv_python'], None)
        self.assertEqual(result['state'], 'present')
        self.assertEqual(result['extra_args'], None)
        self.assertEqual(result['executable'], None)
        self.assertEqual(result['chdir'], None)
        self.assertEqual(result['umask'], None)

if __name__ == '__main__':
    unittest.main()