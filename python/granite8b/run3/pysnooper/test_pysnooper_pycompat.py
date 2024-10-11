import unittest
from pysnooper.pycompat import *


class TestPycompat(unittest.TestCase):
    def test_abc(self):
        self.assertTrue(issubclass(ABC, object))

    def test_pathlike(self):
        self.assertTrue(issubclass(PathLike, ABC))

    def test_iscoroutinefunction(self):
        self.assertTrue(inspect.iscoroutinefunction(inspect.iscoroutinefunction))

    def test_isasyncgenfunction(self):
        self.assertTrue(isasyncgenfunction(asyncgenfunction))

    def test_string_types(self):
        self.assertTrue(issubclass(str, string_types))

    def test_text_type(self):
        self.assertEqual(text_type, str)

    def test_binary_type(self):
        self.assertEqual(binary_type, bytes)

    def test_collections_abc(self):
        self.assertTrue(issubclass(collections_abc.Mapping, object))

    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 78900)
        self.assertEqual(time_isoformat(time), '12:34:56.078900')

    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=4000)
        self.assertEqual(timedelta_format(timedelta), '01:02:03.004000')

    def test_timedelta_parse(self):
        s = '01:02:03.000400'
        self.assertEqual(timedelta_parse(s), datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=400))

if __name__ == '__main__':
    unittest.main()