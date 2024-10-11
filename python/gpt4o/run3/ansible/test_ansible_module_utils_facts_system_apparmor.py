import unittest
from unittest.mock import patch
from ansible.module_utils.facts.system.apparmor import ApparmorFactCollector


class TestApparmorFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = ApparmorFactCollector()

    def test_collect_apparmor_enabled(self):
        with patch('os.path.exists', return_value=True):
            result = self.collector.collect()
            self.assertEqual(result, {'apparmor': {'status': 'enabled'}})

    def test_collect_apparmor_disabled(self):
        with patch('os.path.exists', return_value=False):
            result = self.collector.collect()
            self.assertEqual(result, {'apparmor': {'status': 'disabled'}})

    def test_name_attribute(self):
        self.assertEqual(self.collector.name, 'apparmor')

    def test_fact_ids_attribute(self):
        self.assertEqual(self.collector._fact_ids, set())

if __name__ == '__main__':
    unittest.main()