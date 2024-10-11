import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_get_best_pip_version(self):
        from pip_upgrader import get_best_pip_version
        self.assertIsNotNone(result)

    def test_get_pip_version(self):
        result = get_pip_version()
        self.assertIsNotNone(result)

    def test_get_pip_command(self):
        result = get_pip_command()
        self.assertIsNotNone(result)

    def test_get_pip_executable(self):
        result = get_pip_executable()
        self.assertIsNotNone(result)

    def test_get_pip_version_info(self):
        from pip._internal.utils.misc import get_pip_version_info
        self.assertIsNotNone(result)

    def test_get_pip_executable_version_info(self):
        result = get_pip_executable_version_info()
        self.assertIsNotNone(result)

    def test_get_pip_executable_version(self):
        result = get_pip_executable_version('pip')
        self.assertIsNotNone(result)

    def test_get_pip_executable_version_tuple(self):
        result = get_pip_executable_version_tuple()
        self.assertIsNotNone(result)

    def test_get_pip_executable_version_str(self):
        result = get_pip_executable_version_str()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default(self):
        result = get_pip_executable_is_default()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version(self):
        result = get_pip_executable_is_default_version(pip_executable)
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_tuple(self):
        result = get_pip_executable_is_default_version_tuple(pip_executable)
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_str(self):
        result = get_pip_executable_is_default_version_str()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info(self):
        result = get_pip_executable_is_default_version_info(pip_executable)
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info_tuple(self):
        result = get_pip_executable_is_default_version_info_tuple()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info_str(self):
        result = get_pip_executable_is_default_version_info_str()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info_tuple(self):
        result = get_pip_executable_is_default_version_info_tuple()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info_str(self):
        result = get_pip_executable_is_default_version_info_str()
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info_tuple(self):
        result = get_pip_executable_is_default_version_info_tuple
        self.assertIsNotNone(result)

    def test_get_pip_executable_is_default_version_info_str(self):
        result = get_pip_executable_is_default_version_info_str()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()