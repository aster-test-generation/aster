import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = BaseFactCollector("name")

    def test_init(self):
        collector = BaseFactCollector(collectors=['collector1'], namespace='namespace1')
        self.assertEqual(collector.collectors, ['collector1'])
        self.assertEqual(collector.namespace, 'namespace1')

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
        class Namespace:
            def transform(self, key_name):
                return f"ns_{key_name}"
        
        collector = BaseFactCollector(namespace=Namespace())
        result = collector._transform_name('key')
        self.assertEqual(result, 'ns_key')

    def test_transform_name_without_namespace(self):
        result = self.collector._transform_name('key')
        self.assertEqual(result, 'key')

    def test_transform_dict_keys_with_namespace(self):
        class Namespace:
            def transform(self, key_name):
                return f"ns_{key_name}"
        
        collector = BaseFactCollector(namespace=Namespace())
        fact_dict = {'key1': 'value1', 'key2': 'value2'}
        result = collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'ns_key1': 'value1', 'ns_key2': 'value2'})

    def test_transform_dict_keys_without_namespace(self):
        fact_dict = {'key1': 'value1', 'key2': 'value2'}
        result = self.collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_collect_with_namespace(self):
        class Namespace:
            def transform(self, key_name):
                return f"ns_{key_name}"
        
        class TestCollector(BaseFactCollector):
            def collect(self, module=None, collected_facts=None):
                return {'key1': 'value1', 'key2': 'value2'}
        
        collector = TestCollector(namespace=Namespace())
        result = collector.collect_with_namespace()
        self.assertEqual(result, {'ns_key1': 'value1', 'ns_key2': 'value2'})

    def test_collect_without_namespace(self):
        class TestCollector(BaseFactCollector):
            def collect(self, module=None, collected_facts=None):
                return {'key1': 'value1', 'key2': 'value2'}
        
        collector = TestCollector()
        result = collector.collect_with_namespace()
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_collect(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()