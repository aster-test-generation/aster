import unittest
import sys
import datetime as datetime_module
from pysnooper.pycompat import *

class TestABC(unittest.TestCase):
    def test_ABC(self):
        class ConcreteABC(ABC):
            pass
        instance = ConcreteABC()
        self.assertIsInstance(instance, ABC)

class TestPathLike(unittest.TestCase):
    def test_PathLike(self):
        class ConcretePathLike(PathLike):
            def __fspath__(self):
                return "test_path"
        instance = ConcretePathLike()
        self.assertEqual(instance.__fspath__(), "test_path")

    def test_PathLike_subclasshook(self):
        class SubclassWithFspath:
            def __fspath__(self):
                return "test_path"
        self.assertTrue(PathLike.__subclasshook__(SubclassWithFspath))

        class SubclassWithOpen:
            def open(self):
                pass
        self.assertTrue(PathLike.__subclasshook__(SubclassWithOpen))

        class SubclassWithoutFspathOrOpen:
            pass
        self.assertTrue(PathLike.__subclasshook__(SubclassWithoutFspathOrOpen))

class TestCoroutineFunctions(unittest.TestCase):
    def test_iscoroutinefunction(self):
        async def async_func():
            pass
        self.assertTrue(iscoroutinefunction(async_func))

        def sync_func():
            pass
        self.assertFalse(iscoroutinefunction(sync_func))

    def test_isasyncgenfunction(self):
        async def async_gen_func():
            yield
        self.assertTrue(isasyncgenfunction(async_gen_func))

        def sync_func():
            pass
        self.assertFalse(isasyncgenfunction(sync_func))

class TestStringTypes(unittest.TestCase):
    def test_string_types(self):
        if PY3:
            self.assertEqual(string_types, (str,))
        else:
            self.assertEqual(string_types, (basestring,))

    def test_text_type(self):
        if PY3:
            self.assertEqual(text_type, str)
        else:
            self.assertEqual(text_type, unicode)

    def test_binary_type(self):
        if PY3:
            self.assertEqual(binary_type, bytes)
        else:
            self.assertEqual(binary_type, str)

class TestTimeIsoformat(unittest.TestCase):
    def test_time_isoformat(self):
        if sys.version_info[:2] >= (3, 6):
            time = datetime_module.time(12, 34, 56, 789012)
            self.assertEqual(time_isoformat(time), "12:34:56.789012")
        else:
            time = datetime_module.time(12, 34, 56, 789012)
            self.assertEqual(time_isoformat(time), "12:34:56.789012")

    def test_time_isoformat_not_implemented(self):
        if sys.version_info[:2] < (3, 6):
            time = datetime_module.time(12, 34, 56, 789012)
            with self.assertRaises(NotImplementedError):
                time_isoformat(time, timespec='seconds')

class TestTimedeltaFunctions(unittest.TestCase):
    def test_timedelta_format(self):
        delta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(timedelta_format(delta), "01:02:03.456789")

    def test_timedelta_parse(self):
        s = "01:02:03.456789"
        delta = timedelta_parse(s)
        expected_delta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(delta, expected_delta)

if __name__ == '__main__':
    unittest.main()