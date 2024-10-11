import unittest
from ansible.module_utils.common.parameters import *



class TestSanitizeKeys(unittest.TestCase):
    def test_sanitize_keys(self):
        obj = None
        no_log_strings = None
        ignore_keys = None
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_1(self):
        obj = None
        no_log_strings = None
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_2(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_3(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_4(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_5(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_6(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_7(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_8(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_9(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_10(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_11(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

    def test_sanitize_keys_12(self):
        obj = None
        no_log_strings = []
        ignore_keys = frozenset()
        result = sanitize_keys(obj, no_log_strings, ignore_keys)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()