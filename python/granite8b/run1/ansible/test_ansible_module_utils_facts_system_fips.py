import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = FipsFactCollector()
        fips_facts = collector.collect()
        self.assertEqual(fips_facts['fips'], False)

    def test_private_method(self):
        collector = FipsFactCollector()
        result = collector._get_file_content('/proc/sys/crypto/fips_enabled')
        self.assertEqual(result, None)

    def test_protected_method(self):
        collector = FipsFactCollector()
        result = collector._collect()
        self.assertEqual(result, {})

    def test_magic_method(self):
        collector = FipsFactCollector()
        result = collector.__str__()
        self.assertEqual(result, FipsFactCollector)

if __name__ == '__main__':
    unittest.main()