import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def test_init(self):
        collector = BaseFactCollector()
        self.assertEqual(collector.collectors, [])
        self.assertEqual(collector.namespace, None)
        self.assertEqual(collector.fact_ids, {'BaseFactCollector'})

    def test_platform_match(self):
        collector = BaseFactCollector()
        platform_info = {'system': 'Linux'}
        self.assertEqual(BaseFactCollector.platform_match(platform_info), BaseFactCollector)

    def test_transform_name(self):
        collector = BaseFactCollector()
        key_name = 'key_name'
        self.assertEqual(collector._transform_name(key_name), key_name)

    def test_transform_dict_keys(self):
        collector = BaseFactCollector()
        fact_dict = {'key1': 'value1', 'key2': 'value2'}
        result = collector._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'key1': 'value1', 'key2': 'value2'})

    def test_collect_with_namespace(self):
        collector = BaseFactCollector()
        module = None
        collected_facts = None
        result = collector.collect_with_namespace(module, collected_facts)
        self.assertEqual(result, {})

    def test_collect(self):
        collector = BaseFactCollector()
        module = None
        collected_facts = None
        result = collector.collect(module, collected_facts)
        self.assertEqual(result, {})

    def test_str(self):
        collector = BaseFactCollector()
        self.assertEqual(str(collector), 'BaseFactCollector')

    def test_repr(self):
        collector = BaseFactCollector()
        self.assertEqual(repr(collector), 'BaseFactCollector()')

if __name__ == '__main__':
    unittest.main()