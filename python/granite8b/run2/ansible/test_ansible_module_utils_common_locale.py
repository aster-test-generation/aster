import unittest
from ansible.module_utils.common.locale import get_best_parsable_locale


class TestLocale(unittest.TestCase):
    def test_get_best_parsable_locale(self):
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'en_US.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')
        self.assertEqual(get_best_parsable_locale(None, preferences=['C.utf8', 'en_US.utf8', 'C', 'POSIX']), 'C.utf8')

if __name__ == '__main__':
    unittest.main()