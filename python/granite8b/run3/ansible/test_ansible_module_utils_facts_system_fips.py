import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect_fips_facts(self):
        collector = FipsFactCollector()
        fips_facts = collector.collect()
        self.assertIn('fips', fips_facts)
        self.assertIsInstance(fips_facts['fips'], bool)

    def test_collect_fips_facts_with_data(self):
        collector = FipsFactCollector()
        with open('/proc/sys/crypto/fips_enabled', 'w') as f:
            f.write('1')
        fips_facts = collector.collect()
        self.assertTrue(fips_facts['fips'])

    def test_collect_fips_facts_without_data(self):
        collector = FipsFactCollector()
        with open('/proc/sys/crypto/fips_enabled', 'w') as f:
            f.write('0')
        fips_facts = collector.collect()
        self.assertFalse(fips_facts['fips'])

if __name__ == '__main__':
    unittest.main()