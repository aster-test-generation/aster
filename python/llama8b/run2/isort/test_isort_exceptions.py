import unittest
from isort.exceptions import *


class TestISortError(unittest.TestCase):
    def test_invalid_settings_path(self):
        error = InvalidSettingsPath('path')
        self.assertEqual(str(error), "isort was told to use the settings_path: path as the base directory or file that represents the starting point of config file discovery, but it does not exist.")

    def test_existing_syntax_errors(self):
        error = ExistingSyntaxErrors('file_path')
        self.assertEqual(str(error), "isort was told to sort imports within code that contains syntax errors: file_path.")

    def test_introduced_syntax_errors(self):
        error = IntroducedSyntaxErrors('file_path')
        self.assertEqual(str(error), "isort introduced syntax errors when attempting to sort the imports contained within file_path.")

    def test_file_skipped(self):
        error = FileSkipped('message', 'file_path')
        self.assertEqual(str(error), 'message')

    def test_file_skip_comment(self):
        error = FileSkipComment('file_path')
        self.assertEqual(str(error), f"{file_path} contains an file skip comment and was skipped.")

    def test_file_skip_setting(self):
        error = FileSkipSetting('file_path')
        self.assertEqual(str(error), f"{file_path} was skipped as it's listed in 'skip' setting or matches a glob in 'skip_glob' setting")

    def test_profile_does_not_exist(self):
        error = ProfileDoesNotExist('profile')
        self.assertEqual(str(error), f"Specified profile of {profile} does not exist. Available profiles: {','.join(profiles)}.")

    def test_formatting_plugin_does_not_exist(self):
        error = FormattingPluginDoesNotExist('formatter')
        self.assertEqual(str(error), f"Specified formatting plugin of {formatter} does not exist.")

    def test_literal_parsing_failure(self):
        error = LiteralParsingFailure('code', Exception('original_error'))
        self.assertEqual(str(error), f"isort failed to parse the given literal {code}. It's important to note that isort literal sorting only supports simple literals parsable by ast.literal_eval which gave the exception of {original_error}.")

    def test_literal_sort_type_mismatch(self):
        error = LiteralSortTypeMismatch(type, type)
        self.assertEqual(str(error), f"isort was told to sort a literal of type {expected_kind} but was given a literal of type {kind}.")

    def test_assignments_format_mismatch(self):
        error = AssignmentsFormatMismatch('code')
        self.assertEqual(str(error), "isort was told to sort a section of assignments, however the given code:\n\n" + code + "\n\nDoes not match isort's strict single line formatting requirement for assignment sorting:\n\n{variable_name} = {value}\n{variable_name2} = {value2}\n...\n\n")

    def test_unsupported_settings(self):
        error = UnsupportedSettings({'setting1': {'value': 'value1'}, 'setting2': {'value': 'value2'}})
        self.assertEqual(str(error), "isort was provided settings that it doesn't support:\n\n\t- setting1 = value1  (source: '...')\n\t- setting2 = value2  (source: '...')\n\nFor a complete and up-to-date listing of supported settings see: https://pycqa.github.io/isort/docs/configuration/options/.")

    def test_unsupported_encoding(self):
        error = UnsupportedEncoding('filename')
        self.assertEqual(str(error), f"Unknown or unsupported encoding in {filename}")

    def test_missing_section(self):
        error = MissingSection('import_module', 'section')
        self.assertEqual(str(error), f"Found {import_module} import while parsing, but {section} was not included in the `sections` setting of your config. Please add it before continuing\nSee https://pycqa.github.io/isort/ for more info.")

if __name__ == '__main__':
    unittest.main()