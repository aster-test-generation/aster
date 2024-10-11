import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_init(self):
        instance = FipsFactCollector()
        self.assertIsInstance(instance, FipsFactCollector)

    def test_name(self):
        instance = FipsFactCollector()
        self.assertEqual(instance.name, 'fips')

    def test_fact_ids(self):
        instance = FipsFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_collect(self):
        instance = FipsFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('fips', result)

    def test_collect_with_module_and_collected_facts(self):
        instance = FipsFactCollector()
        result = instance.collect(module='dummy_module', collected_facts={'dummy_fact': 'dummy_value'})
        self.assertIsInstance(result, dict)
        self.assertIn('fips', result)

    def test_str_method(self):
        instance = FipsFactCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = FipsFactCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = FipsFactCollector()
        instance2 = FipsFactCollector()
        self.assertEqual(instance1, instance2)

    def test_private_method__fact_ids(self):
        instance = FipsFactCollector()
        result = instance._FipsFactCollector__fact_ids
        self.assertIsInstance(result, set)

if __name__ == '__main__':
    unittest.main()