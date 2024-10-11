import unittest
from pymonet.monad_try import Try

class TestTry(unittest.TestCase):
    def test_init(self):
        try_instance = Try(5, True)
        self.assertEqual(try_instance.value, 5)
        self.assertTrue(try_instance.is_success)

    def test_eq(self):
        try_instance1 = Try(5, True)
        try_instance2 = Try(5, True)
        self.assertTrue(try_instance1 == try_instance2)

    def test_str(self):
        try_instance = Try(5, True)
        self.assertEqual(str(try_instance), 'Try[value=5, is_success=True]')

    def test_of_success(self):
        def fn(x):
            return x * 2
        try_instance = Try.of(fn, 5)
        self.assertEqual(try_instance.value, 10)
        self.assertTrue(try_instance.is_success)

    def test_of_failure(self):
        def fn(x):
            raise ValueError("Error")
        try_instance = Try.of(fn, 5)
        self.assertIsInstance(try_instance.value, ValueError)
        self.assertFalse(try_instance.is_success)

    def test_map_success(self):
        try_instance = Try(5, True)
        mapped_instance = try_instance.map(lambda x: x * 2)
        self.assertEqual(mapped_instance.value, 10)
        self.assertTrue(mapped_instance.is_success)

    def test_map_failure(self):
        try_instance = Try(5, False)
        mapped_instance = try_instance.map(lambda x: x * 2)
        self.assertEqual(mapped_instance.value, 5)
        self.assertFalse(mapped_instance.is_success)

    def test_bind_success(self):
        def binder(x):
            return Try(x * 2, True)
        try_instance = Try(5, True)
        bound_instance = try_instance.bind(binder)
        self.assertEqual(bound_instance.value, 10)
        self.assertTrue(bound_instance.is_success)

    def test_bind_failure(self):
        def binder(x):
            return Try(x * 2, True)
        try_instance = Try(5, False)
        bound_instance = try_instance.bind(binder)
        self.assertEqual(bound_instance.value, 5)
        self.assertFalse(bound_instance.is_success)

    def test_on_success(self):
        try_instance = Try(5, True)
        result = []
        def success_callback(x):
            result.append(x)
        try_instance.on_success(success_callback)
        self.assertEqual(result, [5])

    def test_on_fail(self):
        try_instance = Try(5, False)
        result = []
        def fail_callback(x):
            result.append(x)
        try_instance.on_fail(fail_callback)
        self.assertEqual(result, [5])

    def test_filter_success(self):
        try_instance = Try(5, True)
        filtered_instance = try_instance.filter(lambda x: x > 3)
        self.assertEqual(filtered_instance.value, 5)
        self.assertTrue(filtered_instance.is_success)

    def test_filter_failure(self):
        try_instance = Try(5, True)
        filtered_instance = try_instance.filter(lambda x: x < 3)
        self.assertEqual(filtered_instance.value, 5)
        self.assertFalse(filtered_instance.is_success)

    def test_get(self):
        try_instance = Try(5, True)
        self.assertEqual(try_instance.get(), 5)

    def test_get_or_else_success(self):
        try_instance = Try(5, True)
        self.assertEqual(try_instance.get_or_else(10), 5)

    def test_get_or_else_failure(self):
        try_instance = Try(5, False)
        self.assertEqual(try_instance.get_or_else(10), 10)

if __name__ == '__main__':
    unittest.main()