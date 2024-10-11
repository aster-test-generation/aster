import unittest
from isort.exceptions import *

class TestISortError(unittest.TestCase):
    def test_invalid_settings_path(self):
        with self.assertRaises(InvalidSettingsPath):
            raise InvalidSettingsPath("invalid_path")

    def test_existing_syntax_errors(self):
        with self.assertRaises(ExistingSyntaxErrors):
            raise ExistingSyntaxErrors("file_path")

    def test_introduced_syntax_errors(self):
        with self.assertRaises(IntroducedSyntaxErrors):
            raise IntroducedSyntaxErrors("file_path")

    def test_file_skipped(self):
        with self.assertRaises(FileSkipped):
            raise FileSkipped("message", "file_path")

    def test_file_skip_comment(self):
        with self.assertRaises(FileSkipComment):
            raise FileSkipComment("file_path")

    def test_file_skip_setting(self):
        with self.assertRaises(FileSkipSetting):
            raise FileSkipSetting("file_path")

    def test_profile_does_not_exist(self):
        with self.assertRaises(ProfileDoesNotExist):
            raise ProfileDoesNotExist("profile")

    def test_formatting_plugin_does_not_exist(self):
        with self.assertRaises(FormattingPluginDoesNotExist):
            raise FormattingPluginDoesNotExist("formatter")

    def test_literal_parsing_failure(self):
        with self.assertRaises(LiteralParsingFailure):
            raise LiteralParsingFailure("code", Exception("original_error"))

    def test_literal_sort_type_mismatch(self):
        with self.assertRaises(LiteralSortTypeMismatch):
            raise LiteralSortTypeMismatch(int, str)

    def test_assignments_format_mismatch(self):
        with self.assertRaises(AssignmentsFormatMismatch):
            raise AssignmentsFormatMismatch("code")

    def test_unsupported_settings(self):
        with self.assertRaises(UnsupportedSettings):
            raise UnsupportedSettings({"setting": {"name": "value", "source": "source"}})

    def test_unsupported_encoding(self):
        with self.assertRaises(UnsupportedEncoding):
            raise UnsupportedEncoding("filename")

    def test_missing_section(self):
        with self.assertRaises(MissingSection):
            raise MissingSection("import_module", "section")

if __name__ == '__main__':
    unittest.main()