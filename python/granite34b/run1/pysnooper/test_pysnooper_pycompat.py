from pysnooper.pycompat import datetime_module
import unittest
from pysnooper.pycompat import (
    ABC, PathLike, iscoroutinefunction, isasyncgenfunction,
    string_types, text_type, binary_type, collections_abc,
    time_isoformat, timedelta_format, timedelta_parse
)


class TestABC(unittest.TestCase):
    def test_abc(self):
        class MyABC(ABC):
            pass
        self.assertIsInstance(MyABC(), ABC)

class TestPathLike(unittest.TestCase):
    def test_path_like(self):
        class MyPathLike(PathLike):
            def __fspath__(self):
                return '/path/to/file'
        self.assertIsInstance(MyPathLike(), PathLike)

class TestIscoroutinefunction(unittest.TestCase):
    def test_iscoroutinefunction(self):
        async def my_coroutine():
            pass
        self.assertTrue(iscoroutinefunction(my_coroutine))

class TestIsasyncgenfunction(unittest.TestCase):
    def test_isasyncgenfunction(self):
        async def my_asyncgen():
            yield 1
        self.assertTrue(isasyncgenfunction(my_asyncgen))

class TestStringTypes(unittest.TestCase):
    def test_string_types(self):
        self.assertIs(string_types, (str,))

class TestTextType(unittest.TestCase):
    def test_text_type(self):
        self.assertIs(text_type, str)

class TestBinaryType(unittest.TestCase):
    def test_binary_type(self):
        self.assertIs(binary_type, bytes)

class TestCollectionsAbc(unittest.TestCase):
    def test_collections_abc(self):
        self.assertIs(collections_abc, collections_abc)

class TestTimeIsoformat(unittest.TestCase):
    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 789012)
        self.assertEqual(time_isoformat(time), '12:34:56.789012')

class TestTimedeltaFormat(unittest.TestCase):
    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(timedelta_format(timedelta), '01:02:03.456789')

class TestTimedeltaParse(unittest.TestCase):
    def test_timedelta_parse(self):
        self.assertEqual(timedelta_parse('01:02:03.456789'), datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789))

if __name__ == '__main__':
    unittest.main()