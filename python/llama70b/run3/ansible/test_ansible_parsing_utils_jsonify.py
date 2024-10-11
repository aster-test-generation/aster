import unittest
from ansible.parsing.utils import jsonify


class TestJsonifyFunction(unittest.TestCase):
    def test_jsonify_none(self):
        result = jsonify(None)
        self.assertEqual(result, "{}")

    def test_jsonify_format_false(self):
        result = jsonify({"key": "value"}, format=False)
        self.assertEqual(result, '{"key": "value"}')

    def test_jsonify_format_true(self):
        result = jsonify({"key": "value"}, format=True)
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_jsonify_unicode_decode_error(self):
        result = jsonify({"key": "value".encode("utf-16")}, format=True)
        self.assertEqual(result, '{"key": "value"}')

if __name__ == '__main__':
    unittest.main()