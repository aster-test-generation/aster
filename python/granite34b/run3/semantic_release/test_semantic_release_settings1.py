import unittest
from semantic_release.settings import _config, _config_from_ini, _config_from_pyproject, config, current_commit_parser, current_changelog_components, overload_configuration

class TestSettings(unittest.TestCase):
    def test_config(self):
        self.assertIsInstance(config, UserDict)

    def test_config_from_ini(self):
        paths = [os.path.join(os.path.dirname(__file__), "defaults.cfg"), os.path.join(getcwd(), "setup.cfg")]
        self.assertIsInstance(_config_from_ini(paths), dict)

    def test_config_from_pyproject(self):
        path = os.path.join(getcwd(), "pyproject.toml")
        self.assertIsInstance(_config_from_pyproject(path), dict)

    def test_current_commit_parser(self):
        self.assertIsInstance(current_commit_parser(), Callable)

    def test_current_changelog_components(self):
        self.assertIsInstance(current_changelog_components(), List)

    def test_overload_configuration(self):
        @overload_configuration
        def test_function(*args, **kwargs):
            pass
        self.assertIsInstance(test_function(), Callable)

if __name__ == '__main__':
    unittest.main()