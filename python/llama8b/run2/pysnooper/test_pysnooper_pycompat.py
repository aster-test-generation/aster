import unittest
from pysnooper.pycompat import *


class TestPycompat(unittest.TestCase):
    def test_ABC(self):
        self.assertTrue(issubclass(ABC, type))

    def test_PathLike(self):
        class MyPathLike(PathLike):
            def __fspath__(self):
                return '/path/to/somewhere'

        self.assertEqual(MyPathLike().__fspath__(), '/path/to/somewhere')

    def test_is_coroutinefunction(self):
        def coroutine_function():
            yield

        self.assertTrue(iscoroutinefunction(coroutine_function))

    def test_is_asyncgenfunction(self):
        async def asyncgen_function():
            yield

        self.assertTrue(isasyncgenfunction(asyncgen_function))

    def test_string_types(self):
        self.assertTrue(isinstance('hello', string_types))

    def test_text_type(self):
        self.assertTrue(isinstance('hello', text_type))

    def test_binary_type(self):
        self.assertTrue(isinstance(b'hello', binary_type))

    def test_collections_abc(self):
        self.assertTrue(hasattr(collections_abc, 'Mapping'))

    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 789000)
        self.assertEqual(time_isoformat(time), '12:34:56.789000')

    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(timedelta_format(timedelta), '01:02:03.456789')

    def test_timedelta_parse(self):
        self.assertEqual(timedelta_parse('01:02:03.456789'),
                         datetime_module.timedelta(hours=0, minutes=1, seconds=2, microseconds=456789))

    def test_timedelta_parse_invalid(self):
        with self.assertRaises(ValueError):
            timedelta_parse('invalid')

if __name__ == '__main__':
    unittest.main()