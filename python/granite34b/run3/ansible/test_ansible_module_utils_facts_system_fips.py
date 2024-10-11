import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = FipsFactCollector()
        fips_facts = collector.collect()
        self.assertIn('fips', fips_facts)
        self.assertIsInstance(fips_facts['fips'], bool)

    def test_collect_with_data(self):
        collector = FipsFactCollector()
        data = '1'
        fips_facts = collector.collect(None, data)
        self.assertIn('fips', fips_facts)
        self.assertTrue(fips_facts['fips'])

    def test_collect_without_data(self):
        collector = FipsFactCollector()
        data = None
        fips_facts = collector.collect(None, data)
        self.assertIn('fips', fips_facts)
        self.assertFalse(fips_facts['fips'])

if __name__ == '__main__':
    unittest.main()