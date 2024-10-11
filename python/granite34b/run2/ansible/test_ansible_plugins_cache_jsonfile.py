from ansible.plugins.cache.jsonfile import AnsibleJSONEncoder
import unittest
from ansible.plugins.cache.jsonfile import CacheModule


class TestCacheModule(unittest.TestCase):
    def test_load_method(self):
        filepath = "path/to/file.json"
        expected_result = {"key": "value"}
        with unittest.mock.patch("ansible.plugins.cache.jsonfile.json.load") as mock_load:
            mock_load.return_value = expected_result
            cache_module = CacheModule()
            result = cache_module._load(filepath)
            self.assertEqual(result, expected_result)

    def test_dump_method(self):
        value = {"key": "value"}
        filepath = "path/to/file.json"
        expected_result = '{"key": "value"}'
        with unittest.mock.patch("ansible.plugins.cache.jsonfile.json.dumps") as mock_dumps:
            mock_dumps.return_value = expected_result
            cache_module = CacheModule()
            cache_module._dump(value, filepath)
            mock_dumps.assert_called_once_with(value, cls=AnsibleJSONEncoder, sort_keys=True, indent=4)

if __name__ == '__main__':
    unittest.main()