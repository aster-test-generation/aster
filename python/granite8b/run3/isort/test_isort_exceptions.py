import unittest
from isort.exceptions import *


class TestISortError(unittest.TestCase):
    def test_invalid_settings_path(self):
        instance = InvalidSettingsPath("settings_path")
        self.assertEqual(instance.settings_path, "settings_path")
        self.assertEqual(str(instance), "isort was told to use the settings_path: settings_path as the base directory or file that represents the starting point of config file discovery, but it does not exist.")

    def test_existing_syntax_errors(self):
        instance = ExistingSyntaxErrors("file_path")
        self.assertEqual(instance.file_path, "file_path")
        self.assertEqual(str(instance), "isort was told to sort imports within code that contains syntax errors: file_path.")

    def test_introduced_syntax_errors(self):
        instance = IntroducedSyntaxErrors("file_path")
        self.assertEqual(instance.file_path, "file_path")
        self.assertEqual(str(instance), "isort introduced syntax errors when attempting to sort the imports contained within file_path.")

    def test_file_skipped(self):
        instance = FileSkipped("message", "file_path")
        self.assertEqual(instance.file_path, "file_path")
        self.assertEqual(str(instance), "message")

    def test_file_skip_comment(self):
        instance = FileSkipComment("file_path")
        self.assertEqual(instance.file_path, "file_path")
        self.assertEqual(str(instance), "file_path contains an file skip comment and was skipped.")

    def test_file_skip_setting(self):
        instance = FileSkipSetting("file_path")
        self.assertEqual(instance.file_path, "file_path")
        self.assertEqual(str(instance), "file_path was skipped as it's listed in 'skip' setting or matches a glob in 'skip_glob' setting")

    def test_profile_does_not_exist(self):
        instance = ProfileDoesNotExist("profile")
        self.assertEqual(instance.profile, "profile")
        self.assertEqual(str(instance), "Specified profile of profile does not exist. Available profiles: black,django,pycharm,google,open_stack,plone,attrs,hug,wemake.")

    def test_formatting_plugin_does_not_exist(self):
        instance = FormattingPluginDoesNotExist("formatter")
        self.assertEqual(instance.formatter, "formatter")
        self.assertEqual(str(instance), "Specified formatting plugin of formatter does not exist. ")

    def test_literal_parsing_failure(self):
        instance = LiteralParsingFailure("code", Exception("original_error"))
        self.assertEqual(instance.code, "code")
        self.assertEqual(instance.original_error, Exception("new_error"))
        self.assertEqual(str(instance), "isort failed to parse the given literal code. It's important to note that isort literal sorting only supports simple literals parsable by ast.literal_eval which gave the exception of original_error.")

    def test_literal_sort_type_mismatch(self):
        instance = LiteralSortTypeMismatch(int, str)
        self.assertEqual(instance.kind, int)
        self.assertEqual(instance.expected_kind, str)
        self.assertEqual(str(instance), "isort was told to sort a literal of type <class 'str'> but was given a literal of type <class 'int'>.")

    def test_assignments_format_mismatch(self):
        instance = AssignmentsFormatMismatch("code")
        self.assertEqual(instance.code, "code")
        self.assertEqual(str(instance), "isort was told to sort a section of assignments, however the given code:\n\ncode\n\nDoes not match isort's strict single line formatting requirement for assignment sorting:\n\nvariable_name = value\nvariable_name2 = value2\n...\n\n")

    def test_unsupported_settings(self):
        instance = UnsupportedSettings({"option": {"name": "value"}})
        self.assertEqual(instance.unsupported_settings, {"option": {"name": "value", "source": "source"}})
        self.assertEqual(str(instance), "isort was provided settings that it doesn't support:\n\n\t- option = value  (source: 'source')\n\nFor a complete and up-to-date listing of supported settings see: https://pycqa.github.io/isort/docs/configuration/options/.\n")

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