import unittest
from pysnooper.pycompat import *


class TestABC(unittest.TestCase):
    def test_ABC(self):
        instance = ABC()
        self.assertEqual(instance, ABC())

    def test_PathLike(self):
        instance = PathLike()
        self.assertEqual(instance, PathLike())

class Testiscoroutinefunction(unittest.TestCase):
    def test_iscoroutinefunction(self):
        result = iscoroutinefunction(1)
        self.assertEqual(result, False)

class Testisasyncgenfunction(unittest.TestCase):
    def test_isasyncgenfunction(self):
        result = isasyncgenfunction(1)
        self.assertEqual(result, False)

class Teststring_types(unittest.TestCase):
    def test_string_types(self):
        result = string_types
        self.assertEqual(result, (str,))

class Testtext_type(unittest.TestCase):
    def test_text_type(self):
        result = text_type
        self.assertEqual(result, str)

class Testbinary_type(unittest.TestCase):
    def test_binary_type(self):
        result = binary_type
        self.assertEqual(result, bytes)

class Testtime_isoformat(unittest.TestCase):
    def test_time_isoformat(self):
        result = time_isoformat(1)
        self.assertEqual(result, '00:00:00.000001')

class Testtimedelta_format(unittest.TestCase):
    def test_timedelta_format(self):
        result = timedelta_format(1)
        self.assertEqual(result, '00:00:00.000001')

class Testtimedelta_parse(unittest.TestCase):
    def test_timedelta_parse(self):
        result = timedelta_parse('00:00:00.000001')
        self.assertEqual(result, datetime_module.timedelta(hours=0, minutes=0, seconds=0, microseconds=1))

if __name__ == '__main__':
    unittest.main()