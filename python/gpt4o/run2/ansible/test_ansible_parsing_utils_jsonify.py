import unittest
from ansible.parsing.utils.jsonify import jsonify


class TestJsonifyFunction(unittest.TestCase):
    def test_jsonify_none(self):
        result = jsonify(None)
        self.assertEqual(result, "{}")

    def test_jsonify_empty_dict(self):
        result = jsonify({})
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
        result = jsonify({"key": "välue"})
        self.assertEqual(result, '{"key": "välue"}')

    def test_jsonify_unicode_formatted(self):
        result = jsonify({"key": "välue"}, format=True)
        self.assertEqual(result, '{\n    "key": "välue"\n}')

    def test_jsonify_unicode_decode_error(self):
        # Simulate a UnicodeDecodeError by passing a non-decodable byte sequence
        class NonDecodable:
            def __str__(self):
                raise UnicodeDecodeError("utf-8", b"", 0, 1, "reason")

        result = jsonify({"key": NonDecodable()})
        self.assertEqual(result, '{"key": "<__main__.NonDecodable object at 0x"}')

if __name__ == '__main__':
    unittest.main()