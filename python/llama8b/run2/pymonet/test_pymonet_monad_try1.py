import unittest
from pymonet.monad_try import Try

class TestTry(unittest.TestCase):
    def test_init(self):
        try_obj = Try(1, True)
        self.assertEqual(try_obj.value, 1)
        self.assertTrue(try_obj.is_success)

    def test_eq(self):
        try_obj1 = Try(1, True)
        try_obj2 = Try(1, True)
        self.assertTrue(try_obj1 == try_obj2)

    def test_str(self):
        try_obj = Try(1, True)
        self.assertEqual(str(try_obj), 'Try[value=1, is_success=True]')

    def test_of_success(self):
        def add_one(x):
            return x + 1
        try_obj = Try.of(add_one, 1)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_of_failure(self):
        def raise_exception():
            raise ValueError
        try_obj = Try.of(raise_exception, 1)
        self.assertFalse(try_obj.is_success)
        self.assertIsInstance(try_obj.value, ValueError)

    def test_map_success(self):
        try_obj = Try.of(lambda x: x + 1, 1)
        mapped_try_obj = try_obj.map(lambda x: x * 2)
        self.assertTrue(mapped_try_obj.is_success)
        self.assertEqual(mapped_try_obj.value, 4)

    def test_map_failure(self):
        try_obj = Try.of(lambda x: x + 1, 1).map(lambda x: 1 / x)
        self.assertFalse(try_obj.is_success)
        self.assertIsInstance(try_obj.value, ZeroDivisionError)

    def test_bind_success(self):
        def add_one(x):
            return Try.of(lambda y: y + 1, x)
        try_obj = Try.of(lambda x: x + 1, 1).bind(add_one)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_bind_failure(self):
        def raise_exception(x):
            raise ValueError
        try_obj = Try.of(lambda x: x + 1, 1).bind(lambda x: Try.of(raise_exception, x))
        self.assertFalse(try_obj.is_success)
        self.assertIsInstance(try_obj.value, ValueError)

    def test_on_success(self):
        def success_callback(x):
            self.assertEqual(x, 2)
        try_obj = Try.of(lambda x: x + 1, 1).on_success(success_callback)
        self.assertTrue(try_obj.is_success)

    def test_on_fail(self):
        def fail_callback(x):
            self.assertEqual(x, 1)
        try_obj = Try.of(lambda x: 1 / x, 1).on_fail(fail_callback)
        self.assertFalse(try_obj.is_success)

    def test_filter_success(self):
        try_obj = Try.of(lambda x: x + 1, 1).filter(lambda x: x > 1)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_filter_failure(self):
        try_obj = Try.of(lambda x: x + 1, 1).filter(lambda x: x < 1)
        self.assertFalse(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_get(self):
        try_obj = Try.of(lambda x: x + 1, 1)
        self.assertEqual(try_obj.get(), 2)

    def test_get_or_else(self):
        try_obj = Try.of(lambda x: 1 / x, 1).get_or_else(0)
        self.assertEqual(try_obj, 0)

if __name__ == '__main__':
    unittest.main()