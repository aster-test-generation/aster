from semantic_release.settings import Callable
import unittest
from semantic_release.settings import (
    _config,
    _config_from_ini,
    _config_from_pyproject,
    config,
    current_changelog_components,
    current_commit_parser,
    overload_configuration,
)


class TestSemanticReleaseSettings(unittest.TestCase):
    def test_config(self):
        self.assertIn('semantic_release', config)

    def test_config_from_ini(self):
        self.assertIsInstance(_config_from_ini(["nonexistent.ini"]), dict)

    def test_config_from_pyproject(self):
        self.assertIsInstance(_config_from_pyproject("nonexistent.toml"), dict)

    def test_current_commit_parser(self):
        self.assertIsInstance(current_commit_parser(), Callable)

    def test_current_changelog_components(self):
        self.assertIsInstance(current_changelog_components(), list)

if __name__ == '__main__':
    unittest.main()