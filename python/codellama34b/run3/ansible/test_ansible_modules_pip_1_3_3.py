import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_get_pip_version(self):
        result = get_pip_version()
        self.assertIsInstance(result, str)

    def test_get_pip_command(self):
        result = get_pip_command(None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_options(self):
        result = get_pip_options(None)
        self.assertIsInstance(result, list)

    def test_get_pip_default_version(self):
        from pip._internal.utils.misc import get_pip_default_version
        self.assertIsInstance(result, str)

    def test_get_pip_version_info(self):
        result = get_pip_version_info()
        self.assertIsInstance(result, tuple)

    def test_get_pip_version_info_from_string(self):
        result = get_pip_version_info_from_string(None)
        self.assertIsInstance(result, tuple)

    def test_is_pip_installed(self):
        result = is_pip_installed('None')
        self.assertIsInstance(result, bool)

    def test_is_pip_newer_than_minimum_version(self):
        result = is_pip_newer_than_minimum_version('1.0.0')
        self.assertIsInstance(result, bool)

    def test_is_pip_installed_properly(self):
        result = is_pip_installed_properly("None")
        self.assertIsInstance(result, bool)

    def test_get_pip_executable(self):
        result = get_pip_executable(None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version(self):
        result = get_pip_executable(None, None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version_and_path(self):
        result = get_pip_executable(None, None, None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version_and_path_and_virtualenv(self):
        result = get_pip_executable(None, None, None, None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version_and_path_and_virtualenv_and_executable(self):
        result = get_pip_executable(None, None, None, None, None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version_and_path_and_virtualenv_and_executable_and_umask(self):
        result = get_pip_executable(None, None, None, None, None, None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version_and_path_and_virtualenv_and_executable_and_umask_and_chdir(self):
        result = get_pip_executable(None, None, None, None, None, None, None, None)
        self.assertIsInstance(result, str)

    def test_get_pip_executable_with_version_and_path_and_virtualenv_and_executable_and_umask_and_chdir_and_extra_args(self):
        result = get_pip_executable(None, None, None, None, None, None, None, None, None)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()