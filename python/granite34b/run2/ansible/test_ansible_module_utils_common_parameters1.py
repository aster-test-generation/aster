import unittest
from ansible.module_utils.common.parameters import _sanitize_keys_conditions

class TestSanitizeKeysConditions(unittest.TestCase):
    def test_string(self):
        value = "example"
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, "example")

    def test_list(self):
        value = ["example1", "example2"]
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, [])

    def test_set(self):
        value = {"example1", "example2"}
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, set())

    def test_dict(self):
        value = {"example1": "value1", "example2": "value2"}
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, {})

    def test_integer(self):
        value = 123
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, 123)

    def test_datetime(self):
        value = datetime.datetime.now()
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, value)

if __name__ == '__main__':
    unittest.main()