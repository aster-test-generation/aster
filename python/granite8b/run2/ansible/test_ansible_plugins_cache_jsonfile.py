import unittest
from ansible.plugins.cache import CacheModule


class TestCacheModule(unittest.TestCase):
    def test_load(self):
        cache = CacheModule()
        filepath = 'test.json'
        with open(filepath, 'w') as f:
            f.write('{"key": "value"}')
        result = cache._load(filepath)
        self.assertEqual(result, {'key': 'value'})

    def test_dump(self):
        cache = CacheModule()
        filepath = 'test.json'
        value = {'key': 'value'}
        cache._dump(value, filepath)
        with open(filepath, 'r') as f:
            result = json.load(f)
        self.assertEqual(result, value)

    def test_get(self):
        cache = CacheModule()
        cache.set('key', 'value')
        result = cache.get('key')
        self.assertEqual(result, 'value')

    def test_set(self):
        cache = CacheModule()
        cache.set('key', 'value')
        result = cache._load(cache._get_filepath('key'))
        self.assertEqual(result, 'value')

    def test_delete(self):
        cache = CacheModule()
        cache.set('key', 'value')
        cache.delete('key')
        result = cache._load(cache._get_filepath('key'))
        self.assertEqual(result, None)

    def test_has(self):
        cache = CacheModule()
        cache.set('key', 'value')
        result = cache.has('key')
        self.assertTrue(result)

    def test_flush(self):
        cache = CacheModule()
        cache.set('key1', 'value1')
        cache.set('key2', 'value2')
        cache.flush()
        result = cache._load(cache._get_filepath('key1'))
        self.assertEqual(result, None)
        result = cache._load(cache._get_filepath('key2'))
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()