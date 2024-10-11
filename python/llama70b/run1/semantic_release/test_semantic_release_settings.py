from semantic_release.settings import Callable
import unittest
from unittest.mock import patch, mock_open, Mock
from semantic_release.settings import (
    _config,
    _config_from_ini,
    _config_from_pyproject,
    config,
    current_commit_parser,
    current_changelog_components,
    overload_configuration,
)


class TestSemanticReleaseSettings(unittest.TestCase):
    def test__config(self):
        result = _config()
        self.assertIsInstance(result, dict)

    def test__config_from_ini(self):
        paths = ["path/to/defaults.cfg", "path/to/setup.cfg"]
        result = _config_from_ini(paths)
        self.assertIsInstance(result, dict)

    def test__config_from_pyproject(self):
        path = "path/to/pyproject.toml"
        with patch("builtins.open", mock_open(read_data="tool.semantic_release = { }")):
            result = _config_from_pyproject(path)
            self.assertIsInstance(result, dict)

    def test_config(self):
        self.assertIsInstance(config, dict)

    def test_current_commit_parser(self):
        config["commit_parser"] = "module.parser"
        result = current_commit_parser()
        self.assertIsInstance(result, Callable)

    def test_current_changelog_components(self):
        config["changelog_components"] = "module.component1,module.component2"
        result = current_changelog_components()
        self.assertIsInstance(result, list)

    def test_overload_configuration(self):
        @overload_configuration
        def func(*args, **kwargs):
            return kwargs

        result = func(define=["key=value"])
        self.assertIn("key", result)

if __name__ == '__main__':
    unittest.main()