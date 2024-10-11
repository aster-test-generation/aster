import unittest
from semantic_release.settings import *


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

    def test_current_commit_parser(self):
        parser = current_commit_parser()
        self.assertIsInstance(parser, Callable)

    def test_current_changelog_components(self):
        components = current_changelog_components()
        self.assertIsInstance(components, list)
        for component in components:
            self.assertIsInstance(component, Callable)

    def test_overload_configuration(self):
        @overload_configuration
        def test_func(*args, **kwargs):
            return True
        result = test_func(define=["key=value"])
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()