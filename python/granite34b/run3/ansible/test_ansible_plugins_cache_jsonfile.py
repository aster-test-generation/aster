import unittest
from ansible.plugins.cache.jsonfile import CacheModule


class TestCacheModule(unittest.TestCase):
    def test_load(self):
        filepath = "path/to/file.json"
        expected_result = {"key": "value"}
        with open(filepath, "x") as f:
            json.dump(expected_result, f)
        cache_module = CacheModule()
        result = cache_module._load(filepath)
        self.assertEqual(result, expected_result)

    def test_dump(self):
        value = {"key": "value"}
        filepath = "path/to/file.json"
        cache_module = CacheModule()
        cache_module._dump(value, filepath)
        with open(filepath, "r") as f:
            result = json.load(f)
        self.assertEqual(result, value)

    def test_protected_method(self):
        cache_module = CacheModule()
        result = cache_module._protected_method(1)
        self.assertEqual(result, 2)

    def test_private_method(self):
        cache_module = CacheModule()
        result = cache_module.__private_method(2)
        self.assertEqual(result, 4)

    def test_str_method(self):
        cache_module = CacheModule()
        result = cache_module.__str__()
        self.assertEqual(result, "CacheModule")

    def test_repr_method(self):
        cache_module = CacheModule(connection='jsonfile')
        result = cache_module.__repr__()
        self.assertEqual(result, "CacheModule(1)")

    def test_eq_method(self):
        cache_module1 = CacheModule(connection='jsonfile')
        cache_module2 = CacheModule()
        self.assertEqual(cache_module1, cache_module2)

if __name__ == '__main__':
    unittest.main()