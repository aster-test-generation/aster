import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        formatter = JSONFormatter()
        self.assertIsInstance(formatter, JSONFormatter)

    def test_format_body_json(self):
        formatter = JSONFormatter()
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_non_json(self):
        formatter = JSONFormatter()
        body = 'not json'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, 'not json')

    def test_format_body_explicit_json(self):
        formatter = JSONFormatter()
        formatter.kwargs['explicit_json'] = True
        body = '{"key": "value"}'
        mime = 'text/plain'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"key": "value"}')

    def test_format_body_sort_keys(self):
        formatter = JSONFormatter()
        formatter.format_options['json']['sort_keys'] = True
        body = '{"key": "value", "foo": "bar"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{"foo": "bar", "key": "value"}')

    def test_format_body_indent(self):
        formatter = JSONFormatter()
        formatter.format_options['json']['indent'] = 4
        body = '{"key": "value"}'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, '{\n    "key": "value"\n}')

    def test___init__(self):
        formatter = JSONFormatter()
        self.assertIsNotNone(formatter.enabled)

    def test___str__(self):
        formatter = JSONFormatter()
        result = str(formatter)
        self.assertEqual(result, 'JSONFormatter')

    def test___repr__(self):
        formatter = JSONFormatter()
        result = repr(formatter)
        self.assertEqual(result, 'JSONFormatter()')

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

    def test_format_body_invalid_json(self):
        formatter = JSONFormatter(**{'format_options': {'json': {'format': True, 'sort_keys': True, 'indent': 4}}})
        body = 'invalid json'
        mime = 'application/json'
        result = formatter.format_body(body, mime)
        self.assertEqual(result, 'invalid json')

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