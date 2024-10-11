import unittest
from semantic_release.settings import config, current_changelog_components, current_commit_parser, overload_configuration


class TestConfig(unittest.TestCase):
    def test_config_default_values(self):
        self.assertEqual(config["changelog_capitalize"], True)
        self.assertEqual(config["changelog_scope"], False)
        self.assertEqual(config["check_build_status"], True)
        self.assertEqual(config["commit_version_number"], True)
        self.assertEqual(config["patch_without_tag"], False)
        self.assertEqual(config["major_on_zero"], False)
        self.assertEqual(config["remove_dist"], True)
        self.assertEqual(config["upload_to_pypi"], True)
        self.assertEqual(config["upload_to_release"], True)

class TestCurrentCommitParser(unittest.TestCase):
    def test_current_commit_parser_default_value(self):
        self.assertEqual(current_commit_parser().__class__.__name__, "AngularCommitParser")

class TestCurrentChangelogComponents(unittest.TestCase):
    def test_current_changelog_components_default_value(self):
        self.assertEqual(current_changelog_components(), ["semantic_release.changelog.DefaultChangelogComponent", "semantic_release.changelog.changelog_headers"])

class TestOverloadConfiguration(unittest.TestCase):
    def test_overload_configuration_default_value(self):
        self.assertEqual(overload_configuration.__defaults__, None)

class TestConfig(unittest.TestCase):
    def test_config_get(self):
        self.assertEqual(config.get("changelog_capitalize"), True)
        self.assertEqual(config.get("changelog_scope"), True)
        self.assertEqual(config.get("check_build_status"), True)
        self.assertEqual(config.get("commit_version_number"), True)
        self.assertEqual(config.get("patch_without_tag"), False)
        self.assertEqual(config.get("major_on_zero"), False)
        self.assertEqual(config.get("remove_dist"), True)
        self.assertEqual(config.get("upload_to_pypi"), True)
        self.assertEqual(config.get("upload_to_release"), True)

    def test_config_get_default(self):
        self.assertEqual(config.get("changelog_capitalize", False), True)
        self.assertEqual(config.get("changelog_scope", False), True)
        self.assertEqual(config.get("check_build_status", False), True)
        self.assertEqual(config.get("commit_version_number", False), True)
        self.assertEqual(config.get("patch_without_tag", False), False)
        self.assertEqual(config.get("major_on_zero", False), False)
        self.assertEqual(config.get("remove_dist", False), True)
        self.assertEqual(config.get("upload_to_pypi", False), True)
        self.assertEqual(config.get("upload_to_release", False), True)

class TestCurrentCommitParser(unittest.TestCase):
    def test_current_commit_parser(self):
        self.assertEqual(current_commit_parser().__class__.__name__, "AngularCommitParser")

class TestCurrentChangelogComponents(unittest.TestCase):
    def test_current_changelog_components(self):
        self.assertEqual(current_changelog_components()[0].__class__.__name__, "AngularChangelogComponent")

class TestOverloadConfiguration(unittest.TestCase):
    def test_overload_configuration(self):
        @overload_configuration
        def test_func(define):
            pass
        test_func(define=["changelog_capitalize=False"])
        self.assertEqual(config.get("changelog_capitalize"), False)

if __name__ == '__main__':
    unittest.main()