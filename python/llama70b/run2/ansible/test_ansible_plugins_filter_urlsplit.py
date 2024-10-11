from ansible.module_utils._text import to_text
import unittest
from ansible.plugins.filter.urlsplit import FilterModule, split_url


class TestFilterModule(unittest.TestCase):
    def test_init(self):
        instance = FilterModule()
        self.assertIsInstance(instance, FilterModule)

    def test_filters(self):
        instance = FilterModule()
        result = instance.filters()
        self.assertIsInstance(result, dict)
        self.assertIn('urlsplit', result)

    def test_str_method(self):
        instance = FilterModule()
        result = instance.__str__()
        self.assertEqual(result, 'URI filter')

    def test_repr_method(self):
        instance = FilterModule()
        result = instance.__repr__()
        self.assertEqual(result, 'FilterModule()')

    def test_eq_method(self):
        instance1 = FilterModule()
        instance2 = FilterModule()
        self.assertTrue(instance1 == instance2)

class TestSplitUrlFunction(unittest.TestCase):
    def test_split_url(self):
        result = split_url('https://example.com/path?a=1&b=2')
        self.assertIsInstance(result, dict)
        self.assertIn('scheme', result)
        self.assertIn('netloc', result)
        self.assertIn('path', result)
        self.assertIn('query', result)
        self.assertIn('fragment', result)

    def test_split_url_query(self):
        result = split_url('https://example.com/path?a=1&b=2', query='a')
        self.assertEqual(result, '1')

    def test_split_url_unknown_query(self):
        with self.assertRaises(AnsibleFilterError):
            split_url('https://example.com/path?a=1&b=2', query='unknown')

if __name__ == '__main__':
    unittest.main()