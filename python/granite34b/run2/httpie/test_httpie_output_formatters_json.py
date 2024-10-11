import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter(format_options=0)
        self.assertFalse(formatter.enabled)

    def test_format_body(self):
        formatter = JSONFormatter(format_options=0)
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, body)

if __name__ == '__main__':
    unittest.main()