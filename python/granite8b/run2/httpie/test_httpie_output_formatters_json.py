import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_format_body(self):
        formatter = JSONFormatter(explicit_json=True, format_options=FormatOptions(indent=2))
        body = '{"key": "value"}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, body)

    def test_format_body_invalid_json(self):
        formatter = JSONFormatter(explicit_json=True, format_options=FormatOptions(indent=2))
        body = '{"key": "value}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, body)

    def test_format_body_sort_keys(self):
        formatter = JSONFormatter(explicit_json=True, sort_keys=True, format_options=0)
        body = '{"b": 2, "a": 1}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, '{"a": 1, "b": 2}')

    def test_format_body_indent(self):
        formatter = JSONFormatter(explicit_json=True, indent=4, format_options=0)
        body = '{"key": "value"}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, '{\n    "key": "value"\n}')

class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}})
        self.assertTrue(formatter.enabled)

    def test_format_body_json(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}})
        body = '{"name": "John", "age": 30, "city": "New York"}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        expected_body = '{\n    "age": 30,\n    "city": "New York",\n    "name": "John"\n}'
        self.assertEqual(formatted_body, expected_body)

    def test_format_body_non_json(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}})
        body = '<html><body><h1>Hello, World!</h1></body></html>'
        mime = 'text/html'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, body)

    def test_format_body_explicit_json(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}}, explicit_json=True)
        body = '{"name": "John", "age": 30, "city": "New York"}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        expected_body = '{\n    "age": 30,\n    "city": "New York",\n    "name": "John"\n}'
        self.assertEqual(formatted_body, expected_body)

    def test_format_body_explicit_non_json(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}}, explicit_json=True)
        body = '<html><body><h1>Hello, World!</h1></body></html>'
        mime = 'text/html'
        formatted_body = formatter.format_body(body, mime)
        expected_body = '<html><body><h1>Hello, World!</h1></body></html>'
        self.assertEqual(formatted_body, expected_body)

if __name__ == '__main__':
    unittest.main()