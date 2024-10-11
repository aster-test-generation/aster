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
            raise ValueError('test')
        try_obj = Try.of(failure_fn)
        self.assertFalse(try_obj.is_success)
        self.assertIsInstance(try_obj.value, ValueError)

    def test_map_success(self):
        try_obj = Try(1, True)
        mapped_try_obj = try_obj.map(lambda x: x * 2)
        self.assertTrue(mapped_try_obj.is_success)
        self.assertEqual(mapped_try_obj.value, 2)

    def test_map_failure(self):
        try_obj = Try(1, False)
        mapped_try_obj = try_obj.map(lambda x: x * 2)
        self.assertFalse(mapped_try_obj.is_success)
        self.assertEqual(mapped_try_obj.value, 1)

    def test_bind_success(self):
        def binder(x):
            return Try(x * 2, True)
        try_obj = Try(1, True)
        bound_try_obj = try_obj.bind(binder)
        self.assertTrue(bound_try_obj.is_success)
        self.assertEqual(bound_try_obj.value, 2)

    def test_bind_failure(self):
        def binder(x):
            return Try(x * 2, False)
        try_obj = Try(1, False)
        bound_try_obj = try_obj.bind(binder)
        self.assertFalse(bound_try_obj.is_success)
        self.assertEqual(bound_try_obj.value, 1)

    def test_on_success(self):
        def success_callback(x):
            self.assertEqual(x, 1)
        try_obj = Try(1, True)
        try_obj.on_success(success_callback)

    def test_on_fail(self):
        def fail_callback(x):
            self.assertEqual(x, 1)
        try_obj = Try(1, False)
        try_obj.on_fail(fail_callback)

    def test_filter_success(self):
        try_obj = Try(1, True)
        filtered_try_obj = try_obj.filter(lambda x: x > 0)
        self.assertTrue(filtered_try_obj.is_success)
        self.assertEqual(filtered_try_obj.value, 1)

    def test_filter_failure(self):
        try_obj = Try(1, False)
        filtered_try_obj = try_obj.filter(lambda x: x > 0)
        self.assertFalse(filtered_try_obj.is_success)
        self.assertEqual(filtered_try_obj.value, 1)

    def test_get(self):
        try_obj = Try(1, True)
        self.assertEqual(try_obj.get(), 1)

    def test_get_or_else(self):
        try_obj = Try(1, False)
        self.assertEqual(try_obj.get_or_else(2), 2)

if __name__ == '__main__':
    unittest.main()