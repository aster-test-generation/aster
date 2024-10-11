import unittest
from semantic_release.settings import *


class TestSettings(unittest.TestCase):
    def test_config(self):
        result = _config()
        self.assertIsInstance(result, UserDict)

    def test_config_from_ini(self):
        result = _config_from_ini(["path1", "path2"])
        self.assertIsInstance(result, dict)

    def test_config_from_pyproject(self):
        result = _config_from_pyproject("path")
        self.assertIsInstance(result, dict)

    def test_current_commit_parser(self):
        result = current_commit_parser()
        self.assertIsInstance(result, Callable)

    def test_current_changelog_components(self):
        result = current_changelog_components()
        self.assertIsInstance(result, List)

    def test_overload_configuration(self):
        @overload_configuration
        def func():
            pass
        result = func()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()