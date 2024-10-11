import unittest
from httpie.output.formatters.json import JSONFormatter


class TestJSONFormatter(unittest.TestCase):
    def test_init(self):
        instance = JSONFormatter(format_options=None)
        self.assertEqual(instance.enabled, instance.format_options['json']['format'])

    def test_format_body(self):
        instance = JSONFormatter(format_options={})
        result = instance.format_body('body', 'mime')
        self.assertEqual(result, 'body')

if __name__ == '__main__':
    unittest.main()