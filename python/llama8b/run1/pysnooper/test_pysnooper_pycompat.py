import unittest
from pysnooper import *


class TestPysnooper(unittest.TestCase):
    def test_ABC(self):
        self.assertTrue(issubclass(ABC, type))

    def test_PathLike(self):
        self.assertTrue(issubclass(PathLike, ABC))

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
        self.assertTrue(isinstance(u'hello', string_types))

    def test_text_type(self):
        self.assertTrue(isinstance('hello', text_type))
        self.assertTrue(isinstance(u'hello', text_type))

    def test_binary_type(self):
        self.assertTrue(isinstance(b'hello', binary_type))

    def test_collections_abc(self):
        self.assertTrue(issubclass(collections_abc.Sequence, collections_abc.Iterable))

    def test_time_isoformat(self):
        time = datetime_module.time(12, 34, 56, 789000)
        self.assertEqual(time_isoformat(time), '12:34:56.789000')

    def test_timedelta_format(self):
        timedelta = datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789)
        self.assertEqual(timedelta_format(timedelta), '01:02:03.456789')

    def test_timedelta_parse(self):
        self.assertEqual(timedelta_parse('01:02:03.456789'), datetime_module.timedelta(hours=1, minutes=2, seconds=3, microseconds=456789))

    def test_init(self):
        instance = ABC()
        self.assertTrue(isinstance(instance, ABC))

    def test_str_method(self):
        instance = ABC()
        result = str(instance)
        self.assertEqual(result, 'ABC')

    def test_repr_method(self):
        instance = ABC()
        result = repr(instance)
        self.assertEqual(result, 'ABC')

    def test_eq_method(self):
        instance1 = ABC()
        instance2 = ABC()
        self.assertTrue(instance1 == instance2)

    def test_private_method(self):
        instance = ABC()
        result = instance.__private_method__()
        self.assertEqual(result, None)

    def test_protected_method(self):
        instance = ABC()
        result = instance._ABC__protected_method__()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()