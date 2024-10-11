import unittest
from semantic_release.settings import _config, _config_from_ini, _config_from_pyproject, config, current_commit_parser, current_changelog_components, overload_configuration
import os
from collections import UserDict
from typing import Callable


class TestConfig(unittest.TestCase):
    def test_config(self):
        self.assertIsInstance(config(), UserDict)

    def test_config_from_ini(self):
        ini_paths = [
            os.path.join(os.path.dirname(__file__), "defaults.cfg"),
            os.path.join(os.path.dirname(__file__), "setup.cfg"),
        ]
        ini_config = _config_from_ini(ini_paths)
        self.assertIsInstance(ini_config, dict)

    def test_config_from_pyproject(self):
        toml_path = os.path.join(os.path.dirname(__file__), "pyproject.toml")
        toml_config = _config_from_pyproject(toml_path)
        self.assertIsInstance(toml_config, dict)

    def test_current_commit_parser(self):
        parser = current_commit_parser()
        self.assertIsInstance(parser, Callable)

    def test_current_changelog_components(self):
        components = current_changelog_components()
        self.assertIsInstance(components, list)

    def test_overload_configuration(self):
        @overload_configuration
        def test_function(x, y):
            return x + y
        result = test_function(1, 2)
        self.assertEqual(result, 3)

class TestPrivateMethods(unittest.TestCase):
    def test__config(self):
        result = _config()
        self.assertIsInstance(result, UserDict)

    def test__config_from_ini(self):
        ini_paths = [
            os.path.join(os.path.dirname(__file__), "defaults.cfg"),
            os.path.join(os.path.dirname(__file__), "setup.cfg"),
        ]
        result = _config_from_ini(ini_paths)
        self.assertIsInstance(result, dict)

    def test__config_from_pyproject(self):
        toml_path = os.path.join(os.path.dirname(__file__), "pyproject.toml")
        result = _config_from_pyproject(toml_path)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()