import unittest
from ansible.modules.pip import *



class TestPipModule(unittest.TestCase):
    def test_get_pip_version(self):
        result = get_pip_version()
        self.assertIsNotNone(result)

    def test_get_pip_command(self):
        result = get_pip_command()
        self.assertIsNotNone(result)

    def test_get_pip_options(self):
        result = get_pip_options()
        self.assertIsNotNone(result)

    def test_get_pip_default_version(self):
        result = get_pip_default_version()
        self.assertIsNotNone(result)

    def test_get_pip_version_info(self):
        result = get_pip_version_info()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_version(self):
        result = get_pip_version_info_from_version()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_output(self):
        result = get_pip_version_info_from_output()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_pip(self):
        result = get_pip_version_info_from_pip()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_module(self):
        result = get_pip_version_info_from_module()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_file(self):
        result = get_pip_version_info_from_file()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_default(self):
        result = get_pip_version_info_from_default()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_legacy(self):
        result = get_pip_version_info_from_legacy()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unknown(self):
        result = get_pip_version_info_from_unknown()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_invalid(self):
        result = get_pip_version_info_from_invalid()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unsupported(self):
        result = get_pip_version_info_from_unsupported()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unknown_version(self):
        result = get_pip_version_info_from_unknown_version()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unparseable_version(self):
        result = get_pip_version_info_from_unparseable_version()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unparseable_output(self):
        result = get_pip_version_info_from_unparseable_output()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unparseable_module(self):
        result = get_pip_version_info_from_unparseable_module()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unparseable_file(self):
        result = get_pip_version_info_from_unparseable_file()
        self.assertIsNotNone(result)

    def test_get_pip_version_info_from_unparseable_default(self):
        result = get_pip_version_info_from_unparseable_default()
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()