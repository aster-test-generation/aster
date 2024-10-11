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
from pathlib import Path
from typing import Any, Dict, Union
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
        error = ISortError("Test error message")
        self.assertEqual(str(error), "Test error message")

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
        error = ExistingSyntaxErrors("/path/to/file.py")
        self.assertEqual(
            str(error),
            "isort was told to sort imports within code that contains syntax errors: /path/to/file.py.",
        )
        self.assertEqual(error.file_path, "/path/to/file.py")

# ... (similar test cases for other error classes)

class TestMissingSection(unittest.TestCase):
    def test_missing_section(self):
        error = MissingSection("import_module", "section")
        self.assertEqual(
            str(error),
            "Found import_module import while parsing, but section was not included in the `sections` setting of your config. Please add it before continuing\nSee https://pycqa.github.io/isort/ for more info.",
        )

if __name__ == "__main__":



def test_isort_error():
    error = ISortError("This is a test error message")
    assert isinstance(error, Exception)
    assert str(error) == "This is a test error message"

def test_invalid_settings_path():
    error = InvalidSettingsPath("/path/to/settings")
    assert isinstance(error, ISortError)
    assert str(error) == (
        "isort was told to use the settings_path: /path/to/settings as the base directory or "
        "file that represents the starting point of config file discovery, but it does not "
        "exist."
    )
    assert error.settings_path == "/path/to/settings"

def test_existing_syntax_errors():
    error = ExistingSyntaxErrors("/path/to/file")
    assert isinstance(error, ISortError)
    assert str(error) == (
        "isort was told to sort imports within code that contains syntax errors: "
        "/path/to/file."
    )
    assert error.file_path == "/path/to/file"

# ... (similar tests for other error classes)

def test_unsupported_settings():
    unsupported_settings = {
        "setting1": {"value": "value1", "source": "source1"},
        "setting2": {"value": "value2", "source": "source2"},
    }
    error = UnsupportedSettings(unsupported_settings)
    assert isinstance(error, ISortError)
    assert str(error) == (
        "isort was provided settings that it doesn't support:\n\n"
        "\t- setting1 = value1  (source: 'source1')\n"
        "\t- setting2 = value2  (source: 'source2')\n\n"
        "For a complete and up-to-date listing of supported settings see: "
        "https://pycqa.github.io/isort/docs/configuration/options/."
    )
    assert error.unsupported_settings == unsupported_settings

def test_unsupported_encoding():
    error = UnsupportedEncoding("/path/to/file")
    assert isinstance(error, ISortError)
    assert str(error) == "Unknown or unsupported encoding in /path/to/file"
    assert error.filename == "/path/to/file"

class TestISortError(unittest.TestCase):
    def test_isort_error(self):
        error = ISortError("This is a test error message.")
        self.assertEqual(str(error), "This is a test error message.")

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