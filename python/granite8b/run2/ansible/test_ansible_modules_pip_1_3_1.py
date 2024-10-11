import unittest
from ansible.modules.pip import Pip


class TestPip(unittest.TestCase):
    def test_pip_init(self):
        pip = Pip()
        self.assertIsInstance(pip, Pip)

    def test_pip_run(self):
        pip = Pip()
        result = pip.run()
        self.assertEqual(result, None)

    def test_pip_get_bin_path(self):
        pip = Pip()
        result = pip.get_bin_path()
        self.assertEqual(result, 'pip')

    def test_pip_get_package_info(self):
        pip = Pip()
        result = pip.get_package_info('ansible')
        self.assertEqual(result, {'name': 'ansible', 'version': None})

    def test_pip_get_installed_version(self):
        pip = Pip()
        result = pip.get_installed_version('ansible')
        self.assertEqual(result, None)

    def test_pip_get_executable(self):
        pip = Pip()
        result = pip.get_executable()
        self.assertEqual(result, 'pip')

    def test_pip_get_executable_version(self):
        pip = Pip()
        result = pip.get_executable_version()
        self.assertEqual(result, None)

    def test_pip_get_executable_version_from_path(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip')
        self.assertEqual(result, None)

    def test_pip_get_executable_version_from_path_with_version(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip', version='2.0.0')
        self.assertEqual(result, '2.0.0')

    def test_pip_get_executable_version_from_path_with_version_and_path(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip', version='2.0.0', path='/usr/bin')
        self.assertEqual(result, '2.0.0')

    def test_pip_get_executable_version_from_path_with_version_and_path_and_python_executable(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip', version='2.0.0', path='/usr/bin', python_executable='/usr/bin/python3')
        self.assertEqual(result, '2.0.0')

    def test_pip_get_executable_version_from_path_with_version_and_path_and_python_executable_and_multiple_paths(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip', version='2.0.0', path='/usr/bin:/usr/local/bin', python_executable='/usr/bin/python3')
        self.assertEqual(result, '2.0.0')

    def test_pip_get_executable_version_from_path_with_version_and_path_and_python_executable_and_multiple_paths_and_multiple_versions(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip', version='2.0.0,2.1.0', path='/usr/bin:/usr/local/bin', python_executable='/usr/bin/python3')
        self.assertEqual(result, '2.1.0')

    def test_pip_get_executable_version_from_path_with_version_and_path_and_python_executable_and_multiple_paths_and_multiple_versions_and_multiple_python_executables(self):
        pip = Pip()
        result = pip.get_executable_version_from_path('pip', version='2.0.0,2.1.0', path='/usr/bin:/usr/local/bin', python_executable='/usr/bin/python3,/usr/bin/python2')
        self.assertEqual(result, '2.1.0')

if __name__ == '__main__':
    unittest.main()