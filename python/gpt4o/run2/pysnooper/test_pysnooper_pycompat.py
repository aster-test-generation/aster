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
                return "path"
        instance = ConcretePathLike()
        self.assertEqual(instance.__fspath__(), "path")

    def test_PathLike_subclasshook(self):
        class ConcretePathLike(PathLike):
            def __fspath__(self):
                return "path"
        self.assertTrue(PathLike.__subclasshook__(ConcretePathLike))

class TestIsCoroutineFunction(unittest.TestCase):
    def test_iscoroutinefunction(self):
        async def coroutine_func():
            pass
        self.assertTrue(iscoroutinefunction(coroutine_func))

    def test_iscoroutinefunction_false(self):
        def regular_func():
            pass
        self.assertFalse(iscoroutinefunction(regular_func))

class TestIsAsyncGenFunction(unittest.TestCase):
    def test_isasyncgenfunction(self):
        async def async_gen_func():
            yield
        self.assertTrue(isasyncgenfunction(async_gen_func))

    def test_isasyncgenfunction_false(self):
        def regular_func():
            pass
        self.assertFalse(isasyncgenfunction(regular_func))

class TestStringTypes(unittest.TestCase):
    def test_string_types(self):
        self.assertIsInstance("test", string_types)

class TestTimeIsoFormat(unittest.TestCase):
    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 789012)
        result = time_isoformat(time)
        self.assertEqual(result, "12:34:56.789012")

    def test_time_isoformat_not_implemented(self):
        time = datetime_module.time(12, 34, 56, 789012)
        with self.assertRaises(NotImplementedError):
            time_isoformat(time, timespec='seconds')

class TestTimedeltaFormat(unittest.TestCase):
    def test_timedelta_format(self):
        delta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        result = timedelta_format(delta)
        self.assertEqual(result, "01:02:03.456789")

class TestTimedeltaParse(unittest.TestCase):
    def test_timedelta_parse(self):
        s = "01:02:03.456789"
        result = timedelta_parse(s)
        expected = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()