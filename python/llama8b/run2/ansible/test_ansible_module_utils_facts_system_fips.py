import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = FipsFactCollector()
        result = collector.collect()
        self.assertIn('fips', result)
        self.assertIsInstance(result['fips'], bool)

    def test_collect_module(self):
        collector = FipsFactCollector()
        result = collector.collect(module='test_module', collected_facts={})
        self.assertIn('fips', result)
        self.assertIsInstance(result['fips'], bool)

    def test_get_file_content(self):
        collector = FipsFactCollector()
        data = collector._get_file_content('/proc/sys/crypto/fips_enabled')
        self.assertIsNone(data)

    def test_get_file_content_true(self):
        collector = FipsFactCollector()
        data = collector._get_file_content('/proc/sys/crypto/fips_enabled', '1')
        self.assertEqual(data, '1')

    def test_get_file_content_false(self):
        collector = FipsFactCollector()
        data = collector._get_file_content('/proc/sys/crypto/fips_enabled', '0')
        self.assertEqual(data, '0')

    def test_collect_fips_enabled_true(self):
        collector = FipsFactCollector()
        data = collector._get_file_content('/proc/sys/crypto/fips_enabled', '1')
        result = collector.collect()
        self.assertTrue(result['fips'])

    def test_collect_fips_enabled_false(self):
        collector = FipsFactCollector()
        data = collector._get_file_content('/proc/sys/crypto/fips_enabled', '0')
        result = collector.collect()
        self.assertFalse(result['fips'])

    def test_str_method(self):
        collector = FipsFactCollector()
        result = str(collector)
        self.assertEqual(result, 'FipsFactCollector')

    def test_repr_method(self):
        collector = FipsFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'FipsFactCollector()')

if __name__ == '__main__':
    unittest.main()