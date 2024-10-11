import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestGetBestparsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        module = object()
        module.get_bin_path = lambda x: '/path/to/locale'
        result = get_best_parsable_locale(module)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_preferences(self):
        module = object()
        module.get_bin_path = lambda x: '/path/to/locale'
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences=preferences)
        self.assertEqual(result, 'C.utf8')

    def test_get_best_parsable_locale_preferences_not_found(self):
        module = object()
        module.get_bin_path = lambda x: '/path/to/locale'
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        available = ['en_US.utf8', 'C']
        module.run_command = lambda x: (0, 'en_US.utf8\nC\n', '')
        result = get_best_parsable_locale(module, preferences=preferences)
        self.assertEqual(result, 'en_US.utf8')

    def test_get_best_parsable_locale_preferences_not_found_raise_on_locale(self):
        module = object()
        module.get_bin_path = lambda x: '/path/to/locale'
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        available = ['en_US.utf8', 'C']
        module.run_command = lambda x: (1, 'en_US.utf8\nC\n', '')
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(module, preferences=preferences, raise_on_locale=True)

    def test_get_best_parsable_locale_preferences_not_found_no_raise_on_locale(self):
        module = object()
        module.get_bin_path = lambda x: '/path/to/locale'
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        available = ['en_US.utf8', 'C']
        module.run_command = lambda x: (1, 'en_US.utf8\nC\n', '')
        result = get_best_parsable_locale(module, preferences=preferences, raise_on_locale=False)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_locale_not_found(self):
        module = object()
        module.get_bin_path = lambda x: None
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(module)

class TestGetBestparsableLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        module = object()  # Mocking AnsibleModule instance
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_preferences(self):
        module = object()  # Mocking AnsibleModule instance
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_available_locales(self):
        module = object()  # Mocking AnsibleModule instance
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        available = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        module.run_command = lambda x: (0, '\n'.join(available), '')
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C.utf8')

    def test_get_best_parsable_locale_available_locales_not_found(self):
        module = object()  # Mocking AnsibleModule instance
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        available = []
        module.run_command = lambda x: (0, '\n'.join(available), '')
        result = get_best_parsable_locale(module, preferences)
        self.assertEqual(result, 'C')

    def test_get_best_parsable_locale_runtime_warning(self):
        module = object()  # Mocking AnsibleModule instance
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        module.run_command = lambda x: (1, '', 'Error')
        with self.assertRaises(RuntimeWarning):
            get_best_parsable_locale(module, preferences)

    def test_get_best_parsable_locale_runtime_warning_raise_on_locale(self):
        module = object()  # Mocking AnsibleModule instance
        preferences = ['C.utf8', 'en_US.utf8', 'C', 'POSIX']
        module.run_command = lambda x: (1, '', 'Error')
        with self.assertRaises(Exception):
            get_best_parsable_locale(module, preferences, raise_on_locale=True)

if __name__ == '__main__':
    unittest.main()