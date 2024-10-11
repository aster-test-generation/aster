import unittest
from ansible.module_utils.common.parameters import _remove_values_conditions, _set_defaults
from datetime import datetime


class TestParameters(unittest.TestCase):
    def test_remove_values_conditions_text(self):
        result = _remove_values_conditions("hello", [], [])
        self.assertEqual(result, "hello")

    def test_remove_values_conditions_binary(self):
        result = _remove_values_conditions(b"hello", [], [])
        self.assertEqual(result, "hello")

    def test_remove_values_conditions_sequence(self):
        seq = [1, 2, 3]
        result = _remove_values_conditions(seq, [], [])
        self.assertEqual(result, [1, 2, 3])

    def test_remove_values_conditions_set(self):
        s = {1, 2, 3}
        result = _remove_values_conditions(s, [], [])
        self.assertEqual(result, {1, 2, 3})

    def test_remove_values_conditions_mapping(self):
        m = {"a": 1, "b": 2}
        result = _remove_values_conditions(m, [], [])
        self.assertEqual(result, {"a": 1, "b": 2})

    def test_remove_values_conditions_integer(self):
        result = _remove_values_conditions(1, [], [])
        self.assertEqual(result, "1")

    def test_remove_values_conditions_float(self):
        result = _remove_values_conditions(1.2, [], [])
        self.assertEqual(result, "1.2")

    def test_remove_values_conditions_bool(self):
        result = _remove_values_conditions(True, [], [])
        self.assertEqual(result, "True")

    def test_remove_values_conditions_none(self):
        result = _remove_values_conditions(None, [], [])
        self.assertEqual(result, "None")

    def test_remove_values_conditions_datetime(self):
        dt = datetime(2022, 1, 1)
        result = _remove_values_conditions(dt, [], [])
        self.assertEqual(result, "2022-01-01T00:00:00")

    def test_set_defaults(self):
        argument_spec = {"a": {"default": "hello"}, "b": {"default": None}}
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(parameters, {"a": "hello", "b": None})
        self.assertEqual(no_log_values, set())

    def test_set_defaults_no_log(self):
        argument_spec = {"a": {"default": "hello", "no_log": True}, "b": {"default": None}}
        parameters = {}
        no_log_values = _set_defaults(argument_spec, parameters)
        self.assertEqual(parameters, {"a": "hello", "b": None})
        self.assertEqual(no_log_values, {"hello"})

if __name__ == '__main__':
    unittest.main()