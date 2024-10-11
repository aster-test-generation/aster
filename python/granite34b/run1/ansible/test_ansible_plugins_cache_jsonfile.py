import unittest
from ansible.plugins.cache.jsonfile import CacheModule


class TestCacheModule(unittest.TestCase):
    def setUp(self):
        self.cache = CacheModule(connection='jsonfile')

    def test_load_method(self):
        filepath = 'path/to/file.json'
        data = {'key': 'value'}
        with open(filepath, 'w') as f:
            json.dump(data, f)
        result = self.cache._load(filepath)
        self.assertEqual(result, data)

    def test_dump_method(self):
        value = {'key': 'value'}
        filepath = 'path/to/file.json'
        self.cache._dump(value, filepath)
        with open(filepath, 'r') as f:
            result = json.load(f)
        self.assertEqual(result, value)

    def test_protected_method(self):
        value = {'key': 'value'}
        filepath = 'path/to/file.json'
        self.cache._CacheModule__protected_method(value, filepath)
        with open(filepath, 'r') as f:
            result = json.load(f)
        self.assertEqual(result, value)

    def test_private_method(self):
        value = {'key': 'value'}
        filepath = 'path/to/file.json'
        self.cache._CacheModule__private_method(value, filepath)
        with open(filepath, 'r') as f:
            result = json.load(f)
        self.assertEqual(result, value)

    def test_str_method(self):
        result = self.cache.__str__()
        self.assertEqual(result, 'CacheModule')

    def test_repr_method(self):
        result = self.cache.__repr__()
        self.assertEqual(result, 'CacheModule()')

    def test_eq_method(self):
        other = CacheModule()
        result = self.cache.__eq__(other)
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()