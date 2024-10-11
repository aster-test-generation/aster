import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def test_platform_match(self):
        class TestFactCollector(BaseFactCollector):
            _platform = 'test'
        info = {'system': 'test'}
        result = TestFactCollector.platform_match(info)
        self.assertEqual(result, TestFactCollector)

    def test_transform_name(self):
        class TestFactCollector(BaseFactCollector):
            namespace = 'test'
        instance = TestFactCollector()
        key_name = 'test_key'
        result = instance._transform_name(key_name)
        self.assertEqual(result, 'test.test_key')

    def test_transform_dict_keys(self):
        class TestFactCollector(BaseFactCollector):
            namespace = 'test'
        instance = TestFactCollector()
        fact_dict = {'test_key': 'test_value'}
        result = instance._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'test.test_key': 'test_value'})

    def test_collect_with_namespace(self):
        class TestFactCollector(BaseFactCollector):
            namespace = 'test'
        instance = TestFactCollector()
        facts_dict = instance.collect_with_namespace()
        self.assertEqual(facts_dict, {})

    def test_collect(self):
        class TestFactCollector(BaseFactCollector):
            namespace = 'test'
        instance = TestFactCollector()
        facts_dict = instance.collect()
        self.assertEqual(facts_dict, {})

if __name__ == '__main__':
    unittest.main()