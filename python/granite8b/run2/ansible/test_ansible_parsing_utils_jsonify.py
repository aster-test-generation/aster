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
        self.assertEqual(result, "{\n    \"a\": 1,\n    \"b\": 2\n}")

if __name__ == '__main__':
    unittest.main()