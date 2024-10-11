import unittest
from ansible.module_utils.facts.collector import *


class TestBaseFactCollector(unittest.TestCase):
    def test_init(self):
        instance = BaseFactCollector(name='test')
        self.assertEqual(instance.collectors, [])
        self.assertEqual(instance.namespace, None)
        self.assertEqual(instance.fact_ids, set(["BaseFactCollector"]))

    def test_platform_match(self):
        result = BaseFactCollector.platform_match(None)
        self.assertEqual(result, None)

    def test_transform_name(self):
        instance = BaseFactCollector(name='test')
        result = instance._transform_name("key_name")
        self.assertEqual(result, "key_name")

    def test_transform_dict_keys(self):
        instance = BaseFactCollector(name='test')
        result = instance._transform_dict_keys({"old_key": "old_value"})
        self.assertEqual(result, {"old_key": "old_value"})

    def test_collect_with_namespace(self):
        instance = BaseFactCollector()
        result = instance.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect(self):
        instance = BaseFactCollector(name='test')
        result = instance.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()