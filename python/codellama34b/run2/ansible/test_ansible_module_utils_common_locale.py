import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestParsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        result = get_best_parsable_locale(None)
        self.assertEqual(result, 'C')

if __name__ == '__main__':
    unittest.main()