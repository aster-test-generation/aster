import unittest
from ansible.module_utils.facts.collector import BaseFactCollector


class TestBaseFactCollector(unittest.TestCase):
    def test_platform_match(self):
        class TestFactCollector(BaseFactCollector):
            _platform = 'test'
        info = {'system': 'test'}
        result = TestFactCollector.platform_match(info)
        self.assertEqual(result, TestFactCollector)
        info = {'system': 'other'}
        result = TestFactCollector.platform_match(info)
        self.assertIsNone(result)

    def test_transform_name(self):
        class TestFactCollector(BaseFactCollector):
            namespace = 'test'
        instance = TestFactCollector()
        result = instance._transform_name('key')
        self.assertEqual(result, 'test.key')

    def test_transform_dict_keys(self):
        class TestFactCollector(BaseFactCollector):
            namespace = 'test'
        instance = TestFactCollector()
        fact_dict = {'key': 'value'}
        result = instance._transform_dict_keys(fact_dict)
        self.assertEqual(result, {'test.key': 'value'})

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