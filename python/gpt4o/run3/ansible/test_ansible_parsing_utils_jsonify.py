import unittest
from ansible.parsing.utils.jsonify import jsonify


class TestJsonifyFunction(unittest.TestCase):
    def test_jsonify_none(self):
        result = jsonify(None)
        self.assertEqual(result, "{}")

    def test_jsonify_dict_unformatted(self):
        result = jsonify({"key": "value"})
        self.assertEqual(result, '{"key": "value"}')

    def test_jsonify_dict_formatted(self):
        result = jsonify({"key": "value"}, format=True)
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_jsonify_list_unformatted(self):
        result = jsonify([1, 2, 3])
        self.assertEqual(result, '[1, 2, 3]')

    def test_jsonify_list_formatted(self):
        result = jsonify([1, 2, 3], format=True)
        self.assertEqual(result, '[\n    1,\n    2,\n    3\n]')

    def test_jsonify_unicode(self):
        result = jsonify({"key": "value", "unicode": "üñîçødë"})
        self.assertEqual(result, '{"key": "value", "unicode": "üñîçødë"}')

    def test_jsonify_unicode_formatted(self):
        result = jsonify({"key": "value", "unicode": "üñîçødë"}, format=True)
        self.assertEqual(result, '{\n    "key": "value",\n    "unicode": "üñîçødë"\n}')

    def test_jsonify_unicode_decode_error(self):
        # Simulate a UnicodeDecodeError by passing a bytes object that cannot be decoded
        result = jsonify({"key": b'\x80abc'})
        self.assertEqual(result, '{"key": "b\'\\\\x80abc\'"}')

if __name__ == '__main__':
    unittest.main()