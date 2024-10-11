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
        def mapper(x):
            return x * 2
        try_obj = Try.of(lambda: 1).map(mapper)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_map_failure(self):
        def mapper(x):
            raise ValueError('test')
        try_obj = Try.of(lambda: 1).map(mapper)
        self.assertFalse(try_obj.is_success)
        self.assertIsInstance(try_obj.value, ValueError)

    def test_bind_success(self):
        def binder(x):
            return Try.of(lambda: x * 2)
        try_obj = Try.of(lambda: 1).bind(binder)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 2)

    def test_bind_failure(self):
        def binder(x):
            raise ValueError('test')
        try_obj = Try.of(lambda: 1).bind(binder)
        self.assertFalse(try_obj.is_success)
        self.assertIsInstance(try_obj.value, ValueError)

    def test_on_success(self):
        def success_callback(x):
            self.assertEqual(x, 1)
        try_obj = Try.of(lambda: 1).on_success(success_callback)
        self.assertTrue(try_obj.is_success)

    def test_on_failure(self):
        def fail_callback(x):
            self.fail('Should not be called')
        try_obj = Try.of(lambda: 1).on_failure(fail_callback)
        self.assertFalse(try_obj.is_success)

    def test_filter_success(self):
        def filterer(x):
            return x > 0
        try_obj = Try.of(lambda: 1).filter(filterer)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_filter_failure(self):
        def filterer(x):
            return x < 0
        try_obj = Try.of(lambda: 1).filter(filterer)
        self.assertFalse(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_get(self):
        try_obj = Try.of(lambda: 1)
        self.assertEqual(try_obj.get(), 1)

    def test_get_or_else(self):
        try_obj = Try.of(lambda: 1)
        self.assertEqual(try_obj.get_or_else(2), 1)
        try_obj = Try.of(lambda: None).get_or_else(2)
        self.assertEqual(try_obj, 2)

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

    def test_of(self):
        def fn():
            return 1
        try_obj = Try.of(fn)
        self.assertTrue(try_obj.is_success)
        self.assertEqual(try_obj.value, 1)

    def test_of_failure(self):
        def fn():
            raise Exception('Error')
        try_obj = Try.of(fn)
        self.assertFalse(try_obj.is_success)

    def test_map(self):
        try_obj = Try(1, True)
        mapped_try_obj = try_obj.map(lambda x: x + 1)
        self.assertTrue(mapped_try_obj.is_success)
        self.assertEqual(mapped_try_obj.value, 2)

    def test_bind(self):
        try_obj = Try(1, True)
        def binder(x):
            return Try(x + 1, True)
        result = try_obj.bind(binder)
        self.assertTrue(result.is_success)
        self.assertEqual(result.value, 2)

    def test_on_success(self):
        try_obj = Try(1, True)
        def success_callback(x):
            self.assertEqual(x, 1)
        try_obj.on_success(success_callback)

    def test_on_fail(self):
        try_obj = Try(1, False)
        def fail_callback(x):
            self.assertEqual(x, 1)
        try_obj.on_fail(fail_callback)

    def test_filter(self):
        try_obj = Try(1, True)
        filtered_try_obj = try_obj.filter(lambda x: x > 0)
        self.assertTrue(filtered_try_obj.is_success)
        self.assertEqual(filtered_try_obj.value, 1)

    def test_filter_failure(self):
        try_obj = Try(1, True)
        filtered_try_obj = try_obj.filter(lambda x: x < 0)
        self.assertFalse(filtered_try_obj.is_success)

    def test_get(self):
        try_obj = Try(1, True)
        self.assertEqual(try_obj.get(), 1)

    def test_get_or_else(self):
        try_obj = Try(1, False)
        self.assertEqual(try_obj.get_or_else(2), 2)

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
            raise Exception('Test exception')
        try_obj = Try.of(failure_fn)
        self.assertFalse(try_obj.is_success)

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

    def test_on_failure(self):
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