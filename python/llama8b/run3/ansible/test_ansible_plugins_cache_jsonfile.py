import unittest
from ansible.plugins.cache.yamlfile import CacheModul


class TestCacheModule(unittest.TestCase):
    def test_init(self):
        instance = CacheModule()
        self.assertEqual(instance._uri, None)
        self.assertEqual(instance._prefix, None)
        self.assertEqual(instance._timeout, 86400)

    def test_load(self):
        instance = CacheModule()
        filepath = 'test.json'
        with open(filepath, 'w') as f:
            f.write('{"key": "value"}')
        result = instance._load(filepath)
        self.assertEqual(result, {'key': 'value'})
        os.remove(filepath)

    def test_dump(self):
        instance = CacheModule()
        filepath = 'test.json'
        value = {'key': 'value'}
        instance._dump(value, filepath)
        with open(filepath, 'r') as f:
            self.assertEqual(f.read(), json.dumps(value, cls=AnsibleJSONEncoder, sort_keys=True, indent=4))
        os.remove(filepath)

    def test_str_method(self):
        instance = CacheModule()
        result = str(instance)
        self.assertEqual(result, '<ansible.plugins.cache.jsonfile.CacheModule object at 0x...>')

    def test_repr_method(self):
        instance = CacheModule()
        result = repr(instance)
        self.assertEqual(result, '<ansible.plugins.cache.jsonfile.CacheModule object at 0x...>')

    def test_eq_method(self):
        instance1 = CacheModule()
        instance2 = CacheModule()
        self.assertEqual(instance1, instance2)

    def test_load_timeout(self):
        instance = CacheModule()
        filepath = 'test.json'
        with open(filepath, 'w') as f:
            f.write('{"key": "value"}')
        instance._timeout = 1
        result = instance._load(filepath)
        self.assertEqual(result, {'key': 'value'})
        os.remove(filepath)

    def test_dump_timeout(self):
        instance = CacheModule()
        filepath = 'test.json'
        value = {'key': 'value'}
        instance._dump(value, filepath)
        with open(filepath, 'r') as f:
            self.assertEqual(f.read(), json.dumps(value, cls=AnsibleJSONEncoder, sort_keys=True, indent=4))
        os.remove(filepath)

if __name__ == '__main__':
    unittest.main()