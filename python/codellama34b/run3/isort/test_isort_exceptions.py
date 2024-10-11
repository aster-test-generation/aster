import unittest
from isort.exceptions import *



class TestISortError(unittest.TestCase):
    def test_isort_error(self):
        instance = ISortError()
        self.assertIsInstance(instance, Exception)

class TestInvalidSettingsPath(unittest.TestCase):
    def test_invalid_settings_path(self):
        settings_path = "settings_path"
        instance = InvalidSettingsPath(settings_path)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.settings_path, settings_path)

class TestExistingSyntaxErrors(unittest.TestCase):
    def test_existing_syntax_errors(self):
        file_path = "file_path"
        instance = ExistingSyntaxErrors(file_path)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.file_path, file_path)

class TestIntroducedSyntaxErrors(unittest.TestCase):
    def test_introduced_syntax_errors(self):
        file_path = "file_path"
        instance = IntroducedSyntaxErrors(file_path)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.file_path, file_path)

class TestFileSkipped(unittest.TestCase):
    def test_file_skipped(self):
        message = "message"
        file_path = "file_path"
        instance = FileSkipped(message, file_path)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.message, message)
        self.assertEqual(instance.file_path, file_path)

class TestFileSkipComment(unittest.TestCase):
    def test_file_skip_comment(self):
        file_path = "file_path"
        instance = FileSkipComment(file_path)
        self.assertIsInstance(instance, FileSkipped)
        self.assertEqual(instance.file_path, file_path)

class TestFileSkipSetting(unittest.TestCase):
    def test_file_skip_setting(self):
        file_path = "file_path"
        instance = FileSkipSetting(file_path)
        self.assertIsInstance(instance, FileSkipped)
        self.assertEqual(instance.file_path, file_path)

class TestProfileDoesNotExist(unittest.TestCase):
    def test_profile_does_not_exist(self):
        profile = "profile"
        instance = ProfileDoesNotExist(profile)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.profile, profile)

class TestFormattingPluginDoesNotExist(unittest.TestCase):
    def test_formatting_plugin_does_not_exist(self):
        formatter = "formatter"
        instance = FormattingPluginDoesNotExist(formatter)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.formatter, formatter)

class TestLiteralParsingFailure(unittest.TestCase):
    def test_literal_parsing_failure(self):
        code = "code"
        original_error = "original_error"
        instance = LiteralParsingFailure(code, original_error)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.code, code)
        self.assertEqual(instance.original_error, original_error)

class TestLiteralSortTypeMismatch(unittest.TestCase):
    def test_literal_sort_type_mismatch(self):
        kind = "kind"
        expected_kind = "expected_kind"
        instance = LiteralSortTypeMismatch(kind, expected_kind)
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.kind, kind)
        self.assertEqual(instance.expected_kind, expected_kind)


class TestISortError(unittest.TestCase):
    def test_init(self):
        instance = ISortError()
        self.assertIsInstance(instance, Exception)

class TestInvalidSettingsPath(unittest.TestCase):
    def test_init(self):
        settings_path = 'test'
        instance = InvalidSettingsPath(settings_path)
        self.assertEqual(instance.settings_path, settings_path)

class TestExistingSyntaxErrors(unittest.TestCase):
    def test_init(self):
        file_path = 'test'
        instance = ExistingSyntaxErrors(file_path)
        self.assertEqual(instance.file_path, file_path)

class TestIntroducedSyntaxErrors(unittest.TestCase):
    def test_init(self):
        file_path = 'test'
        instance = IntroducedSyntaxErrors(file_path)
        self.assertEqual(instance.file_path, file_path)

class TestFileSkipped(unittest.TestCase):
    def test_init(self):
        message = 'test'
        file_path = 'test'
        instance = FileSkipped(message, file_path)
        self.assertEqual(instance.file_path, file_path)

class TestFileSkipComment(unittest.TestCase):
    def test_init(self):
        file_path = 'test'
        instance = FileSkipComment(file_path)
        self.assertEqual(instance.file_path, file_path)

class TestFileSkipSetting(unittest.TestCase):
    def test_init(self):
        file_path = 'test'
        instance = FileSkipSetting(file_path)
        self.assertEqual(instance.file_path, file_path)

class TestProfileDoesNotExist(unittest.TestCase):
    def test_init(self):
        profile = 'test'
        instance = ProfileDoesNotExist(profile)
        self.assertEqual(instance.profile, profile)

class TestFormattingPluginDoesNotExist(unittest.TestCase):
    def test_init(self):
        formatter = 'test'
        instance = FormattingPluginDoesNotExist(formatter)
        self.assertEqual(instance.formatter, formatter)

class TestLiteralParsingFailure(unittest.TestCase):
    def test_init(self):
        code = 'test'
        original_error = 'test'
        instance = LiteralParsingFailure(code, original_error)
        self.assertEqual(instance.code, code)
        self.assertEqual(instance.original_error, original_error)

class TestLiteralSortTypeMismatch(unittest.TestCase):
    def test_init(self):
        kind = 'test'
        expected_kind = 'test'
        instance = LiteralSortTypeMismatch(kind, expected_kind)
        self.assertEqual(instance.kind, kind)
        self.assertEqual(instance.expected_kind, expected_kind)

class TestAssignmentsFormatMismatch(unittest.TestCase):
    def test_init(self):
        code = 'test'
        instance = AssignmentsFormatMismatch(code)
        self.assertEqual(instance.code, code)

class TestUnsupportedSettings(unittest.TestCase):
    def test_init(self):
        unsupported_settings = {}
        instance = UnsupportedSettings(unsupported_settings)
        self.assertEqual(instance.unsupported_settings, unsupported_settings)

class TestUnsupportedEncoding(unittest.TestCase):
    def test_init(self):
        filename = 'test'
        instance = UnsupportedEncoding(filename)
        self.assertEqual(instance.filename, filename)


if __name__ == '__main__':
    unittest.main()