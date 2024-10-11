import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale_with_preferences(self):
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale("en_US", preferences)
        self.assertIn(result, preferences)

    def test_get_best_parsable_locale_without_preferences(self):
        result = get_best_parsable_locale('en_US.UTF-8')
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_empty_preferences(self):
        preferences = []
        result = get_best_parsable_locale(None, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_invalid_preferences(self):
        preferences = ['invalid_locale']
        result = get_best_parsable_locale(None, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_no_locale_tool(self):
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        with self.assertRaises(RuntimeWarning):
            self.assertIsNone(get_best_parsable_locale(None, preferences, raise_on_locale=True))

if __name__ == '__main__':
    unittest.main()