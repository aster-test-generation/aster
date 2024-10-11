import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestparsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_preferences(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_runtime_warning(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        with unittest.mock.patch('ansible.module_utils.common.locale.module.run_command') as run_command:
            run_command.return_value = (1, '', 'Error')
            with self.assertRaises(RuntimeWarning):
                get_best_parsable_locale(module, preferences)

    def test_get_best_parsable_locale_locale_tool_not_found(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        with unittest.mock.patch('ansible.module_utils.common.locale.module.get_bin_path') as get_bin_path:
            get_bin_path.return_value = None
            with self.assertRaises(RuntimeWarning):
                get_best_parsable_locale(module, preferences)

    def test_get_best_parsable_locale_locale_available(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        with unittest.mock.patch('ansible.module_utils.common.locale.module.run_command') as run_command:
            run_command.return_value = (0, 'C.utf8\nen_US.utf8\nC\nPOSIX', '')
            result = get_best_parsable_locale(module, preferences)
            self.assertEqual(result, 'C.utf8')

    def test_get_best_parsable_locale_locale_available_preferences(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        with unittest.mock.patch('ansible.module_utils.common.locale.module.run_command') as run_command:
            run_command.return_value = (0, 'C.utf8\nen_US.utf8\nC\nPOSIX', '')
            result = get_best_parsable_locale(module, preferences)
            self.assertEqual(result, 'C.utf8')

    def test_get_best_parsable_locale_locale_available_preferences_not_found(self):
        module = object()
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        with unittest.mock.patch('ansible.module_utils.common.locale.module.run_command') as run_command:
            run_command.return_value = (0, 'C.utf8\nen_US.utf8\nC\nPOSIX', '')
            result = get_best_parsable_locale(module, preferences)
            self.assertEqual(result, 'C.utf8')

if __name__ == '__main__':
    unittest.main()