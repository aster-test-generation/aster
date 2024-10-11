import unittest
from unittest.mock import patch
from ansible.plugins.cache.yamlfile import CacheModul


class TestCacheModule(unittest.TestCase):
    def setUp(self):
        self.cache_module = CacheModule()

    def test_init(self):
        self.assertEqual(self.cache_module._uri, '')
        self.assertEqual(self.cache_module._prefix, '')
        self.assertEqual(self.cache_module._timeout, 86400)

    def test_load(self):
        with patch('codecs.open') as mock_open:
            self.cache_module._load('test_file')
            mock_open.assert_called_once_with('test_file', 'r', encoding='utf-8')

    def test_dump(self):
        with patch('codecs.open') as mock_open:
            self.cache_module._dump({}, 'test_file')
            mock_open.assert_called_once_with('test_file', 'w', encoding='utf-8')

    def test_load_with_data(self):
        data = {'key': 'value'}
        with patch('codecs.open') as mock_open:
            mock_open.return_value.read.return_value = json.dumps(data)
            result = self.cache_module._load('test_file')
            self.assertEqual(result, data)

    def test_dump_with_data(self):
        data = {'key': 'value'}
        with patch('codecs.open') as mock_open:
            self.cache_module._dump(data, 'test_file')
            mock_open.return_value.write.assert_called_once_with(json.dumps(data, cls=AnsibleJSONEncoder, sort_keys=True, indent=4))

    def test_str(self):
        self.assertEqual(str(self.cache_module), 'CacheModule')

    def test_repr(self):
        self.assertEqual(repr(self.cache_module), 'CacheModule()')

    def test_eq(self):
        other = CacheModule()
        self.assertEqual(self.cache_module, other)

    def test_ne(self):
        other = object()
        self.assertNotEqual(self.cache_module, other)

if __name__ == '__main__':
    unittest.main()