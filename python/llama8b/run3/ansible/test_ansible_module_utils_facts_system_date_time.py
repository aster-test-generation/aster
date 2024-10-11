import unittest
from ansible.module_utils.facts.system.date_time import DateTimeFactCollector


class TestDateTimeFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DateTimeFactCollector()
        facts_dict = collector.collect()
        self.assertIn('date_time', facts_dict)
        self.assertIn('year', facts_dict['date_time'])
        self.assertIn('month', facts_dict['date_time'])
        self.assertIn('weekday', facts_dict['date_time'])
        self.assertIn('weekday_number', facts_dict['date_time'])
        self.assertIn('weeknumber', facts_dict['date_time'])
        self.assertIn('day', facts_dict['date_time'])
        self.assertIn('hour', facts_dict['date_time'])
        self.assertIn('minute', facts_dict['date_time'])
        self.assertIn('second', facts_dict['date_time'])
        self.assertIn('epoch', facts_dict['date_time'])
        self.assertIn('epoch_int', facts_dict['date_time'])
        self.assertIn('date', facts_dict['date_time'])
        self.assertIn('time', facts_dict['date_time'])
        self.assertIn('iso8601_micro', facts_dict['date_time'])
        self.assertIn('iso8601', facts_dict['date_time'])
        self.assertIn('iso8601_basic', facts_dict['date_time'])
        self.assertIn('iso8601_basic_short', facts_dict['date_time'])
        self.assertIn('tz', facts_dict['date_time'])
        self.assertIn('tz_dst', facts_dict['date_time'])
        self.assertIn('tz_offset', facts_dict['date_time'])

    def test_str_method(self):
        collector = DateTimeFactCollector()
        result = str(collector)
        self.assertEqual(result, 'DateTimeFactCollector')

    def test_repr_method(self):
        collector = DateTimeFactCollector()
        result = repr(collector)
        self.assertEqual(result, 'DateTimeFactCollector()')

    def test_eq_method(self):
        collector1 = DateTimeFactCollector()
        collector2 = DateTimeFactCollector()
        self.assertEqual(collector1, collector2)

    def test_init_method(self):
        collector = DateTimeFactCollector()
        self.assertEqual(collector.name, 'date_time')
        self.assertEqual(collector._fact_ids, set())

if __name__ == '__main__':
    unittest.main()