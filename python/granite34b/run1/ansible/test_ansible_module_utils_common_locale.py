import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale_with_preferences(self):
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(None, preferences=preferences)
        self.assertIn(result, preferences)

    def test_get_best_parsable_locale_without_preferences(self):
        result = get_best_parsable_locale('en_US.UTF-8')
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_raise_on_locale(self):
        with self.assertRaises(RuntimeWarning):
            self.assertEqual(add(5+10), 15)

if __name__ == '__main__':
    unittest.main()