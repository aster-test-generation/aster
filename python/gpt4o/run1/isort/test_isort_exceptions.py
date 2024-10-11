import unittest
from isort.exceptions import *


class TestISortError(unittest.TestCase):
    def test_isort_error(self):
        error = ISortError("Test error")
        self.assertEqual(str(error), "Test error")

class TestInvalidSettingsPath(unittest.TestCase):
    def test_init(self):
        error = InvalidSettingsPath("invalid/path")
        self.assertEqual(error.settings_path, "invalid/path")
        self.assertEqual(
            str(error),
            "isort was told to use the settings_path: invalid/path as the base directory or file that represents the starting point of config file discovery, but it does not exist."
        )

class TestExistingSyntaxErrors(unittest.TestCase):
    def test_init(self):
        error = ExistingSyntaxErrors("file_with_errors.py")
        self.assertEqual(error.file_path, "file_with_errors.py")
        self.assertEqual(
            str(error),
            "isort was told to sort imports within code that contains syntax errors: file_with_errors.py."
        )

class TestIntroducedSyntaxErrors(unittest.TestCase):
    def test_init(self):
        error = IntroducedSyntaxErrors("file_with_errors.py")
        self.assertEqual(error.file_path, "file_with_errors.py")
        self.assertEqual(
            str(error),
            "isort introduced syntax errors when attempting to sort the imports contained within file_with_errors.py."
        )

class TestFileSkipped(unittest.TestCase):
    def test_init(self):
        error = FileSkipped("File was skipped", "skipped_file.py")
        self.assertEqual(error.file_path, "skipped_file.py")
        self.assertEqual(str(error), "File was skipped")

class TestFileSkipComment(unittest.TestCase):
    def test_init(self):
        error = FileSkipComment("skipped_file.py")
        self.assertEqual(error.file_path, "skipped_file.py")
        self.assertEqual(
            str(error),
            "skipped_file.py contains an file skip comment and was skipped."
        )

class TestFileSkipSetting(unittest.TestCase):
    def test_init(self):
        error = FileSkipSetting("skipped_file.py")
        self.assertEqual(error.file_path, "skipped_file.py")
        self.assertEqual(
            str(error),
            "skipped_file.py was skipped as it's listed in 'skip' setting or matches a glob in 'skip_glob' setting"
        )

class TestProfileDoesNotExist(unittest.TestCase):
    def test_init(self):
        error = ProfileDoesNotExist("nonexistent_profile")
        self.assertEqual(error.profile, "nonexistent_profile")
        self.assertEqual(
            str(error),
            "Specified profile of nonexistent_profile does not exist. Available profiles: ."
        )

class TestFormattingPluginDoesNotExist(unittest.TestCase):
    def test_init(self):
        error = FormattingPluginDoesNotExist("nonexistent_formatter")
        self.assertEqual(error.formatter, "nonexistent_formatter")
        self.assertEqual(
            str(error),
            "Specified formatting plugin of nonexistent_formatter does not exist. "
        )

class TestLiteralParsingFailure(unittest.TestCase):
    def test_init(self):
        original_error = ValueError("Invalid literal")
        error = LiteralParsingFailure("some_code", original_error)
        self.assertEqual(error.code, "some_code")
        self.assertEqual(error.original_error, original_error)
        self.assertEqual(
            str(error),
            "isort failed to parse the given literal some_code. It's important to note that isort literal sorting only supports simple literals parsable by ast.literal_eval which gave the exception of Invalid literal."
        )

class TestLiteralSortTypeMismatch(unittest.TestCase):
    def test_init(self):
        error = LiteralSortTypeMismatch(int, str)
        self.assertEqual(error.kind, int)
        self.assertEqual(error.expected_kind, str)
        self.assertEqual(
            str(error),
            "isort was told to sort a literal of type <class 'str'> but was given a literal of type <class 'int'>."
        )

class TestAssignmentsFormatMismatch(unittest.TestCase):
    def test_init(self):
        error = AssignmentsFormatMismatch("a = 1\nb = 2")
        self.assertEqual(error.code, "a = 1\nb = 2")
        self.assertEqual(
            str(error),
            "isort was told to sort a section of assignments, however the given code:\n\na = 1\nb = 2\n\nDoes not match isort's strict single line formatting requirement for assignment sorting:\n\n{variable_name} = {value}\n{variable_name2} = {value2}\n...\n\n"
        )

class TestUnsupportedSettings(unittest.TestCase):
    def test_init(self):
        unsupported_settings = {
            "setting1": {"value": "value1", "source": "source1"},
            "setting2": {"value": "value2", "source": "source2"},
        }
        error = UnsupportedSettings(unsupported_settings)
        self.assertEqual(error.unsupported_settings, unsupported_settings)
        self.assertIn(
            "isort was provided settings that it doesn't support",
            str(error)
        )

    def test_format_option(self):
        result = UnsupportedSettings._format_option("name", "value", "source")
        self.assertEqual(result, "\t- name = value  (source: 'source')")

class TestUnsupportedEncoding(unittest.TestCase):
    def test_init(self):
        error = UnsupportedEncoding("file_with_encoding_issue.py")
        self.assertEqual(error.filename, "file_with_encoding_issue.py")
        self.assertEqual(
            str(error),
            "Unknown or unsupported encoding in file_with_encoding_issue.py"
        )

class TestMissingSection(unittest.TestCase):
    def test_init(self):
        error = MissingSection("module_name", "section_name")
        self.assertEqual(error.import_module, "module_name")
        self.assertEqual(error.section, "section_name")
        self.assertEqual(
            str(error),
            "Found module_name import while parsing, but section_name was not included in the `sections` setting of your config. Please add it before continuing\nSee https://pycqa.github.io/isort/ for more info."
        )

if __name__ == '__main__':
    unittest.main()