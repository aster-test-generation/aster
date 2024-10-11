import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.module.get_bin_path.return_value = "/usr/bin/locale"
        self.module.run_command.return_value = (0, "C.utf8\nen_US.utf8\nC\nPOSIX", "")

    def test_get_best_parsable_locale_default_preferences(self):
        result = get_best_parsable_locale(self.module)
        self.assertEqual(result, 'C.utf8')

    def test_get_best_parsable_locale_custom_preferences(self):
        preferences = ['en_GB.utf8', 'en_US.utf8']
        result = get_best_parsable_locale(self.module, preferences)
        self.assertEqual(result, 'en_US.utf8')

    def test_get_best_parsable_locale_no_preferences_match(self):
        preferences = ['fr_FR.utf8', 'de_DE.utf8']
        result = get_best_parsable_locale(self.module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_no_locale_tool(self):
        self.module.get_bin_path.return_value = None
        result = get_best_parsable_locale(self.module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_no_output_from_locale(self):
        self.module.run_command.return_value = (0, "", "error")
        result = get_best_parsable_locale(self.module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_unable_to_get_locale_info(self):
        self.module.run_command.return_value = (1, "", "error")
        result = get_best_parsable_locale(self.module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_raise_on_locale(self):
        self.module.run_command.return_value = (1, "", "error")
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(self.module, raise_on_locale=True)

if __name__ == '__main__':
    unittest.main()