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

    def test_private_method(self):
        cache = CacheModule()
        filepath = 'test.json'
        with open(filepath, 'w') as f:
            f.write('{"key": "value"}')
        result = cache._CacheModule__load(filepath)
        self.assertEqual(result, {'key': 'value'})

    def test_protected_method(self):
        cache = CacheModule()
        filepath = 'test.json'
        value = {'key': 'value'}
        cache._CacheModule__dump(value, filepath)
        with open(filepath, 'r') as f:
            result = json.load(f)
        self.assertEqual(result, value)

    def test_magic_methods(self):
        cache = CacheModule()
        self.assertEqual(str(cache), 'CacheModule')
        self.assertEqual(repr(cache), 'CacheModule()')
        self.assertEqual(cache.__eq__(CacheModule()), True)

if __name__ == '__main__':
    unittest.main()