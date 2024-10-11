import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect(self):
        instance = FipsFactCollector()
        result = instance.collect()
        self.assertEqual(result, {'fips': False})

    def test_name(self):
        instance = FipsFactCollector()
        result = instance.name
        self.assertEqual(result, 'fips')

    def test__fact_ids(self):
        instance = FipsFactCollector()
        result = instance._fact_ids
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()