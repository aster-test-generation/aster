import unittest
from httpie.output.formatters.headers import HeadersFormatter


class TestHeadersFormatter(unittest.TestCase):
    def test_init(self):
        instance = HeadersFormatter(format_options={})
        self.assertEqual(instance.enabled, instance.format_options['headers']['sort'])

    def test_format_headers(self):
        instance = HeadersFormatter(format_options={})
        result = instance.format_headers('a: b\r\nc: d\r\n')
        self.assertEqual(result, 'a: b\r\nc: d\r\n')

if __name__ == '__main__':
    unittest.main()