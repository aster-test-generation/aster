import unittest
from ansible.parsing.utils import jsonify


class TestJsonify(unittest.TestCase):
    def test_jsonify(self):
        result = jsonify({})
        self.assertEqual(result, "{}")

    def test_jsonify_format(self):
        result = jsonify(None, indent=4)
        self.assertEqual(result, "{}")

    def test_jsonify_format_indent(self):
        result = jsonify({}, format=True)
        self.assertEqual(result, "{}")

    def test_jsonify_format_indent_sort_keys(self):
        result = jsonify(None, indent=4)
        self.assertEqual(result, "{}")

    def test_jsonify_format_indent_sort_keys_ensure_ascii(self):
        result = jsonify(None, format=True)
        self.assertEqual(result, "{}")

    def test_jsonify_format_indent_sort_keys_ensure_ascii_unicode_decode_error(self):
        result = jsonify(None)
        self.assertEqual(result, "{}")

if __name__ == '__main__':
    unittest.main()