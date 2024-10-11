import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter(format_options=0)
        self.assertFalse(formatter.enabled)

    def test_format_body(self):
        formatter = JSONFormatter(format_options=0)
        body = '{"key": "value"}'
        formatted_body = formatter.format_body(body, 'application/json')
        self.assertEqual(formatted_body, body)

if __name__ == '__main__':
    unittest.main()