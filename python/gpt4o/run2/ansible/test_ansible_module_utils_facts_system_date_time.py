import unittest
from ansible.module_utils.facts.system.date_time import DateTimeFactCollector
import datetime
import time


class TestDateTimeFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = DateTimeFactCollector()

    def test_collect(self):
        result = self.collector.collect()
        self.assertIn('date_time', result)
        self.assertIn('year', result['date_time'])
        self.assertIn('month', result['date_time'])
        self.assertIn('weekday', result['date_time'])
        self.assertIn('weekday_number', result['date_time'])
        self.assertIn('weeknumber', result['date_time'])
        self.assertIn('day', result['date_time'])
        self.assertIn('hour', result['date_time'])
        self.assertIn('minute', result['date_time'])
        self.assertIn('second', result['date_time'])
        self.assertIn('epoch', result['date_time'])
        self.assertIn('epoch_int', result['date_time'])
        self.assertIn('date', result['date_time'])
        self.assertIn('time', result['date_time'])
        self.assertIn('iso8601_micro', result['date_time'])
        self.assertIn('iso8601', result['date_time'])
        self.assertIn('iso8601_basic', result['date_time'])
        self.assertIn('iso8601_basic_short', result['date_time'])
        self.assertIn('tz', result['date_time'])
        self.assertIn('tz_dst', result['date_time'])
        self.assertIn('tz_offset', result['date_time'])

    def test_collect_epoch_fallback(self):
        # Mock time to return a specific epoch time
        epoch_ts = 1609459200  # 2021-01-01 00:00:00 UTC
        now = datetime.datetime.fromtimestamp(epoch_ts)
        utcnow = datetime.datetime.utcfromtimestamp(epoch_ts)
        
        with unittest.patch('time.time', return_value=epoch_ts):
            result = self.collector.collect()
            self.assertEqual(result['date_time']['epoch'], str(int(epoch_ts)))
            self.assertEqual(result['date_time']['epoch_int'], str(int(epoch_ts)))
            self.assertEqual(result['date_time']['date'], now.strftime('%Y-%m-%d'))
            self.assertEqual(result['date_time']['time'], now.strftime('%H:%M:%S'))
            self.assertEqual(result['date_time']['iso8601_micro'], utcnow.strftime("%Y-%m-%dT%H:%M:%S.%fZ"))
            self.assertEqual(result['date_time']['iso8601'], utcnow.strftime("%Y-%m-%dT%H:%M:%SZ"))
            self.assertEqual(result['date_time']['iso8601_basic'], now.strftime("%Y%m%dT%H%M%S%f"))
            self.assertEqual(result['date_time']['iso8601_basic_short'], now.strftime("%Y%m%dT%H%M%S"))

    def test_name(self):
        self.assertEqual(self.collector.name, 'date_time')

    def test_fact_ids(self):
        self.assertEqual(self.collector._fact_ids, set())

if __name__ == '__main__':
    unittest.main()