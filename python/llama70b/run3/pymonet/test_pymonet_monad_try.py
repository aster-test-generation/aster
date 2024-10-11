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

    def test_map(self):
        try_instance = Try(5, True)
        mapped_instance = try_instance.map(lambda x: x * 2)
        self.assertEqual(mapped_instance.value, 10)
        self.assertTrue(mapped_instance.is_success)

    def test_bind(self):
        try_instance = Try(5, True)
        def binder(x):
            return Try(x * 2, True)
        bound_instance = try_instance.bind(binder)
        self.assertEqual(bound_instance.value, 10)
        self.assertTrue(bound_instance.is_success)

    def test_on_success(self):
        try_instance = Try(5, True)
        success_called = False
        def success_callback(x):
            nonlocal success_called
            success_called = True
        try_instance.on_success(success_callback)
        self.assertTrue(success_called)

    def test_on_fail(self):
        try_instance = Try(5, False)
        fail_called = False
        def fail_callback(x):
            nonlocal fail_called
            fail_called = True
        try_instance.on_fail(fail_callback)
        self.assertTrue(fail_called)

    def test_filter(self):
        try_instance = Try(5, True)
        filtered_instance = try_instance.filter(lambda x: x > 3)
        self.assertEqual(filtered_instance.value, 5)
        self.assertTrue(filtered_instance.is_success)

    def test_get(self):
        try_instance = Try(5, True)
        self.assertEqual(try_instance.get(), 5)

    def test_get_or_else(self):
        try_instance = Try(5, True)
        self.assertEqual(try_instance.get_or_else(10), 5)
        try_instance = Try(5, False)
        self.assertEqual(try_instance.get_or_else(10), 10)

if __name__ == '__main__':
    unittest.main()