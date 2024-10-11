import unittest
from ansible.module_utils.facts.collector import *


class TestBaseFactCollector(unittest.TestCase):
    def test_platform_match(self):
        platform_info = {'system': 'test'}
        result = BaseFactCollector.platform_match(platform_info)
        self.assertEqual(result, None)

    def test_init(self):
        collectors = []
        namespace = None
        instance = BaseFactCollector(collectors, namespace)
        self.assertEqual(instance.collectors, collectors)
        self.assertEqual(instance.namespace, namespace)
        self.assertEqual(instance.fact_ids, set(['BaseFactCollector']))

    def test_transform_name(self):
        instance = BaseFactCollector()
        result = instance._transform_name('test')
        self.assertEqual(result, 'test')

    def test_transform_dict_keys(self):
        instance = BaseFactCollector()
        fact_dict = {'test': 'test'}
        result = instance._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'test': 'test'})

    def test_collect_with_namespace(self):
        instance = BaseFactCollector()
        result = instance.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect(self):
        instance = BaseFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()