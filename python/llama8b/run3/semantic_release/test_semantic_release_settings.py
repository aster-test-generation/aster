import unittest
from semantic_release.settings import _config, _config_from_ini, _config_from_pyproject, config, current_commit_parser, current_changelog_components, overload_configuration


class TestConfig(unittest.TestCase):
    def test_config(self):
        self.assertIsInstance(config, UserDict)

    def test_config_from_ini(self):
        config = _config_from_ini(["defaults.cfg", "setup.cfg"])
        self.assertIsInstance(config, dict)

    def test_config_from_pyproject(self):
        config = _config_from_pyproject("pyproject.toml")
        self.assertIsInstance(config, dict)

    def test_current_commit_parser(self):
        parser = current_commit_parser()
        self.assertIsInstance(parser, Callable)

    def test_current_changelog_components(self):
        components = current_changelog_components()
        self.assertIsInstance(components, list)

    def test_overload_configuration(self):
        @overload_configuration
        def test_function(x):
            return x
        result = test_function(define={"x": "1"})
        self.assertEqual(result, "1")

if __name__ == '__main__':
    unittest.main()