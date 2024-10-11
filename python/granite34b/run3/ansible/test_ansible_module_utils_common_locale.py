import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale_with_preferences(self):
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module=preferences)
        self.assertIn(result, preferences)

    def test_get_best_parsable_locale_without_preferences(self):
        result = get_best_parsable_locale(module=None)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_empty_preferences(self):
        preferences = []
        result = get_best_parsable_locale(module=preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_invalid_preferences(self):
        preferences = ['invalid_locale']
        result = get_best_parsable_locale(module=preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_raise_on_locale(self):
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(module=True, raise_on_locale=True)

if __name__ == '__main__':
    unittest.main()