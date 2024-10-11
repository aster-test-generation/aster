import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale(module)
        self.assertEqual(result, None)

    def test_get_cmd_options(self):
        result = get_cmd_options()
        self.assertEqual(result, None)

    def test_get_pip_version(self):
        result = get_pip_version
        self.assertEqual(result, None)

    def test_get_pip_command(self):
        result = get_pip_command()
        self.assertEqual(result, None)

    def test_get_pip_executable(self):
        result = get_pip_executable()
        self.assertEqual(result, None)

    def test_get_pip_executable_with_pip_executable(self):
        result = get_pip_executable(pip_executable='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_pip_executable_and_executable(self):
        result = get_pip_executable(pip_executable='pip', executable='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable(self):
        result = get_pip_executable(executable='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_pip_executable(self):
        result = get_pip_executable(executable='pip', pip_executable='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_pip_executable_and_pip_version(self):
        result = get_pip_executable(executable='pip', pip_executable='pip', pip_version='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_pip_executable_and_pip_version_and_pip_version_check(self):
        result = get_pip_executable(executable='pip', pip_executable='pip', pip_version='pip', pip_version_check='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_pip_executable_and_pip_version_and_pip_version_check_and_pip_version_check_warn(self):
        result = get_pip_executable(executable='pip', pip_executable='pip', pip_version='pip', pip_version_check='pip', pip_version_check_warn='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_pip_executable_and_pip_version_and_pip_version_check_and_pip_version_check_warn_and_pip_version_check_failed(self):
        result = get_pip_executable(executable='pip', pip_executable='pip', pip_version='pip', pip_version_check='pip', pip_version_check_warn='pip', pip_version_check_failed='pip')
        self.assertEqual(result, None)

    def test_get_pip_executable_with_executable_and_pip_executable_and_pip_version_and_pip_version_check_and_pip_version_check_warn_and_pip_version_check_failed_and_pip_version_check_success(self):
        result = get_pip_executable(executable='pip', pip_executable='pip', pip_version='pip', pip_version_check='pip', pip_version_check_warn='pip', pip_version_check_failed='pip', pip_version_check_success='pip')
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()