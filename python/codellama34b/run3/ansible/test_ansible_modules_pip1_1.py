
import unittest
from ansible.modules.pip import *

class TestPipModule(unittest.TestCase):
    def test_get_best_pip_version(self):
        result = get_best_pip_version()
        self.assertEqual(result, None)

    def test_get_pip_version(self):
        result = get_pip_version()
        self.assertEqual(result, None)

    def test_get_pip_executable(self):
        result = get_pip_executable()
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable(self):
        result = get_pip_executable(executable='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_version(self):
        result = get_pip_executable(version='1.0')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version(self):
        result = get_pip_executable(executable='pip', version='1.0')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv_and_virtualenv_site_packages(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='', virtualenv_site_packages='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv_and_virtualenv_site_packages_and_virtualenv_command(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='', virtualenv_site_packages='', virtualenv_command='')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_version_and_extra_args_and_chdir_and_umask_and_virtualenv_and_virtualenv_site_packages_and_virtualenv_command_and_virtualenv_python(self):
        result = get_pip_executable(executable='pip', version='1.0', extra_args='', chdir='', umask='', virtualenv='', virtualenv_site_packages='', virtualenv_command='', virtualenv_python='')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()