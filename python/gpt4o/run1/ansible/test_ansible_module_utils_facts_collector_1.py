import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = BaseFactCollector("name")

    def test_init(self):
        self.assertIsInstance(self.collector, BaseFactCollector)
        self.assertEqual(self.collector.collectors, [])
        self.assertIsNone(self.collector.namespace)
        self.assertIn(self.collector.name, self.collector.fact_ids)

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
        class MockNamespace:
            def transform(self, key_name):
                return f"ns_{key_name}"
        
        collector = BaseFactCollector(namespace=MockNamespace())
        result = collector._transform_name("test_key")
        self.assertEqual(result, "ns_test_key")

    def test_transform_name_without_namespace(self):
        result = self.collector._transform_name("test_key")
        self.assertEqual(result, "test_key")

    def test_transform_dict_keys_with_namespace(self):
        class MockNamespace:
            def transform(self, key_name):
                return f"ns_{key_name}"
        
        collector = BaseFactCollector(namespace=MockNamespace())
        fact_dict = {"key1": "value1", "key2": "value2"}
        result = collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {"ns_key1": "value1", "ns_key2": "value2"})

    def test_transform_dict_keys_without_namespace(self):
        fact_dict = {"key1": "value1", "key2": "value2"}
        result = self.collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {"key1": "value1", "key2": "value2"})

    def test_collect_with_namespace(self):
        class MockNamespace:
            def transform(self, key_name):
                return f"ns_{key_name}"
        
        collector = BaseFactCollector(namespace=MockNamespace())
        result = collector.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect_without_namespace(self):
        result = self.collector.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

class MockNamespace:
    def transform(self, key_name):
        return f"transformed_{key_name}"

class TestBaseFactCollector(unittest.TestCase):
    def test_init(self):
        instance = BaseFactCollector(collectors=['collector1'], namespace=MockNamespace())
        self.assertEqual(instance.collectors, ['collector1'])
        self.assertIsInstance(instance.namespace, MockNamespace)
        self.assertIn(instance.name, instance.fact_ids)

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
        instance = BaseFactCollector(namespace=MockNamespace())
        result = instance._transform_name('key')
        self.assertEqual(result, 'transformed_key')

    def test_transform_name_without_namespace(self):
        instance = BaseFactCollector()
        result = instance._transform_name('key')
        self.assertEqual(result, 'key')

    def test_transform_dict_keys(self):
        instance = BaseFactCollector(namespace=MockNamespace())
        fact_dict = {'key1': 'value1', 'key2': 'value2'}
        result = instance._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'transformed_key1': 'value1', 'transformed_key2': 'value2'})

    def test_collect_with_namespace(self):
        instance = BaseFactCollector(namespace=MockNamespace())
        result = instance.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect_without_namespace(self):
        instance = BaseFactCollector()
        result = instance.collect_with_namespace()
        self.assertEqual(result, {})

    def test_collect(self):
        instance = BaseFactCollector()
        result = instance.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()