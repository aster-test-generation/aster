import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}})
        self.assertTrue(formatter.enabled)

    def test_format_body(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}})
        body = '{"key": "value"}'
        mime = 'application/json'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, '{\n    "key": "value"\n}')

    def test_format_body_not_json(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}})
        body = 'not json'
        mime = 'text/plain'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, body)

    def test_format_body_explicit_json(self):
        formatter = JSONFormatter(format_options={'json': {'format': True}}, explicit_json=True)
        body = '{"key": "value"}'
        mime = 'text/plain'
        formatted_body = formatter.format_body(body, mime)
        self.assertEqual(formatted_body, '{\n    "key": "value"\n}')

if __name__ == '__main__':
    unittest.main()