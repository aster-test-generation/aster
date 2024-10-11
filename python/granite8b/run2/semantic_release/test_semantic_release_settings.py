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

    def test_config_custom_values(self):
        overload_configuration(define=["changelog_capitalize=True", "changelog_scope=True", "check_build_status=False", "commit_version_number=False", "patch_without_tag=True", "major_on_zero=True", "remove_dist=False", "upload_to_pypi=False", "upload_to_release=False"])
        self.assertEqual(config["changelog_capitalize"], True)
        self.assertEqual(config["changelog_scope"], True)
        self.assertEqual(config["check_build_status"], False)
        self.assertEqual(config["commit_version_number"], False)
        self.assertEqual(config["patch_without_tag"], True)
        self.assertEqual(config["major_on_zero"], True)
        self.assertEqual(config["remove_dist"], False)
        self.assertEqual(config["upload_to_pypi"], False)
        self.assertEqual(config["upload_to_release"], False)

class TestCurrentCommitParser(unittest.TestCase):
    def test_current_commit_parser(self):
        parser = current_commit_parser()
        self.assertEqual(parser("1234567890"), "1234567890")

class TestCurrentChangelogComponents(unittest.TestCase):
    def test_current_changelog_components(self):
        components = current_changelog_components()
        self.assertEqual(len(components), 3)
        self.assertEqual(components[0].__name__, "component_a")
        self.assertEqual(components[1].__name__, "component_b")
        self.assertEqual(components[2].__name__, "component_c")

if __name__ == '__main__':
    unittest.main()