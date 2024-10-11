import unittest
from semantic_release.settings import (
    _config,
    _config_from_ini,
    _config_from_pyproject,
    config,
    current_commit_parser,
    current_changelog_components,
    overload_configuration,
)


class TestSettings(unittest.TestCase):
    def test__config(self):
        result = _config()
        self.assertIsInstance(result, dict)

    def test__config_from_ini(self):
        paths = ["path/to/defaults.cfg", "path/to/setup.cfg"]
        result = _config_from_ini(paths)
        self.assertIsInstance(result, dict)

    def test__config_from_pyproject(self):
        path = "path/to/pyproject.toml"
        result = _config_from_pyproject(path)
        self.assertIsInstance(result, dict)

    def test_config(self):
        result = config
        self.assertIsInstance(result, dict)

    def test_current_commit_parser(self):
        result = current_commit_parser()
        self.assertIsInstance(result, Callable)

    def test_current_changelog_components(self):
        result = current_changelog_components()
        self.assertIsInstance(result, list)

    def test_overload_configuration(self):
        def func(*args, **kwargs):
            pass

        wrapped_func = overload_configuration(func)
        result = wrapped_func(define=["key=value"])
        self.assertIsNone(result)

    def test_private_methods(self):
        # Test private method _config
        result = _config._config()
        self.assertIsInstance(result, dict)

        # Test private method _config_from_ini
        paths = ["path/to/defaults.cfg", "path/to/setup.cfg"]
        result = _config_from_ini._config_from_ini(paths)
        self.assertIsInstance(result, dict)

        # Test private method _config_from_pyproject
        path = "path/to/pyproject.toml"
        result = _config_from_pyproject._config_from_pyproject(path)
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()