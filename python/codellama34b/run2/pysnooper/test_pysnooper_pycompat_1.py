import unittest
from pysnooper import *

class TestPysnooper(unittest.TestCase):
    def test_ABC(self):
        self.assertTrue(issubclass(ABC, abc.ABCMeta))

    def test_PathLike(self):
        self.assertTrue(issubclass(PathLike, ABC))

    def test_is_coroutinefunction(self):
        def test_func():
            pass
        self.assertFalse(iscoroutinefunction(test_func))

    def test_is_asyncgenfunction(self):
        def test_func():
            pass
        self.assertFalse(isasyncgenfunction(test_func))

    def test_string_types(self):
        self.assertTrue(isinstance('hello', string_types))

    def test_text_type(self):
        self.assertTrue(isinstance('hello', text_type))

    def test_binary_type(self):
        self.assertTrue(isinstance(b'hello', binary_type))

    def test_collections_abc(self):
        self.assertTrue(issubclass(collections_abc, abc))

    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 789000)
        self.assertEqual(time_isoformat(time), '12:34:56.789000')

    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(timedelta_format(timedelta), '01:02:03.456789')

    def test_timedelta_parse(self):
        self.assertEqual(timedelta_parse('01:02:03.456789'), datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789))

if __name__ == '__main__':
    unittest.main()