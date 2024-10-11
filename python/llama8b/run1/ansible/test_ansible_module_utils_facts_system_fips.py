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
        with unittest.mock.patch('ansible.module_utils.facts.utils.get_file_content', return_value=data):
            result = collector.collect()
            self.assertTrue(result['fips'])

    def test_collect_fips_disabled(self):
        collector = FipsFactCollector()
        data = '0'
        with unittest.mock.patch('ansible.module_utils.facts.utils.get_file_content', return_value=data):
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

    def test_eq_method(self):
        collector1 = FipsFactCollector()
        collector2 = FipsFactCollector()
        self.assertEqual(collector1, collector2)

if __name__ == '__main__':
    unittest.main()