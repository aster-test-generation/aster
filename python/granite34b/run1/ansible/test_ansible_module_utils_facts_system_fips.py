import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect_fips_enabled(self):
        collector = FipsFactCollector()
        fips_facts = collector.collect()
        self.assertTrue(fips_facts['fips'])

    def test_collect_fips_disabled(self):
        collector = FipsFactCollector()
        fips_facts = collector.collect()
        self.assertFalse(fips_facts['fips'])

if __name__ == '__main__':
    unittest.main()