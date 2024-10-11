import unittest
from ansible.module_utils.facts.system.date_time import *


class TestDateTimeFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = DateTimeFactCollector()
        result = instance.collect()
        self.assertIsInstance(result, dict)

    def test_name(self):
        instance = DateTimeFactCollector()
        result = instance.name
        self.assertEqual(result, 'date_time')

    def test__fact_ids(self):
        instance = DateTimeFactCollector()
        result = instance._fact_ids
        self.assertIsInstance(result, set)


if __name__ == '__main__':
    unittest.main()