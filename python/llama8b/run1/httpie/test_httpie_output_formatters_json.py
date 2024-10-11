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

    def test_format_body_json_explicit(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_json_sort_keys(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'application/json'
        formatter.format_options['json']['sort_keys'] = True
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_json_indent(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'application/json'
        formatter.format_options['json']['indent'] = 4
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '    {"key": "value"}')

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

    def test_format_body_no_explicit_json(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

if __name__ == '__main__':
    unittest.main()