import unittest
from pysnooper.pycompat import *


class TestABC(unittest.TestCase):
    def test_ABC(self):
        result = ABC()
        self.assertEqual(result, ABC())

class TestPathLike(unittest.TestCase):
    def test_PathLike(self):
        result = PathLike()
        self.assertEqual(result, PathLike)

class TestIsCoroutineFunction(unittest.TestCase):
    def test_iscoroutinefunction(self):
        result = iscoroutinefunction(func)
        self.assertEqual(result, False)

class TestIsAsyncGenFunction(unittest.TestCase):
    def test_isasyncgenfunction(self):
        result = isasyncgenfunction(obj)
        self.assertEqual(result, False)

class TestStringTypes(unittest.TestCase):
    def test_string_types(self):
        result = string_types
        self.assertEqual(result, (str,))

class TestTextType(unittest.TestCase):
    def test_text_type(self):
        result = text_type()
        self.assertEqual(result, '')

class TestBinaryType(unittest.TestCase):
    def test_binary_type(self):
        result = binary_type()
        self.assertEqual(result, b'')

class TestTimeIsoformat(unittest.TestCase):
    def test_time_isoformat(self):
        result = time.isoformat()
        self.assertEqual(result, datetime_module.time.isoformat)

class TestTimedeltaFormat(unittest.TestCase):
    def test_timedelta_format(self):
        result = timedelta_format(timedelta(days=1, hours=2, minutes=3, seconds=4))
        self.assertEqual(result, datetime_module.timedelta(hours=hours, minutes=minutes, seconds=seconds, microseconds=microseconds))

class TestTimedeltaParse(unittest.TestCase):
    def test_timedelta_parse(self):
        result = timedelta_parse('10:00:00')
        self.assertEqual(result, datetime_module.timedelta(hours=hours, minutes=minutes, seconds=seconds, microseconds=microseconds))

if __name__ == '__main__':
    unittest.main()