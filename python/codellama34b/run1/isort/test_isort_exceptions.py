import unittest
from isort.exceptions import *



class TestISortError(unittest.TestCase):
    def test_ISortError(self):
        instance = ISortError()
        self.assertIsInstance(instance, Exception)

    def test_InvalidSettingsPath(self):
        instance = InvalidSettingsPath("settings_path")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.settings_path, "settings_path")

    def test_ExistingSyntaxErrors(self):
        instance = ExistingSyntaxErrors("file_path")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.file_path, "file_path")

    def test_IntroducedSyntaxErrors(self):
        instance = IntroducedSyntaxErrors("file_path")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.file_path, "file_path")

    def test_FileSkipped(self):
        instance = FileSkipped("message", "file_path")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.file_path, "file_path")

    def test_FileSkipComment(self):
        instance = FileSkipComment("file_path")
        self.assertIsInstance(instance, FileSkipped)
        self.assertEqual(instance.file_path, "file_path")

    def test_FileSkipSetting(self):
        instance = FileSkipSetting("file_path")
        self.assertIsInstance(instance, FileSkipped)
        self.assertEqual(instance.file_path, "file_path")

    def test_ProfileDoesNotExist(self):
        instance = ProfileDoesNotExist("profile")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.profile, "profile")

    def test_FormattingPluginDoesNotExist(self):
        instance = FormattingPluginDoesNotExist("formatter")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.formatter, "formatter")

    def test_LiteralParsingFailure(self):
        instance = LiteralParsingFailure("code", "original_error")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.code, "code")
        self.assertEqual(instance.original_error, "original_error")

    def test_LiteralSortTypeMismatch(self):
        instance = LiteralSortTypeMismatch("kind", "expected_kind")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.kind, "kind")
        self.assertEqual(instance.expected_kind, "expected_kind")

    def test_AssignmentsFormatMismatch(self):
        instance = AssignmentsFormatMismatch("code")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.code, "code")

    def test_UnsupportedSettings(self):
        instance = UnsupportedSettings({"unsupported_settings": "unsupported_settings"})
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.unsupported_settings, "unsupported_settings")

    def test_UnsupportedEncoding(self):
        instance = UnsupportedEncoding("filename")
        self.assertIsInstance(instance, ISortError)
        self.assertEqual(instance.filename, "filename")


class TestISortError(unittest.TestCase):
    def test_ISortError(self):
        instance = ISortError()
        self.assertEqual(instance.__class__.__name__, "ISortError")

    def test_InvalidSettingsPath(self):
        instance = InvalidSettingsPath("test")
        self.assertEqual(instance.__class__.__name__, "InvalidSettingsPath")

    def test_ExistingSyntaxErrors(self):
        instance = ExistingSyntaxErrors("test")
        self.assertEqual(instance.__class__.__name__, "ExistingSyntaxErrors")

    def test_IntroducedSyntaxErrors(self):
        instance = IntroducedSyntaxErrors("test")
        self.assertEqual(instance.__class__.__name__, "IntroducedSyntaxErrors")

    def test_FileSkipped(self):
        instance = FileSkipped("test", "test")
        self.assertEqual(instance.__class__.__name__, "FileSkipped")

    def test_FileSkipComment(self):
        instance = FileSkipComment("test")
        self.assertEqual(instance.__class__.__name__, "FileSkipComment")

    def test_FileSkipSetting(self):
        instance = FileSkipSetting("test")
        self.assertEqual(instance.__class__.__name__, "FileSkipSetting")

    def test_ProfileDoesNotExist(self):
        instance = ProfileDoesNotExist("test")
        self.assertEqual(instance.__class__.__name__, "ProfileDoesNotExist")

    def test_FormattingPluginDoesNotExist(self):
        instance = FormattingPluginDoesNotExist("test")
        self.assertEqual(instance.__class__.__name__, "FormattingPluginDoesNotExist")

    def test_LiteralParsingFailure(self):
        instance = LiteralParsingFailure("test", "test")
        self.assertEqual(instance.__class__.__name__, "LiteralParsingFailure")

    def test_LiteralSortTypeMismatch(self):
        instance = LiteralSortTypeMismatch("test", "test")
        self.assertEqual(instance.__class__.__name__, "LiteralSortTypeMismatch")

    def test_AssignmentsFormatMismatch(self):
        instance = AssignmentsFormatMismatch("test")
        self.assertEqual(instance.__class__.__name__, "AssignmentsFormatMismatch")

    def test_UnsupportedSettings(self):
        instance = UnsupportedSettings({"test": {"test": "test"}})
        self.assertEqual(instance.__class__.__name__, "UnsupportedSettings")

    def test_UnsupportedEncoding(self):
        instance = UnsupportedEncoding("test")
        self.assertEqual(instance.__class__.__name__, "UnsupportedEncoding")

    def test_MissingSection(self):
        instance = MissingSection("test", "test")
        self.assertEqual(instance.__class__.__name__, "MissingSection")

if __name__ == '__main__':
    unittest.main()