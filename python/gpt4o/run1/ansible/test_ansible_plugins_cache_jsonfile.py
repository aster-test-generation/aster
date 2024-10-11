import unittest
import json
import codecs
from unittest.mock import mock_open, patch
from ansible.plugins.cache.jsonfile import CacheModule
from ansible.parsing.ajson import AnsibleJSONEncoder, AnsibleJSONDecoder


class TestCacheModule(unittest.TestCase):
    def setUp(self):
        self.cache_module = CacheModule(fact_caching_connection='/path/to/writeable/directory')

    @patch('codecs.open', new_callable=mock_open, read_data='{"key": "value"}')
    def test_load(self, mock_file):
        filepath = 'test.json'
        result = self.cache_module._load(filepath)
        self.assertEqual(result, {"key": "value"})
        mock_file.assert_called_once_with(filepath, 'r', encoding='utf-8')

    @patch('codecs.open', new_callable=mock_open)
    def test_dump(self, mock_file):
        filepath = 'test.json'
        value = {"key": "value"}
        self.cache_module._dump(value, filepath)
        mock_file.assert_called_once_with(filepath, 'w', encoding='utf-8')
        mock_file().write.assert_called_once_with(json.dumps(value, cls=AnsibleJSONEncoder, sort_keys=True, indent=4))

if __name__ == '__main__':
    unittest.main()