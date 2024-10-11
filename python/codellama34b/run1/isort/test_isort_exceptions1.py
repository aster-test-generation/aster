import unittest
from isort.exceptions import *

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