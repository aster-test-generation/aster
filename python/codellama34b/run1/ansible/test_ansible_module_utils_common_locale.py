import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        module = None
        preferences = None
        raise_on_locale = False
        result = get_best_parsable_locale(module, preferences, raise_on_locale)
        self.assertEqual(result, 'C')

if __name__ == '__main__':
    unittest.main()