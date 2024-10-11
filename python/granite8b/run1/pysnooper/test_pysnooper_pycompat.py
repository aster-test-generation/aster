import unittest
from pysnooper.pycompat import *


class TestPycompat(unittest.TestCase):
    def test_string_types(self):
        self.assertTrue(isinstance('a', string_types))
        self.assertTrue(isinstance(b'a', string_types))
        self.assertFalse(isinstance(1, string_types))

    def test_text_type(self):
        self.assertTrue(isinstance('a', text_type))
        self.assertFalse(isinstance(b'a', text_type))

    def test_binary_type(self):
        self.assertFalse(isinstance('a', binary_type))
        self.assertTrue(isinstance(b'a', binary_type))

    def test_iscoroutinefunction(self):
        self.assertFalse(iscoroutinefunction(lambda x: x))
        self.assertFalse(iscoroutinefunction(lambda: None))
        self.assertTrue(iscoroutinefunction(lambda: (yield)))

    def test_isasyncgenfunction(self):
        self.assertFalse(isasyncgenfunction(lambda x: x))
        self.assertFalse(isasyncgenfunction(lambda: None))
        self.assertTrue(isasyncgenfunction(lambda: (yield)))

    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 78900)
        self.assertEqual(time_isoformat(time), '12:34:56.007890')

    def test_timedelta_format(self):
        self.assertEqual(timedelta_format(datetime_module.timedelta(0)), '00:00:00.000000')
        self.assertEqual(timedelta_format(datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=4)), '01:02:03.000004')

    def test_timedelta_parse(self):
        self.assertEqual(timedelta_parse('00:00:00.000000'), datetime_module.timedelta(0))
        self.assertEqual(timedelta_parse('01:02:03.000004'), datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=4))

if __name__ == '__main__':
    unittest.main()