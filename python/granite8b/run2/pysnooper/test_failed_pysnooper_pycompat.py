import unittest
from pysnooper.pycompat import *

class TestPycompat(unittest.TestCase):
    def test_abc(self):
        self.assertTrue(hasattr(abc, 'ABC'))

    def test_os_pathlike(self):
        self.assertTrue(hasattr(os, 'PathLike'))

    def test_inspect_iscoroutinefunction(self):
        self.assertTrue(hasattr(inspect, 'iscoroutinefunction'))

    def test_inspect_isasyncgenfunction(self):
        self.assertTrue(hasattr(inspect, 'isasyncgenfunction'))

    def test_string_types(self):
        self.assertTrue(hasattr(string_types, '__iter__'))

    def test_text_type(self):
        self.assertTrue(isinstance('a', text_type))

    def test_binary_type(self):
        self.assertTrue(isinstance(b'a', binary_type))

    def test_collections_abc(self):
        self.assertTrue(hasattr(collections_abc, 'Sized'))

    def test_time_isoformat(self):
        self.assertEqual(time_isoformat(datetime_module.time(12, 34, 56, 78900)), '12:34:56.078900')

    def test_timedelta_format(self):
        self.assertEqual(timedelta_format(datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=4)), '01:02:03.000004')

    def test_timedelta_parse(self):
        self.assertEqual(timedelta_parse('01:02:03.000004'), datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=4))

if __name__ == '__main__':
    unittest.main()