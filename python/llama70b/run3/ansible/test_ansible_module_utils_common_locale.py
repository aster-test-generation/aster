import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale_default(self):
        result = get_best_parsable_locale(None)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_preferences(self):
        result = get_best_parsable_locale(None, preferences=['en_US.utf8', 'C.utf8'])
        self.assertEqual(result, 'en_US.utf8')

    def test_get_best_parsable_locale_raise_on_locale(self):
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(None, raise_on_locale=True)

    def test_get_best_parsable_locale_no_locale_tool(self):
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(None, module=lambda: {'get_bin_path': lambda x: None})

    def test_get_best_parsable_locale_no_output(self):
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(None, module=lambda: {'get_bin_path': lambda x: 'locale', 'run_command': lambda x: (1, '', 'error')})

    def test_get_best_parsable_locale_available_locales(self):
        result = get_best_parsable_locale(None, module=lambda: {'get_bin_path': lambda x: 'locale', 'run_command': lambda x: (0, 'C.utf8\nen_US.utf8', '')})
        self.assertEqual(result, 'C.utf8')

if __name__ == '__main__':
    unittest.main()