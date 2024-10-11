import unittest
from unittest.mock import patch
from ansible.plugins.cache.yamlfile import CacheModul


class TestCacheModule(unittest.TestCase):
    def test_init(self):
        cache_module = CacheModule()
        self.assertEqual(cache_module._uri, None)
        self.assertEqual(cache_module._prefix, None)
        self.assertEqual(cache_module._timeout, 86400)

    def test_load(self):
        cache_module = CacheModule()
        filepath = 'test.json'
        with patch('codecs.open') as mock_open:
            cache_module._load(filepath)
            mock_open.assert_called_once_with(filepath, 'r', encoding='utf-8')

    def test_dump(self):
        cache_module = CacheModule()
        value = {'key': 'value'}
        filepath = 'test.json'
        with patch('codecs.open') as mock_open:
            cache_module._dump(value, filepath)
            mock_open.assert_called_once_with(filepath, 'w', encoding='utf-8')

    def test_str(self):
        cache_module = CacheModule()
        self.assertEqual(str(cache_module), 'CacheModule')

    def test_repr(self):
        cache_module = CacheModule()
        self.assertEqual(repr(cache_module), 'CacheModule()')

    def test_eq(self):
        cache_module1 = CacheModule()
        cache_module2 = CacheModule()
        self.assertEqual(cache_module1, cache_module2)

    def test_ne(self):
        cache_module1 = CacheModule()
        cache_module2 = object()
        self.assertNotEqual(cache_module1, cache_module2)

if __name__ == '__main__':
    unittest.main()