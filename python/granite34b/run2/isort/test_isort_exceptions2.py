import unittest
from isort.exceptions import (
    ISortError,
    InvalidSettingsPath,
    ExistingSyntaxErrors,
    IntroducedSyntaxErrors,
    FileSkipped,
    FileSkipComment,
    FileSkipSetting,
    ProfileDoesNotExist,
    FormattingPluginDoesNotExist,
    LiteralParsingFailure,
    LiteralSortTypeMismatch,
    AssignmentsFormatMismatch,
    UnsupportedSettings,
    UnsupportedEncoding,
    MissingSection,
)

class TestISortError(unittest.TestCase):
    def test_isort_error(self):
        error = ISortError("This is a test error message.")
        self.assertEqual(str(error), "This is a test error message.")

class TestInvalidSettingsPath(unittest.TestCase):
    def test_invalid_settings_path(self):
        error = InvalidSettingsPath("/path/to/settings")
        self.assertEqual(
            str(error),
            "isort was told to use the settings_path: /path/to/settings as the base directory or file that represents the starting point of config file discovery, but it does not exist.",
        )
        self.assertEqual(error.settings_path, "/path/to/settings")

class TestExistingSyntaxErrors(unittest.TestCase):
    def test_existing_syntax_errors(self):
        error = ExistingSyntaxErrors("/path/to/file")
        self.assertEqual(
            str(error),
            "isort was told to sort imports within code that contains syntax errors: /path/to/file.",
        )
        self.assertEqual(error.file_path, "/path/to/file")

class TestIntroducedSyntaxErrors(unittest.TestCase):
    def test_introduced_syntax_errors(self):
        error = IntroducedSyntaxErrors("/path/to/file")
        self.assertEqual(
            str(error),
            "isort introduced syntax errors when attempting to sort the imports contained within /path/to/file.",
        )
        self.assertEqual(error.file_path, "/path/to/file")

class TestFileSkipped(unittest.TestCase):
    def test_file_skipped(self):
        error = FileSkipped("This is a test error message.", "/path/to/file")
        self.assertEqual(str(error), "This is a test error message.")
        self.assertEqual(error.file_path, "/path/to/file")

class TestFileSkipComment(unittest.TestCase):
    def test_file_skip_comment(self):
        error = FileSkipComment("/path/to/file")
        self.assertEqual(
            str(error),
            "/path/to/file contains an file skip comment and was skipped.",
        )
        self.assertEqual(error.file_path, "/path/to/file")

class TestFileSkipSetting(unittest.TestCase):
    def test_file_skip_setting(self):
        error = FileSkipSetting("/path/to/file")
        self.assertEqual(
            str(error),
            "/path/to/file was skipped as it's listed in 'skip' setting or matches a glob in 'skip_glob' setting",
        )
        self.assertEqual(error.file_path, "/path/to/file")

class TestProfileDoesNotExist(unittest.TestCase):
    def test_profile_does_not_exist(self):
        error = ProfileDoesNotExist("test_profile")
        self.assertEqual(
            str(error),
            "Specified profile of test_profile does not exist. Available profiles: test_profile.",
        )
        self.assertEqual(error.profile, "test_profile")

class TestFormattingPluginDoesNotExist(unittest.TestCase):
    def test_formatting_plugin_does_not_exist(self):
        error = FormattingPluginDoesNotExist("test_formatter")
        self.assertEqual(
            str(error),
            "Specified formatting plugin of test_formatter does not exist. ",
        )
        self.assertEqual(error.formatter, "test_formatter")

class TestLiteralParsingFailure(unittest.TestCase):
    def test_literal_parsing_failure(self):
        error = LiteralParsingFailure("test_code", Exception("Original error message."))
        self.assertEqual(
            str(error),
            "isort failed to parse the given literal test_code. It's important to note that isort literal sorting only supports simple literals parsable by ast.literal_eval which gave the exception of Original error message.",
        )
        self.assertEqual(error.code, "test_code")
        self.assertEqual(str(error.original_error), "Original error message.")


if __name__ == '__main__':
    unittest.main()