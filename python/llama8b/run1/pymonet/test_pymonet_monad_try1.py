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
        def success_fn():
            return 1
        try_obj = Try.of(success_fn)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_of_failure(self):
        def failure_fn():
            raise ValueError('test failure')
        try_obj = Try.of(failure_fn)
        self.assertFalse(try_obj.is_success)

    def test_map_success(self):
        try_obj = Try.of(lambda: 1).map(lambda x: x + 1)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_map_failure(self):
        try_obj = Try.of(lambda: 1).map(lambda x: 1 / x).map(lambda x: x + 1)
        self.assertFalse(try_obj.is_success)

    def test_bind_success(self):
        def binder(x):
            return Try.of(lambda: x + 1)
        try_obj = Try.of(lambda: 1).bind(binder)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_bind_failure(self):
        def binder(x):
            raise ValueError('test failure')
        try_obj = Try.of(lambda: 1).bind(binder)
        self.assertFalse(try_obj.is_success)

    def test_on_success(self):
        def success_callback(x):
            self.assertEqual(x, 1)
        try_obj = Try.of(lambda: 1).on_success(success_callback)
        self.assertTrue(try_obj.is_success)

    def test_on_fail(self):
        def fail_callback(x):
            self.assertEqual(x, 1)
        try_obj = Try.of(lambda: 1 / 0).on_fail(fail_callback)
        self.assertFalse(try_obj.is_success)

    def test_filter_success(self):
        try_obj = Try.of(lambda: 1).filter(lambda x: x > 0)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_filter_failure(self):
        try_obj = Try.of(lambda: -1).filter(lambda x: x > 0)
        self.assertFalse(try_obj.is_success)

    def test_get(self):
        try_obj = Try.of(lambda: 1)
        self.assertEqual(try_obj.get(), 1)

    def test_get_or_else(self):
        try_obj = Try.of(lambda: 1 / 0).get_or_else(0)
        self.assertEqual(try_obj, 0)

if __name__ == '__main__':
    unittest.main()