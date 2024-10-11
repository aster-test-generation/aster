import unittest
from pysnooper.pycompat import *


class TestABC(unittest.TestCase):
    def test_ABC(self):
        instance = ABC()
        self.assertIsInstance(instance, ABC)

class TestPathLike(unittest.TestCase):
    def test_PathLike(self):
        instance = PathLike()
        self.assertIsInstance(instance, PathLike)

class TestIsCoroutineFunction(unittest.TestCase):
    def test_iscoroutinefunction(self):
        result = iscoroutinefunction(asyncio.iscoroutinefunction)
        self.assertIsInstance(result, bool)

class TestIsAsyncGenFunction(unittest.TestCase):
    def test_isasyncgenfunction(self):
        result = isasyncgenfunction(isasyncgenfunction)
        self.assertIsInstance(result, bool)

class TestStringTypes(unittest.TestCase):
    def test_string_types(self):
        instance = string_types
        self.assertIsInstance(instance, tuple)

class TestTextType(unittest.TestCase):
    def test_text_type(self):
        instance = text_type()
        self.assertIsInstance(instance, str)

class TestBinaryType(unittest.TestCase):
    def test_binary_type(self):
        instance = binary_type()
        self.assertIsInstance(instance, bytes)

class TestTimeIsoFormat(unittest.TestCase):
    def test_time_isoformat(self):
        time = datetime_module.time()
        result = time_isoformat(time, timespec='microseconds')
        self.assertIsInstance(result, str)

class TestTimedeltaFormat(unittest.TestCase):
    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta()
        result = timedelta_format(timedelta)
        self.assertIsInstance(result, str)

class TestTimedeltaParse(unittest.TestCase):
    def test_timedelta_parse(self):
        s = '00:00:00.000000'
        result = timedelta_parse(s)
        self.assertIsInstance(result, datetime_module.timedelta)

if __name__ == '__main__':
    unittest.main()