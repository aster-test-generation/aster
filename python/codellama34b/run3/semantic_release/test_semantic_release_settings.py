import unittest
from semantic_release.settings import *


class TestSettings(unittest.TestCase):
    def test_config(self):
        result = _config()
        self.assertIsInstance(result, UserDict)

    def test_config_from_ini(self):
        paths = [
            os.path.join(os.path.dirname(__file__), "defaults.cfg"),
            os.path.join(getcwd(), "setup.cfg"),
        ]
        result = _config_from_ini(paths)
        self.assertIsInstance(result, dict)

    def test_config_from_pyproject(self):
        path = os.path.join(getcwd(), "pyproject.toml")
        result = _config_from_pyproject(path)
        self.assertIsInstance(result, dict)

    def test_current_commit_parser(self):
        result = current_commit_parser()
        self.assertIsInstance(result, Callable)

    def test_current_changelog_components(self):
        result = current_changelog_components()
        self.assertIsInstance(result, List)

    def test_overload_configuration(self):
        @overload_configuration
        def func(**kwargs):
            pass
        result = func(define=["key=value"])
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()