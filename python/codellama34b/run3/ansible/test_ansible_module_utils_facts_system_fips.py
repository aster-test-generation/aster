import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector
from ansible.module_utils.facts.utils import get_file_content



class TestFipsFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = FipsFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'fips': False})

    def test_collect_with_data(self):
        instance = FipsFactCollector()
        result = instance.collect(data=1)
        self.assertEqual(result, {'fips': True})

    def test_collect_with_data_not_one(self):
        instance = FipsFactCollector()
        result = instance.collect(data='0')
        self.assertEqual(result, {'fips': False})

    def test_collect_with_data_none(self):
        instance = FipsFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'fips': False})

    def test_collect_with_data_not_string(self):
        instance = FipsFactCollector()
        result = instance.collect(data=None)
        self.assertEqual(result, {'fips': False})

    def test_collect_with_module(self):
        instance = FipsFactCollector()
        result = instance.collect(module=1)
        self.assertEqual(result, {'fips': False})

    def test_collect_with_collected_facts(self):
        instance = FipsFactCollector()
        result = instance.collect(collected_facts=1)
        self.assertEqual(result, {'fips': False})

    def test_collect_with_data_and_module(self):
        instance = FipsFactCollector()
        result = instance.collect(data='1', module=1)
        self.assertEqual(result, {'fips': True})

    def test_collect_with_data_and_collected_facts(self):
        instance = FipsFactCollector()
        result = instance.collect(data='1')
        self.assertEqual(result, {'fips': True})

    def test_collect_with_module_and_collected_facts(self):
        instance = FipsFactCollector()
        result = instance.collect(module=1, collected_facts=1)
        self.assertEqual(result, {'fips': False})

    def test_collect_with_data_and_module_and_collected_facts(self):
        instance = FipsFactCollector()
        result = instance.collect(data='1', module=1, collected_facts=1)
        self.assertEqual(result, {'fips': True})

    def test_name(self):
        instance = FipsFactCollector()
        result = instance.name
        self.assertEqual(result, 'fips')

    def test_name_setter(self):
        instance = FipsFactCollector()
        instance.name = 'fips'
        result = instance.name
        self.assertEqual(result, 'fips')

    def test_name_setter_with_not_string(self):
        instance = FipsFactCollector()
        instance.name = 1
        result = instance.name
        self.assertEqual(result, 1)

    def test_name_setter_with_empty_string(self):
        instance = FipsFactCollector()
        instance.name = ''
        result = instance.name
        self.assertEqual(result, '')

    def test_fact_ids(self):
        instance = FipsFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, set())

    def test_fact_ids_setter(self):
        instance = FipsFactCollector()
        instance._fact_ids = set()
        result = instance._fact_ids
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()