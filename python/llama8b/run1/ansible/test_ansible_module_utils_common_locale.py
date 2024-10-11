import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestparsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_preferences(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences, raise_on_locale=True)
        self.assertEqual(result, 'C.utf8')

    def test_get_best_parsable_locale_with_no_preferences(self):
        module = object()
        result = get_best_parsable_locale(module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_no_locale_tool(self):
        module = object()
        module.get_bin_path = lambda x: None
        result = get_best_parsable_locale(module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_locale_tool_error(self):
        module = object()
        module.get_bin_path = lambda x: 'locale'
        module.run_command = lambda x: (1, 'error', 'error')
        result = get_best_parsable_locale(module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_locale_tool_output(self):
        module = object()
        module.get_bin_path = lambda x: 'locale'
        module.run_command = lambda x: (0, 'en_US.utf8\nC.utf8\nC\nPOSIX', '')
        result = get_best_parsable_locale(module)
        self.assertEqual(result, 'en_US.utf8')

    def test_get_best_parsable_locale_with_locale_tool_output_no_output(self):
        module = object()
        module.get_bin_path = lambda x: 'locale'
        module.run_command = lambda x: (0, '', '')
        result = get_best_parsable_locale(module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_with_locale_tool_output_no_match(self):
        module = object()
        module.get_bin_path = lambda x: 'locale'
        module.run_command = lambda x: (0, 'other_locale\nother_locale2\nother_locale3', '')
        result = get_best_parsable_locale(module, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX'])
        self.assertEqual(result, 'C')

if __name__ == '__main__':
    unittest.main()