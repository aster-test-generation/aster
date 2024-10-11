import unittest
from ansible.module_utils.facts.system.user import *


class TestUserFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = UserFactCollector()
        result = instance.collect()
        self.assertIsNotNone(result)

    def test_name(self):
        instance = UserFactCollector()
        result = instance.name
        self.assertEqual(result, 'user')

    def test_fact_ids(self):
        instance = UserFactCollector()
        result = instance._fact_ids
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()