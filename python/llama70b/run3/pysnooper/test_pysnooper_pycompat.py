import unittest
from pysnooper.pycompat import *


class TestABC(unittest.TestCase):
    def test_ABC_init(self):
        abc_instance = ABC()
        self.assertIsInstance(abc_instance, ABC)

    def test_ABC_slots(self):
        abc_instance = ABC()
        self.assertEqual(abc_instance.__slots__, ())

class TestPathLike(unittest.TestCase):
    def test_PathLike_init(self):
        path_like_instance = PathLike()
        self.assertIsInstance(path_like_instance, PathLike)

    def test_PathLike_fspath(self):
        path_like_instance = PathLike()
        with self.assertRaises(NotImplementedError):
            path_like_instance.__fspath__()

    def test_PathLike_subclasshook(self):
        class Subclass:
            def __fspath__(self):
                pass
        self.assertTrue(PathLike.__subclasshook__(Subclass))

class TestPyCompatFunctions(unittest.TestCase):
    def test_iscoroutinefunction(self):
        def coroutine_function():
            yield
        self.assertTrue(iscoroutinefunction(coroutine_function))

    def test_isasyncgenfunction(self):
        def async_gen_function():
            yield
        self.assertTrue(isasyncgenfunction(async_gen_function))

    def test_time_isoformat(self):
        time_instance = datetime_module.time(12, 30, 45, 123456)
        self.assertEqual(time_isoformat(time_instance), '12:30:45.123456')

    def test_timedelta_format(self):
        timedelta_instance = datetime_module.timedelta(hours=1, minutes=30, seconds=45, microseconds=123456)
        self.assertEqual(timedelta_format(timedelta_instance), '01:30:45.123456')

    def test_timedelta_parse(self):
        timedelta_instance = timedelta_parse('01:30:45.123456')
        self.assertEqual(timedelta_instance, datetime_module.timedelta(hours=1, minutes=30, seconds=45, microseconds=123456))

if __name__ == '__main__':
    unittest.main()