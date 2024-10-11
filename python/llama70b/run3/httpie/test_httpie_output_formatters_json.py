import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter(**{'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        self.assertTrue(formatter.enabled)

    def test_format_body_json(self):
        formatter = JSONFormatter(**{'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_format_body_non_json(self):
        formatter = JSONFormatter(**{'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        body = 'not json'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, 'not json')

    def test_format_body_explicit_json(self):
        formatter = JSONFormatter(**{'kwargs': {'explicit_json': True}, 'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test_str_method(self):
        formatter = JSONFormatter(**{'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        result = formatter.__str__()
        self.assertEqual(result, 'JSONFormatter')

    def test_repr_method(self):
        formatter = JSONFormatter(**{'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        result = formatter.__repr__()
        self.assertEqual(result, 'JSONFormatter()')

if __name__ == '__main__':
    unittest.main()