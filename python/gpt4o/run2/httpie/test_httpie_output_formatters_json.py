import unittest
import json
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def setUp(self):
        self.format_options = {
            'json': {
                'format': True,
                'sort_keys': True,
                'indent': 4
            }
        }
        self.kwargs = {
            'explicit_json': False,
            'format_options': self.format_options
        }
        self.instance = JSONFormatter(**self.kwargs)

    def test_init(self):
        self.assertTrue(self.instance.enabled)

    def test_format_body_with_valid_json(self):
        body = '{"key": "value"}'
        mime = 'application/json'
        result = self.instance.format_body(body, mime)
        expected = json.dumps(
            obj=json.loads(body),
            sort_keys=self.format_options['json']['sort_keys'],
            ensure_ascii=False,
            indent=self.format_options['json']['indent']
        )
        self.assertEqual(result, expected)

    def test_format_body_with_invalid_json(self):
        body = '{"key": "value"'
        mime = 'application/json'
        result = self.instance.format_body(body, mime)
        self.assertEqual(result, body)

    def test_format_body_with_non_json_mime(self):
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = self.instance.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_with_explicit_json(self):
        self.instance.kwargs['explicit_json'] = True
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = self.instance.format_body(body, mime)
        expected = json.dumps(
            obj=json.loads(body),
            sort_keys=self.format_options['json']['sort_keys'],
            ensure_ascii=False,
            indent=self.format_options['json']['indent']
        )
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()