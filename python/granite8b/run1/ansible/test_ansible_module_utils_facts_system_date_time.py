import time
import datetime
import unittest
from ansible.module_utils.facts.system.date_time import DateTimeFactCollector


class TestDateTimeFactCollector(unittest.TestCase):
    def test_collect(self):
        collector = DateTimeFactCollector()
        facts_dict = collector.collect()
        self.assertIn('date_time', facts_dict)
        date_time_facts = facts_dict['date_time']
        self.assertEqual(date_time_facts['year'], datetime.datetime.now().strftime('%Y'))
        self.assertEqual(date_time_facts['month'], datetime.datetime.now().strftime('%m'))
        self.assertEqual(date_time_facts['weekday'], datetime.datetime.now().strftime('%A'))
        self.assertEqual(date_time_facts['weekday_number'], datetime.datetime.now().strftime('%w'))
        self.assertEqual(date_time_facts['weeknumber'], datetime.datetime.now().strftime('%W'))
        self.assertEqual(date_time_facts['day'], datetime.datetime.now().strftime('%d'))
        self.assertEqual(date_time_facts['hour'], datetime.datetime.now().strftime('%H'))
        self.assertEqual(date_time_facts['minute'], datetime.datetime.now().strftime('%M'))
        self.assertEqual(date_time_facts['second'], datetime.datetime.now().strftime('%S'))
        self.assertEqual(date_time_facts['epoch'], datetime.datetime.now().strftime('%s'))
        self.assertEqual(date_time_facts['epoch_int'], str(int(datetime.datetime.now().strftime('%s'))))
        self.assertEqual(date_time_facts['date'], datetime.datetime.now().strftime('%Y-%m-%d'))
        self.assertEqual(date_time_facts['time'], datetime.datetime.now().strftime('%H:%M:%S'))
        self.assertEqual(date_time_facts['iso8601_micro'], datetime.datetime.now(datetime.timezone.utc).strftime("%Y-%m-%dT%H:%M:%S.%fZ"))
        self.assertEqual(date_time_facts['iso8601'], datetime.datetime.now(datetime.timezone.utc).strftime("%Y-%m-%dT%H:%M:%SZ"))
        self.assertEqual(date_time_facts['iso8601_basic'], datetime.datetime.now().strftime("%Y%m%dT%H%M%S%f"))
        self.assertEqual(date_time_facts['iso8601_basic_short'], datetime.datetime.now().strftime("%Y%m%dT%H%M%S"))
        self.assertEqual(date_time_facts['tz'], time.strftime("%Z"))
        self.assertEqual(date_time_facts['tz_dst'], time.tzname[1])
        self.assertEqual(date_time_facts['tz_offset'], time.strftime("%z"))

if __name__ == '__main__':
    unittest.main()