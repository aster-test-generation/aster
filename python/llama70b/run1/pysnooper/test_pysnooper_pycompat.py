import unittest
from pysnooper.pycompat import *


class TestABC(unittest.TestCase):
    def test_ABC_init(self):
        abc_instance = ABC()
        self.assertIsInstance(abc_instance, ABC)

    def test_ABC_subclasshook(self):
        class Subclass:
            def __fspath__(self):
                pass
        self.assertTrue(issubclass(Subclass, PathLike))

class TestPathLike(unittest.TestCase):
    def test_PathLike_init(self):
        pathlike_instance = PathLike()
        self.assertIsInstance(pathlike_instance, PathLike)

    def test_PathLike_fspath(self):
        with self.assertRaises(NotImplementedError):
            PathLike().__fspath__()

    def test_PathLike_subclasshook(self):
        class Subclass:
            def __fspath__(self):
                pass
        self.assertTrue(PathLike.__subclasshook__(Subclass))

class TestPYCompatFunctions(unittest.TestCase):
    def test_iscoroutinefunction(self):
        def coroutine_function():
            yield
        self.assertTrue(iscoroutinefunction(coroutine_function))

    def test_isasyncgenfunction(self):
        def asyncgen_function():
            yield
        self.assertTrue(isasyncgenfunction(asyncgen_function))

    def test_time_isoformat(self):
        time = datetime_module.time(12, 30, 45, 123456)
        self.assertEqual(time_isoformat(time), '12:30:45.123456')

    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta(hours=1, minutes=30, seconds=45, microseconds=123456)
        self.assertEqual(timedelta_format(timedelta), '01:30:45.123456')

    def test_timedelta_parse(self):
        s = '01:30:45.123456'
        timedelta = timedelta_parse(s)
        self.assertEqual(timedelta, datetime_module.timedelta(hours=1, minutes=30, seconds=45, microseconds=123456))

if __name__ == '__main__':
    unittest.main()