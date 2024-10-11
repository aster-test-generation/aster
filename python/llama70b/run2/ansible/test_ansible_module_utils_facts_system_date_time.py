import unittest
from ansible.module_utils.facts.system.date_time import DateTimeFactCollector


class TestDateTimeFactCollector(unittest.TestCase):
    def test_init(self):
        instance = DateTimeFactCollector()
        self.assertIsInstance(instance, DateTimeFactCollector)

    def test_name(self):
        instance = DateTimeFactCollector()
        self.assertEqual(instance.name, 'date_time')

    def test_fact_ids(self):
        instance = DateTimeFactCollector()
        self.assertIsInstance(instance._fact_ids, set)

    def test_collect(self):
        instance = DateTimeFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('date_time', result)

    def test_private___init__(self):
        instance = DateTimeFactCollector()
        result = instance._DateTimeFactCollector__init__()
        self.assertIsNone(result)

    def test_str_method(self):
        instance = DateTimeFactCollector()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = DateTimeFactCollector()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = DateTimeFactCollector()
        instance2 = DateTimeFactCollector()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()