import unittest
from ansible.module_utils.facts.system.date_time import DateTimeFactCollector


class TestDateTimeFactCollector(unittest.TestCase):
    def test_collect_method(self):
        collector = DateTimeFactCollector()
        result = collector.collect()
        self.assertIsInstance(result, dict)
        self.assertIn('date_time', result)
        date_time_facts = result['date_time']
        self.assertIsInstance(date_time_facts, dict)
        self.assertIn('year', date_time_facts)
        self.assertIn('month', date_time_facts)
        self.assertIn('weekday', date_time_facts)
        self.assertIn('weekday_number', date_time_facts)
        self.assertIn('weeknumber', date_time_facts)
        self.assertIn('day', date_time_facts)
        self.assertIn('hour', date_time_facts)
        self.assertIn('minute', date_time_facts)
        self.assertIn('second', date_time_facts)
        self.assertIn('epoch', date_time_facts)
        self.assertIn('epoch_int', date_time_facts)
        self.assertIn('date', date_time_facts)
        self.assertIn('time', date_time_facts)
        self.assertIn('iso8601_micro', date_time_facts)
        self.assertIn('iso8601', date_time_facts)
        self.assertIn('iso8601_basic', date_time_facts)
        self.assertIn('iso8601_basic_short', date_time_facts)
        self.assertIn('tz', date_time_facts)
        self.assertIn('tz_dst', date_time_facts)
        self.assertIn('tz_offset', date_time_facts)

if __name__ == '__main__':
    unittest.main()