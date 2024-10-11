import unittest
from ansible.parsing.utils.jsonify import jsonify


class TestJsonify(unittest.TestCase):
    def test_jsonify_none(self):
        result = jsonify(None)
        self.assertEqual(result, "{}")

    def test_jsonify_dict(self):
        result = jsonify({"a": 1, "b": 2})
        self.assertEqual(result, '{"a": 1, "b": 2}')

    def test_jsonify_list(self):
        result = jsonify([1, 2, 3])
        self.assertEqual(result, '[1, 2, 3]')

    def test_jsonify_format(self):
        result = jsonify({"a": 1, "b": 2}, format=True)
        self.assertEqual(result, '{\n    "a": 1,\n    "b": 2\n}')

    def test_jsonify_unicode(self):
        result = jsonify({"a": "é"})
        self.assertEqual(result, '{"a": "\\u00e9"}')

class TestJsonify(unittest.TestCase):
    def test_jsonify_none(self):
        result = jsonify(None)
        self.assertEqual(result, "{}")

    def test_jsonify_dict(self):
        result = jsonify({"a": 1, "b": 2})
        self.assertEqual(result, '{"a": 1, "b": 2}')

    def test_jsonify_list(self):
        result = jsonify([1, 2, 3])
        self.assertEqual(result, '[1, 2, 3]')

    def test_jsonify_format(self):
        result = jsonify({"a": 1, "b": 2}, format=True)
        self.assertEqual(result, '{\n    "a": 1,\n    "b": 2\n}')

    def test_jsonify_unicode(self):
        result = jsonify({"a": "é"})
        self.assertEqual(result, '{"a": "\\u00e9"}')

    def test_jsonify_bytes(self):
        result = jsonify(b"abc")
        self.assertEqual(result, '"YWJj"')

if __name__ == '__main__':
    unittest.main()