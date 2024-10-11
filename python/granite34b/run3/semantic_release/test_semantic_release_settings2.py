import unittest
from semantic_release.settings import _config, _config_from_ini, _config_from_pyproject, config, current_commit_parser, current_changelog_components, overload_configuration

class TestConfig(unittest.TestCase):
    def test_config_from_ini(self):
        paths = [
            os.path.join(os.path.dirname(__file__), "defaults.cfg"),
            os.path.join(getcwd(), "setup.cfg"),
        ]
        config = _config_from_ini(paths)
        self.assertIsInstance(config, dict)

    def test_config_from_pyproject(self):
        path = os.path.join(getcwd(), "pyproject.toml")
        config = _config_from_pyproject(path)
        self.assertIsInstance(config, dict)

    def test_config(self):
        config = _config()
        self.assertIsInstance(config, UserDict)

class TestCurrentCommitParser(unittest.TestCase):
    def test_current_commit_parser(self):
        parser = current_commit_parser()
        self.assertIsInstance(parser, Callable)

class TestCurrentChangelogComponents(unittest.TestCase):
    def test_current_changelog_components(self):
        components = current_changelog_components()
        self.assertIsInstance(components, list)

class TestOverloadConfiguration(unittest.TestCase):
    def test_overload_configuration(self):
        @overload_configuration
        def my_function(x, y):
            return x + y

        result = my_function(1, 2, define=["x=3"])
        self.assertEqual(result, 5)

if __name__ == '__main__':
    unittest.main()