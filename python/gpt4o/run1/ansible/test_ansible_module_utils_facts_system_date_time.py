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

    def test_collect_year(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['year'], datetime.datetime.now().strftime('%Y'))

    def test_collect_month(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['month'], datetime.datetime.now().strftime('%m'))

    def test_collect_weekday(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['weekday'], datetime.datetime.now().strftime('%A'))

    def test_collect_weekday_number(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['weekday_number'], datetime.datetime.now().strftime('%w'))

    def test_collect_weeknumber(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['weeknumber'], datetime.datetime.now().strftime('%W'))

    def test_collect_day(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['day'], datetime.datetime.now().strftime('%d'))

    def test_collect_hour(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['hour'], datetime.datetime.now().strftime('%H'))

    def test_collect_minute(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['minute'], datetime.datetime.now().strftime('%M'))

    def test_collect_second(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['second'], datetime.datetime.now().strftime('%S'))

    def test_collect_epoch(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['epoch'], str(int(time.time())))

    def test_collect_epoch_int(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['epoch_int'], str(int(time.time())))

    def test_collect_date(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['date'], datetime.datetime.now().strftime('%Y-%m-%d'))

    def test_collect_time(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['time'], datetime.datetime.now().strftime('%H:%M:%S'))

    def test_collect_iso8601_micro(self):
        result = self.collector.collect()
        self.assertAlmostEqual(result['date_time']['iso8601_micro'], datetime.datetime.utcnow().strftime("%Y-%m-%dT%H:%M:%S.%fZ"), delta=datetime.timedelta(microseconds=100))

    def test_collect_iso8601(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['iso8601'], datetime.datetime.utcnow().strftime("%Y-%m-%dT%H:%M:%SZ"))

    def test_collect_iso8601_basic(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['iso8601_basic'], '20240727T155215715865')

    def test_collect_iso8601_basic_short(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['iso8601_basic_short'], datetime.datetime.now().strftime("%Y%m%dT%H%M%S"))

    def test_collect_tz(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['tz'], time.strftime("%Z"))

    def test_collect_tz_dst(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['tz_dst'], time.tzname[1])

    def test_collect_tz_offset(self):
        result = self.collector.collect()
        self.assertEqual(result['date_time']['tz_offset'], time.strftime("%z"))

if __name__ == '__main__':
    unittest.main()