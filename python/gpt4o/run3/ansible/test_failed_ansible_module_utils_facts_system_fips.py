import unittest
from unittest.mock import patch
from ansible.module_utils.facts.system.fips import FipsFactCollector
from ansible.module_utils.facts.utils import get_file_content

class TestFipsFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = FipsFactCollector()

    def test_collect_fips_disabled(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='0'):
            result = self.collector.collect()
            self.assertEqual(result, {'fips': False})

    def test_collect_fips_enabled(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value='1'):
            result = self.collector.collect()
            self.assertEqual(result, {'fips': False})

    def test_collect_no_data(self):
        with patch('ansible.module_utils.facts.utils.get_file_content', return_value=None):
            result = self.collector.collect()
            self.assertEqual(result, {'fips': False})

    def test_name_attribute(self):
        self.assertEqual(self.collector.name, 'fips')

    def test_fact_ids_attribute(self):
        self.assertEqual(self.collector._fact_ids, set())

if __name__ == '__main__':
    unittest.main()