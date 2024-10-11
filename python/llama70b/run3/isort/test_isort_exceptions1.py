import unittest
from isort.exceptions import *

class TestISortError(unittest.TestCase):
    def test_init(self):
        error = ISortError("Test error")
        self.assertEqual(str(error), "Test error")

class TestInvalidSettingsPath(unittest.TestCase):
    def test_init(self):
        error = InvalidSettingsPath("path")
        self.assertEqual(str(error), "isort was told to use the settings_path: path as the base directory or file that represents the starting point of config file discovery, but it does not exist.")
        self.assertEqual(error.settings_path, "path")

class TestExistingSyntaxErrors(unittest.TestCase):
    def test_init(self):
        error = ExistingSyntaxErrors("file_path")
        self.assertEqual(str(error), "isort was told to sort imports within code that contains syntax errors: file_path.")
        self.assertEqual(error.file_path, "file_path")

class TestIntroducedSyntaxErrors(unittest.TestCase):
    def test_init(self):
        error = IntroducedSyntaxErrors("file_path")
        self.assertEqual(str(error), "isort introduced syntax errors when attempting to sort the imports contained within file_path.")
        self.assertEqual(error.file_path, "file_path")

class TestFileSkipped(unittest.TestCase):
    def test_init(self):
        error = FileSkipped("message", "file_path")
        self.assertEqual(str(error), "message")
        self.assertEqual(error.file_path, "file_path")

class TestFileSkipComment(unittest.TestCase):
    def test_init(self):
        error = FileSkipComment("file_path")
        self.assertEqual(str(error), "file_path contains an file skip comment and was skipped.")
        self.assertEqual(error.file_path, "file_path")

class TestFileSkipSetting(unittest.TestCase):
    def test_init(self):
        error = FileSkipSetting("file_path")
        self.assertEqual(str(error), "file_path was skipped as it's listed in 'skip' setting or matches a glob in 'skip_glob' setting")
        self.assertEqual(error.file_path, "file_path")

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
        error = UnsupportedSettings({"option": {"name": "value", "source": "source"}})
        self.assertEqual(str(error), "isort was provided settings that it doesn't support:\n\n\t- option = value  (source: 'source')\n\nFor a complete and up-to-date listing of supported settings see: https://pycqa.github.io/isort/docs/configuration/options/.\n")
        self.assertEqual(error.unsupported_settings, {"option": {"name": "value", "source": "source"}})

    def test_format_option(self):
        self.assertEqual(UnsupportedSettings._format_option("name", "value", "source"), "\t- name = value  (source: 'source')")

class TestUnsupportedEncoding(unittest.TestCase):
    def test_init(self):
        error = UnsupportedEncoding("filename")
        self.assertEqual(str(error), "Unknown or unsupported encoding in filename")
        self.assertEqual(error.filename, "filename")


if __name__ == '__main__':
    unittest.main()