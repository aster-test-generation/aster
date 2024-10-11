import unittest
from ansible.module_utils.facts.system.fips import FipsFactCollector


class TestFipsFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = FipsFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('fips', result)

    def test_collect_fips_enabled(self):
        collector = FipsFactCollector()
        data = '1'
        with unittest.mock.patch.object(collector, 'get_file_content', return_value=data):
            result = collector.collect()
            self.assertTrue(result['fips'])

    def test_collect_fips_disabled(self):
        collector = FipsFactCollector()
        data = '0'
        with unittest.mock.patch.object(collector, 'get_file_content', return_value=data):
            result = collector.collect()
            self.assertFalse(result['fips'])

    def test_collect_file_content_error(self):
        collector = FipsFactCollector()
        with unittest.mock.patch.object(collector, 'get_file_content', side_effect=Exception('Error')):
            with self.assertRaises(Exception):
                collector.collect()

    def test_init(self):
        collector = FipsFactCollector()
        self.assertEqual(collector.name, 'fips')
        self.assertEqual(collector._fact_ids, set())

    def test_str(self):
        collector = FipsFactCollector()
        result = str(collector)
        self.assertEqual(result, 'FipsFactCollector')

    def test_repr(self):
        collector = FipsFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'FipsFactCollector()')

    def test_eq(self):
        collector1 = FipsFactCollector()
        collector2 = FipsFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()