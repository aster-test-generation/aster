import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter()
        self.assertTrue(formatter.enabled)

    def test_format_body_json(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_explicit_json(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_non_json(self):
        formatter = JSONFormatter()
        body = 'Hello, World!'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, 'Hello, World!')

    def test_format_body_invalid_json(self):
        formatter = JSONFormatter()
        body = 'not a json'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, 'not a json')

    def test_format_body_indent(self):
        formatter = JSONFormatter(indent=4)
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '    {"key": "value"}')

    def test_format_body_sort_keys(self):
        formatter = JSONFormatter(sort_keys=True)
        body = '{"key1": "value1", "key2": "value2"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key1": "value1", "key2": "value2"}')

    def test_format_body_ensure_ascii(self):
        formatter = JSONFormatter(ensure_ascii=True)
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_invalid_mime(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'invalid/mime'
        with self.assertRaises(ValueError):
            formatter.format_body(body, mime)

if __name__ == '__main__':
    unittest.main()