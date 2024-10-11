import unittest
from isort.exceptions import *


class TestISortError(unittest.TestCase):
    def test_init(self):
        error = ISortError("Test error")
        self.assertEqual(str(error), "Test error")

class TestInvalidSettingsPath(unittest.TestCase):
    def test_init(self):
        error = InvalidSettingsPath("path/to/settings")
        self.assertEqual(str(error), "isort was told to use the settings_path: path/to/settings as the base directory or file that represents the starting point of config file discovery, but it does not exist.")
        self.assertEqual(error.settings_path, "path/to/settings")

class TestExistingSyntaxErrors(unittest.TestCase):
    def test_init(self):
        error = ExistingSyntaxErrors("file.py")
        self.assertEqual(str(error), "isort was told to sort imports within code that contains syntax errors: file.py.")
        self.assertEqual(error.file_path, "file.py")

class TestIntroducedSyntaxErrors(unittest.TestCase):
    def test_init(self):
        error = IntroducedSyntaxErrors("file.py")
        self.assertEqual(str(error), "isort introduced syntax errors when attempting to sort the imports contained within file.py.")
        self.assertEqual(error.file_path, "file.py")

class TestFileSkipped(unittest.TestCase):
    def test_init(self):
        error = FileSkipped("message", "file.py")
        self.assertEqual(str(error), "message")
        self.assertEqual(error.file_path, "file.py")

class TestFileSkipComment(unittest.TestCase):
    def test_init(self):
        error = FileSkipComment("file.py")
        self.assertEqual(str(error), "file.py contains an file skip comment and was skipped.")
        self.assertEqual(error.file_path, "file.py")

class TestFileSkipSetting(unittest.TestCase):
    def test_init(self):
        error = FileSkipSetting("file.py")
        self.assertEqual(str(error), "file.py was skipped as it's listed in 'skip' setting or matches a glob in 'skip_glob' setting")
        self.assertEqual(error.file_path, "file.py")

class TestProfileDoesNotExist(unittest.TestCase):
    def test_init(self):
        error = ProfileDoesNotExist("profile")
        self.assertEqual(str(error), "Specified profile of profile does not exist. Available profiles: .")
        self.assertEqual(error.profile, "profile")

class TestFormattingPluginDoesNotExist(unittest.TestCase):
    def test_init(self):
        error = FormattingPluginDoesNotExist("formatter")
        self.assertEqual(str(error), "Specified formatting plugin of formatter does not exist. ")
        self.assertEqual(error.formatter, "formatter")

class TestLiteralParsingFailure(unittest.TestCase):
    def test_init(self):
        error = LiteralParsingFailure("code", Exception("original error"))
        self.assertEqual(str(error), "isort failed to parse the given literal code. It's important to note that isort literal sorting only supports simple literals parsable by ast.literal_eval which gave the exception of original error.")
        self.assertEqual(error.code, "code")
        self.assertEqual(error.original_error, Exception("original error"))

class TestLiteralSortTypeMismatch(unittest.TestCase):
    def test_init(self):
        error = LiteralSortTypeMismatch(int, str)
        self.assertEqual(str(error), "isort was told to sort a literal of type <class 'str'> but was given a literal of type <class 'int'>.")
        self.assertEqual(error.kind, int)
        self.assertEqual(error.expected_kind, str)

class TestAssignmentsFormatMismatch(unittest.TestCase):
    def test_init(self):
        error = AssignmentsFormatMismatch("code")
        self.assertEqual(str(error), "isort was told to sort a section of assignments, however the given code:\n\n code\n\nDoes not match isort's strict single line formatting requirement for assignment sorting:\n\n{variable_name} = {value}\n{variable_name2} = {value2}\n...\n")
        self.assertEqual(error.code, "code")

class TestUnsupportedSettings(unittest.TestCase):
    def test_init(self):
        error = UnsupportedSettings({"option": {"value": "value", "source": "source"}})
        self.assertEqual(str(error), "isort was provided settings that it doesn't support:\n\n\t- option = value  (source: 'source')\n\nFor a complete and up-to-date listing of supported settings see: https://pycqa.github.io/isort/docs/configuration/options/.\n")
        self.assertEqual(error.unsupported_settings, {"option": {"value": "value", "source": "source"}})

    def test__format_option(self):
        error = UnsupportedSettings({"option": {"value": "value", "source": "source"}})
        self.assertEqual(error._format_option("option", value="value", source="source"), "\t- option = value  (source: 'source')")


if __name__ == '__main__':
    unittest.main()