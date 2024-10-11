import unittest
from ansible.module_utils.facts.collector import BaseFactCollector

class MockNamespace:
    def transform(self, key_name):
        return f"transformed_{key_name}"

class TestBaseFactCollector(unittest.TestCase):
    def test_init_with_collectors_and_namespace(self):
        namespace = MockNamespace()
        collector = BaseFactCollector(collectors=['collector1'], namespace=namespace)
        self.assertEqual(collector.collectors, ['collector1'])
        self.assertEqual(collector.namespace, namespace)
        self.assertIn('BaseFactCollector', collector.fact_ids)

    def test_init_without_collectors_and_namespace(self):
        collector = BaseFactCollector()
        self.assertEqual(collector.collectors, [])
        self.assertIsNone(collector.namespace)
        self.assertIn('BaseFactCollector', collector.fact_ids)

    def test_platform_match(self):
        class TestCollector(BaseFactCollector):
            _platform = 'Linux'
        
        platform_info = {'system': 'Linux'}
        result = TestCollector.platform_match(platform_info)
        self.assertEqual(result, TestCollector)

        platform_info = {'system': 'Windows'}
        result = TestCollector.platform_match(platform_info)
        self.assertIsNone(result)

    def test_transform_name_with_namespace(self):
        namespace = MockNamespace()
        collector = BaseFactCollector(namespace=namespace)
        result = collector._transform_name('key')
        self.assertEqual(result, 'transformed_key')

    def test_transform_name_without_namespace(self):
        collector = BaseFactCollector()
        result = collector._transform_name('key')
        self.assertEqual(result, 'key')

    def test_transform_dict_keys_with_namespace(self):
        namespace = MockNamespace()
        collector = BaseFactCollector(namespace=namespace)
        fact_dict = {'key1': 'value1', 'key2': 'value2'}
        result = collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'transformed_key1': 'value1', 'transformed_key2': 'value2'})

    def test_transform_dict_keys_without_namespace(self):
        collector = BaseFactCollector()
        fact_dict = {'key1': 'value1', 'key2': 'value2'}
        result = collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_collect_with_namespace(self):
        namespace = MockNamespace()
        collector = BaseFactCollector(namespace=namespace)
        result = collector.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect_without_namespace(self):
        collector = BaseFactCollector()
        result = collector.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect(self):
        collector = BaseFactCollector()
        result = collector.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()