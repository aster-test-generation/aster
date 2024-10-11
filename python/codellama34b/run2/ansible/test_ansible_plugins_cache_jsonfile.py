import unittest
from ansible.plugins.cache.base import *


class TestCacheModule(unittest.TestCase):
    def test_load(self):
        instance = CacheModule()
        result = instance._load("test.json")
        self.assertEqual(result, {})

    def test_dump(self):
        instance = CacheModule()
        result = instance._dump({"test": "test"}, "test.json")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()