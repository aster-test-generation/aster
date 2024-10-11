import unittest
from ansible.plugins.cache.base import CacheBase


class TestCacheModule(unittest.TestCase):
    def test_load(self):
        instance = CacheModule()
        result = instance._load("test_file.json")
        self.assertEqual(result, "test_file.json")

    def test_dump(self):
        instance = CacheModule()
        result = instance._dump("test_file.json", "test_file.json")
        self.assertEqual(result, "test_file.json")

if __name__ == '__main__':
    unittest.main()