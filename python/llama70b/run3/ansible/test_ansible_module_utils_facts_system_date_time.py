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

    def test__init__(self):
        instance = DateTimeFactCollector()
        self.assertIsNone(instance.__init__())

    def test__str__(self):
        instance = DateTimeFactCollector()
        result = instance.__str__()
        self.assertEqual(result, 'DateTimeFactCollector')

    def test__repr__(self):
        instance = DateTimeFactCollector()
        result = instance.__repr__()
        self.assertEqual(result, 'DateTimeFactCollector()')

    def test__eq__(self):
        instance1 = DateTimeFactCollector()
        instance2 = DateTimeFactCollector()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()